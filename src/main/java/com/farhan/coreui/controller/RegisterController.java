package com.farhan.coreui.controller;

import com.farhan.coreui.domain.User;
import com.farhan.coreui.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("register")
public class RegisterController {

    private Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @GetMapping
    public String getRegister() {
        return "register";
    }

    @PostMapping
    public ModelAndView postRegister(@ModelAttribute User user) {
        ModelAndView modelAndView = new ModelAndView();
        userService.saveUser(user);
        LOGGER.info("{} register successfully", user.getUsername());
        return modelAndView;
    }

}
