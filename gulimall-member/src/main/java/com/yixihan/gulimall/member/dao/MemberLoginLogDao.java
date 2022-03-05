package com.yixihan.gulimall.member.dao;

import com.yixihan.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author yixihan
 * @email yixihan20010617@gmail.com
 * @date 2022-03-05 21:54:55
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
