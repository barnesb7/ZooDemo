package com.company;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Pen> allZooPens = new ArrayList<>();


    public void displayAllAnimals(){
        for(Pen pen: allZooPens){
            pen.displayPenDetails();
        }
    }

    public void displayPenInfoByPenName(String userInputPenName){
        for(Pen pen: allZooPens){
            if(pen.getPenName().equals(userInputPenName)){
                pen.displayPenDetails();
            }
        }
    }


    public void addPen(Pen newPen){
        allZooPens.add(newPen);
    }


    public void removePenByName(String penName){
        for(int i = 0; i < allZooPens.size(); i++){
            if(allZooPens.get(i).getPenName().equals(penName)){
                allZooPens.remove(i);
            }

            if(i == allZooPens.size() - 1){
                System.out.println("A pen with the name " + penName + " could not be found." );
            }
        }
    }


    public void addAnimalToPen(String penName, String animalType, Animal animalToAdd){

        for(int i = 0; i < allZooPens.size(); i++){
            if(allZooPens.get(i).getPenName().equals(penName)){

                if(animalType.equals("adult")){
                    allZooPens.get(i).addAdultAnimal(animalToAdd);

                } else if(animalType.equals("baby")){
                    allZooPens.get(i).addBabyAnimal(animalToAdd);
                }

            }

        }
    }

    public void removeAnimalFromPenByName(String penName, String babyOrAdult, String nameOfAnimalToRemove){
            for(int i = 0; i < allZooPens.size(); i++){
                if(allZooPens.get(i).getPenName().equals(penName)){
                    if(babyOrAdult.equals("baby")){

                        allZooPens.get(i).removeBabyAnimalByName(nameOfAnimalToRemove);

                    } else if (babyOrAdult.equals("adult")){

                        allZooPens.get(i).removeAdultAnimalByName(nameOfAnimalToRemove);
                    }

                }
            }

    }


    public void showAllPens(){
        System.out.println(allZooPens);
    }

}
