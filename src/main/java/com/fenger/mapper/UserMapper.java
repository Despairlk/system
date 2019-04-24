package com.fenger.mapper;

import com.fenger.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 老雷
 * @since 2019-04-23
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}
