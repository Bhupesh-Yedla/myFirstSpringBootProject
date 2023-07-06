package com.reactapp.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InningsData {

    List<Batting> batting;

    List<Bowling> bowling;

    BattingTotal battingTotal;

    public List<Batting> getBatting(){
        return batting;
    }

    public void setBatting(List<Batting> batting){
        this.batting=batting;
    }

    public List<Bowling> getBowling(){
        return bowling;
    }

    public void setBowling(List<Bowling>  bowling){
        this.bowling=bowling;
    }
    
    public BattingTotal getBattingTotal(){
        return battingTotal;
    }

    public void setBattingTotal(BattingTotal battingTotal){
        this.battingTotal=battingTotal;
    }

}
