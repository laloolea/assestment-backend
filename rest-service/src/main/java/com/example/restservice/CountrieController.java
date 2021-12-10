package com.example.restservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CountrieController {
    /*
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
    */
    @Autowired
    private CountriesService countriesService;

    @GetMapping("/countries")
    public List<Countrie> getAllCountries(){
        return countriesService.getAllCountries();
    }
    @GetMapping ("/countries/{pId}")
    public Countrie getCountrie(@PathVariable("pId") int id){
        return countriesService.getCountrie(id);
    }

    @PostMapping("/countries")
    public void addCountries(@RequestBody Countrie countrie){
        countriesService.addCountrie(countrie);
    }

    @PutMapping("/countries/{pId}")
    public void updateCountrie(@RequestBody Countrie countrie,@PathVariable("pId") int id){
        countriesService.updateCountrie(id,countrie);
    }
    @DeleteMapping("/countries/{pId}")
    public void deleteCountrie(@PathVariable("pId")int id){
        countriesService.deleteCountrie(id);
    }
}

