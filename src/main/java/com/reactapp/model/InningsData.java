package com.reactapp.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class InningsData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Batting> batting;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Bowling> bowling;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private BattingTotal battingTotal;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Teams teams;


    public InningsData() {

    }

    public InningsData(int id, List<Batting> batting, List<Bowling> bowling, BattingTotal battingTotal) {
        super();
        this.id = id;
        this.batting = batting;
        this.bowling = bowling;
        this.battingTotal = battingTotal;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Batting> getBatting() {
        return batting;
    }

    public void setBatting(List<Batting> batting) {
        this.batting = batting;
    }

    public List<Bowling> getBowling() {
        return bowling;
    }

    public void setBowling(List<Bowling> bowling) {
        this.bowling = bowling;
    }

    public BattingTotal getBattingTotal() {
        return battingTotal;
    }

    public void setBattingTotal(BattingTotal battingTotal) {
        this.battingTotal = battingTotal;
    }

    public Teams getTeams(){
        return teams;
    }

    public void setTeams(Teams teams){
        this.teams=teams;
    }

}
