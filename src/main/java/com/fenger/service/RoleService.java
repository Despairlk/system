package com.fenger.service;

import com.fenger.entity.Role;
import com.fenger.vo.RoleVo;

import java.util.List;

public interface RoleService {

    List<Role> queryAllRole();
    void addRole(RoleVo roleVo);
    void updateRole(RoleVo roleVo);
    void deleteRole(Integer roleId);
    Role queryRoleById(Integer roleid);

}
