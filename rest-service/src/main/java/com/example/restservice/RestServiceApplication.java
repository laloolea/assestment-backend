package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication implements CommandLineRunner{
	@Autowired
	private CountrieRepository countrieRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}
	@Override
	public void run(String[] args) throws Exception{
		countrieRepository.save(new Countrie("Mexico","Ciudad de Mexico","128900000",0));
		countrieRepository.save(new Countrie("Canada","Ottawa","32222222",1));
		countrieRepository.save(new Countrie("Argentina","Buenos Aires","123432432",0));
		countrieRepository.save(new Countrie("Espana","Madrid","1322220",0));
	}
}
