package com.ccj.gymxmjpa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ccj.gymxmjpa.mapper.SubjectMapper;
import com.ccj.gymxmjpa.pojo.Subject;
import com.ccj.gymxmjpa.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 课程管理service实现层
 */
@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectMapper subjectMapper;

    @Override
    public Map<String, Object> query(Map<String, Object> map1) {
        int pageNumber = (int) map1.get("qi");

        int pageSize = (int) map1.get("shi");
        //分页
        Page<Subject> page = new Page<>(pageNumber, pageSize);
        Page<Subject> subjectPage;
        if (map1.get("subname") != null && !map1.get("subname").equals("")) {
            subjectPage = subjectMapper.selectPage(page,
                    new QueryWrapper<Subject>().eq("subname", null).or().likeRight("subname", map1.get("subname")));
        } else {
            subjectPage = subjectMapper.selectPage(page, null);
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("total", subjectPage.getTotal());
        map.put("rows", subjectPage.getRecords());
        return map;
    }

    /**
     * 课程管理service实现层-计算总数量
     */
    @Override
    public int count(String subName) {
        Integer count = subjectMapper.selectCount(new QueryWrapper<Subject>().eq("subname", subName));
        return count;
    }

    /**
     * 根据课程id删除课程
     */
    @Override
    public int deleteById(int subId) {
        return subjectMapper.deleteById(subId);
    }

    /**
     * 课程管理-添加课程
     */
    @Override
    public int addSubject(Subject subject) {
        return subjectMapper.insert(subject);
    }

    /**
     * 根据课程id查询课程信息
     */
    @Override
    public Subject findById(int subId) {
        return subjectMapper.selectById(subId);
    }

    /**
     * 修改课程信息
     */
    @Override
    public int updateSubject(Subject subject) {
        return subjectMapper.updateById(subject);
    }

}
