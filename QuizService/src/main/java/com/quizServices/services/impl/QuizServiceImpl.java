package com.quizServices.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizServices.entities.Quiz;
import com.quizServices.repositories.QuizRepo;
import com.quizServices.services.QueClient;
import com.quizServices.services.QuizService;



@Service
public class QuizServiceImpl implements QuizService{
    @Autowired
    private QuizRepo quizRepo;
    private QueClient queClient;
    
    public QuizServiceImpl(QuizRepo quizRepo, QueClient queClient) {
        this.quizRepo = quizRepo;
        this.queClient = queClient;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepo.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        List<Quiz> quizes = quizRepo.findAll();

        List<Quiz> newQuizList = quizes.stream().map(quiz -> {
            quiz.setQue(queClient.getQuestionOfQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());

        return newQuizList;
    }

    @Override
    public Quiz get(Long id) {

        Quiz quiz = quizRepo.findById(id).orElseThrow(()-> new RuntimeException("Quiz Not Found"));
        quiz.setQue(queClient.getQuestionOfQuiz(quiz.getId()));
        return quiz;
    }
    
}
