package com.techelevator;

import java.util.Scanner;

/**
 * This class is responsible for ALL user input and output.
 */
public class UserInterface {

    //Probably a great place for a scanner and some methods to prompt user for info and return response back to ApplicationCLI
    private Scanner scanner = new Scanner(System.in);

    public int PrintMenu(){

        System.out.println("\n*****SILVER SHAMROCK CANDY COMPANY******\n");


        System.out.println("1. Show Inventory");
        System.out.println("2. Make Sale");
        System.out.println("3. Quit");

        System.out.println("Please make a selection: \n\n");
        String choice = scanner.nextLine();

        return Integer.parseInt(choice);
    }

}
