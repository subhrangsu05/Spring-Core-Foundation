package com.springJDBC.Chap02_SpringJDBCRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public int insert(Employee e){
        String sql = "INSERT INTO springjdbc.employee(Id,Name,CompanyName) VALUES (?,?,?)";
        int rowCount = jdbcTemplate.update(sql,e.getId(),e.getName(),e.getCompanyName());
        return rowCount;
    }
    public Employee getEmployeeDetails(int id){
        RowMapper<Employee> rowMapper = new RowMapperImplementation();
        String sql = "SELECT * FROM springjdbc.employee WHERE Id = ?";
        Employee emp = jdbcTemplate.queryForObject(sql, rowMapper, id);
        return emp;
    }
    
}
