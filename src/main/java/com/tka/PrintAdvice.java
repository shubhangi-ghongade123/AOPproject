package com.tka;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PrintAdvice {
	@Before("execution(* com.tka.HomeController.getMassage())")
   public void beforeMsg()
  {
  System.err.println("Hello");	
  }
	
	@After("execution(* com.tka.HomeController.getMassage())")
	public void afterMsg()
	{
	System.err.println("By");	
	}
	
	@Around("execution(* com.tka.HomeController.getMassage1())")
	public Object arroundMsg(ProceedingJoinPoint p) throws Throwable
	{
		System.err.println("Before Massage,Hello Student");
		Object result=p.proceed();
		System.err.println("Hello Student,By Student");
		return result;
		}
}
