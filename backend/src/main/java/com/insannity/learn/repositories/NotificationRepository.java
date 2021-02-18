package com.insannity.learn.repositories;

import com.insannity.learn.entities.Notification;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    
}
