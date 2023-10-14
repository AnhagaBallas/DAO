package com.example.jdbc.service;

import java.util.List;

public interface JDBCService {
    List<String> getProductNameList(String name);
    void addCustomer(int age,String name,String surname,String phone,String amount,String date,String productName);
}
