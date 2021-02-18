package com.insannity.learn.repositories;

import com.insannity.learn.entities.Topic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    
}
