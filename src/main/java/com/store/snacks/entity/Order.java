package com.store.snacks.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

@TableName("order")
@Data
public class Order extends Model<Order> {
    private Integer id;


    @Override
    protected Serializable pkVal() {
        return id;
    }
}
