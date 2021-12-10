package com.example.restservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CountriesController {
    private static final String template = "The countrie is: %s" ;
    private static final String templateCapital=" its Capital city is: %s ";
    private static final String templatePopulation=" it has a population of: %s";
    //private static final String templateIdLanguage=", and it has a language Id of: %d";

    private final AtomicLong counter= new AtomicLong();

    @GetMapping("/countries")
    public Countries countries(@RequestParam(value = "name",defaultValue="Mexico")String name,@RequestParam(value = "capital",defaultValue="CdMx")String capital,
                              @RequestParam(value = "population",defaultValue = "128900000")int population){
        Countries countries = new Countries(counter.incrementAndGet(), String.format(template,name),
                String.format(templateCapital,capital),String.format(templatePopulation,population));
        return countries;

    }

}

