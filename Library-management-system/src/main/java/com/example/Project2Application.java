package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.repository.BookRepository;

@SpringBootApplication
public class Project2Application {

	public static void main(String[] args) {
		SpringApplication.run(Project2Application.class, args);

	
		
		//BookRepository.findByB_name("b_name").forEach(System.out::println);		
		
		
	}
	
	
	
	
	

}
