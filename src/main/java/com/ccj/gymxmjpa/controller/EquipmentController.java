package com.ccj.gymxmjpa.controller;

import com.ccj.gymxmjpa.pojo.Equipment;
import com.ccj.gymxmjpa.service.impl.EquipmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/qc")
public class EquipmentController {
    @Autowired
    private EquipmentServiceImpl equipmentServiceImpl;


    /**
     * 器材管理-进入器材信息界面
     */
    @RequestMapping("/yemian")
    public String yemian() {
        return "WEB-INF/jsp/CEquipment";
    }

    /**
     * @Description: 器材管理-根据器材名称分页查询
     * @Author: LiuJian
     * @Date: 2020/4/12
     */
    @RequestMapping("/query")
    @ResponseBody
    public Map<String, Object> query(String hyname, int pageSize, int pageNumber) {
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("hyname", hyname);
        map1.put("qi", (pageNumber));
        map1.put("shi", pageSize);
        return equipmentServiceImpl.query(map1);
    }

    /**
     * 器材管理-添加器材

     */
    @RequestMapping("/insert")
    @ResponseBody
    public Map<String,Object> insert(Equipment equipment){
        equipmentServiceImpl.insertEp(equipment);
        return query("",5,1);
    }


    /**
     * 器材管理-根据器材id删除
     */
    @RequestMapping("/delete")
    @ResponseBody
    public Map<String,Object> del(int eqId){
        equipmentServiceImpl.deleteEp(eqId);
        return query("",5,1);
    }
}
