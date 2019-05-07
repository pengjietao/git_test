package com.itheima.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class HelloSpringMVC {


    /**
     *
     * 创建方法
     * 返回一个String类型的值
     */
    @RequestMapping("/hello")
    public String helloSpringMVC(){
        System.out.println("我就看看能不能访问到我");
        return "success";
    }
}
