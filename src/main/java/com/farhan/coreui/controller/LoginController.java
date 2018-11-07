package com.farhan.coreui.controller;

import com.farhan.coreui.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    private Logger LOGGER = LoggerFactory.getLogger(getClass());

    @GetMapping({"/", "login"})
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
/*
    @PostMapping("login")
    public String login(@ModelAttribute User user) {
        LOGGER.info("username: " + user.getUsername());
        LOGGER.info("password: " + user.getPassword());
        return "redirect:/pages/welcome";
    }
*/
}
