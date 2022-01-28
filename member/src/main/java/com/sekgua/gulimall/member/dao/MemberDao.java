package com.sekgua.gulimall.member.dao;

import com.sekgua.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author sekgua
 * @email 15671600255@163.com
 * @date 2022-01-28 17:57:28
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}