package com.example.daomigration.service;

import com.example.daomigration.model.Person;
import com.example.daomigration.repository.HibernateRepositoryImpl;
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
