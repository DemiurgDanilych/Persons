package com.example.personentity.reposit;

import com.example.personentity.entity.Persons;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class RepositoryEntity {
    @PersistenceContext
    public EntityManager entityManager;

    public List getPersons(String city) {
        Query query = entityManager.createQuery("select p from Persons p  where p.city_of_living = :city", Persons.class);
        query.setParameter("city", city);

        return query.getResultList();
    }
}
