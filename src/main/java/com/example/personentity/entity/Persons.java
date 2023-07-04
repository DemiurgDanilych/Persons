package com.example.personentity.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "persons")
public class Persons {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;
    @Id
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false)
    private int age;
    @Column(length = 11)
    private String phone_number;
    @Column(nullable = false)
    private String city_of_living;
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id")
    private Contact contact;
}
