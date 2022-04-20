package com.ccj.gymxmjpa.controller;

import com.ccj.gymxmjpa.mapper.PrivateCoachInfoMapper;
import com.ccj.gymxmjpa.pojo.Privatecoachinfo;
import com.ccj.gymxmjpa.pojo.Subject;
import com.ccj.gymxmjpa.service.impl.SubjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 课程管理Controller控制层
 */
@Controller
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectServiceImpl subjectServiceImpl;

    @Autowired
    private PrivateCoachInfoMapper privateCoachInfoMapper;

    /**
     * 课程管理-进入课程信息界面
     */
    @RequestMapping("/jin7")
    public String jin7() {

        return "WEB-INF/jsp/subject";
    }

    /**
     * 课程管理-根据课程名称分页查询
     */
    @RequestMapping("/query")
    @ResponseBody
    public Map<String, Object> query(String subname, int pageSize, int pageNumber) {
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("subname", subname);
        map1.put("qi", pageNumber);
        map1.put("shi", pageSize);
        return subjectServiceImpl.query(map1);
    }


    /**
     * 课程管理-根据课程id删除课程
     */
    @RequestMapping("/del")
    @ResponseBody
    public Map<String, Object> del(int subId) {

        //先根据教练id在私教信息表里查询是否有其信息
//        List<Privatecoachinfo> privateCoachInfoList = privateCoachInfoMapper.queryBySubjectIdNative(subId);
//        if (privateCoachInfoList != null && privateCoachInfoList.size() > 0) {
//            //如果有,先循环删除
//            for (Privatecoachinfo privateCoachInfo : privateCoachInfoList) {
//                if (subId == privateCoachInfo.getSubjectid()) {
//                    privateCoachInfoMapper.deleteById(privateCoachInfo);
//                }
//            }
//        }
        subjectServiceImpl.deleteById(subId);
        return query("",5,1);
    }

    /**
     * 课程管理-添加课程
     */
    @RequestMapping("/add")
    @ResponseBody
    public void save(Subject subject) {
        subjectServiceImpl.addSubject(subject);
    }

    /**
     * 课程管理-根据课程id查询课程信息
     */
    @RequestMapping("/cha")
    @ResponseBody
    public Subject one(int subId) {
        return subjectServiceImpl.findById(subId);
    }

    /**
     * 课程管理-修改课程信息
     */
    @RequestMapping("/upd")
    @ResponseBody
    public void upd(Subject subject) {
        subjectServiceImpl.updateSubject(subject);
    }

    /**
     * 课程管理-根据课程名称计算总课程数据
     */
    @RequestMapping("/count")
    @ResponseBody
    public int count(String subname) {
        return subjectServiceImpl.count(subname);
    }


}
