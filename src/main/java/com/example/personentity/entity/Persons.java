package com.example.personentity.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Persons {
    @Id
    @Column(nullable = false)
    private String name;
    @Id
    @Column(nullable = false)
    private String surname;
    @Id
    @Column(nullable = false)
    private int age;
    @Column(length = 11)
    private String phone_number;
    @Column(nullable = false)
    private String city_of_living;

//    @ManyToOne
//    public Contact contact;
}
