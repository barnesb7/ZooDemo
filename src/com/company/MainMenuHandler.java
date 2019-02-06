package com.company;

import java.util.Scanner;

public class MainMenuHandler {

    final String setUpNewPen = "1";
    final String removePen = "2";
    final String addAnimalToPen = "3";
    final String removeAnimalFromPen = "4";
    final String displayAllAnimalsInPen = "5";
    final String displayAllZooAnimals = "6";
    String userInput;

    public void handleUserInput(String userInput, Zoo ourZoo, Scanner scan){

       if(userInput.equals(setUpNewPen)){
           System.out.println("What should the new pen's name be?");
           userInput = scan.nextLine();
           Pen newPen = new Pen(userInput);
           ourZoo.addPen(newPen);
           System.out.println("The new pen, " + userInput + " has been added to the zoo.");

           ourZoo.showAllPens();

       } else if(userInput.equals(removePen)){
           System.out.println("What is the name of the pen you would like to remove?");
           userInput = scan.nextLine();
           ourZoo.removePenByName(userInput);

           ourZoo.showAllPens();
       } else if(userInput.equals(addAnimalToPen)){

           AnimalCreator animalCreator = new AnimalCreator();

           Animal animalToAdd = new Animal();
           String animalType = "";
           String penName;

           System.out.println("Would you like to add a [1] Adult Animal or [2] Baby Animal");
           userInput = scan.nextLine();

           if(userInput.equals("1")){
              animalToAdd = animalCreator.createAnimal("adult", scan);
              animalType = "adult";
           } else if (userInput.equals("2")){
             animalToAdd = animalCreator.createAnimal("baby", scan);
             animalType = "baby";
           } else {
               System.out.println("Sorry," + userInput +  " ,was not a valid option.");
           }

           System.out.println("What is the name of the pen you would like to add the animal to?");
           penName = scan.nextLine();

           ourZoo.addAnimalToPen(penName, animalType, animalToAdd);

       } else if(userInput.equals(removeAnimalFromPen)){

       } else if(userInput.equals(displayAllAnimalsInPen)){
           System.out.println("What is the name of the pen?");
           userInput = scan.nextLine();
           ourZoo.displayPenInfoByPenName(userInput);

       } else if(userInput.equals(displayAllZooAnimals)){

           ourZoo.displayAllAnimals();

       } else {
           System.out.println("Invalid option. Please choose a valid option from menu.");
       }


    }
}
