package com.thehecklers.sburrestdemo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import com.thehecklers.sburrestdemo.service.CoffeeService;

import javax.annotation.PostConstruct;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class SburRestDemoApplication {
	
	 private final CoffeeService coffeeService;

	    public SburRestDemoApplication (CoffeeService coffeeService) {
	        this.coffeeService = coffeeService;
	    }  
	

	public static void main(String[] args) {
		SpringApplication.run(SburRestDemoApplication.class, args);
	}
	
	 @Bean
	   public ApplicationRunner init() {
		 //   long id1 = 1;
		 //  List<Long> ids = Arrays.asList(4L, 2L, 3L);
	       return args -> {
	    	     long id1 = 5; 
	    	  //    boolean bul = courseService.naitiPoId(id1);
	    	   
	                System.out.println("\nInsert course  2   ...");
	                coffeeService.insertCourse();
	    	     
	       };
	

}
}

//@Component
//class DataLoader {
//	private final CoffeeRepository coffeeRepository;
//
//	public DataLoader(CoffeeRepository coffeeRepository) {
//		this.coffeeRepository = coffeeRepository;
//	}
//
//	@PostConstruct
//	private void loadData() {
//		coffeeRepository.saveAll(List.of(
//				new Coffee("Café Cereza"),
//				new Coffee("Café Ganador"),
//				new Coffee("Café Lareño"),
//				new Coffee("Café Três Pontas")
//		));
//	}
//}

//@RestController
//@RequestMapping("/coffees")
//class RestApiDemoController {
//	private final CoffeeRepository coffeeRepository;
//
//	public RestApiDemoController(CoffeeRepository coffeeRepository) {
//		this.coffeeRepository = coffeeRepository;
//	}
//
//	@GetMapping
//	Iterable<Coffee> getCoffees() {
//		return coffeeRepository.findAll();
//	}
//
//	@GetMapping("/{id}")
//	Optional<Coffee> getCoffeeById(@PathVariable String id) {
//		return coffeeRepository.findById(id);
//	}
//
//	@PostMapping
//	Coffee postCoffee(@RequestBody Coffee coffee) {
//		return coffeeRepository.save(coffee);
//	}
//
//	@PutMapping("/{id}")
//	ResponseEntity<Coffee> putCoffee(@PathVariable String id,
//									 @RequestBody Coffee coffee) {
//
//		return (coffeeRepository.existsById(id))
//				? new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.OK)
//				: new ResponseEntity<>(coffeeRepository.save(coffee), HttpStatus.CREATED);
//	}
//
//	@DeleteMapping("/{id}")
//	void deleteCoffee(@PathVariable String id) {
//		coffeeRepository.deleteById(id);
//	}
//}

//@Transactional
//interface CoffeeRepository extends CrudRepository<Coffee, String> {}

//@Entity
//class Coffee {
//	@Id
//	private String id;
//	private String name;
//
//	public Coffee() {
//	}
//
//	public Coffee(String id, String name) {
//		this.id = id;
//		this.name = name;
//	}
//
//	public Coffee(String name) {
//		this(UUID.randomUUID().toString(), name);
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//}