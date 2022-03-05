package com.yixihan.gulimall.product.dao;

import com.yixihan.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yixihan
 * @email yixihan20010617@gmail.com
 * @date 2022-03-05 20:55:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
