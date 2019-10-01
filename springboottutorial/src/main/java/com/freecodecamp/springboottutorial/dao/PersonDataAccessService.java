package com.freecodecamp.springboottutorial.dao;

import com.freecodecamp.springboottutorial.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class PersonDataAccessService implements PersonDao {
    @Override
    public Integer insertPerson(UUID id, Person person) {
        return null;
    }

    @Override
    public List<Person> selectAllPeople() {
        return List.of(new Person(UUID.randomUUID(), "FROM POSTGRES DB"));
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Integer deletePersonById(UUID id) {
        return null;
    }

    @Override
    public Integer updatePersonById(UUID id, Person person) {
        return null;
    }
}
