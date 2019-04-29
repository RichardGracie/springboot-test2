package com.gyf.web.controller;

import com.gyf.model.User;
import com.gyf.service.IUerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
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

    /**
     *
     * 通过id查询用户的信息
     *
     */
    @RequestMapping("{id}")
    @ResponseBody
    public User getInfo(@PathVariable() Integer id){

        User user= new User("gyf","123456");
        user.setId(id);
//        int i = 10/0;
        return user;
    }
//不用这种，比较单一
//    public static void main(String[] args) {
//        //启动spring boot项目
//        SpringApplication.run(UserController.class,args);
//    }
    @Autowired
    private IUerService uerService;
    @RequestMapping("register")
    @ResponseBody
    public String register(String username,String password){
        uerService.register(username,password);
        return "success";
    }

    @RequestMapping("find")
    @ResponseBody
    public User find(String username){
        return uerService.findByUsername(username);
    }
}
