package com.store.snacks.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@TableName("snacks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Snack extends Page {
    private Integer id;
    private String snackcode;
    private String snackname;
    private Integer categid;
    @Override
    protected Serializable pkVal() {
        return id;
    }
}
