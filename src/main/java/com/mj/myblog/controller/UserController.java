package com.mj.myblog.controller;

import com.mj.myblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository ur;

    @GetMapping
    public ModelAndView list(Model model){
        model.addAttribute("userlist",ur.findAll());
        return new ModelAndView("users/list","userModel",model);
    }
}
