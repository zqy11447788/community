package com.yu.community.controller;

import com.yu.community.dto.QuestionDTO;
import com.yu.community.mapper.UserMapper;
import com.yu.community.model.Question;
import com.yu.community.model.User;
import com.yu.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author yu
 * @Description
 * @create 2019-10-13-21:09
 */
@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private QuestionService serviceMapper;
    @GetMapping("/")
    public String index(HttpServletRequest request,Model model){

        Cookie[] cookies = request.getCookies();
        if(cookies != null&&cookies.length != 0)
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

        List<QuestionDTO> questionDTOList = serviceMapper.list();
        model.addAttribute("questions",questionDTOList);
        return "index";
    }
}
