package com.techelevator;

import java.util.List;
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

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printCandy(List<Candy> foundCandy){
        System.out.println("*****INVENTORY*****");

        System.out.println("ID" + "\t\tName" + "\tWrapper " + "\tQTY " + "\tPrice");

        for(Candy candy : foundCandy){
            printCandy(candy);
        }
    }
    public void printCandy (Candy candy) {
        System.out.println(candy.toString());
    }

    public int MoneyAdded(CashBox cashBox){
        return 0;
    }

    public int PrintSubMenu(CashBox cashBox){

        System.out.println("1. Take Money");
        System.out.println("2. Select Products");
        System.out.println("3. Complete Sale");
        String subMenuChoice = scanner.nextLine();
        System.out.println("Current Customer Balance: " + cashBox.getBalance());


      return Integer.parseInt(subMenuChoice);
    }
    }








