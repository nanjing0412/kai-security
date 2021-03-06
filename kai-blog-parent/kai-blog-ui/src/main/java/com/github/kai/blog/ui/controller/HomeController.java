package com.github.kai.blog.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * TODO: 微博首页Controller
 *
 * Author: kai
 * CreateDate: 2017/9/12
 * CreateTime: 14:12
 */
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    @RequestMapping("/about")
    public String about(){
        return "about";
    }
    @RequestMapping("/article")
    public String article(){
        return "article";
    }
    @RequestMapping("/detail/{id}")
    public String detail(@PathVariable String id, Map<String,Object> map){
        map.put("articleId",id);
        return "detail";
    }
    @RequestMapping("/resource")
    public String resource(){
        return "resource";
    }
    @RequestMapping("/timeline")
    public String timeline(){
        return "timeline";
    }

    @RequestMapping("/QQ")
    public String QQ(){
        return "QQ";
    }
}
