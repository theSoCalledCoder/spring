package org.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Worldi");
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Student Adi=(Student)context.getBean("student1");
//        Student Prachi=(Student)context.getBean("student2");
        System.out.println(Adi);
//        System.out.println(Prachi);
    }
}
