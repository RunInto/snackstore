package com.store.snacks.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.store.snacks.entity.Snack;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SnackMapper extends BaseMapper<Snack> {
}
