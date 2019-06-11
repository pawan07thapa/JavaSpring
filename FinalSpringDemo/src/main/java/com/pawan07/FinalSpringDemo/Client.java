package com.pawan07.FinalSpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// All the jar files should be added in the systempath and not in the classpath
// bean.xml file should be created in the src folder
// to add jar files to pom.xml update the project-> maven -> update or Alt+F5

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("employee_bean.xml");
		//Employee e1= context.getBean("employee", Employee.class);

		
		Employee e2= context.getBean("emp", Employee.class);
		
		//Using annotation based configuration
//		e1.setEid(100);
//		e1.setEname("pawam");
//		e1.setEadd("Nepal");

		System.out.println("info about our first employer :" + e2);
	//	System.out.println(""+e2);
		
		//closing Context
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
	}

}
