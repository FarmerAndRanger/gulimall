package com.sekgua.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sekgua.common.utils.PageUtils;
import com.sekgua.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author sekgua
 * @email 15671600255@163.com
 * @date 2022-01-28 18:05:53
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

