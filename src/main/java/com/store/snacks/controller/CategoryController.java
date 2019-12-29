package com.store.snacks.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.store.snacks.entity.Category;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
@Api(tags = "CategoryController|食品类别相关接口")
public class CategoryController {
    @PostMapping("/insert")
    public void insert(@RequestBody Category c){
        c.insert();
    }
    @PostMapping("/list")
    @ApiOperation(value = "查询食品类别列表", notes = "查询条件为类别的信息，传我啥我用啥匹配,不传查全部")
    public List<Category> list(@RequestBody Category c) {
        return c.selectList(new QueryWrapper<Category>(c));
    }
    @PostMapping("/detail")
    public Category detail(@RequestBody Category c) {
        return c.selectOne(new QueryWrapper<Category>(c));
    }
}
