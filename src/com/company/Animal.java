package com.company;

public class Animal {

    private String name;
    private String species;
    private String size;
    private String gender;


    public Animal(){}

    public Animal(String name, String species, String size, String gender){
        this.name = name;
        this.species = species;
        this.size = size;
        this.gender = gender;
    }

    public void printDetails(){
        System.out.println("Name: " + name + ", Species: " + species + " , Size: " + size + " , Gender: " + gender );
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
