package org.demo.practical;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("refconfig.xml");
        adi a= (adi)context.getBean("firstAdi");
        prachi p=(prachi) context.getBean("firstPrachi");
        System.out.println(a);
    }
}
