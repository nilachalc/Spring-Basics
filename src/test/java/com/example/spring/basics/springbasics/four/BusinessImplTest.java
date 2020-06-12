package com.example.spring.basics.springbasics.four;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class BusinessImplTest {
	@Mock
	private Dao dao;
	
	@InjectMocks
	private BusinessImpl businessImpl;   
	
	@Test
	void test_businessMethodOne() {
		List<Integer> values = new ArrayList<Integer>();
		values.add(4);
		values.add(4);
		values.add(1991);
		when(dao.dataAccessMethodOne()).thenReturn(values);
		
		System.out.println(businessImpl.businessMethodOne());
	}
	
	@Test
	void test_businessMethodTwo() {
		List<Integer> values = new ArrayList<Integer>();
		values.add(1991);
		when(dao.dataAccessMethodOne()).thenReturn(values);
		
		System.out.println(businessImpl.businessMethodOne());
	}
	
	@Test
	void test_businessMethodThree() {
		List<Integer> values = new ArrayList<Integer>();
		values.add(1991);
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1955);
		when(dao.dataAccessMethodOne()).thenReturn(values).thenReturn(integers);
		
		System.out.println(businessImpl.businessMethodOne());
		System.out.println(businessImpl.businessMethodOne());
	}
	
	@Test
	void test_businessMethodFour() {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1955);
		when(dao.dataAccessMethodTwo(5)).thenReturn(integers);
		
		System.out.println(businessImpl.businessMethodTwo(5));
		System.out.println(businessImpl.businessMethodTwo(6));
	}
	
	@Test
	void test_businessMethodFive() {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1955);
		when(dao.dataAccessMethodTwo(Mockito.anyInt())).thenReturn(integers);
		
		System.out.println(businessImpl.businessMethodTwo(5));
		System.out.println(businessImpl.businessMethodTwo(6));
	}
}
