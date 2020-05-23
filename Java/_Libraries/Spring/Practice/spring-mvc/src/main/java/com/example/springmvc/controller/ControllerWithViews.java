package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/views")
public class ControllerWithViews {

    @GetMapping("/welcome-view")
    public String welcome() {
        return "welcome";
    }

}
