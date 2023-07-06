package com.reactapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BattingTotal {
    private int runs;

    private int balls;

    private int wkts;

    private int extras;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public BattingTotal(){

    }

    public BattingTotal(int id,int runs, int balls, int wkts, int extras){
        super();
        this.id=id;
        this.runs=runs;
        this.wkts=wkts;
        this.balls=balls;
        this.extras=extras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int balls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int wkts() {
        return wkts;
    }

    public void setwkts(int wkts) {
        this.wkts = wkts;
    }

}
