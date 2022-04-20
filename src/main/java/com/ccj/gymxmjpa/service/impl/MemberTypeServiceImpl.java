package com.ccj.gymxmjpa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ccj.gymxmjpa.mapper.MemberTypeMapper;
import com.ccj.gymxmjpa.pojo.Membertype;
import com.ccj.gymxmjpa.service.MemberTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 会员卡类型service实现层
 */
@Service
public class MemberTypeServiceImpl implements MemberTypeService {

    @Autowired
    private MemberTypeMapper memberTypeMapper;

    /**
     * 会员卡类型service实现层-查询所有会员卡类型
     */
    @Override
    public List<Membertype> selectMemberType() {
        List<Membertype> list = memberTypeMapper.selectList(null);
        return list;

    }

    /**
     * 会员卡类型service实现层-根据id查询会员卡类型信息
     */
    @Override
    public Membertype selectById(int id) {
        Membertype list = memberTypeMapper.selectById(id);
        return list;
    }

    /**
     * 会员卡类型service实现层-分页查询
     */
    @Override
    public Map<String, Object> query(Map<String, Object> map1) {
        int pageNumber = (int) map1.get("qi");

        int pageSize = (int) map1.get("shi");
        //分页
        Page<Membertype> page = new Page<>(pageNumber, pageSize);
        Page<Membertype> membertypePage;
        if (map1.get("typeName") != null && !map1.get("typeName").equals("")) {
            membertypePage = memberTypeMapper.selectPage(page,
                    new QueryWrapper<Membertype>().eq("TypeName", null)
                            .or().likeRight("TypeName", map1.get("typeName")));
        } else {
            membertypePage = memberTypeMapper.selectPage(page, null);
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("total", membertypePage.getTotal());
        map.put("rows", membertypePage.getRecords());
        return map;
    }
}
