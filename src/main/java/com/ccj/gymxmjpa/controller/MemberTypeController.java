package com.ccj.gymxmjpa.controller;


import com.ccj.gymxmjpa.pojo.Membertype;
import com.ccj.gymxmjpa.service.impl.MemberTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 会员卡类型Controller控制层
 */
@Controller
@RequestMapping("/ktype")
public class MemberTypeController {

    @Autowired
    private MemberTypeServiceImpl memberTypeServiceImpl;
    /**
     * 会员卡类型-进入jsp页面
     */
    @RequestMapping("/jin5")
    public String jin5() {

        return "WEB-INF/jsp/Membertype";
    }

    /**
     * @Description: 会员卡类型-查询所有数据
     */
    @RequestMapping("/query")
    @ResponseBody
    public List<Membertype> query() {
        return memberTypeServiceImpl.selectMemberType();
    }

    /**
     * 会员卡类型-分页查询
     */
    @RequestMapping("/queryq")
    @ResponseBody
    public Map<String, Object> query(String typeName, int pageSize, int pageNumber) {
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("typeName", typeName);
        map1.put("qi", pageNumber);
        map1.put("shi", pageSize);
        return memberTypeServiceImpl.query(map1);
    }

    /**
     *  会员卡类型-根据id查询
     */
    @RequestMapping("/query2")
    @ResponseBody
    public Membertype query2(int xztype){
        return memberTypeServiceImpl.selectById(xztype);
    }

}
