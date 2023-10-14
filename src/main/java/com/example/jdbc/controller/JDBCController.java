package com.example.jdbc.controller;

import com.example.jdbc.service.JDBCServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class JDBCController {
    private final JDBCServiceImpl service;

    @GetMapping("/products/fetch-product")
    public List<String> productNameFromSql(@RequestParam String name) {
        return service.getProductNameList(name);
    }
}
