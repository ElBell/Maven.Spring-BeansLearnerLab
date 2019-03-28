package com.ElBell.beanslearner.beans;

import com.ElBell.beanslearner.Instructor;
import com.ElBell.beanslearner.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {
    @Bean(name = "usaInstructors")
    public Instructors tcUsaInstructors() {
        return new Instructors(new Instructor(0, "Ted"), new Instructor(1, "Marcy"),
                new Instructor(2, "Fred"), new Instructor(3, "Dylan"));
    }

    @Bean(name = "ukInstructors")
    public Instructors tcUkInstructors() {
        return new Instructors(new Instructor(0, "Edward"), new Instructor(1, "Sammy"),
                new Instructor(2, "Jenn"), new Instructor(3, "April"));
    }

    @Primary
    @Bean
    public Instructors instructors() {
        return new Instructors(new Instructor(0, "Kris"), new Instructor(1, "Leon"),
                new Instructor(2, "Nhu"), new Instructor(3, "Dolio"),
                new Instructor(4, "Melanie"));
    }
}
