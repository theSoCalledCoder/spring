package org.demo.practical.autowiringXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("wiringconfig.xml");
        EMP e=(EMP)context.getBean("emp1");
        System.out.println(e);
    }
}
