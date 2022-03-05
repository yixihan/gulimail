package com.yixihan.gulimall.coupon.service.impl;

import com.yixihan.gulimall.coupon.dao.HomeSubjectDao;
import com.yixihan.gulimall.coupon.entity.HomeSubjectEntity;
import com.yixihan.gulimall.coupon.service.HomeSubjectService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yixihan.common.utils.PageUtils;
import com.yixihan.common.utils.Query;


@Service("homeSubjectService")
public class HomeSubjectServiceImpl extends ServiceImpl<HomeSubjectDao, HomeSubjectEntity> implements HomeSubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeSubjectEntity> page = this.page(
                new Query<HomeSubjectEntity>().getPage(params),
                new QueryWrapper<HomeSubjectEntity>()
        );

        return new PageUtils(page);
    }

}