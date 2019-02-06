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


    public void removeBabyAnimalByName(String nameOfAnimal){
        for(int i = 0; i < babyAnimals.size(); i++){
            if(babyAnimals.get(i).getName().equals(nameOfAnimal)){
                babyAnimals.remove(i);
                System.out.println("The baby animal has been removed");
            }
        }
    }


    public void removeAdultAnimalByName(String nameOfAnimal){
        for(int i = 0; i < grownUpAnimals.size(); i++){
            if(grownUpAnimals.get(i).getName().equals(nameOfAnimal)){
                grownUpAnimals.remove(i);
                System.out.println("The adult animal has been removed");
            }
        }
    }

    public void addAdultAnimal(Animal animalToAdd){
        grownUpAnimals.add(animalToAdd);
        System.out.println("Your adult animal has been added to the pen: " + penName);
    }

    public void addBabyAnimal(Animal animalToAdd){
        babyAnimals.add(animalToAdd);
        System.out.println("Your baby animal has been added to the pen: " + penName);

    }

    public void displayPenDetails(){
        System.out.println("Pen name: " + penName);

        for(int i = 0; i < grownUpAnimals.size(); i++){
            grownUpAnimals.get(i).printDetails();
        }

        for(int i = 0; i < babyAnimals.size(); i++){
            babyAnimals.get(i).printDetails();
        }

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
