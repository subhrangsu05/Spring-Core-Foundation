package com.springJDBC.Chap03_SpringJDBCRowMappers;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Persondao {
    JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Person> allDetails(){
        String sql = "SELECT * FROM springjdbc.employee";
        RowMapper<Person> rowMapper = new RowMapperImp();
        List<Person> person =  jdbcTemplate.query(sql, rowMapper );
        return person;
    }
}
