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

    /*
   SELECT product_name FROM orders o
         join customers c on c.id = o.customer_id
         WHERE c.name = :name
    */
    public List getStreet(String name) {
        Query query = entityManager.createQuery("select c from Contact c join Persons p on p.name = c.street where c.street = :street", Persons.class);
        query.setParameter("street", name);
        return query.getResultList();
    }
}
