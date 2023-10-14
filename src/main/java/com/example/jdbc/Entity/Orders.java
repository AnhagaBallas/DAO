package com.example.jdbc.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Table(name = "ORDERS", schema = "netology")
public class Orders {
    @Column(name = "orders_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String date;
    @Column
    private String productName;
    @Column
    private String amount;

}
