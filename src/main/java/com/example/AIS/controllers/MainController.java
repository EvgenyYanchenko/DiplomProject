package com.example.AIS.controllers;

import com.example.AIS.models.Employee;
import com.example.AIS.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.AIS.models.Stores;
import com.example.AIS.repositories.StoreSettingsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private StoreSettingsRepository storesRepository;
    @Autowired
    private EmployeeRepository employeeRepository;


    @GetMapping("/")
    public String loginPage(Model model) {
        System.out.println("Helo world new project");

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
//
//        return "new_mainMenu";
//    }

    @GetMapping("/mainMenu")
    public String mainMenuPage(Model model) {
        System.out.println("/mainMenu");

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

//    @GetMapping("/stores")
//    public String storesPage(Model model) {
//        System.out.println("/stores");
//
//        return "/stores";
//    }
    @GetMapping("/stores")
    public String showSettStoresPage(Model model) {
        Iterable<Stores> someStore = storesRepository.findAll();
        model.addAttribute("stores", someStore);
        return "/stores";
    }

    @PostMapping("/stores")
    public String addToDB(@RequestParam("action") String action,
                          @RequestParam String storeName,
                          @RequestParam String storeAdress,
                          @RequestParam int storeSpace,
                          Model model) {

        if("add".equals(action))
        {
            Stores newstore = new Stores(storeName, storeAdress, storeSpace);
            storesRepository.save(newstore);
        }
        else if ("remove".equals(action))
        {
            Stores storeForDeleting = storesRepository.findById(storeName).orElseThrow();
            storesRepository.delete(storeForDeleting);
        }
        return "redirect:/stores";
    }

    @GetMapping("/SotrudnikiALL")
    public String showSotrudnikiALL(Model model) {
        Iterable<Employee> someEmployee = employeeRepository.findAll();
        model.addAttribute("stores", someEmployee);
        return "/SotrudnikiALL";
    }
}
