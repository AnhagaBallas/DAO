package com.example.jdbc.repository;

import java.util.List;

public interface JDBCRepository {

    List<String> getProductName(String name);

}
