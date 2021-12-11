package com.example.restservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountrieRepository extends CrudRepository<Countrie,Long>
{

}