package com.example.demo.student;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jack = new Student("Jack");
            Student kathy = new Student("Kathy");
            repository.saveAll(List.of(jack, kathy));
        };        
    }
}
