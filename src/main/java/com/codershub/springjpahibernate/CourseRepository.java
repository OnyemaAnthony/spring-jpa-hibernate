package com.codershub.springjpahibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseRepository {

    @PersistenceContext
    private  EntityManager entityManager;

    public void insert(Course course){
        System.out.println("the course is "+course.toString());
        entityManager.merge(course);
    }

    public Course findById(long id){
        return  entityManager.find(Course.class,id);
    }

    public void deleteById(long id){
        Course course = entityManager.find(Course.class,id);
        entityManager.remove(course);
    }
}

