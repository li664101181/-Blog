package com.blog.mapper;

import com.blog.entity.TUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 李昶
 * @since 2022-05-31
 */
public interface TUserMapper extends BaseMapper<TUser> {
//        @Select("select * from t_user where username=#{username}")
        TUser loadUserByUsername(String username);
}
