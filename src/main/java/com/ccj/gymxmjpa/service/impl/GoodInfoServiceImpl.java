package com.ccj.gymxmjpa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ccj.gymxmjpa.mapper.GoodInfoMapper;
import com.ccj.gymxmjpa.pojo.GoodInfo;
import com.ccj.gymxmjpa.service.GoodInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商品售卖信息管理service实现层
 */
@Service
public class GoodInfoServiceImpl implements GoodInfoService {

    @Autowired
    private GoodInfoMapper goodInfoMapper;

    /**
     * 商品售卖信息管理service实现层-分页查询
     */
    @Override
    public Map<String, Object> query(Map<String, Object> map1) {
        int pageNumber = (int) map1.get("qi");

        int pageSize = (int) map1.get("shi");

//        int memberid = (int) map1.get("memberid");
//        int gooodsid = (int) map1.get("gooodsid");

        //分页
        Page<GoodInfo> page = new Page<>(pageNumber, pageSize);
        Page<GoodInfo> goodInfoPage;
        if (map1.get("memberid") != null && !map1.get("memberid").equals("")) {
            goodInfoPage = goodInfoMapper.selectPage(page,
                    new QueryWrapper<GoodInfo>().eq("memberid", map1.get("memberid")));
//            goodInfoPage = goodInfoMapper.goodPage(page, memberid);
        } else if (map1.get("goodsid") != null && !map1.get("gooodsid").equals("")) {
            goodInfoPage = goodInfoMapper.selectPage(page,
                    new QueryWrapper<GoodInfo>().eq("goodsid", map1.get("gooodsid")));
//            goodInfoPage = goodInfoMapper.goodPage(page, gooodsid);
        } else {
            goodInfoPage = goodInfoMapper.selectPage(page, null);
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("total", goodInfoPage.getTotal());
        map.put("rows", goodInfoPage.getRecords());
        return map;
    }

    /**
     * 根据商品id删除信息
     */
    @Override
    public int deleteById(long id) {
        return goodInfoMapper.deleteById(id);
    }

    /**
     * 添加商品售卖信息
     */
    @Override
    public int insert(GoodInfo goodInfo) {
        return goodInfoMapper.insert(goodInfo);
    }

    /**
     * 根据商品id查询商品售卖信息
     */
    @Override
    public GoodInfo findById(int goodsId) {
        return goodInfoMapper.selectById(goodsId);
    }

    /**
     * 修改商品售卖信息
     */
    @Override
    public int save(GoodInfo goodInfo) {
        return goodInfoMapper.updateById(goodInfo);
    }

    @Override
    public List<GoodInfo> queryByGoodsIdNative(int goodsId) {
        return goodInfoMapper.queryByGoodsIdNative(goodsId);
    }

    @Override
    public int delete(GoodInfo goodInfo) {
        return goodInfoMapper.deleteById(goodInfo);
    }
}
