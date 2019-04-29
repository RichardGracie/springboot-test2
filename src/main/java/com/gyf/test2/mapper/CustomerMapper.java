package com.gyf.test2.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Createed by  slix
 * 2019/4/28 20:36
 */
public interface CustomerMapper {

    @Insert("insert into customer (name,tel) values (#{name},#{tel})")
    public int save(@Param("name") String name, @Param("tel") String tel);
}
