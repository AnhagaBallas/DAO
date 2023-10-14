package com.example.daomigration.service;

import com.example.daomigration.model.Person;

import java.util.List;

public interface HibernateService {
    List<Person> getByCity(String city);
}
