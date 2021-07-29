package com.sparta.week01_hwk.controller;

import com.sparta.week01_hwk.models.PersonRepository;
import com.sparta.week01_hwk.models.PersonRequestDto;
import com.sparta.week01_hwk.models.Person;
import com.sparta.week01_hwk.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {

    private final PersonRepository personRepository;

    private final PersonService personService;

    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto) {
        Person person = new Person(requestDto);

        return personRepository.save(person);
    }

    @GetMapping("/api/persons")
    public List<Person> readPersons() {
        return personRepository.findAll();
    }

    @PutMapping("/api/persons/{id}")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto) {
        return personService.update(id, requestDto);
    }

    @DeleteMapping("/api/persons/{id}")
    public Long deletePerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto) {
        personRepository.deleteById(id);
        return id;
    }

}
