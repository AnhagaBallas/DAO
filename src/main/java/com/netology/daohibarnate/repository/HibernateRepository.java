package com.netology.daohibarnate.repository;

import com.netology.daohibarnate.model.Person;
import com.netology.daohibarnate.model.PersonalData;

import java.util.List;

public interface HibernateRepository {
    List<Person> getPersonByCity(String city);

    void addPerson(PersonalData personalData,String phoneNumber,String city);
}
