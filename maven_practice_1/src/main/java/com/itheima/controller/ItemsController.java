package com.itheima.controller;


import com.itheima.domain.Items;
import com.itheima.service.IMavenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class ItemsController {


    @Autowired
    private IMavenService mavenService;

    @RequestMapping("/findById")
    public String findById(Model model){
        System.out.println("收到请求~");
        Integer id =1;
        Items byId = mavenService.findById(id);
        model.addAttribute("item",byId);
        return "itemDetail";

    }
}
