package com.example.personentity.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private int number;
    @OneToOne(mappedBy = "contact", cascade = CascadeType.ALL)
    private Persons persons;
}
