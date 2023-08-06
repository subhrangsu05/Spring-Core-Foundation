package com.springJDBC.Chap04_SpringJavaConfig;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Skilldao {
    JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public int Insert(Skill skill){
        String sql = "INSERT INTO springjdbc.Skills(Name,Skills) VALUES (?,?)";
        int rowCount = jdbcTemplate.update(sql,skill.getName(),skill.getSkills());
        return rowCount;
    }
    public List<Skill> select(){
        RowMapper<Skill> rowmapper = new RowmapperImpp();
        String sql = "SELECT * FROM springjdbc.skills";
        List<Skill> skill = jdbcTemplate.query(sql,rowmapper);
        return skill;

    }
} 
