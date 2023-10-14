package com.netology.daohibarnate.repository;

import com.netology.daohibarnate.model.Person;

import java.util.List;

public interface HibernateRepository {
    List<Person> getPersonByCity(String city);
}
