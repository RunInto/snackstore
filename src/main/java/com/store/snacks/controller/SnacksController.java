package com.store.snacks.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.store.snacks.entity.Snack;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/snack")
@Api(tags = "SnacksController|零食相关接口")
public class SnacksController {

    @PostMapping("/list")
    @ApiOperation(value = "查询零食列表", notes = "查询条件为零食的信息，返回的Page对象包装了全部列表和总共条数")
    public Page list(@RequestBody Snack s) {
       Page p = new Page<Snack>(s.getCurrentPage(),s.getPageSize());
       QueryWrapper<Snack> q = new QueryWrapper<>(s);
       Page page = s.selectPage(p, q);
       return page;
    }
    @PostMapping("/detail")
    @ApiOperation(value = "查询零食详细", notes = "查询条件为零食的信息")
    public Snack detail(@RequestBody Snack s) {
        return s.selectOne(new QueryWrapper<>(s));
    }
    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除零食", notes = "id删除")
    public void delete(@PathVariable Integer id) {
        new Snack().deleteById(id);
    }
    @PostMapping("/insert")
    @ApiOperation(value = "添加", notes = "json格式post传给我，字段名需要和我相同")
    public void insert(@RequestBody Snack s) {
        s.insert();
    }
    @ApiOperation(value = "更新", notes = "json格式post传给我，字段名需要和我相同")
    @PostMapping("/update")
    public void update(@RequestBody Snack s) {
        s.update(new QueryWrapper<>(s));
    }
}
