package com.example.spring.basics.springbasics.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {

	@After(value = "com.example.spring.basics.springbasics.aspect.CommonJointPointConfig.businesspointCut()")
	public void afterAspectTest(JoinPoint joinPoint) {
		System.out.println("After any of the flow of business method call : " + joinPoint);
	}
	
	@AfterReturning(value = "com.example.spring.basics.springbasics.aspect.CommonJointPointConfig.businesspointCut()",
			returning = "returnValue")
	public void afterReturningAspectTest(JoinPoint joinPoint, Object returnValue) {
		System.out.println("After returning the value of business method call : " + joinPoint);
		System.out.println("The returned value of business method call : " + returnValue);
	}
	
	@AfterThrowing(value = "com.example.spring.basics.springbasics.aspect.CommonJointPointConfig.businesspointCut()",
			throwing = "exception")
	public void afterThrowingAspectTest(JoinPoint joinPoint, Exception exception) {
		System.out.println("After throwing an exception from business method call : " + joinPoint);
		System.out.println("The thrown exception from business method call : " + exception);
	}
}
