package com.quizServices.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizServices.entities.Quiz;
import com.quizServices.repositories.QuizRepo;
import com.quizServices.services.QuizService;



@Service
public class QuizServiceImpl implements QuizService{
    @Autowired
    private QuizRepo quizRepo;

    public QuizServiceImpl(QuizRepo quizRepo) {
        this.quizRepo = quizRepo;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepo.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        return quizRepo.findAll();
    }

    @Override
    public Quiz get(Long id) {
        return quizRepo.findById(id).orElseThrow(()-> new RuntimeException("Quiz Not Found"));
    }
    
}
