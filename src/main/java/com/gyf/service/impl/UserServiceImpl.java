package com.gyf.service.impl;

import com.gyf.mapper.UserMapper;
import com.gyf.service.IUerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Createed by  slix
 * 2019/4/28 18:44
 */
@Service
public class UserServiceImpl implements IUerService {

    //使用spring的jdbc
    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(String username, String password) {
        userMapper.save(username,password);
    }
}
