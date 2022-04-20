package com.ccj.gymxmjpa.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ccj.gymxmjpa.mapper.CoachMapper;
import com.ccj.gymxmjpa.pojo.Coach;
import com.ccj.gymxmjpa.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class CoachServiceImpl implements CoachService {
    @Autowired
    private CoachMapper coachMapper;

    //教练管理service实现层-分页查询
    @Override
    public Map<String, Object> query(Map<String, Object> map1) {

        int pageNumber = (int) map1.get("qi");

        int pageSize = (int) map1.get("shi");
        //分页
        Page<Coach> page = new Page<>(pageNumber, pageSize);
        Page<Coach> coachPage;
        if (map1.get("coachname") != null && !map1.get("coachname").equals("")) {
            coachPage = coachMapper.selectPage(page,
                    new QueryWrapper<Coach>().like("coachName", map1.get("coachname")));
        } else {
            coachPage = coachMapper.selectPage(page, null);
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("total", coachPage.getTotal());
        map.put("rows", coachPage.getRecords());
        return map;
    }

    //教练管理service实现层-查询总数据
    public Integer count(String coachName) {
        Integer count = coachMapper.selectCount(new QueryWrapper<Coach>().eq("coachName", coachName));
        return count;
    }

    //根据教练id删除教练信息
    @Override
    public void deleteByCoachId(int id) {
        coachMapper.deleteById(id);
    }

    //教练管理-添加新教练
    @Override
    public void saveCoach(Coach coach) {
        coachMapper.insert(coach);
    }

    //教练管理-根据教练id查询
    @Override
    public Coach selectByCoachId(int id) {
        return coachMapper.selectById(id);

    }

    //教练管理-修改教练信息
    @Override
    public void updateCoach(Coach coach) {
        coachMapper.updateById(coach);
    }

}
