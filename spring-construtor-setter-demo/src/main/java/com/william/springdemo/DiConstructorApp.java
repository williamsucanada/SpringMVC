package com.william.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.william.springdemo.domain.HumanResourceDept;
import com.william.springdemo.domain.Organization;

public class DiConstructorApp {

	public static void main(String[] args) {

		// create application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

		// create the bean
		Organization org = (Organization) ctx.getBean("myorg");

		// invoke the company slogan via the bean
		System.out.println(org.cororateSlogan());
		
		//print organization details
		//System.out.println(org);
		
		HumanResourceDept hrdept = (HumanResourceDept) ctx.getBean("myhrdept");		
		System.out.println(hrdept.hiringStatus(5555));

		// close the application context
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
