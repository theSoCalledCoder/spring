package org.demo.practical.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("consconfig.xml");
        first f1=(first)context.getBean("firstBean");
        System.out.println(f1);
    }
}
