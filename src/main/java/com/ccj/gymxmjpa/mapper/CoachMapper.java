package com.ccj.gymxmjpa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ccj.gymxmjpa.pojo.Coach;
import org.apache.ibatis.annotations.Mapper;

/**
 * 教练信息层接口
 */
@Mapper
public interface CoachMapper extends BaseMapper<Coach> {

}
