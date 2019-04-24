package com.fenger.service;

import com.fenger.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fenger.utils.DataGirdView;
import com.fenger.vo.UserVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 老雷
 * @since 2019-04-23
 */
public interface UserService extends IService<User> {

    DataGirdView queryAllUserByPage(UserVo userVo);
}
