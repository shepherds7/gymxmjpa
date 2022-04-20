package com.ccj.gymxmjpa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ccj.gymxmjpa.mapper.LoosMapper;
import com.ccj.gymxmjpa.pojo.Loos;
import com.ccj.gymxmjpa.service.LoosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoosServiceImpl implements LoosService {
    @Autowired
    private LoosMapper loosMapper;

    /**
     * 遗失物品管理service实现层-分页查询
     */
    @Override
    public Map<String, Object> query(Map<String, Object> map1) {
        int pageNumber = (int) map1.get("qi");

        int pageSize = (int) map1.get("shi");
        //分页
        Page<Loos> page = new Page<>(pageNumber, pageSize);
        Page<Loos> loosPage;
        if (map1.get("loosName") != null && !map1.get("loosName").equals("")) {
            loosPage = loosMapper.selectPage(page,
                    new QueryWrapper<Loos>().eq("loosName", null).or().likeRight("loosName", map1.get("loosName")));
        } else {
            loosPage = loosMapper.selectPage(page, null);
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("total", loosPage.getTotal());
        map.put("rows", loosPage.getRecords());
        return map;
    }

    /**
     * 遗失物品管理service实现层-修改信息
     */
    @Override
    public int update(Loos loos) {
        Loos loos1 = loosMapper.selectById(loos.getLoosId());
        loos1.setLoosId(loos1.getLoosId());
        loos1.setLoosStatus(loos.getLoosStatus());
        loos1.setReceiveName(loos.getReceiveName());
        loos1.setReceivePhone(loos.getReceivePhone());
        loos1.setLoosldate(loos.getLoosldate());
        return loosMapper.updateById(loos1);
    }

    /**
     * 遗失物品管理-添加遗失物品
     */
    @Override
    public int insert(Loos loos) {
        return loosMapper.insert(loos);
    }

    /**
     * 根据遗失物品id查询信息
     */
    @Override
    public Loos findById(int loosId) {
        return loosMapper.selectById(loosId);
    }


}
