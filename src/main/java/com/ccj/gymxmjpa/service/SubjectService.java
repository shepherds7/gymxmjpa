package com.ccj.gymxmjpa.service;

import com.ccj.gymxmjpa.pojo.Subject;

import java.util.Map;

public interface SubjectService {

    Map<String,Object> query(Map<String,Object> map1);

    int count(String  subName);

    int deleteById(int subId);

    int addSubject(Subject subject);

    Subject findById(int subId);

    int updateSubject(Subject subject);
}
