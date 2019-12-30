package com.store.snacks.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@TableName("order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order extends Model<Order> {
    private Integer id;
    private String ocode;
    private String oname;
    private Integer userid;
    private Integer snackid;
    private Integer currentPage;
    private Integer pageSize;

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
