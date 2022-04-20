package com.ccj.gymxmjpa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ccj.gymxmjpa.pojo.Equipment;
import org.apache.ibatis.annotations.Mapper;

/**
 * 设备信息层接口
 */
@Mapper
public interface EquipmentMapper extends BaseMapper<Equipment> {
}
