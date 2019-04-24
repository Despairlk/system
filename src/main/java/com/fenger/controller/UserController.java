package com.fenger.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.fenger.entity.User;
import com.fenger.service.UserService;
import com.fenger.utils.DataGirdView;
import com.fenger.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 老雷
 * @since 2019-04-23
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("user")
    public String toUserManager(){
        return "sys/userManager";
    }
    @ResponseBody
    @RequestMapping("loadAllUser")
    public DataGirdView loadAllUser(UserVo userVo){

        return this.userService.queryAllUserByPage(userVo);

    }
}

