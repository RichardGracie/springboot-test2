package com.gyf.test1.service;

import com.gyf.test1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Createed by  slix
 * 2019/4/28 18:44
 */
@Service
@Transactional
public class UserServiceImpl{

    //使用spring的jdbc
    @Autowired
    private UserMapper userMapper;

    public void register(String username, String password) {
        userMapper.save(username,password);
    }

}
