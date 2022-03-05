package com.yixihan.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yixihan.common.utils.PageUtils;
import com.yixihan.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author yixihan
 * @email yixihan20010617@gmail.com
 * @date 2022-03-05 21:49:26
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

