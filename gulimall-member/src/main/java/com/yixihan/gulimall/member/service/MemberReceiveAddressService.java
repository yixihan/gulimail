package com.yixihan.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yixihan.common.utils.PageUtils;
import com.yixihan.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author yixihan
 * @email yixihan20010617@gmail.com
 * @date 2022-03-05 21:54:55
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

