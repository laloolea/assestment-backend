package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CountrieWebController {
    @Autowired
    CountrieController countrieController;
    @GetMapping("/")
    public String getAllCountries(Model model){
        List<Countrie> countriesList = countrieController.getAllCountries();

        model.addAttribute("countries",countriesList);
        return "list_countries";

    }
    @GetMapping ("/new_countrie")
    public String addCountrie(Model model){
        Countrie countrie = new Countrie();
        model.addAttribute("countrie",countrie);
        return "new_countrie";
    }

    @PostMapping(value="/save_new")
    public String saveNewCountrie(@ModelAttribute("countrie")Countrie countrie){
        countrieController.addCountries(countrie);
        return"redirect:/";
    }
}
