package com.example.spring.basics.springbasics.five.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.basics.springbasics.five.dao.FirstDaoClass;

@Service
public class FirstBusinessClass {
	@Autowired
	private FirstDaoClass firstDaoClass;
	
	public String firstBusinessLogic() {
		System.out.println("From FirstBusinessClass");
		return "From FirstBusinessClass --> " + firstDaoClass.retrieveFirstValue();
	}
}
