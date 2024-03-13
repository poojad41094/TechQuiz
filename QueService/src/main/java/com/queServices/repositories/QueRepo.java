package com.queServices.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.queServices.entities.Que;


public interface QueRepo extends JpaRepository<Que , Long> {

    List<Que> findByQuizId(Long quizId);
    
}
