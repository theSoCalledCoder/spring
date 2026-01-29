package org.demo.SpringJDBC;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao{

    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Employee employee) {
        String query="INSERT INTO EMPLOYEE(name,address) VALUES(?,?)";
        int result=this.jdbcTemplate.update(query,employee.getName(),employee.getAddress());
        return result;
    }
    public int change(Employee employee){
        String query="UPDATE EMPLOYEE SET name= ?, address= ? WHERE name LIKE 'a%'";
        int result=this.jdbcTemplate.update(query,employee.getName(),employee.getAddress());
        return result;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
