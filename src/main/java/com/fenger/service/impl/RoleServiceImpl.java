package com.fenger.service.impl;

import com.fenger.entity.Role;
import com.fenger.mapper.RoleMapper;
import com.fenger.service.RoleService;
import com.fenger.vo.RoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Role> queryAllRole() {

        return roleMapper.selectList(null);
    }

    @Override
    public void addRole(RoleVo roleVo) {
        this.roleMapper.insert(roleVo);
    }

    @Override
    public void updateRole(RoleVo roleVo) {
        this.roleMapper.updateById(roleVo);
    }

    @Override
    public void deleteRole(Integer roleId) {
        this.roleMapper.deleteById(roleId);
    }

    @Override
    @Transactional(readOnly = true)
    public Role queryRoleById(Integer roleid) {
        return this.roleMapper.selectById(roleid);
    }
}
