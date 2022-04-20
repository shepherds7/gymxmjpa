package com.ccj.gymxmjpa.controller;

import com.ccj.gymxmjpa.mapper.MemberMapper;
import com.ccj.gymxmjpa.mapper.RechargeMapper;
import com.ccj.gymxmjpa.pojo.Member;
import com.ccj.gymxmjpa.pojo.Recharge;
import com.ccj.gymxmjpa.service.impl.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 会员充值管理Controller控制层
 */

@Controller
@RequestMapping("/cz")
public class RechargeController {

    @Autowired
    private RechargeMapper rechargeMapper;

    @Autowired
    private MemberServiceImpl memberServiceImpl;


    /**
     * 会员充值管理-进入会员充值记录界面
     */
    @RequestMapping("/jin")
    public String jin() {
        return "WEB-INF/jsp/HYMemberjilu";
    }

    /**
     * 信息统计-进入收入统计界面
     */
    @RequestMapping("/jin2")
    public String jin2() {
        return "WEB-INF/jsp/HYMember";
    }

    /**
     * 会员余额充值
     */
    @RequestMapping("/xin")
    @ResponseBody
    public Map<String, Object> cye(Recharge chongzhi) {

        //充值money
        Member member = memberServiceImpl.findById(chongzhi.getMember().getMemberId());
        member.setMemberbalance(member.getMemberbalance() + chongzhi.getMoney());
        memberServiceImpl.update(member);

        //添加充值记录
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.sql.Timestamp dat = java.sql.Timestamp.valueOf(df.format(new Date()));
        chongzhi.setDate(dat);
        chongzhi.setCzStatic(1L);
        rechargeMapper.insert(chongzhi);
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("hyname", null);
        map1.put("ktype", 0);
        map1.put("qi", 1);
        map1.put("shi", 5);
        return memberServiceImpl.query(map1);
    }


}
