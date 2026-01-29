package org.demo.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("jdbcconfig.xml");
        EmployeeDao emp=context.getBean("employeeDao",EmployeeDao.class);
        Employee e= context.getBean("employee",Employee.class);
//        int result=emp.insert(e);
        int result =emp.change(e);
        System.out.println("rows affected -"+result);
    }
}
