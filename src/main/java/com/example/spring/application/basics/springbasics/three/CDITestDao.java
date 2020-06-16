package com.example.spring.application.basics.springbasics.three;
  
import javax.inject.Named;
  
@Named
public interface CDITestDao { 
	public Integer accessDB(); 
}
 