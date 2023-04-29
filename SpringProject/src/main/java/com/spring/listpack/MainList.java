package com.spring.listpack;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainList {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/listpack/empproj.xml");
		Employee emp =(Employee)context.getBean("emp1");
		System.out.println(emp.getName()+"    "+emp.getAddress()+ "the project are  ");
		for(Project l: emp.getProjects()) {
			System.out.println(l.getProjectName()+" \n "+ l.getDescription());
		}

	}

}
