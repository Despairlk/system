package com.fenger.vo;

import com.fenger.entity.Role;
import lombok.Data;

@Data
public class UserVo extends Role {
    private Integer page;
    private Integer limit;
}
