package com.reactapp.service.InningsData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactapp.model.InningsData;

@Service
public class InningsDataService {

    private InningsDataRepo inningsDataRepo;

    @Autowired
    public InningsDataService(InningsDataRepo inningsDataRepo){
        this.inningsDataRepo=inningsDataRepo;
    }
    
    public InningsData saveInnings(InningsData inningsData){
        return inningsDataRepo.save(inningsData);
    }
}
