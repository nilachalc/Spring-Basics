package com.example.spring.basics.springbasics.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJointPointConfig {
	@Pointcut(value = "execution(* com.example.spring.basics.springbasics.five.business.*.*(..))")
	public void businesspointCut() {}
	
	@Pointcut(value = "bean(*Dao*)")
	public void daoBeanPointCut() {}
	
	@Pointcut(value = "@annotation(com.example.spring.basics.springbasics.aspect.TimeTracked)")
	public void annotationBasedPointCut() {}
}
