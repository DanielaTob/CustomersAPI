package com.project.customers.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.APRIL;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student luke = new Student(
                    "luke",
                    "luke@gmail.com",
                    LocalDate.of(2000, APRIL, 5),
                    21
            );

            Student leia = new Student(
                    "leia",
                    "leia@gmail.com",
                    LocalDate.of(2000, APRIL, 5),
                    21
            );

            repository.saveAll(
                    List.of(luke,  leia)
            );
        };
    }
}
