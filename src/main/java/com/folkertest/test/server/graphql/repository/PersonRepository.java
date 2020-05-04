package com.folkertest.test.server.graphql.repository;

import com.folkertest.test.server.graphql.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
