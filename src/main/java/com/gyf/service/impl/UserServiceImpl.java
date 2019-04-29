package com.gyf.service.impl;

import com.gyf.mapper.UserMapper;
import com.gyf.model.User;
import com.gyf.service.IUerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Createed by  slix
 * 2019/4/28 18:44
 */
@Service
@Transactional
public class UserServiceImpl implements IUerService {

    //使用spring的jdbc
    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(String username, String password) {
        userMapper.save(username,password);
//        int i = 10/0;
    }

    public User findByUsername(String username){
        return userMapper.findByUsername(username);
    };
}
