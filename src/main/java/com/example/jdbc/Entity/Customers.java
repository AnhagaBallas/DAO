package com.example.jdbc.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity()
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "CUSTOMERS", schema = "netology")
public class Customers {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private int age;
    @Column
    private String phoneString;
    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    private Orders orders;
}

