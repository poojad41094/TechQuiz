package com.quizServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizServices.entities.Quiz;

public interface QuizRepo extends JpaRepository<Quiz, Long>{
    
}
