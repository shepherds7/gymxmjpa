package com.ccj.gymxmjpa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ccj.gymxmjpa.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品信息层接口
 */
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {

}
