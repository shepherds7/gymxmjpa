package com.ccj.gymxmjpa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ccj.gymxmjpa.mapper.CoachMapper;
import com.ccj.gymxmjpa.mapper.PrivateCoachInfoMapper;
import com.ccj.gymxmjpa.pojo.Privatecoachinfo;
import com.ccj.gymxmjpa.service.PrivateCoachInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 会员私教信息service实现层
 */
@Service
public class PrivateCoachInfoServiceImpl implements PrivateCoachInfoService {
//    @Autowired
//    private PrivateCoachInfoMapper privateCoachInfoMapper;
//    @Autowired
//    private CoachMapper coachMapper;
//
//
//    /**
//     * 会员私教信息service实现层-分页查询
//     */
//    @Override
//    public Map<String, Object> query(Map<String, Object> map1) {
//        int pageNumber = (int) map1.get("qi");
//
//        int pageSize = (int) map1.get("shi");
//        //分页
//        Page<Privatecoachinfo> page = new Page<>(pageNumber, pageSize);
//        Page<Privatecoachinfo> privatecoachinfoPage;
//        if (map1.get("subjectid") != null && !map1.get("subjectid").equals("")) {
//            privatecoachinfoPage = privateCoachInfoMapper.selectPage(page,
//                    new QueryWrapper<Privatecoachinfo>()
//                            .eq("subjectid", map1.get("subjectid")));
//        } else if (map1.get("coachid") != null && !map1.get("coachid").equals("")) {
//            privatecoachinfoPage = privateCoachInfoMapper.selectPage(page,
//                    new QueryWrapper<Privatecoachinfo>()
//                            .eq("coachid", map1.get("coachid")));
//        } else if (map1.get("memberid") != null && !map1.get("memberid").equals("")) {
//            privatecoachinfoPage = privateCoachInfoMapper.selectPage(page,
//                    new QueryWrapper<Privatecoachinfo>()
//                            .eq("memberid", map1.get("memberid")));
//        } else {
//            privatecoachinfoPage = privateCoachInfoMapper.selectPage(page, null);
//        }
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("total", privatecoachinfoPage.getTotal());
//        map.put("rows", privatecoachinfoPage.getRecords());
//        return map;
//    }
//
//    /**
//     * 会员私教信息service实现层-计算总数量
//     */
//    @Override
//    public int count(int memId) {
//        Integer count = privateCoachInfoMapper.selectCount(new QueryWrapper<Privatecoachinfo>()
//                .eq("memberid", memId));
//        return count;
//    }
//
//    /**
//     * 会员私教信息service实现层-修改会员私教信息
//     */
//    @Override
//    public int update(Privatecoachinfo privatecoachinfo) {
//        Privatecoachinfo privatecoachinfo1 = privateCoachInfoMapper.selectById(privatecoachinfo.getPid());
//        privatecoachinfo1.setCoach(privatecoachinfo1.getCoach());
//        return privateCoachInfoMapper.updateById(privatecoachinfo1);
//    }
//
//
//    /**
//     * 会员私教信息service实现层-根据会员id查询
//     */
//    @Override
//    public List<Privatecoachinfo> byMemberid(int memId) {
//        List<Privatecoachinfo> list = privateCoachInfoMapper.selectList(
//                new QueryWrapper<Privatecoachinfo>().eq("memeberid", memId));
//        return list;
//    }
//


}
