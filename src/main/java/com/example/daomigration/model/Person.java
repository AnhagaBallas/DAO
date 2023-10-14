package com.example.daomigration.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PERSON", schema = "netology")
public class Person {
    @EmbeddedId
    private PersonalData personalData;

    @Column(nullable = false)
    private String phone_number;

    @Column(nullable = false)
    private String city_of_living;
}
