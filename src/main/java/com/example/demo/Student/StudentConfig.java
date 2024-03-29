package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args ->{

            Student mariam = new Student(
                    "Mariam",
                    "mail@mail.com",
                    LocalDate.of(2000, JANUARY,17));

            Student alex = new Student(
                    "Alex",
                    "alex@mail.com",
                    LocalDate.of(1999, Month.JANUARY,18));

            Student javi = new Student(
                    "Javi",
                    "javi@mail.com",
                    LocalDate.of(1999, Month.JANUARY,18));



            repository.saveAll(List.of(mariam,alex,javi));


        };

    }

}
