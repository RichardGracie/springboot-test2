package com.gyf.service;

import com.gyf.model.User;

/**
 * Createed by  slix
 * 2019/4/28 18:42
 */
public interface IUerService {

    public void register(String username,String password);
    public User findByUsername(String username);
}
