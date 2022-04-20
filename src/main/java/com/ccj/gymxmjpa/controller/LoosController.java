package com.ccj.gymxmjpa.controller;

import com.ccj.gymxmjpa.pojo.Loos;
import com.ccj.gymxmjpa.service.impl.LoosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * 遗失物品管理Controller控制层
 */
@Controller
@RequestMapping("/loos")
public class LoosController {

    @Autowired
    private LoosServiceImpl loosServiceImpl;

    /**
     * 遗失物品管理-进入遗失物品信息界面
     */
    @RequestMapping("/jin9")
    public String jin7() {
        return "WEB-INF/jsp/loos";
    }

    /**
     * 遗失物品管理-根据遗失物品名称分页查询
     */
    @RequestMapping("/query")
    @ResponseBody
    public Map<String, Object> query(String loosName, int pageSize, int pageNumber) {
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("loosName", loosName);
        map1.put("qi", pageNumber);
        map1.put("shi", pageSize);
        return loosServiceImpl.query(map1);
    }

    /**
     * 遗失物品管理-添加遗失物品
     */
    @RequestMapping("/add")
    @ResponseBody
    public void save(Loos loos) {
        loosServiceImpl.insert(loos);
    }


    /**
     * 遗失物品管理-根据遗失物品id查询信息
     */
    @RequestMapping("/query3")
    @ResponseBody
    public List<Loos> query3(int loosId) {
        List<Loos> list = new ArrayList<Loos>();
        list.add(loosServiceImpl.findById(loosId));
        return list;
    }

    /**
     * 遗失物品管理-取回遗失物品修改其信息
     */
    @RequestMapping("/quhui")
    @ResponseBody
    public void upd(Loos loos) {
        loosServiceImpl.update(loos);
    }

    /**
     * 遗失物品管理-根据遗失物品id查询单个物品信息
     */
    @RequestMapping("/cha")
    @ResponseBody
    public Loos one(int loosId) {
        Loos loos = loosServiceImpl.findById(loosId);
        return loos;
    }

}
