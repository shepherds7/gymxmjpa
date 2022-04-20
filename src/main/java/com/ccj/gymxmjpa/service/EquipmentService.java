package com.ccj.gymxmjpa.service;

import com.ccj.gymxmjpa.pojo.Equipment;

import java.util.Map;

public interface EquipmentService {
    Map<String,Object> query(Map<String,Object> map1);

    int insertEp(Equipment equipment);

    int deleteEp(int qeId);
}
