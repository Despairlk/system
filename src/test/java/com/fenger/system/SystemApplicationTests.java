package com.fenger.system;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.fenger.entity.Role;
import com.fenger.entity.User;
import com.fenger.service.RoleService;
import com.fenger.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemApplicationTests {

    @Autowired
    RoleService roleService;
    @Autowired
    UserService userService;
    @Test
    public void contextLoads() {
//        List<Role> roles = this.roleService.queryAllRole();
//        for (Role role : roles) {
//            System.out.println(role);
//        }
        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        this.userService.listObjs(wrapper);

    }

}
