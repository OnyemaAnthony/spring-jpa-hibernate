package com.codershub.springjpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandlineRunner implements CommandLineRunner {


@Autowired
private  CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        Course course = new Course(1,"Learn java","Anthony");
        Course cours = new Course(2,"Learn swift","Anthony micheal");

    }
}
