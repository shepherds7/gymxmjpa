package com.ccj.gymxmjpa.service;

import com.ccj.gymxmjpa.pojo.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsService {
    Map<String,Object> query(Map<String,Object> map1);

    int count(String goodsName);

    int update(Goods goods);

    Goods findById(int goodsId);

    List<Goods> findAll();

    int insert(Goods goods);

    int update2(Goods goods);

    int deleteById(int goodsId);
}
