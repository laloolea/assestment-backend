package com.example.restservice;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountriesService {

    @Autowired
    private CountrieRepository countrieRepository;


    public List<Countrie> getAllCountries(){
        List<Countrie> countries = new ArrayList<>();
        countrieRepository.findAll().forEach(countries::add);
        return countries;
    }


    public Optional<Countrie> getCountrie(Long id){
        return countrieRepository.findById(id);
    }

    public void addCountrie(Countrie countrie){
        countrieRepository.save(countrie);
    }

    public void updateCountrie(Long id, Countrie countrie){
        if(countrieRepository.findById(id).get()!= null){
            countrieRepository.save(countrie);
        }
    }

    public void deleteCountrie(Long id){
        countrieRepository.deleteById(id);
    }
}
