package com.ccj.gymxmjpa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ccj.gymxmjpa.pojo.Privatecoachinfo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;

/**
 * 私教信息层接口
 */
@Mapper
public interface PrivateCoachInfoMapper extends BaseMapper<Privatecoachinfo> {
    @Select(value = "select * FROM  privatecoachinfo where memberid = #{memberid} ")
    public List<Privatecoachinfo> queryByIdNative(@Param("memberid") long memberid);

    @Select(value = "select * FROM  privatecoachinfo where coachid =#{coachid}")
    public List<Privatecoachinfo> queryByCoachIdNative(@Param("coachid") long coachid);

    @Select(value = "select * FROM  privatecoachinfo where subjectid = #{subjectid}")
    public List<Privatecoachinfo> queryBySubjectIdNative(@Param("subjectid") long subjectid);
}
