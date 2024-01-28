package com.example.AIS.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/")
    public String loginPage(Model model) {
        System.out.println("Helo world new project");
        System.out.println("привет как дела?7/10");
        return "/login";
    }


}
