package com.amit.springboot.jdbchandson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amit.springboot.jdbchandson.model.Student;
import com.amit.springboot.jdbchandson.repo.StudentJdbcRepository;

@SpringBootApplication
public class JdbcHandsonApplication implements CommandLineRunner {

	@Autowired
	StudentJdbcRepository repository;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(JdbcHandsonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Student id 12221 -> {}", repository.findById(12221));
		
		logger.info("Inserting -> {}", repository.insert(new Student((long) 10010  , "John", "A1234657")));

		logger.info("Update 10001 -> {}", repository.update(new Student((long) 12221  , "Name-Updated", "New-Passport")));

		logger.info("deleting 12221 "+ repository.deleteById(12222));

		logger.info("All users 2 -> {}", repository.findAll());

	}
}
