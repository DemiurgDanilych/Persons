package com.example.personentity.control;

import com.example.personentity.entity.Persons;
import com.example.personentity.reposit.RepositoryEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControlEntity {

    private final RepositoryEntity repositoryEntity;

    public ControlEntity(RepositoryEntity repositoryEntity){
        this.repositoryEntity = repositoryEntity;
    }
    @GetMapping("/persons/by-city")
    public List getCity(@RequestParam String city){
        return repositoryEntity.getPersons(city);
    }
    @GetMapping("/persons/by-name")
    public List getStreet(@RequestParam String name){
        return repositoryEntity.getStreet(name);
    }
}
