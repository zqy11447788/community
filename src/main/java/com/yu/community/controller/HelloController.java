package com.yu.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yu
 * @Description
 * @create 2019-10-13-21:09
 */
@Controller
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
