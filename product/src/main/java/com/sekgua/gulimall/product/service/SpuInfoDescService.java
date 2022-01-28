package com.sekgua.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sekgua.common.utils.PageUtils;
import com.sekgua.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author sekgua
 * @email 15671600255@163.com
 * @date 2022-01-28 15:47:39
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

