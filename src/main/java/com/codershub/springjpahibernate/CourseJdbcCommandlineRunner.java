package com.codershub.springjpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandlineRunner implements CommandLineRunner {
//
//    @Autowired
//    private  CourseJdbcRepository repository;
    @Autowired
    private  CourseRepository repository;


    @Override
    public void run(String... args) throws Exception {
        Course course = new Course(1,"Learn java","Anthony micheal");

        repository.insert(course);


//        repository.insert(new Course(1,"Learn java Now","Anthony"));
//        repository.insert(new Course(2,"Learn Andro Now","Anthony"));
//        repository.insert(new Course(3,"Learn flutter Now","Anthony"));
//        repository.insert(new Course(4,"Learn Node Now","Anthony"));
//        repository.deleteById(1);
//        System.out.println(repository.findById(4));
//        System.out.println(repository.findById(3));

    }
}
