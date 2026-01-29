package org.demo.SpringJDBC;

import org.springframework.jdbc.core.JdbcTemplate;

public class Employee {
    private String name;
    private String Address;

    public Employee() {
    }

    public Employee(String name, String address) {
        this.name = name;
        Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
