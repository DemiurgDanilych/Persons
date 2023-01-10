package com.example.personentity.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Contact {
    @Id
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private int number;
}
