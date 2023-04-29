package com.spring.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/SpringProject/student.xml");
        Student s = (Student) context.getBean("student1");
        System.out.println(s);
    }
}
