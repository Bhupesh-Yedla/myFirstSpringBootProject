package com.reactapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactapp.model.Bowling;

@Service
public class BowlingService {

    private BowlingRepo bowlingRepo;

    @Autowired
    public BowlingService(BowlingRepo bowlingRepo) {
        this.bowlingRepo = bowlingRepo;
    }

    public Bowling saveBowlingData(Bowling bowling) {
        return bowlingRepo.save(bowling);
    }

}
