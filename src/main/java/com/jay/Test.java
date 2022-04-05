package com.jay;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jay.ctrl.EmployeeController;
import com.jay.entity.Address;
import com.jay.entity.Employee;
import com.jay.service.EmployeeService;

public class Test {

	public static void main(String arr[]) {
		/*Address address = new Address(1,"street-1","street-2","city-1","state-1","district-1","765432");
		Employee employee = new Employee(1,"John","D-101",100000,true,"john@gmail.com","9876543212",address);
		EmployeeService employeeService = new EmployeeService(employee);
		EmployeeController employeeController = 
				new EmployeeController(employeeService);*/
		
		//System.out.println(employeeController);
		
		 ApplicationContext applicationContext  = new 
		    		ClassPathXmlApplicationContext("beans.xml"); 
		 
		 
		System.out.println("Total Beans: "+ applicationContext.getBeanDefinitionCount());
		System.out.println("Before Calling getBean(), ApplicationContext Creates all the singleton Object Eagerly!!");
		for(String beanName:applicationContext.getBeanDefinitionNames()) {
			System.out.println("Bean Name: "+beanName);
			System.out.println("Is Singleton:"+applicationContext.isSingleton(beanName));
			System.out.println("Is Prototype:"+applicationContext.isPrototype(beanName));
		}
		
		 EmployeeController employeeController = applicationContext.getBean("employeeController",EmployeeController.class);
		 EmployeeController employeeController1 = applicationContext.getBean("employeeController",EmployeeController.class);
		 System.out.println(employeeController);
		 System.out.println("Is These two Objects are Equal:"+(employeeController==employeeController1));
		 
		 Date d1 = applicationContext.getBean("date",Date.class);
		 Date d2 = applicationContext.getBean("date",Date.class);
		 System.out.println(d1);
		 System.out.println("If d1 and d2 are equals:"+(d1==d2));
		
	}
}
