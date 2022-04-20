package com.ccj.gymxmjpa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ccj.gymxmjpa.pojo.Member;
import com.ccj.gymxmjpa.pojo.Membertype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 会员信息层接口
 */
@Mapper
public interface MemberMapper extends BaseMapper<Member> {
    IPage<Member> getMember(Page page);

    List<Membertype> getMembertype(int id);



}
