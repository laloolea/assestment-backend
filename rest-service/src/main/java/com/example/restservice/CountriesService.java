package com.example.restservice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CountriesService {

    private List <Countrie> countries = new ArrayList<>(Arrays.asList(
            new Countrie(0,"Mexico","Ciudad de Mexico","128900000"),
            new Countrie(1,"Canada","Ottawa","128993333"),
            new Countrie(2,"Argentina","Buenos Aires","11221212"),
            new Countrie(3,"Espana","Madrid","13900000")));

    public List<Countrie> getAllCountries(){
        return countries;
    }
    public Countrie getCountrie(int id){
        return countries.stream().filter(p -> p.getId()==id).findFirst().get();
    }

    public void addCountrie(Countrie countrie){
        countries.add(countrie);
    }

    public void updateCountrie(int id, Countrie countrie){
        for(int i = 0 ; i < countries.size();i++){
            Countrie c = countries.get(i);
            if(c.getId() == (id)){
                countries.set(i,countrie);
                return;
            }
        }
    }

    public void deleteCountrie(int id){
        countries.removeIf(p-> p.getId()==id);
    }
}
