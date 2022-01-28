package com.sekgua.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sekgua.common.utils.PageUtils;
import com.sekgua.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author sekgua
 * @email 15671600255@163.com
 * @date 2022-01-28 18:13:53
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

