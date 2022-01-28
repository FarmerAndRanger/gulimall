package com.sekgua.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sekgua.common.utils.PageUtils;
import com.sekgua.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author sekgua
 * @email 15671600255@163.com
 * @date 2022-01-28 17:45:10
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

