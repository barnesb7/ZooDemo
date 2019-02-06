package com.company;

import java.util.Scanner;

public class ZooDemo {

    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
     UserMenu userMenu = new UserMenu();
    String userInput;

     userMenu.showMainMenu();
     userInput = scan.nextLine();

     mainMenuHandler.handleUserInput(userInput, scan);

    }
}
