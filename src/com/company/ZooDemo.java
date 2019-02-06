package com.company;

import java.util.Scanner;

public class ZooDemo {

    public static void main(String[] args) {

     Zoo ourZoo = new Zoo();
     MainMenuHandler mainMenuHandler = new MainMenuHandler();
     Scanner scan = new Scanner(System.in);
     UserMenu userMenu = new UserMenu();
    String userInput;
    boolean shouldContinue = true;


    do {
        userMenu.showMainMenu();
        userInput = scan.nextLine();

        mainMenuHandler.handleUserInput(userInput, ourZoo, scan);
    } while(shouldContinue);

    }
}
