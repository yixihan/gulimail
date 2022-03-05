package com.yixihan.gulimall.coupon.service.impl;

import com.yixihan.gulimall.coupon.entity.CouponSpuRelationEntity;
import com.yixihan.gulimall.coupon.service.CouponSpuRelationService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yixihan.common.utils.PageUtils;
import com.yixihan.common.utils.Query;

import com.yixihan.gulimall.coupon.dao.CouponSpuRelationDao;


@Service("couponSpuRelationService")
public class CouponSpuRelationServiceImpl extends ServiceImpl<CouponSpuRelationDao, CouponSpuRelationEntity> implements CouponSpuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponSpuRelationEntity> page = this.page(
                new Query<CouponSpuRelationEntity>().getPage(params),
                new QueryWrapper<CouponSpuRelationEntity>()
        );

        return new PageUtils(page);
    }

}