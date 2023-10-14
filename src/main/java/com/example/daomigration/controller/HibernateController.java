package com.example.daomigration.controller;

import com.example.daomigration.model.Person;
import com.example.daomigration.service.HibernateServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class HibernateController {

    @NonNull
    private HibernateServiceImpl hibernateService;

    @GetMapping("/persons/by-city")
    public List<Person> getByCity(@RequestParam String city) {
        return hibernateService.getByCity(city);
    }
}
