package com.ccj.gymxmjpa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ccj.gymxmjpa.mapper.GoodsMapper;
import com.ccj.gymxmjpa.pojo.Goods;
import com.ccj.gymxmjpa.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商品管理service实现层
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 商品管理service实现层-分页查询
     */
    @Override
    public Map<String, Object> query(Map<String, Object> map1) {
        int pageNumber = (int) map1.get("qi");

        int pageSize = (int) map1.get("shi");
        //分页
        Page<Goods> page = new Page<>(pageNumber, pageSize);
        Page<Goods> goodsPage;
        if (map1.get("goodsname") != null && !map1.get("goodsname").equals("")) {
            goodsPage = goodsMapper.selectPage(page,
                    new QueryWrapper<Goods>().eq("goodsName", null).or().likeRight("goodsName", map1.get("goodsname")));
        } else {
            goodsPage = goodsMapper.selectPage(page, null);
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("total", goodsPage.getTotal());
        map.put("rows", goodsPage.getRecords());
        return map;
    }

    /**
     * 商品管理service实现层-计算总数量
     */
    @Override
    public int count(String goodsName) {
        return goodsMapper.selectCount(new QueryWrapper<Goods>().eq("goodsName", goodsName));
    }

    /**
     * 商品管理service实现层-修改商品信息
     */
    @Override
    public int update(Goods goods) {
        Goods goods1 = goodsMapper.selectById(goods.getGoodsId());
        goods1.setGoodsId(goods1.getGoodsId());
        goods1.setInventory(goods.getInventory());
        return goodsMapper.updateById(goods1);
    }

    @Override
    public Goods findById(int goodsId) {
        return goodsMapper.selectById(goodsId);
    }

    /**
     * 查询所有商品信息
     */
    @Override
    public List<Goods> findAll() {
        return goodsMapper.selectList(null);
    }

    /**
     * 添加商品
     */
    @Override
    public int insert(Goods goods) {
        return goodsMapper.insert(goods);
    }

    @Override
    public int update2(Goods goods) {
        return goodsMapper.updateById(goods);
    }

    @Override
    public int deleteById(int goodsId) {
        return goodsMapper.deleteById(goodsId);
    }
}
