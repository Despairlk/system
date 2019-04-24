package com.fenger.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName("sys_role")
@Data
public class Role {
    private Integer id;
    private String name;
    private String remark;
    private Integer available;
    private Date createtime;

}
