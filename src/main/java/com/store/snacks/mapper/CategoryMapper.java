package com.store.snacks.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.store.snacks.entity.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
