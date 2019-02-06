package com.company;

import java.util.Scanner;

public class MainMenuHandler {

    final String setUpNewPen = "1";
    final String removePen = "2";
    final String addAnimalToPen = "3";
    final String removeAnimalFromPen = "4";
    final String displayAllAnimalsInPen = "5";
    final String displayAllZooAnimals = "6";


    public void handleUserInput(String userInput, Scanner scan){

       if(userInput.equals(setUpNewPen)){

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
