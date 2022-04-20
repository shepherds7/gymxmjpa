package com.ccj.gymxmjpa.service;

import com.ccj.gymxmjpa.pojo.Member;

import java.util.Map;

public interface MemberService {

    Map<String,Object> query(Map<String,Object> map1);

    Map<String,Object> query2(Map<String,Object> map1);

    int del(int id);

    int insert(Member member);

    int update(Member member);

    Member select(int id);

    int upd(Member member);

    Member findById(int memberId);
}
