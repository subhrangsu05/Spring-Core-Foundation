package com.springJDBC.Chap04_SpringJavaConfig;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowmapperImpp implements RowMapper <Skill>{
    public Skill mapRow(ResultSet rs , int rowNum) throws SQLException{

        Skill skill  = new Skill(rs.getString("Name"),rs.getString("Skills"));
        return skill;
    }
    
}
