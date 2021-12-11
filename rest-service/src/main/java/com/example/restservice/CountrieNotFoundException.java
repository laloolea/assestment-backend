package com.example.restservice;

public class CountrieNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public CountrieNotFoundException(Long id){
        super("The product with "  + id + " cannot be found!");
    }
}
