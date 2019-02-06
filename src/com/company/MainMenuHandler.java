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

       } else if(userInput.equals(removePen)){

       } else if(userInput.equals(addAnimalToPen)){

       } else if(userInput.equals(removeAnimalFromPen)){

       } else if(userInput.equals(displayAllAnimalsInPen)){

       } else if(userInput.equals(displayAllZooAnimals)){

       } else {
           System.out.println("Invalid option. Please choose a valid option from menu.");
       }


    }
}
