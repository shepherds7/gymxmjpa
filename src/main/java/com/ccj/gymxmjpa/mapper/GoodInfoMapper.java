package com.ccj.gymxmjpa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ccj.gymxmjpa.pojo.*;
import org.apache.ibatis.annotations.*;


import java.util.List;

/**
 * 商品统计信息层接口
 */
@Mapper
public interface GoodInfoMapper extends BaseMapper<GoodInfo> {
//
//    @Select(value = "select * FROM  chongzhi where memberid =#{memberid}")
//    public List<GoodInfo> queryByIdNative(@Param("memberid") long memberid);

    @Select(value = "select * FROM  goodinfo where goodsid =#{goodsid}")
    public List<GoodInfo> queryByGoodsIdNative(@Param("goodsid") long goodsid);
}
