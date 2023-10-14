package com.example.jdbc.service;

import com.example.jdbc.repository.JDBCRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JDBCServiceImpl implements JDBCService{
    private final JDBCRepositoryImpl repository;

    @Override
    public List<String> getProductNameList(String name) {
        return repository.getProductName(name);
    }

}
