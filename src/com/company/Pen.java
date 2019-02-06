package com.company;

import java.util.ArrayList;

public class Pen {

    private ArrayList<Animal> grownUpAnimals;
    private ArrayList<Animal> babyAnimals;
    private String penName;

    public Pen(String penName){
        this.grownUpAnimals = new ArrayList<>();
        this.babyAnimals = new ArrayList<>();
        this.penName = penName;
    }

    public ArrayList<Animal> getGrownUpAnimals() {
        return grownUpAnimals;
    }

    public void setGrownUpAnimals(ArrayList<Animal> grownUpAnimals) {
        this.grownUpAnimals = grownUpAnimals;
    }

    public ArrayList<Animal> getBabyAnimals() {
        return babyAnimals;
    }

    public void setBabyAnimals(ArrayList<Animal> babyAnimals) {
        this.babyAnimals = babyAnimals;
    }

    public String getPenName() {
        return penName;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }
}
