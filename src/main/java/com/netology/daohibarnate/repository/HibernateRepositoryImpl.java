package com.netology.daohibarnate.repository;

import com.netology.daohibarnate.model.Person;
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
        List<Person> addPersonList=List.of(
                Person.builder().age("1").city_of_living("Moscow").name("Ivan").surname("Ivanov").phone_number("+79999999").build(),
                Person.builder().age("2").city_of_living("Krasnodar").name("Petya").surname("Petrov").phone_number("+7888888888").build());
        addPersonList.forEach(p->entityManager.persist(p));
        List personList=entityManager.createQuery("SELECT person FROM Person person where person.city_of_living = :city")
                .setParameter("city",city)
                .getResultList();
        return personList;
    }



}
