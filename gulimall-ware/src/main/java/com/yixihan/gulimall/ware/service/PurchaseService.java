package com.yixihan.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yixihan.common.utils.PageUtils;
import com.yixihan.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author yixihan
 * @email yixihan20010617@gmail.com
 * @date 2022-03-05 22:23:45
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

