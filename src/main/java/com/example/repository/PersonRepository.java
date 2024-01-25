package com.example.repository;

import com.example.entity.Person;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonRepository {

  private static final List<Person> persons = new ArrayList<>();
  public static final int MAX_PERSONS = 10;

  private static void init() {
    for (int i = 0; i < MAX_PERSONS; i++) {
      Person person = Person.builder()
          .name("Person-" + i)
          .age(i + 10)
          .build();
      persons.add(person);
    }
  }

  public static List<Person> getAllPerson() {
    if (persons.isEmpty()) {
      init();
      log.info("Persons: {}", persons);
    }
    return persons;
  }
}
