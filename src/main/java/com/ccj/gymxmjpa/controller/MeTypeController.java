package com.ccj.gymxmjpa.controller;


import com.ccj.gymxmjpa.mapper.MemberTypeMapper;
import com.ccj.gymxmjpa.pojo.Membertype;
import com.ccj.gymxmjpa.service.impl.MemberTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

/**
 * 会员卡类型信息Controller控制层
 */
@Controller
@RequestMapping("/metype")
public class MeTypeController {

    @Autowired
    private MemberTypeMapper memberTypeMapper;
    @Autowired
    private MemberTypeServiceImpl memberTypeServiceImpl;

    /**
     * 会员卡类型-根据id查询
     */
    @RequestMapping("/cha")
    @ResponseBody
    public Membertype one(int typeId) {
        return memberTypeServiceImpl.selectById(typeId);
    }

    /**
     * 会员卡类型-修改会员卡类型信息
     */
    @RequestMapping("/upd")
    @ResponseBody
    public void upd(Membertype membertype) {
        memberTypeMapper.updateById(membertype);
    }
}
