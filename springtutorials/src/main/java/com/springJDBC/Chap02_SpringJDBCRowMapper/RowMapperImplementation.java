package com.springJDBC.Chap02_SpringJDBCRowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
public class RowMapperImplementation implements RowMapper<Employee>{
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee  emp = new Employee(rs.getInt("Id"),rs.getString("Name"),rs.getString("CompanyName"));
        return emp;
        
    }
}
