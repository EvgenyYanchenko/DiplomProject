package com.example.AIS.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {


    @GetMapping("/")
    public String loginPage(Model model) {
        System.out.println("Helo world new project");
        System.out.println("привет как дела?7/10");
        return "/login";
    }

//    @PostMapping("/")
//    public String openMainMenu(Model model)
//    {
//        return "redirect:/new_mainMenu";
//    }
//    @GetMapping("/new_mainMenu")
//    public String mainMenuPage(Model model) {
//        System.out.println("Helo world new project");
//        System.out.println("привет как дела?7/10");
//        return "new_mainMenu";
//    }

    @GetMapping("/mainMenu")
    public String mainMenuPage(Model model) {
        System.out.println("Helo world new project");
        System.out.println("привет как дела?7/10");
        return "/mainMenu";
    }
}
