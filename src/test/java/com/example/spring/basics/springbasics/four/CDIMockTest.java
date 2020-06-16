package com.example.spring.basics.springbasics.four;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.spring.application.basics.springbasics.three.CDITestBusiness;
import com.example.spring.application.basics.springbasics.three.CDITestDao;

@RunWith(MockitoJUnitRunner.class)
public class CDIMockTest {
	@Mock
	private CDITestDao cdiTestDao;
	
	@InjectMocks
	private CDITestBusiness cdiTestBusiness;
	
	@Test
	public void test_binarySearch() {
		when(cdiTestDao.accessDB()).thenReturn(10);
		Integer result = cdiTestBusiness.calldb();
		System.out.println(result);
		assertEquals(new Integer(10), result);
	}
}
