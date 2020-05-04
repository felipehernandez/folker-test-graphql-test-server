package com.folkertest.test.server.graphql;

import com.folkertest.test.server.graphql.model.Person;
import com.folkertest.test.server.graphql.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class AppController {

    private final PersonRepository personRepository;

    public AppController(final PersonRepository repository) {
        this.personRepository = repository;
    }

    @GetMapping()
    public String asd() {
        return "Hello World";
    }

    @GetMapping("all")
    public List<Person> getAll() {
        return this.personRepository.findAll();
    }
}
