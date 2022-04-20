package com.ccj.gymxmjpa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ccj.gymxmjpa.pojo.AdminUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * 管理员层接口
 */
@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUser> {

}
