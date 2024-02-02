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

    @GetMapping("/UpravleniePredpriyatiem")
    public String UpravlPrePage(Model model) {
        System.out.println("/UpravleniePredpriyatiem");

        return "/UpravleniePredpriyatiem";
    }
    @GetMapping("/Analitycs")
    public String AnalyticsPage(Model model) {
        System.out.println("/Analitycs");

        return "/Analitycs";
    }

    @GetMapping("/sales")
    public String salesPage(Model model) {
        System.out.println("/sales");

        return "/sales";
    }
    @GetMapping("/products")
    public String productsPage(Model model) {
        System.out.println("/products");

        return "/products";
    }
    @GetMapping("/warehouses")
    public String warehousesPage(Model model) {
        System.out.println("/warehouses");

        return "/warehouses";
    }
    @GetMapping("/eployees")
    public String eployeesPage(Model model) {
        System.out.println("/eployees");

        return "/eployees";
    }

    @GetMapping("/stores")
    public String storesPage(Model model) {
        System.out.println("/stores");

        return "/stores";
    }

}
