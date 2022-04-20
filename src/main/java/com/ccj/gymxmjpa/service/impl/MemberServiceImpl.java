package com.ccj.gymxmjpa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ccj.gymxmjpa.mapper.*;
import com.ccj.gymxmjpa.pojo.*;
import com.ccj.gymxmjpa.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 会员管理service实现层
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private MemberTypeMapper memberTypeMapper;

    @Autowired
    private GoodInfoMapper goodInfoMapper;

    @Autowired
    private PrivateCoachInfoMapper privateCoachInfoMapper;

    @Autowired
    private RechargeMapper rechargeMapper;

    /**
     * 会员管理service实现层-分页查询
     */
    @Override
    public Map<String, Object> query(Map<String, Object> map1) {
        //根据会员到期的日期修改到期后状态
        List<Member> membersList = memberMapper.selectList(null);
        //得到现在的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(new Date());
        try {
            Date now = sdf.parse(date);
            for (Member list : membersList) {
                //得到会员到期时间
                String date1 = list.getMemberxufei().toString();
                if (date1 == null) {
                    date1 = date;
                }
                Date daoqi = sdf.parse(date1);
                Member m = memberMapper.selectById(list.getMemberId());
                if (daoqi.before(now)) {
                    //设置会员状态为不正常
                    m.setMemberStatic(2);
                } else {
                    //设置会员状态为正常
                    m.setMemberStatic(1);
                }
                memberMapper.updateById(m);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int pageNumber = (int) map1.get("qi");
        int pageSize = (int) map1.get("shi");
        int ktype = (int) map1.get("ktype");
        //分页
//        Page<Member> page = new Page<>(pageNumber, pageSize);
//        Page<Member> memberPage;
//        QueryWrapper<Member> memberQueryWrapper = new QueryWrapper<>();
//        memberQueryWrapper.eq("MemberName", null);
//        if (map1.get("hyname") != null && !map1.get("hyname").equals("")) {
//            memberQueryWrapper.eq("MemberName", null)
//                    .or().like("MemberName", map1.get("hyname"));
//        }
//        if (ktype != 0) {
//            memberQueryWrapper.eq("MemberTypes", ktype);
//            memberTypeMapper.queryByPage(page);
//        }
//        memberPage = memberMapper.selectPage(page, memberQueryWrapper);
        Page<Member> memberPage = new Page<>(pageNumber, pageSize);
        memberMapper.getMember(memberPage);
        if (map1.get("hyname") != null && !map1.get("hyname").equals("")) {
            memberMapper.selectPage(memberPage,new QueryWrapper<Member>().eq("MemberName", map1.get("hyname"))
                    .or().like("MemberName", map1.get("hyname")));
        }
        if (ktype != 0) {
            memberMapper.selectPage(memberPage,new QueryWrapper<Member>().eq("MemberTypes", ktype));
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("total", memberPage.getTotal());
        map.put("rows", memberPage.getRecords());
        return map;
    }


    /**
     * 会员管理service实现层-会员到期分页查询
     */
    //会员到期查询
    @Override
    public Map<String, Object> query2(Map<String, Object> map1) {
        int pageNumber = (int) map1.get("qi");
        int pageSize = (int) map1.get("shi");
        int ktype = (int) map1.get("ktype");
        //分页
//        Page<Member> page = new Page<>(pageNumber, pageSize);
//        Page<Member> memberPage;
//        QueryWrapper<Member> memberQueryWrapper = new QueryWrapper<>();
//        memberQueryWrapper.eq("MemberName", null);

//        if (ktype != 0) {
//            memberQueryWrapper.eq("MemberTypes", ktype).eq("memberStatic", 2);
//        }

        Page<Member> memberPage = new Page<>(pageNumber, pageSize);
        if (map1.get("hyname") != null && !map1.get("hyname").equals("")) {
            memberMapper.selectList(new QueryWrapper<Member>().eq("MemberName", map1.get("hyname"))
                    .or().like("MemberName", map1.get("hyname")));
        }
        if (ktype != 0) {
            memberMapper.selectById(ktype);
        }
        memberMapper.getMember(memberPage);
        HashMap<String, Object> map = new HashMap<>();
        map.put("total", memberPage.getTotal());
        map.put("rows", memberPage.getRecords());
        return map;
    }

    /**
     * 会员管理service实现层-根据会员id删除
     */
    @Override
    public int del(int id) {
        Long memid = (long) id;
//        //先根据会员id在私教信息表里查询是否有其信息
//        List<Privatecoachinfo> list = privateCoachInfoMapper.queryByIdNative(memid);
//        if (list != null && list.size() > 0) {
//            for (Privatecoachinfo privatecoachinfo : list) {
//                if (memid.equals(privatecoachinfo.getMember().getMemberId())) {
//                    privateCoachInfoMapper.deleteById(privatecoachinfo);
//                }
//            }
//        }
//
//        //再根据会员id在商品信息表中查是否有其信息
//        List<GoodInfo> goodInfoList = goodInfoMapper.queryByIdNative(memid);
//        if (goodInfoList != null && goodInfoList.size() > 0) {
//            for (GoodInfo goodInfo : goodInfoList) {
//                if (memid.equals(goodInfo.getMember().getMemberId())) {
//                    goodInfoMapper.deleteById(goodInfo);
//                }
//            }
//        }
//
//        //根据会员id在充值信息表中查询是否有其信息
//        List<Recharge> rechargeList = rechargeMapper.selectList(new QueryWrapper<Recharge>().eq("memberid", id));
//        if (rechargeList != null && rechargeList.size() > 0) {
//            for (Recharge recharge : rechargeList) {
//                if (memid.equals(recharge.getMember().getMemberId())) {
//                    rechargeMapper.deleteById(recharge);
//                }
//            }
//        }
        //删除此会员
        return memberMapper.deleteById(memid);
    }


    /**
     * 会员管理service实现层-添加会员
     */
    @Override
    public int insert(Member member) {
        member.setMemberStatic(1);
        return memberMapper.insert(member);
    }


    /**
     * 会员管理service实现层-修改会员信息
     */
    @Override
    public int update(Member member) {
        return memberMapper.updateById(member);
    }

    /**
     * 会员管理service实现层-根据id查询会员信息
     */
    @Override
    public Member select(int id) {
        return memberMapper.selectById(id);
    }


    /**
     * 会员管理service实现层-修改会员信息
     */
    @Override
    public int upd(Member member) {
        Member member1 = memberMapper.selectById(member.getMemberId());
        member1.setMemberbalance(member.getMemberbalance());
        return memberMapper.updateById(member);
    }

    /**
     * 根据id信息
     */
    @Override
    public Member findById(int memberId) {
        return memberMapper.selectById(memberId);
    }

}
