package com.store.snacks.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@TableName("user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends Model<User> {
    private Integer id;
    private String username;
    private String password;
    private String realname;
    private String phone;
    private String idcardnum;
    private String banknum;

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
