package com.insannity.learn.repositories;

import com.insannity.learn.entities.Resource;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
    
}
