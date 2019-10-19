package com.yu.community.controller;

import com.yu.community.dto.PaginationDTO;
import com.yu.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yu
 * @Description
 * @create 2019-10-13-21:09
 */
@Controller
public class IndexController {

    @Autowired
    private QuestionService serviceMapper;
    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model,
                        @RequestParam(name="page",defaultValue = "1")Integer page,
                        @RequestParam(name="size",defaultValue = "5")Integer size){

        PaginationDTO pagination = serviceMapper.list(page,size);
        model.addAttribute("pagination",pagination);
        return "index";
    }
}
