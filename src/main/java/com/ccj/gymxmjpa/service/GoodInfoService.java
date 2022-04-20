package com.ccj.gymxmjpa.service;

import com.ccj.gymxmjpa.pojo.GoodInfo;

import java.util.List;
import java.util.Map;

public interface GoodInfoService {
    Map<String,Object> query(Map<String,Object> map1);

    int deleteById(long id);

    int insert(GoodInfo goodInfo);

    GoodInfo findById(int goodsId);

    int save(GoodInfo goodInfo);

    List<GoodInfo> queryByGoodsIdNative(int goodsId);

    int delete(GoodInfo goodInfo);
}
