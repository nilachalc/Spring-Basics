package com.example.spring.basics.springbasics.four;

import java.util.List;

public interface Dao {
	public List<Integer> dataAccessMethodOne();
	
	public List<Integer> dataAccessMethodTwo(Integer param);
}
