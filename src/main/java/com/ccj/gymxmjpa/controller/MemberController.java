package com.ccj.gymxmjpa.controller;


import com.ccj.gymxmjpa.pojo.Member;
import com.ccj.gymxmjpa.pojo.Membertype;
import com.ccj.gymxmjpa.pojo.Recharge;
import com.ccj.gymxmjpa.service.impl.MemberServiceImpl;

import com.ccj.gymxmjpa.service.impl.RechargeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 会员管理Controller控制层
 */
@Controller
@RequestMapping("/menber")
public class MemberController {
    @Autowired
    private MemberServiceImpl memberServiceImpl;

    @Autowired
    private RechargeServiceImpl rechargeServiceImpl;

    /**
     * 会员管理-进入会员到期界面
     */
    @RequestMapping("/jin2")

    public String jin2() {
        return "WEB-INF/jsp/HYMemberDaoQi";
    }

    /**
     * 会员管理-进入会员续费充值界面
     */
    @RequestMapping("/jin3")
    public String jin3() {
        return "WEB-INF/jsp/HYMemberChongZhi";
    }

    /**
     * 会员管理-进入会员余额充值界面
     */
    @RequestMapping("/jin11")
    public String jin11() {
        return "WEB-INF/jsp/HYMemberyeChongZhi";
    }


    /**
     * 会员管理-进入会员列表界面
     */
    @RequestMapping("/jin")
    public String jin() {

        return "WEB-INF/jsp/HYMember";
    }

    /**
     * 教练管理-进入会员私教详情界面
     */
    @RequestMapping("/jin4")
    public String jin4() {

        return "WEB-INF/jsp/privatecoachinfo";
    }


    /**
     * @Description: 会员列表-分页查询
     * @Author: LiuJian
     * @Date: 2020/4/6
     */
    @RequestMapping("/query")
    @ResponseBody
    public Map<String, Object> query(int ktype, String hyname, int pageSize, int pageNumber) {
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("hyname", hyname);
        map1.put("ktype", ktype);
        map1.put("qi", pageNumber);
        map1.put("shi", pageSize);
        return memberServiceImpl.query(map1);
    }

    /**
     * @Description: 会员到期-分页查询
     * @Author: LiuJian
     * @Date: 2020/4/6
     */
    @RequestMapping("/query2")
    @ResponseBody
    public Map<String, Object> query2(int ktype, String hyname, int pageSize, int pageNumber) {
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("hyname", hyname);
        map1.put("ktype", ktype);
        map1.put("qi", pageNumber);
        map1.put("shi", pageSize);
        return memberServiceImpl.query2(map1);
    }

    /**
     * 会员续卡-根据会员id查询会员信息
     */
    @RequestMapping("/cha")
    @ResponseBody
    public Member query2(int id) {
        return memberServiceImpl.findById(id);
    }
    
    /**
     * 会员管理-根据会员id删除
     */
    @RequestMapping("/delete")
    @ResponseBody
    public Map<String, Object> del(int memid) {
        memberServiceImpl.del(memid);
        return query(0, "", 5, 1);
    }


    /**
     * 会员管理-添加新会员
     */
    @RequestMapping("/insert")
    @ResponseBody
    public Map<String, Object> insert(Member member) {
        memberServiceImpl.insert(member);
        return query(0, "", 5, 1);
    }

    /**
     * 会员管理-修改会员信息
     */
    @RequestMapping("/update")
    @ResponseBody
    public Map<String, Object> update(Member member) {
        memberServiceImpl.update(member);
        return query(0, "", 5, 1);
    }

    /**
     * @Description: 会员卡续费-添加会员卡续费记录

     */
    @RequestMapping("/ins")
    @ResponseBody
    public Map<String, Object> insert(Recharge recharge, String daoqi) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Timestamp dat = Timestamp.valueOf(df.format(new Date()));
        recharge.setDate(dat);
        recharge.setCzStatic(2L);
        rechargeServiceImpl.save(recharge);

        Membertype membertype = new Membertype();
        membertype.setTypeId(recharge.getTypeid());

        Member member = memberServiceImpl.findById(recharge.getMember().getMemberId());

        member.setMemberId(recharge.getMember().getMemberId());
        member.setMemberStatic(1);
        member.setMembertype(membertype);

        java.sql.Date date = java.sql.Date.valueOf(daoqi);

        member.setMemberxufei(date);
        memberServiceImpl.update(member);
        return query(0, null, 5, 1);
    }


}
