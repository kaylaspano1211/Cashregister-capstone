package com.techelevator;

import java.util.List;
import java.util.Scanner;

/**
 * This class is responsible for ALL user input and output.
 */
public class UserInterface {

    //Probably a great place for a scanner and some methods to prompt user for info and return response back to ApplicationCLI
    private Scanner scanner = new Scanner(System.in);

    public int PrintMenu() {

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

    public void printCandy(List<Candy> foundCandy) {
        System.out.println("*****INVENTORY*****");

        System.out.println("ID" + "\t\tName" + "\tWrapper " + "\tQTY " + "\tPrice");

        for (Candy candy : foundCandy) {
            printCandy(candy);
        }
    }

    public void printCandy(Candy candy) {
        System.out.println(String.format("%1$-10s %2$-20s %3$-10s %4$-10s $%5$1.2f", candy.getId(), candy.getName(), convert_boolean_to_string(candy), availabilityOfItems(candy), candy.getPrice()));
    }

    private String convert_boolean_to_string(Candy candy) {
        String wrappers;
        if(candy.isWrapped()){
            wrappers = "Y";
        } else {
            wrappers = "N";
        }
        return wrappers;
    }

    private String availabilityOfItems(Candy candy){

        if (candy.getQty() == 0) {
           return "SOLD OUT";
        } else {
            return String.valueOf(candy.getQty());
        }

    }





    public int MoneyAdded(CashBox cashBox) {

        String moneyAddedChoice = scanner.nextLine();
        int value = Integer.parseInt(moneyAddedChoice);


        return cashBox.addMoney(value);


    }

    public int PrintSubMenu(CashBox cashBox) {

        System.out.println("1. Take Money");
        System.out.println("2. Select Products");
        System.out.println("3. Complete Sale");

        System.out.println("Current Customer Balance: " + cashBox.getBalance());

        String subMenuChoice = scanner.nextLine();

        return Integer.parseInt(subMenuChoice);
    }

    public String askUserForCandyId (){

        System.out.println("Please enter a valid candy Id");
        return scanner.nextLine();

    }
}








