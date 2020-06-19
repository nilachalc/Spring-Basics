package com.example.spring.basics.springbasics.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {

	@Before(value = "com.example.spring.basics.springbasics.aspect.CommonJointPointConfig.businesspointCut()")
	public void beforeAspectTest(JoinPoint joinPoint) {
		System.out.println("Before the business method call : " + joinPoint);
	}
	
	@Before(value = "com.example.spring.basics.springbasics.aspect.CommonJointPointConfig.daoBeanPointCut()")
	public void beforeDaoBeanAspectTest(JoinPoint joinPoint) {
		System.out.println("Before all the DAO method calls : " + joinPoint);
	}
}
