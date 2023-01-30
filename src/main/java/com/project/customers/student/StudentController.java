package com.project.customers.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1,
                        "Luke",
                        "Luke@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 5),
                        21
                ),
                new Student(
                        2,
                        "Lia",
                        "Leia@gmail.com",
                        LocalDate.of(2003, Month.JULY, 20),
                        18
                )
        );
    }


}
