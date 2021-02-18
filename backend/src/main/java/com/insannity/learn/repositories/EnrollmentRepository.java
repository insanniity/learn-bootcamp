package com.insannity.learn.repositories;

import com.insannity.learn.entities.Enrollment;
import com.insannity.learn.entities.pk.EnrollmentPK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
    
}
