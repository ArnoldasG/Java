package com.ag.springdemo;

import com.ag.springdemo.domain.HumanResourceDepartment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ag.springdemo.domain.Organizations;

// DI - Dependency Injection

public class DIConstructorApp {

	public static void main(String[] args) {
		// 1. Create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		// 2. create the bean
		Organizations org = (Organizations) ctx.getBean("anyname");
		
		// 3. invoke the company ag via the bean
		System.out.println(org.corporateSlogan());
		
		// Print organization details
//		 System.out.println(org);
//		System.out.println(org.corporateService());
		HumanResourceDepartment humanResourceDepartment = (HumanResourceDepartment) ctx.getBean("myhrdept");
		System.out.println(humanResourceDepartment.hiringStatus(5500));

		// 4. close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
