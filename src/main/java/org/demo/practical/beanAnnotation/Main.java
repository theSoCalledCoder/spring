package org.demo.practical.beanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
        Aditya adi=context.getBean(Aditya.class);
        System.out.println(adi);
    }
}
