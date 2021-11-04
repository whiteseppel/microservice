package com.example.demo.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student viki = new Student(
                    "Viki",
                    "viki.u@gmail.com",
                    LocalDate.of(2000,1,1)
            );

            Student seppl = new Student(
                    "Seppl",
                    "seppl.w@gmail.com",
                    LocalDate.of(1996,10,30)
            );
//            repository.saveAll(List.of(viki, seppl));
        };
    }
}
