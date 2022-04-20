package com.ccj.gymxmjpa.service;

import com.ccj.gymxmjpa.pojo.Membertype;

import java.util.List;
import java.util.Map;

public interface MemberTypeService {
    List<Membertype> selectMemberType();

    Membertype selectById(int id);

    Map<String,Object> query(Map<String,Object> map1);
}
