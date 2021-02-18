package com.insannity.learn.repositories;

import com.insannity.learn.entities.Lesson;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
    
}
