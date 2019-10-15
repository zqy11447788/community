package com.yu.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yu
 * @Description
 * @create 2019-10-15-19:41
 */
@Controller
public class PublishController {
    @GetMapping("/publish")
    public String publish(){
        return "publish";
    }
}
