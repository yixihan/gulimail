package com.yixihan.gulimall.product.service.impl;

import com.yixihan.gulimall.product.dao.BrandDao;
import com.yixihan.gulimall.product.entity.BrandEntity;
import com.yixihan.gulimall.product.service.BrandService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yixihan.common.utils.PageUtils;
import com.yixihan.common.utils.Query;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

        return new PageUtils(page);
    }

}