package com.store.snacks.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@TableName("Category")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category extends Model<Category> {
    private Integer id;
    private String categcode;
    private String categname;

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
