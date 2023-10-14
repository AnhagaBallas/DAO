package com.example.daomigration.repository;

import com.example.daomigration.model.Person;

import java.util.List;

public interface HibernateRepository {
    List<Person> getPersonByCity(String city);
}
