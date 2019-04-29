package com.gyf.test1.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Createed by  slix
 * 2019/4/28 20:36
 */
public interface UserMapper {

    @Insert("insert into user (username,password) values (#{username},#{password})")
    public int save(@Param("username") String username, @Param("password") String password);
}
