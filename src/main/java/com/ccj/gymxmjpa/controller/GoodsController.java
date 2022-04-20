package com.ccj.gymxmjpa.controller;


import com.ccj.gymxmjpa.pojo.Goods;
import com.ccj.gymxmjpa.service.impl.GoodInfoServiceImpl;
import com.ccj.gymxmjpa.service.impl.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商品管理Controller控制层
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsServiceImpl goodsServiceImpl;

    @Autowired
    private GoodInfoServiceImpl goodInfoServiceImpl;

    /**
     * 商品管理-进入商品列表界面
     */
    @RequestMapping("/sp")
    public String sp() {

        return "WEB-INF/jsp/Goods";
    }

    /**
     * 商品管理-根据商品名称分页查询
     */
    @RequestMapping("/query")
    @ResponseBody
    public Map<String, Object> query(String goodsname, int pageSize, int pageNumber) {
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("goodsname", goodsname);
        map1.put("qi", pageNumber);
        map1.put("shi", pageSize);
        return goodsServiceImpl.query(map1);
    }

    /**
     * 商品管理-查询所有商品信息
     */
    @RequestMapping("/query2")
    @ResponseBody
    public List<Goods> query2() {
        return goodsServiceImpl.findAll();
    }

    /**
     * 根据商品id删除商品信息
     */
    @RequestMapping("/del")
    @ResponseBody
    public Map<String, Object> del(int goodsId, String goodsname, int pageSize, int pageNumber) {
        goodsServiceImpl.deleteById(goodsId);
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("goodsname", goodsname);
        map1.put("qi", pageNumber);
        map1.put("shi", pageSize);
        return goodsServiceImpl.query(map1);
    }

    /**
     * 商品管理-添加商品
     */
    @RequestMapping("/add")
    @ResponseBody
    public void save(Goods goods) {
        goodsServiceImpl.insert(goods);
    }

    /**
     * 商品管理-根据商品id查询单个商品信息
     */
    @RequestMapping("/cha")
    @ResponseBody
    public Goods one(int goodsId) {
        return goodsServiceImpl.findById(goodsId);
    }

    /**
     * 商品管理-根据商品名称计算总数量
     */
    @RequestMapping("/count")
    @ResponseBody
    public int count(String goodsName) {
        return goodsServiceImpl.count(goodsName);
    }

    /**
     * 商品管理-修改商品信息
     */
    @RequestMapping("/upd")
    @ResponseBody
    public void upd(Goods goods) {
        goodsServiceImpl.update(goods);
    }

    /**
     * 商品管理-修改商品信息
     */
    @RequestMapping("/update")
    @ResponseBody
    public void update(Goods goods) {
        goodsServiceImpl.update2(goods);
    }

    /**
     * 商品管理-查询所有商品信息
     */
    @RequestMapping("/topcoach")
    @ResponseBody
    public Map<String, Object> topcoach() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("goods", goodsServiceImpl.findAll());
        return map;
    }

}
