package com.example.spring.basics.springbasics.four;

import org.springframework.beans.factory.annotation.Autowired;

public class BusinessImpl {

	@Autowired
	private Dao dao;
	
	public StringBuilder businessMethodOne() {
		StringBuilder value = new StringBuilder();
		for (Integer integer : dao.dataAccessMethodOne()) {
			value.append(integer + " ");
		}
		return value;
	}
	
	public StringBuilder businessMethodTwo(Integer param) {
		StringBuilder value = new StringBuilder();
		for (Integer integer : dao.dataAccessMethodTwo(param)) {
			value.append(integer + " ");
		}
		return value;
	}
}
