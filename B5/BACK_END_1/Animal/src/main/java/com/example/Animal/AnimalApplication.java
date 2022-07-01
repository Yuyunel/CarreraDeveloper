package com.example.Animal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AnimalApplication {

	public static void main(String[] args) {

		SpringApplication.run(AnimalApplication.class, args);

	}
	@GetMapping
	public String holaAnimal(){
		return "Hola Animal";
	}

}
