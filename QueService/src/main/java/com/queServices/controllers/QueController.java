package com.queServices.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.queServices.entities.Que;
import com.queServices.services.QueService;

@RestController
@RequestMapping("/question")
public class QueController {

    private QueService queService;

    public QueController(QueService queService) {
        this.queService = queService;
    }
    
    @PostMapping
    public Que create(@RequestBody Que que){
        return queService.create(que);
    }

    @GetMapping
    public List<Que> getAll(){
        return queService.get();
    }

    @GetMapping("/{queId}")
    public Que getAll(@PathVariable Long queId){
        return queService.getOne(queId);
    }
    
}
