package com.project.customers;

import com.project.customers.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class CustomersApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomersApplication.class, args);
    }

    @GetMapping("/")
    public List<Student> taste(){
        return List.of(
                new Student(
                        1,
                        "Luke",
                        "Luke@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 5),
                        21
                )
        );
    }

}
