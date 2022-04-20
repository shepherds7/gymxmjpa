package com.ccj.gymxmjpa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ccj.gymxmjpa.pojo.Subject;
import org.apache.ibatis.annotations.Mapper;

/**
 * 课程信息层接口
 */
@Mapper
public interface SubjectMapper extends BaseMapper<Subject> {
}
