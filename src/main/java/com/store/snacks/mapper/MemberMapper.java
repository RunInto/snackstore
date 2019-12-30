package com.store.snacks.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.store.snacks.entity.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper extends BaseMapper<Member> {
}
