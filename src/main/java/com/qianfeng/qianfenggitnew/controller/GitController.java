package com.qianfeng.qianfenggitnew.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HuangGuiZhao
 * @Date 2018/11/17
 */
@Controller
@RequestMapping("git")
public class GitController {

    @RequestMapping("hello")
    public String hello(){
        System.out.println("happyCoding2008");
        System.out.println("2018 go!");
        System.out.println("2008 go!");
        System.out.println("当前正在dev分支开发新功能....");
        return "hello";
    }
}
