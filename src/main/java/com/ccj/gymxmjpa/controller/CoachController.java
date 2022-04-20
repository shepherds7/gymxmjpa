package com.ccj.gymxmjpa.controller;


import com.ccj.gymxmjpa.pojo.Coach;
import com.ccj.gymxmjpa.service.impl.CoachServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 教练管理Controller控制层
 */
@Controller
@RequestMapping("/coach")
public class CoachController {

    @Autowired
    private CoachServiceImpl coachServiceImpl;

    /**
     * 教练管理-进入教练列表界面
     */
    @RequestMapping("/jin3")
    public String jin3() {
        return "WEB-INF/jsp/coach";
    }

    /**
     * 教练管理-根据教练姓名分页查询
     */
    @RequestMapping("/query")
    @ResponseBody
    public Map<String, Object> query(String coachname, int pageSize, int pageNumber) {
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("coachname", coachname);
        map1.put("qi", pageNumber);
        map1.put("shi", pageSize);
        return coachServiceImpl.query(map1);
    }

    /**
     * 教练管理-根据教练id删除教练信息
     */
    @RequestMapping("/del")
    @ResponseBody
    public Map<String, Object> del(int id, String coachname, int pageSize, int pageNumber) {

        coachServiceImpl.deleteByCoachId(id);
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("coachname", coachname);
        map1.put("qi", pageNumber);
        map1.put("shi", pageSize);
        return coachServiceImpl.query(map1);
    }


    /**
     * 教练管理-根据教练姓名计算总数据数量
     */
    @RequestMapping("/count")
    @ResponseBody
    public int count(String coachName) {
        return coachServiceImpl.count(coachName);
    }

    /**
     * 教练管理-添加新教练
     */
    @RequestMapping("/add")
    @ResponseBody
    public  Map<String,Object> save(Coach coach) {
        coachServiceImpl.saveCoach(coach);
        return query("",5,1);
    }

    /**
     * 教练管理-根据教练id查询
     */
    @RequestMapping("/cha")
    @ResponseBody
    public Coach one(int id) {
        return coachServiceImpl.selectByCoachId(id);
    }

    /**
     * 教练管理-修改教练信息
     */
    @RequestMapping("/upd")
    @ResponseBody
    public void upd(Coach coach) {
        coachServiceImpl.updateCoach(coach);
    }
}
