package com.queServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.queServices.entities.Que;

public interface QueRepo extends JpaRepository<Que , Long> {
    
}
