package com.queServices.services;

import java.util.List;

import com.queServices.entities.Que;

public interface QueService {

    Que create(Que que);

    List<Que> get();

    Que getOne(Long id);
    
}