package com.ccj.gymxmjpa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ccj.gymxmjpa.pojo.Member;
import com.ccj.gymxmjpa.pojo.Membertype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *  会员卡类型信息层接口
 */
@Mapper
public interface MemberTypeMapper extends BaseMapper<Membertype> {
    IPage<Membertype> queryByPage(IPage page);

    List<Member> getMembers(int id);



}
