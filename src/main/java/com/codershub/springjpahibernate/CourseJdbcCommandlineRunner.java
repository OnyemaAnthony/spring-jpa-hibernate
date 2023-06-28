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

    }
}
