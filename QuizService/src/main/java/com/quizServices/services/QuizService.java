package com.quizServices.services;

import java.util.List;

import com.quizServices.entities.Quiz;

public interface QuizService {
    
    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long id);
}
