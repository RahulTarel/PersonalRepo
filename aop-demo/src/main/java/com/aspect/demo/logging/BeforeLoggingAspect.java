package com.aspect.demo.logging;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeLoggingAspect {

	@Before("execution(* com.aspect.demo.*.*(..))")
	public void logBefore() {
		System.out.println("Before method execution");
	}
}
