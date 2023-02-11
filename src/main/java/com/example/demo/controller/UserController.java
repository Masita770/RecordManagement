package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService service;

    //Read処理
    @RequestMapping("list")
    public String list(Model model) {
        List<User> users = service.getListAll();
        model.addAttribute("list", users);
        return "/list";
    }

    @RequestMapping("form")
    public String add(@ModelAttribute User user, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            List<User> users = service.getListAll();
            model.addAttribute("success", users);
            return "success";
        }
        service.create(user);
        return "redirect:list";
    }
}
