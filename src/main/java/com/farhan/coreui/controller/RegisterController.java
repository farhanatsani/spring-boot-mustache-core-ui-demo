package com.farhan.coreui.controller;

import com.farhan.coreui.domain.User;
import com.farhan.coreui.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.stream.Collectors;

@Controller
@RequestMapping("register")
public class RegisterController {

    private Logger LOGGER = LoggerFactory.getLogger(getClass());

    private UserService userService;

    @Autowired
    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getRegister() {
        return "register";
    }

    @PostMapping
    public String postRegister(@Valid @ModelAttribute User user, Errors errors) {
        String url;
        if(errors.hasErrors()) {
            LOGGER.info("message: {}", errors.getAllErrors().stream().map(x -> x.getDefaultMessage()).collect(Collectors.joining(", ")));
            url = "register";
        } else {
            userService.saveUser(user);
            LOGGER.info("{} register successfully", user.getUsername());
            url = "login";
        }
        return url;
    }

}
