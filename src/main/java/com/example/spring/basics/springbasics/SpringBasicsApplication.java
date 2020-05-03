package com.example.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringBasicsApplication.class, args);
		BinarySearch binarySearch = context.getBean(BinarySearch.class);
		System.out.println(binarySearch.binarySearch(new Integer[] {1, 2, 3, 4, 10}, 10));
		System.out.println("Application Contex Loaded successfully.");
	}
}