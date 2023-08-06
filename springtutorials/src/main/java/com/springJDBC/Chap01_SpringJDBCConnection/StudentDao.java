package com.springJDBC.Chap01_SpringJDBCConnection;
import org.springframework.jdbc.core.JdbcTemplate;
public class StudentDao {
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
        System.out.println("jdbc template setter");
    }
    // Insert:-
    public int insert(Student student){
        String sql = "INSERT INTO springjdbc.student(id,name,city) VALUES(?,?,?)";
        int row = jdbcTemplate.update(sql,student.getId(),student.getName(),student.getCity());
        return row;
    }
    // Update:-
    public int update(Student student){
        String sql = "UPDATE springjdbc.student SET name = ? WHERE id = ?";
        int row = jdbcTemplate.update(sql,student.getName(),student.getId());
        return row;
    }
    // Delete:-
    public int delete(Student student){
        String sql = "DELETE FROM springjdbc.student WHERE id = ?";
        int row = jdbcTemplate.update(sql, student.getId());
        return row;
    }
}
