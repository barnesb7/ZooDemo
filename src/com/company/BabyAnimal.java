package com.company;

public class BabyAnimal extends Animal {

    private boolean isCute;

    public BabyAnimal(String species, String size, String gender, boolean isCute){
        super(species, size, gender);
        this.isCute = isCute;
    }


    @Override
    public void printDetails(){
        System.out.println("Species: " + getSpecies() + " , Size: " + getSize() + " , Gender: " + getGender() + " , Are cute: " + isCute );
    }

    public boolean isCute() {
        return isCute;
    }

    public void setIsCute(boolean cute) {
        isCute = cute;
    }
}
