package com.example.jdbc.repository;

import com.example.jdbc.Entity.Customers;
import com.example.jdbc.Entity.Orders;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class JDBCRepositoryImpl implements JDBCRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<String> getProductName(String name) {
        List<Customers> customersList = List.of(Customers.builder()
                .age(1)
                .name("alexey")
                .surname("Petrov")
                .phoneString("+8 999999")
                .orders(Orders.builder()
                        .amount("123")
                        .date("1.1.1")
                        .productName("chair")
                        .build())
                .build());
        customersList.forEach(c -> entityManager.persist(c));
        List<String> productNameList = new ArrayList<>();
        List<Customers> customerList = entityManager.createQuery("SELECT customer from Customers customer where customer.name=:name")
                .setParameter("name", name)
                .getResultList();
        customerList.forEach(customer -> productNameList.add(customer.getOrders().getProductName()));
        return productNameList;
    }
}
