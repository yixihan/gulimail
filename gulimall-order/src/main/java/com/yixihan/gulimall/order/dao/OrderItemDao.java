package com.yixihan.gulimall.order.dao;

import com.yixihan.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author yixihan
 * @email yixihan20010617@gmail.com
 * @date 2022-03-05 22:03:21
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
