package com.example.spring.basics.springbasics.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAspect {

	@Around(value = "com.example.spring.basics.springbasics.aspect.CommonJointPointConfig.annotationBasedPointCut()")
	public void aroundAspectTest(ProceedingJoinPoint joinPoint) throws Throwable {
		Long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		System.out.println("TIME TAKEN FOR THE BUSINESS METHOD CALL : " + (System.currentTimeMillis() - startTime));
	}
}
