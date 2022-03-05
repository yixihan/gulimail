package com.yixihan.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yixihan.common.utils.PageUtils;
import com.yixihan.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author yixihan
 * @email yixihan20010617@gmail.com
 * @date 2022-03-05 21:49:26
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

