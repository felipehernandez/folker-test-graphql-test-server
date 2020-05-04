package com.folkertest.test.server.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.folkertest.test.server.graphql.model.Person;
import com.folkertest.test.server.graphql.repository.PersonRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PersonQuery implements GraphQLQueryResolver {

    private final PersonRepository personRepository;

    public PersonQuery(final PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(final int id) {
        return personRepository.findById(id);
    }
}
