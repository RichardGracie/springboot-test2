package com.gyf.mapper;

import com.gyf.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Createed by  slix
 * 2019/4/28 20:36
 */
public interface UserMapper {

    @Insert("insert into t_user (name,password) values (#{username},#{password})")
    public int save(@Param("username") String username, @Param("password") String password);

    @Select("select * from t_user where name = #{username}")
    public User findByUsername(@Param("username") String username);
}
