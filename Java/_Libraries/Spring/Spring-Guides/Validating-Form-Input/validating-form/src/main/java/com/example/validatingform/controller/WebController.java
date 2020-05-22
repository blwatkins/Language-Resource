package com.example.validatingform.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.validatingform.model.Person;


@Controller
public class WebController implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/")
    public String showForm(Person person) {
        return "form";
    }

    @PostMapping("/")
    public String checkPersonData(@Valid Person person, BindingResult result) {

        if (result.hasErrors()) {
            return "form";
        } else {
            return "redirect:/results";
        }
    }
}
