package com.example.jdbc;

import com.example.jdbc.repository.JDBCRepository;
import com.example.jdbc.repository.JDBCRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdbcApplication.class, args);

    }

}
