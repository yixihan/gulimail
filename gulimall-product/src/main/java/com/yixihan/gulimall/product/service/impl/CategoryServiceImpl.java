package com.yixihan.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yixihan.common.utils.PageUtils;
import com.yixihan.common.utils.Query;
import com.yixihan.gulimall.product.dao.CategoryDao;
import com.yixihan.gulimall.product.entity.CategoryEntity;
import com.yixihan.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * @author wq
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

//    @Resource
//    private CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 查出所有分类以及子分类, 以树形结构组装起来
     *
     * @return
     */
    @Override
    public List<CategoryEntity> listWithTree() {
        // 1. 查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList (null);

        // 2. 组装成父子的树形结构
        return entities.stream ()
                // 1. 找父菜单
                .filter (categoryEntity -> categoryEntity.getParentCid () == 0)
                // 2. 找子菜单
                .peek (menu -> menu.setChildren (getChildless (menu, entities)))
                // 3. 排序
                .sorted ((o1, o2) -> {
                    if (o1.getSort () == null) {
                        o1.setSort (0);
                    }
                    if (o2.getSort () == null) {
                        o2.setSort (0);
                    }
                    return Integer.compare (o1.getSort (), o2.getSort ());
                })
                .collect (Collectors.toList ());
    }

    /**
     * 递归查找当前菜单的所有子菜单
     * @param root 当前菜单
     * @param all 所有菜单
     * @return 当前菜单的所有子菜单
     */
    private List<CategoryEntity> getChildless(CategoryEntity root, List<CategoryEntity> all) {

        return all.stream ()
                // 1. 找子菜单
                .filter (entity -> entity.getParentCid ().equals (root.getCatId ()))
                // 2. 找子菜单的子菜单
                .peek (menu -> menu.setChildren (getChildless (menu, all)))
                // 3. 排序
                .sorted ((o1, o2) -> {
                    if (o1.getSort () == null) {
                        o1.setSort (0);
                    }
                    if (o2.getSort () == null) {
                        o2.setSort (0);
                    }
                    return Integer.compare (o1.getSort (), o2.getSort ());
                })
                .collect(Collectors.toList());
    }

}