package com.sparta.week01_hwk.models;

import com.sparta.week01_hwk.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}