package com.company;

import java.util.Scanner;

public class AnimalCreator {

    private String species;
    private String size;
    private String gender;
    boolean isCute;

    public Animal createAnimal(String animalType, Scanner scan){

        System.out.println("What is the species of your animal");
        species = scan.nextLine();


        System.out.println("What is the size of your animal? [big], [medium], [small]");
        size = scan.nextLine();


        System.out.println("What is the gender of your animal? [male] [female] [neither]");
        gender = scan.nextLine();

        if (animalType.equals("baby")){
            System.out.println("Is this baby cute? [true] [false]");
            String stringInput = scan.nextLine();

            if(stringInput.equals("true")){
                isCute = true;
            } else {
                isCute = false;
            }

            System.out.println("Your new baby animal has been created.");
            return new BabyAnimal(species, size, gender, isCute);


        } else {
            System.out.println("Your new animal has been created");
            return new Animal(species, size, gender);
        }


    }
}
