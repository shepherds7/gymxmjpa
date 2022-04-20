package com.ccj.gymxmjpa.service;


import com.ccj.gymxmjpa.pojo.Coach;

import java.util.Map;

public interface CoachService {

    Map<String, Object> query(Map<String,Object> map1);

    Integer count(String  coachName);

    void deleteByCoachId(int id);

    void saveCoach(Coach coach);

    Coach selectByCoachId(int id);

    void updateCoach(Coach coach);
}
