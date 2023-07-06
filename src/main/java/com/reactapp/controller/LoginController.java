package com.reactapp.controller;

import com.reactapp.service.BattingService;
import com.reactapp.service.BattingTotalService;
import com.reactapp.service.BowlingService;
import com.reactapp.service.LoginRepo;
import com.reactapp.service.LoginService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.reactapp.model.Batting;
import com.reactapp.model.BattingTotal;
import com.reactapp.model.Bowling;
import com.reactapp.model.InningsData;
import com.reactapp.model.Login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private BattingService battingService;

    @Autowired
    private BowlingService bowlingService;

    @Autowired
    private BattingTotalService battingTotalService;

    @Autowired
    private LoginRepo repo;

    @PostMapping("/signup") // Map ONLY POST Requests
    public void addNewUser(@RequestBody Login login) {
        loginService.addUser(login);
    }

    @GetMapping("/demo")
    @ResponseBody
    public Boolean displayContent(@RequestParam("username") String username,
            @RequestParam("password") String password) {
        String name = "";
        String pwd = "";
        try {
            name = repo.findByUsername(username).getUsername();
            pwd = repo.findByUsername(username).getPassword();
        } catch (Exception e) {
            System.out.println("No user exists");
            return false;
        }
        return (name.equals(username.trim()) && pwd.equals(password.trim()));
    }

    @PostMapping("/enterscore")
    public boolean createInnings(@RequestBody String jsonPayLoad) {
        System.out.println(jsonPayLoad);
        ObjectMapper objectMapper = new ObjectMapper();
        InningsData inningsData;
        try {
            inningsData = objectMapper.readValue(jsonPayLoad, InningsData.class);
            storeBattingData(inningsData.getBatting());
            storeBowlingData(inningsData.getBowling());
            storeBattingTotalData(inningsData.getBattingTotal());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    private void storeBattingData(List<Batting> battingList) {
        if (battingList != null && !battingList.isEmpty()) {
            for (Batting battingData : battingList) {
                System.out.println(battingData);
                try {
                    battingService.saveBattingData(battingData);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void storeBowlingData(List<Bowling> bowlingList) {
        if (bowlingList != null && !bowlingList.isEmpty()) {
            for (Bowling bowlingData : bowlingList) {
                System.out.println(bowlingData);
                try {
                    bowlingService.saveBowlingData(bowlingData);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void storeBattingTotalData(BattingTotal battingTotals) {
        try {
            battingTotalService.saveBattingTotal(battingTotals);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
