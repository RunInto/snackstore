package com.store.snacks.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.store.snacks.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api(tags = "UserController|用户相关接口")
public class UserController {
    @PostMapping("/insert")
    @ApiOperation(value = "注册", notes = "json格式post传给我，字段名需要和我相同")
    public void insert(@RequestBody User u) {
        u.insert();
    }
    @PostMapping("/update")
    @ApiOperation(value = "修改用户信息", notes = "json格式post请求，字段名需要和我相同，修改哪些字段传哪些")
    public void update(@RequestBody User u) {
        u.updateById();
    }
    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除用户", notes = "请求方式写明了，url传用户id进行删除")
    public void delete(@PathVariable Integer id) {
        new User().deleteById(id);
    }
    @PostMapping("/list")
    @ApiOperation(value = "查询用户列表", notes = "查询条件为用户的信息，传我啥我用啥匹配")
    public List<User> list(@RequestBody User u) {
        return u.selectList(new QueryWrapper<User>(u));
    }
    @GetMapping("/detail/{id}")
    @ApiOperation(value = "查询用户详细信息", notes = "url传id")
    public User detail(@PathVariable Integer id) {
        return new User().selectById(id);
    }
}
