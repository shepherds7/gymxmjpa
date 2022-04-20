package com.ccj.gymxmjpa.service;

import com.ccj.gymxmjpa.pojo.Loos;

import java.util.Map;

public interface LoosService {
    Map<String, Object> query(Map<String, Object> map1);

    int update(Loos loos);

    int insert(Loos loos);

    Loos findById(int loosId);
}
