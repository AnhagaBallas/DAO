package com.example.daomigration.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class HibernateRepositoryImpl implements HibernateRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List getPersonByCity(String city) {
        List personList = entityManager.createQuery("SELECT person FROM Person person where person.city_of_living = :city")
                .setParameter("city", city)
                .getResultList();
        return personList;
    }


}
