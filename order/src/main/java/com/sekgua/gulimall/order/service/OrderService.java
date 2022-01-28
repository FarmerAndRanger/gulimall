package com.sekgua.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sekgua.common.utils.PageUtils;
import com.sekgua.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author sekgua
 * @email 15671600255@163.com
 * @date 2022-01-28 18:05:53
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

