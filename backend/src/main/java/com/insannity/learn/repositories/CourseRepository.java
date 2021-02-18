package com.insannity.learn.repositories;

import com.insannity.learn.entities.Course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>{
    
}
