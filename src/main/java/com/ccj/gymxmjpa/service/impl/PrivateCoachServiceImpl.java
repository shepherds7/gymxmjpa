package com.ccj.gymxmjpa.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ccj.gymxmjpa.mapper.CoachMapper;
import com.ccj.gymxmjpa.mapper.MemberMapper;
import com.ccj.gymxmjpa.pojo.Coach;
import com.ccj.gymxmjpa.pojo.Member;
import com.ccj.gymxmjpa.service.PrivateCoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 会员私教课程service实现层
 */
@Service
public class PrivateCoachServiceImpl implements PrivateCoachService {
//
//
//    @Autowired
//    private CoachMapper coachMapper;
//
//    @Autowired
//    private MemberMapper memberMapper;
//
//    /**
//     * 会员私教课程service实现层-分页查询
//     */
//    @Override
//    public Map<String, Object> query(Map<String, Object> map1) {
//        int pageNumber = (int) map1.get("qi");
//
//        int pageSize = (int) map1.get("shi");
//        //分页
//        Page<Coach> page = new Page<>(pageNumber, pageSize);
//        Page<Coach> coachPage;
//        if (map1.get("coachname") != null && !map1.get("coachname").equals("")) {
//            coachPage = coachMapper.selectPage(page,
//                    new QueryWrapper<Coach>()
//                            .eq("coachName", null)
//                            .or().likeRight("coachName", map1.get("coachname")));
//        } else {
//            coachPage = coachMapper.selectPage(page, null);
//        }
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("total", coachPage.getTotal());
//        map.put("rows", coachPage.getRecords());
//        return map;
//    }
//
//    /**
//     * 会员私教课程service实现层-分页查询
//     */
//    @Override
//    public Map<String, Object> query2(Map<String, Object> map1) {
//
//        int pageNumber = (int) map1.get("qi");
//        int pageSize = (int) map1.get("shi");
//        //分页
//        Page<Member> page = new Page<>(pageNumber, pageSize);
//        Page<Member> memberPage;
//        QueryWrapper<Member> memberQueryWrapper = new QueryWrapper<>();
//        memberQueryWrapper.eq("MemberName", null);
//        if (map1.get("hyname") != null && !map1.get("hyname").equals("")) {
//            memberQueryWrapper.eq("MemberName", null).or()
//                    .likeRight("MemberName", map1.get("hyname"));
//        }
//        memberPage = memberMapper.selectPage(page, memberQueryWrapper);
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("total", memberPage.getTotal());
//        map.put("rows", memberPage.getRecords());
//        return map;
//    }
//

}
