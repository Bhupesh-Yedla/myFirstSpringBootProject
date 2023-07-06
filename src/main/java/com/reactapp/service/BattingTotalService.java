package com.reactapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactapp.model.BattingTotal;

@Service
public class BattingTotalService {

    private BattingTotalRepo battingTotalRepo;

    @Autowired
    public BattingTotalService(BattingTotalRepo battingTotalRepo){
        this.battingTotalRepo=battingTotalRepo;
    }

    public BattingTotal saveBattingTotal(BattingTotal battingTotal){
        return battingTotalRepo.save(battingTotal);
    }
    
}
