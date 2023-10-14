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
        List<String> productNameList = new ArrayList<>();
        List<Customers> customerList = entityManager.createQuery("SELECT customer from Customers customer where customer.name=:name")
                .setParameter("name", name)
                .getResultList();
        customerList.forEach(customer -> productNameList.add(customer.getOrders().getProductName()));
        return productNameList;
    }

    @Override
    @Transactional
    public void addCustomer(int age, String name, String surname, String phone, String amount, String date, String productName) {
        Customers customer = Customers.builder()
                .age(age)
                .name(name)
                .surname(surname)
                .phoneString(phone)
                .orders(Orders.builder()
                        .amount(amount)
                        .date(date)
                        .productName(productName)
                        .build())
                .build();
        entityManager.persist(customer);

    }
}
