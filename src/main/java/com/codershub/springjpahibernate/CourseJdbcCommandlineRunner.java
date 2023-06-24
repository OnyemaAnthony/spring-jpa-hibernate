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
        repository.save(course);
        repository.save(cours);

        System.out.println(repository.findByAuthor("Anthony"));



//        repository.insert(new Course(1,"Learn java Now","Anthony"));
//        repository.insert(new Course(2,"Learn Andro Now","Anthony"));
//        repository.insert(new Course(3,"Learn flutter Now","Anthony"));
//        repository.insert(new Course(4,"Learn Node Now","Anthony"));
//        repository.deleteById(1);
//        System.out.println(repository.findById(4));
//        System.out.println(repository.findById(3));

    }
}
