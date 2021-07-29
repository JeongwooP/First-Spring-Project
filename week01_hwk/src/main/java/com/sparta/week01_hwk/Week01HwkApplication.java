package com.sparta.week01_hwk;

import com.sparta.week01_hwk.models.PersonRepository;
import com.sparta.week01_hwk.models.Person;
import com.sparta.week01_hwk.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class Week01HwkApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week01HwkApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PersonRepository personRepository, PersonService personService) {
        return (args) -> {
            personRepository.save(new Person("신세경", 29, "서울시", "배우"));

            System.out.println("데이터 인쇄");

            List<Person> personList = personRepository.findAll();
            for (int i=0; i<personList.size(); i++) {
                Person course = personList.get(i);
                System.out.println(course.getId());
                System.out.println(course.getName());
                System.out.println(course.getAge());
                System.out.println(course.getAddress());
                System.out.println(course.getJob());
            }
        };
    }
}
