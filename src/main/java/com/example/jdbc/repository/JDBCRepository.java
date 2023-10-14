package com.example.jdbc.repository;

import java.util.List;

public interface JDBCRepository {

    List<String> getProductName(String name);
    void addCustomer(int age,String name,String surname,String phone,String amount,String date,String productName);

}
