package com.reactapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Batting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean showPlus;

    private int extras;

    private String name;

    private int runs;

    private int balls;

    private int wkts;

    public Batting() {
        // Default constructor
    }

    public Batting(int id,int runs, int balls, int wkts, int extras, boolean showPlus, String name) {
        super();
        this.id=id;
        this.runs = runs;
        this.balls = balls;
        this.wkts = wkts;
        this.extras = extras;
        this.showPlus = showPlus;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getWkts() {
        return wkts;
    }

    public void setWkts(int wkts) {
        this.wkts = wkts;
    }

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }

    public boolean getShowPlus() {
        return showPlus;
    }

    public void setShowPlus(boolean showPlus) {
        this.showPlus = showPlus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
