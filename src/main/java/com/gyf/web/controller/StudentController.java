package com.gyf.web.controller;

/**
 * Createed by  slix
 * 2019/4/27 16:05
 */

import com.gyf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @RestController用于写API，给移动客户端提供数据，一般是返回json数据
 * @Controller一般用于写后端（有页面）
 */
@Controller
@RequestMapping("stu")
public class StudentController {

    @RequestMapping("list")
    public String list(Model model){
        model.addAttribute("username","gyf");
        model.addAttribute("age",20);
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student(1001,"张三","男"));
        stuList.add(new Student(1002,"李四","男"));
        stuList.add(new Student(1003,"王五","男"));
        model.addAttribute("stuList",stuList);
        System.out.println("stuList:"+stuList);
        return "stu/list";//找模板页面
    }
}
