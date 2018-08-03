package com.feri.service.impl;

import com.feri.mapper.GoodsMapper;
import com.feri.pojo.Goods;
import com.feri.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *@Author feri
 *@Date Created in 2018/8/3 17:47
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper mapper;
    @Override
    public boolean save(Goods goods) {
        goods.setUid(1);
        return mapper.insert(goods)>0;
    }
}
