package com.queServices.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.queServices.entities.Que;
import com.queServices.repositories.QueRepo;
import com.queServices.services.QueService;

@Service
public class QueServiceImpl implements QueService{

    public QueRepo queRepo;
    

    public QueServiceImpl(QueRepo queRepo) {
        this.queRepo = queRepo;
    }

    @Override
    public Que create(Que que) {
        return queRepo.save(que);
    }

    @Override
    public List<Que> get() {
       return queRepo.findAll();
    }

    @Override
    public Que getOne(Long id) {
        return queRepo.findById(id).orElseThrow(()-> new RuntimeException("Question Not Found!"));
    }
    
}
