package com.amit.springboot.jdbchandson.repo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.amit.springboot.jdbchandson.model.Student;

public class StudentRowMapper implements RowMapper < Student > {

    @Override

    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

        Student student = new Student();

        student.setId(rs.getLong("id"));

        student.setName(rs.getString("name"));

        student.setPassportNumber(rs.getString("passport_number"));

        return student;

    }

}
