package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {

            return args -> {
                Student mariam = new Student(
                        1L,
                        "Mustafa",
                        "marima.asdsad@fmamss.com",
                        LocalDate.of(2000, Month.APRIL,8)


                );

                Student aka = new Student(
                        2L,
                        "aka",
                        "ssaasdsadasdqqq.asdsad@fmamss.com",
                        LocalDate.of(1998, Month.APRIL,10)


                );

                repository.saveAll(
                        List.of(mariam,aka)
                );

            };
    }

}
