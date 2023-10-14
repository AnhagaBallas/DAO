package com.netology.daohibarnate.repository;

import com.netology.daohibarnate.model.Person;
import com.netology.daohibarnate.model.PersonalData;
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

    @Override
    @Transactional
    public void addPerson(PersonalData personalData, String phoneNumber, String city) {
        Person person =
                Person.builder().personalData(PersonalData.builder()
                                .age(personalData.getAge())
                                .name(personalData.getName())
                                .surname(personalData.getSurname())
                                .build())
                        .city_of_living(city)
                        .phone_number(phoneNumber)
                        .build();
        entityManager.persist(person);
    }
}
