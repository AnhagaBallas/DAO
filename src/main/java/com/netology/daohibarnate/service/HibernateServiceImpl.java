package com.netology.daohibarnate.service;

import com.netology.daohibarnate.model.Person;
import com.netology.daohibarnate.repository.HibernateRepositoryImpl;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HibernateServiceImpl implements HibernateService {
    @NonNull
    private HibernateRepositoryImpl hibernateRepository;

    @Override
    public List<Person> getByCity(String city) {
        return hibernateRepository.getPersonByCity(city);
    }
}
