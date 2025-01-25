package com.example.java_spring.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String homeSweetHome(Model model) {
        model.addAttribute("title", "main page");
        return "home";
    }

}
