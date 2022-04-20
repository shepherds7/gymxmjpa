package com.ccj.gymxmjpa.controller;


import com.ccj.gymxmjpa.pojo.GoodInfo;
import com.ccj.gymxmjpa.pojo.Goods;
import com.ccj.gymxmjpa.pojo.Member;
import com.ccj.gymxmjpa.service.impl.GoodInfoServiceImpl;
import com.ccj.gymxmjpa.service.impl.GoodsServiceImpl;
import com.ccj.gymxmjpa.service.impl.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品售卖信息管理Controller控制层
 */
@Controller
@RequestMapping("/goodinfo")
public class GoodInfoController {
//    @Autowired
//    private GoodInfoServiceImpl goodInfoServiceImpl;
//
//    @Autowired
//    private GoodsServiceImpl goodsServiceImpl;
//
//    @Autowired
//    private MemberServiceImpl memberServiceImpl;
//
//    /**
//     * 商品售卖信息管理-进入商品售卖信息界面
//     */
//    @RequestMapping("/spinfo")
//    public String spinfo() {
//        return "WEB-INF/jsp/GoodInfo";
//    }
//
//    /**
//     * 商品售卖信息管理-根据商品id,会员id查询商品售卖信息
//     */
//    @RequestMapping("/query")
//    @ResponseBody
//    public Map<String, Object> query(Integer goodsid, Integer memberid, int pageSize, int pageNumber) {
//        Map<String, Object> map1 = new HashMap<String, Object>();
//        map1.put("goodsid", goodsid);
//        map1.put("memberid", memberid);
//        map1.put("qi", pageNumber);
//        map1.put("shi", pageSize);
//        return goodInfoServiceImpl.query(map1);
//    }
//
//    /**
//     * 商品售卖信息管理-根据商品id,会员id删除信息
//     */
//    @RequestMapping("/del")
//    @ResponseBody
//    public Map<String, Object> del(long id, Integer goodsid, Integer memberid, int pageSize, int pageNumber) {
//        goodInfoServiceImpl.deleteById(id);
//        Map<String, Object> map1 = new HashMap<String, Object>();
//        map1.put("goodsid", goodsid);
//        map1.put("memberid", memberid);
//        map1.put("qi", (pageNumber - 1) * pageSize);
//        map1.put("shi", pageSize);
//        return goodInfoServiceImpl.query(map1);
//    }
//
//    /**
//     * 商品售卖信息管理-根据商品id,会员id批量删除信息
//     */
//    @RequestMapping("/dellist")
//    @ResponseBody
//    public Map<String, Object> delete(int array[], Integer goodsid, Integer memberid, int pageSize, int pageNumber) {
//        System.out.println(array[0]);
//        for (int i = 0; i < array.length; i++) {
//            goodInfoServiceImpl.deleteById(array[i]);
//        }
//        return query(goodsid, memberid, pageSize, pageNumber);
//    }
//
//    /**
//     * 商品售卖信息管理-添加商品售卖信息
//     */
//    @RequestMapping("/add")
//    @ResponseBody
//    public void save(GoodInfo goodInfo) {
//        goodInfoServiceImpl.insert(goodInfo);
//    }
//
//
//    /**
//     * 商品售卖信息管理-根据商品id查询商品售卖信息
//     */
//    @RequestMapping("/cha")
//    @ResponseBody
//    public GoodInfo one(int goodsId) {
//        return goodInfoServiceImpl.findById(goodsId);
//    }
//
//    /**
//     * 商品售卖信息管理-根据商品id查询商品信息
//     */
//    @RequestMapping("/chagoods")
//    @ResponseBody
//    public Goods oneg(int goodsId) {
//        return goodsServiceImpl.findById(goodsId);
//    }
//
//    /**
//     * 商品售卖信息管理-根据id查询信息
//     */
//    @RequestMapping("/chamember")
//    @ResponseBody
//    public Member onem(int memberId){
//        return memberServiceImpl.findById(memberId);
//    }
//
//    /**
//     *  商品售卖信息管理-修改商品售卖信息
//     */
//    @RequestMapping("/upd")
//    @ResponseBody
//    public  void upd(GoodInfo goodInfo){
//        goodInfoServiceImpl.save(goodInfo);
//    }
//
//    /**
//     *  商品售卖信息管理-修改会员信息
//     */
//    @RequestMapping("/updmember")
//    @ResponseBody
//    public  void upd(Member member){
//        memberServiceImpl.upd(member);
//    }
//
//    /**
//     *  商品售卖信息管理-修改商品信息
//     */
//    @RequestMapping("/updgoods")
//    @ResponseBody
//    public  void upd(Goods goods){
//        goodsServiceImpl.update(goods);
//    }

}
