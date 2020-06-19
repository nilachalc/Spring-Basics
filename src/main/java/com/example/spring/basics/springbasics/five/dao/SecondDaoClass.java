package com.example.spring.basics.springbasics.five.dao;

import org.springframework.stereotype.Repository;

import com.example.spring.basics.springbasics.aspect.TimeTracked;

@Repository
public class SecondDaoClass {
	@TimeTracked
	public String retrieveSecondValue() throws Exception{
		//int val = 10 / 0;
		return "From SecondDaoClass";
	}
}
