package com.project.customers.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

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
