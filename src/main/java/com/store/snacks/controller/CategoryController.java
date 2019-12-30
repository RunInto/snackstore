package com.store.snacks.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.store.snacks.entity.Category;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@Api(tags = "CategoryController|食品类别相关接口")
public class CategoryController {
    @PostMapping("/insert")
    @ApiOperation(value = "添加", notes = "json格式post传给我，字段名需要和我相同")
    public void insert(@RequestBody Category c){
        c.insert();
    }
    @PostMapping("/list")
    @ApiOperation(value = "查询食品类别列表", notes = "查询条件为类别的信息，传我啥我用啥匹配,不传查全部")
    public List<Category> list(@RequestBody Category c) {
        return c.selectList(new QueryWrapper<Category>(c));
    }
    @PostMapping("/detail")
    @ApiOperation(value = "详细", notes = "json格式post传给我，字段名需要和我相同")
    public Category detail(@RequestBody Category c) {
        return c.selectOne(new QueryWrapper<Category>(c));
    }
    @PostMapping("/update")
    @ApiOperation(value = "更新", notes = "json格式post传给我，字段名需要和我相同")
    public void update(@RequestBody Category c) {
        c.update(new QueryWrapper<>(c));
    }
    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除", notes = "id 删除")
    public void delete(@PathVariable Integer id) {
        new Category().deleteById(id);
    }
}
