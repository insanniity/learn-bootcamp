package com.insannity.learn.repositories;

import com.insannity.learn.entities.Section;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
    
}
