package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	public void run(String args[]) throws Exception 
	 { 
	     // Print statement when method is called 
	     System.out.println("HEllo world"); 
	 } 

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
