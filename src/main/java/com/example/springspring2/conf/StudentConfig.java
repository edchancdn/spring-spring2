package com.example.springspring2.conf;

import com.example.springspring2.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public Student student() {
        return new Student("John Doe", "123");
        //return new Student();
    }
}
