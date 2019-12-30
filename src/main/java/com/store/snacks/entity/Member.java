package com.store.snacks.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member extends Model<Member> {
    private Integer id;
    private String mcode;
    private String mname;
    private Integer userid;
}
