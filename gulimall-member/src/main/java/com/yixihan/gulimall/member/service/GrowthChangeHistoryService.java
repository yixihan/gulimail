package com.yixihan.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yixihan.common.utils.PageUtils;
import com.yixihan.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author yixihan
 * @email yixihan20010617@gmail.com
 * @date 2022-03-05 21:54:55
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

