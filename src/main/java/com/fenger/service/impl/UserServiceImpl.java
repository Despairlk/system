package com.fenger.service.impl;

import com.fenger.entity.User;
import com.fenger.mapper.UserMapper;
import com.fenger.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fenger.utils.DataGirdView;
import com.fenger.vo.UserVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 老雷
 * @since 2019-04-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public DataGirdView queryAllUserByPage(UserVo userVo) {
        Page<Object> objects = PageHelper.startPage(userVo.getPage(), userVo.getLimit());
        List<User> users = this.userMapper.selectList(null);
        return new DataGirdView(0,"成功",objects.getTotal(),users);
    }
}
