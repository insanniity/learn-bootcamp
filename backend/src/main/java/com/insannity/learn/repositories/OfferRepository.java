package com.insannity.learn.repositories;

import com.insannity.learn.entities.Offer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
    
}
