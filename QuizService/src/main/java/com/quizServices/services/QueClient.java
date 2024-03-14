package com.quizServices.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quizServices.entities.Que;

// @FeignClient(url = "http://localhost:8091", value="Question-Client")
@FeignClient(name = "QUESTIONSERVICE")
public interface QueClient {

    @GetMapping("/question/quiz/{quizId}")
    List<Que> getQuestionOfQuiz(@PathVariable Long quizId);
}
