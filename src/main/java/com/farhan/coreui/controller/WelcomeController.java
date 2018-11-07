package com.farhan.coreui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("pages/welcome")
public class WelcomeController {

    @GetMapping
    public String welcome(Map<String, Object> model) {
        return "pages/welcome";
    }

}
