package com.yu.community.controller;

import com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets;
import com.yu.community.mapper.UserMapper;
import com.yu.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author yu
 * @Description
 * @create 2019-10-13-21:09
 */
@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;
    @GetMapping("/")
    public String index(HttpServletRequest request){

        Cookie[] cookies = request.getCookies();
        if(cookies == null||cookies.length == 0){
            return "index";
        }
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("token")){
                String token = cookie.getValue();
                User user = userMapper.findByToken(token);
                if(user != null){
                    request.getSession().setAttribute("user",user);
                }
                break;
            }
        }


        return "index";
    }
}
