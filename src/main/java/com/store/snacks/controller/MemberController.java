package com.store.snacks.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.store.snacks.entity.Member;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
@Api(tags = "MemberController|会员管理相关接口")
public class MemberController {
    @PostMapping("/insert")
    @ApiOperation(value = "添加", notes = "json格式post传给我，字段名需要和我相同")
    public void insert(@RequestBody Member m) {
        m.insert();
    }
    @PostMapping("/detail")
    @ApiOperation(value = "详细", notes = "json格式post传给我，字段名需要和我相同")
    public Member detail(@RequestBody Member m) {
        return m.selectOne(new QueryWrapper<>(m));
    }
    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除", notes = "id 删除")
    public void delete(@PathVariable Integer id) {
        new Member().deleteById(id);
    }
    @PostMapping("/update")
    @ApiOperation(value = "更新", notes = "json格式post传给我，字段名需要和我相同")
    public void update(@RequestBody Member m) {
        m.update(new QueryWrapper<>(m));
    }

}
