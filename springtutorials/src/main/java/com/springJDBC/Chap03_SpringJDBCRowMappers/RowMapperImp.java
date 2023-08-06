package com.springJDBC.Chap03_SpringJDBCRowMappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImp implements RowMapper<Person>{

    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person(rs.getInt("Id"),rs.getString("name"),rs.getString("CompanyName"));
        return person;
    }
    
}
