package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/views")
public class ControllerWithViews {

    @GetMapping("/welcome-view")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/welcome-model")
    public String welcomeModel(@RequestParam(name="name", defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "welcome-model";
    }

}
