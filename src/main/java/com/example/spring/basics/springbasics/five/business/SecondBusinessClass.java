package com.example.spring.basics.springbasics.five.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.basics.springbasics.five.dao.SecondDaoClass;

@Service
public class SecondBusinessClass {
	@Autowired
	private SecondDaoClass secondDaoClass;
	
	public String secondBusinessLogic() throws Exception {
		System.out.println("From SecondBusinessClass");
		return "From SecondBusinessClass --> " + secondDaoClass.retrieveSecondValue();
	}
}
