package com.example.spring.basics.springbasics;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// This below code is just for testing.
// We can have an one step higher package declaration to have both of the below packages scanned at one go.   
@ComponentScan(basePackages = {"com.example.spring.basics.springbasics"
							, "com.example.spring.basics.componentscantest"})
public class SpringBasicsApplication {

	public static void main(String[] args) {
		/* -- Example - 1
		ApplicationContext context = SpringApplication.run(SpringBasicsApplication.class, args);
		BinarySearch binarySearchOne = context.getBean(BinarySearch.class);
		BinarySearch binarySearchTwo = context.getBean(BinarySearch.class);
		System.out.println(binarySearchOne.binarySearch(new Integer[] {1, 2, 3, 4, 10}, 10));
		System.out.println("Application Contex Loaded successfully.");
		System.out.println(binarySearchOne);
		System.out.println(binarySearchTwo);*/
		
		/* -- Example - 2
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
		
		TestDao testDaoOne = applicationContext.getBean(TestDao.class);
		System.out.println(testDaoOne);
		System.out.println(testDaoOne.getMyConnection());
		
		TestDao testDaoTwo = applicationContext.getBean(TestDao.class);
		System.out.println(testDaoTwo);
		System.out.println(testDaoTwo.getMyConnection());*/
		
		/*  -- Example - 3
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
		
		ComponentScanTestDao componentScanTestDao = applicationContext.getBean(ComponentScanTestDao.class);
		System.out.println(componentScanTestDao);*/
		
		/*ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
		CDITestBusiness cdiTestBusiness = applicationContext.getBean(CDITestBusiness.class);
		System.out.println(cdiTestBusiness);
		System.out.println(cdiTestBusiness.getCdiTestDao());*/
	}
}