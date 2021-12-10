package com.example.restservice;

public class Countrie {
    private int id;
    private String name;
    private String capital;
    private String population;

    public Countrie(){}
    public Countrie(int _id, String _name, String _capital, String _population) {
        this.id = _id;
        this.name = _name;
        this.capital = _capital;
        this.population = _population;

    }

    public int getId() {
        return id;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    


}