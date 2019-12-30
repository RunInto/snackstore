package com.store.snacks.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.store.snacks.entity.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@Api(tags = "OrderController|订单相关接口")
public class OrderController {
    @PostMapping("/insert")
    @ApiOperation(value = "添加", notes = "json格式post传给我，字段名需要和我相同")
    public void insert(@RequestBody Order o) {
        o.insert();
    }
    @PostMapping("/update")
    @ApiOperation(value = "更新", notes = "json格式post传给我，字段名需要和我相同")
    public void update(@RequestBody Order o) {
        o.update(new QueryWrapper<Order>(o));
    }
    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除", notes = "id删除")
    public void delete(@PathVariable Integer id) {
        new Order().deleteById(id);
    }
    @PostMapping("/select")
    @ApiOperation(value = "查询订单列表", notes = "查询条件为订单的信息，返回的Page对象包装了全部列表和总共条数")
    public Page list(@RequestBody Order s) {
        Page p = new Page<Order>(s.getCurrentPage(),s.getPageSize());
        QueryWrapper<Order> q = new QueryWrapper<Order>(s);
        Page page = s.selectPage(p, q);
        return page;
    }
    @PostMapping("/detail")
    @ApiOperation(value = "查询订单详细", notes = "查询条件为订单的信息")
    public Order detail(@RequestBody Order s) {
        return s.selectOne(new QueryWrapper<>(s));
    }
}
