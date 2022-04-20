package com.ccj.gymxmjpa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ccj.gymxmjpa.mapper.EquipmentMapper;
import com.ccj.gymxmjpa.pojo.Equipment;
import com.ccj.gymxmjpa.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    private EquipmentMapper equipmentMapper;


    /**
     * 器材管理service实现层-分页查询
     */
    @Override
    public Map<String, Object> query(Map<String, Object> map1) {

        int pageNumber = (int) map1.get("qi");

        int pageSize = (int) map1.get("shi");
        //分页
        Page<Equipment> page = new Page<>(pageNumber, pageSize);
        Page<Equipment> equipmentPage;
        if (map1.get("hyname") != null && !map1.get("hyname").equals("")) {
            equipmentPage = equipmentMapper.selectPage(page,
                    new QueryWrapper<Equipment>().eq("eqName", null).or().likeRight("eqName", map1.get("hyname")));
        } else {
            equipmentPage = equipmentMapper.selectPage(page, null);
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("total", equipmentPage.getTotal());
        map.put("rows", equipmentPage.getRecords());
        return map;
    }

    /**
     * 器材管理service实现层-新增
     */
    @Override
    public int insertEp(Equipment equipment) {
        return equipmentMapper.insert(equipment);
    }


    /**
     * 器材管理service实现层-删除
     */
    @Override
    public int deleteEp(int qeId) {
        return equipmentMapper.deleteById(qeId);
    }

}
