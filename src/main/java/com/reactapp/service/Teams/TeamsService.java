package com.reactapp.service.Teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactapp.model.Teams;

@Service
public class TeamsService {

    private TeamsRepo teamsRepo;

    @Autowired
    public TeamsService(TeamsRepo teamsRepo) {
        this.teamsRepo = teamsRepo;
    }

    public Teams saveTeams(Teams teams) {
        return teamsRepo.save(teams);
    }

}
