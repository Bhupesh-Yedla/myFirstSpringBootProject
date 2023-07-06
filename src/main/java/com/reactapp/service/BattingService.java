package com.reactapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactapp.model.Batting;

@Service
public class BattingService {

    private BattingRepo battingRepo;

    @Autowired
    public BattingService(BattingRepo battingRepo) {
        this.battingRepo = battingRepo;
    }

    public Batting saveBattingData(Batting batting) {
        // List<BattingData> savedBattingDataList = new ArrayList<>();
        // for (BattingData bd : battingData) {
        // battingRepo.save(battingData);
        // }
        return battingRepo.save(batting);
    }

}
