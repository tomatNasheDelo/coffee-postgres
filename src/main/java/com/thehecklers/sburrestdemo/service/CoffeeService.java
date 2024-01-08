package com.thehecklers.sburrestdemo.service;

import org.springframework.stereotype.Component;

import com.thehecklers.sburrestdemo.entity.Coffee;
import com.thehecklers.sburrestdemo.repository.CoffeeRepository;



@Component
public class CoffeeService {
	
	 private final CoffeeRepository coffeeRepository;

	    public CoffeeService(CoffeeRepository coffeeRepository) {

	        this.coffeeRepository = coffeeRepository;
	    }
	
	public void insertCourse() {

    Coffee kurs = new Coffee();
    kurs.setId("Alicia ");
    kurs.setName("comedy");
   // kurs.setDescription("Anthology");
   // kurs.setRating(5);
    
    Coffee kurs2 = new Coffee();
    kurs2.setId("Govard ");
    kurs2.setName("fantastic");
 //   kurs2.setDescription("Logic");
  //  kurs2.setRating(4);

    coffeeRepository.save(kurs);
    coffeeRepository.save(kurs2);
}

}