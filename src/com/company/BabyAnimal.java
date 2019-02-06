package com.company;

public class BabyAnimal extends Animal {

    private boolean isCute;

    public BabyAnimal(String name, String species, String size, String gender, boolean isCute){
        super(name, species, size, gender);
        this.isCute = isCute;
    }


    @Override
    public void printDetails(){
        System.out.println("Name: " + getName() + " , Species: " + getSpecies() + " , Size: " + getSize() + " , Gender: " + getGender() + " , Are cute: " + isCute );
    }

    public boolean isCute() {
        return isCute;
    }

    public void setIsCute(boolean cute) {
        isCute = cute;
    }
}
