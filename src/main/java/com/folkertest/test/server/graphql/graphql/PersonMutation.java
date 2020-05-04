package com.folkertest.test.server.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.folkertest.test.server.graphql.model.Person;
import com.folkertest.test.server.graphql.repository.PersonRepository;
import org.springframework.stereotype.Component;

@Component
public class PersonMutation implements GraphQLMutationResolver {

    private final PersonRepository personRepository;

    public PersonMutation(final PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person addPerson(final String firstName, final String lastName) {
        return this.personRepository.save(Person.builder()
                                                .id(51)
                                                .firstName(firstName)
                                                .lastName(lastName)
                                                .build());
    }
}
