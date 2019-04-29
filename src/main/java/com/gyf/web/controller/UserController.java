package com.gyf.web.controller;

import com.gyf.test1.service.UserServiceImpl;
import com.gyf.test2.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Createed by  slix
 * 2019/4/23 21:17
 */
@RestController //声明rest风格的控制器
@EnableAutoConfiguration //自动配置，相当于写了spring的配置文件
@RequestMapping("user")
public class UserController {



//不用这种，比较单一
//    public static void main(String[] args) {
//        //启动spring boot项目
//        SpringApplication.run(UserController.class,args);
//    }
    @Autowired
    private UserServiceImpl uerService;
    @Autowired
    private CustomerServiceImpl customerService;
    @RequestMapping("register")
    @ResponseBody
    public String register(String username,String password){
        //把数据保存到test1数据库
        uerService.register(username,password);
        //把数据保存到test2数据库
        customerService.save(username, "120");
        return "success";
    }

}
