package com.sekgua.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sekgua.common.utils.PageUtils;
import com.sekgua.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author sekgua
 * @email 15671600255@163.com
 * @date 2022-01-28 17:57:28
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

