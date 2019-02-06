package com.company;

import java.util.Scanner;

public class AnimalRemover {

private String penName;
private String animalToRemoveName;
private String babyOrAdult;

    public void removeAnimal(Zoo ourZoo, Scanner scan){

        System.out.println("What is the pen name this animal is in?");
        penName = scan.nextLine();

        System.out.println("What is the name of the animal?");
        animalToRemoveName = scan.nextLine();

        System.out.println("Is this animal a [baby] or an [adult]");
        babyOrAdult = scan.nextLine();

        ourZoo.removeAnimalFromPenByName(penName, babyOrAdult, animalToRemoveName);
    }
}
