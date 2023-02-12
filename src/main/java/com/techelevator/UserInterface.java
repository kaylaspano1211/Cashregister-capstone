package com.techelevator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

/**
 * This class is responsible for ALL user input and output.
 */
public class UserInterface {

    //Probably a great place for a scanner and some methods to prompt user for info and return response back to ApplicationCLI
    private Scanner scanner = new Scanner(System.in);
    private LogFileWriter writer = new LogFileWriter();
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa ");
    Date date = new Date();

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
        System.out.println("\n*****INVENTORY*****\n");

        System.out.println(String.format("%1$-10s %2$-20s %3$-10s %4$-10s %5$-10s", "ID", "Name", "Wrapper", "QTY", "Price"));

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
        }
        else {
            return String.valueOf(candy.getQty());
        }
    }

    public String isSaleSuccessful(Candy candy, int qty, double balance){
        writer.logTransactions(dateFormat.format(date) + qty + " " + candy.getName() + " " + candy.getId() + " $" + String.format("%1.2f",candy.getPrice()*qty) + " $" + String.format("%1.2f",balance - candy.getPrice()*qty));
        if(qty > candy.getQty()){
            return "Insufficient Stock\n";
        }
        else if(balance < candy.getPrice()*qty) {
            return "Insufficient Funds\n";
        } else {
            return "Item added to Customers cart\n";
        }
    }



    public void MoneyAdded(CashBox cashBox) {
        String moneyAddedChoice = scanner.nextLine();
        int value = Integer.parseInt(moneyAddedChoice);

        cashBox.addMoney(value);
        writer.logTransactions(dateFormat.format(date) + "MONEY RECEIVED: " + "$" + String.format("%1.2f",(double)(value)) + " $" + String.format("%1.2f", cashBox.getBalance()));
    }


    public int PrintSubMenu(CashBox cashBox) {

        System.out.println("1. Take Money");
        System.out.println("2. Select Products");
        System.out.println("3. Complete Sale");

        System.out.println("Current Customer Balance: $" + String.format("%.2f", cashBox.getBalance()));

        String subMenuChoice = scanner.nextLine();

        return Integer.parseInt(subMenuChoice);
    }

    public String askUserForCandyId (){

        System.out.println("Please enter a valid candy Id\n");
        return scanner.nextLine();
    }

    public String askUserForQty(){
        System.out.println("Please enter in how many?\n");
        return scanner.nextLine();
    }


    private String productTypesDisplayed(Candy candy) {

        return candy.getDescription();
    }



    public void printReceipt(CashBox cashBox, List<Candy> candy) {
        double totalPrice = 0.0;
        for (Candy shoppingCartCandy : candy){
            receiptCandy(shoppingCartCandy);
            totalPrice = totalPrice + shoppingCartCandy.getQty()*shoppingCartCandy.getPrice();
        }
        printMessage("\nTotal: $" + String.format("%.2f", totalPrice));

        double balance = cashBox.getBalance();
        int numberOfTwenties = 0;
        int numberOfTens = 0;
        int numberOfFives = 0;
        int numberOfOnes = 0;
        int numberOfQuarters = 0;
        int numberOfDimes = 0;
        int numberOfNickles = 0;


        numberOfTwenties = (int)balance / 20;
        balance = balance % 20;


        numberOfTens = (int)balance / 10;
        balance = balance % 10;

        numberOfFives = (int)balance / 5;
        balance = balance % 5;


        numberOfOnes = (int)balance / 1;
        balance = balance % 1.00;


        numberOfQuarters = (int)(balance / .25);
        balance = balance % .25;


        numberOfDimes = (int)(balance / .10);
        balance = balance % .10;


        numberOfNickles = (int)(balance / .05);
        balance = balance % .05;

        printMessage("\nChange: $" + String.format("%.2f", cashBox.getBalance()));
        printMessage("(" + numberOfTwenties + ") Twenties, " + "(" + numberOfTens + ") Tens, " + "(" + numberOfFives + ") Fives, " + "(" + numberOfOnes + ") Ones, " + "(" + numberOfQuarters + ") Quarters, " + "(" + numberOfDimes + ") Dimes, " + "(" + numberOfNickles + ") nickels\n\n");


        writer.logTransactions(dateFormat.format(date) + "CHANGE GIVEN: " + "$" + String.format("%1.2f",cashBox.getBalance()) + " $" + String.format("%1.2f",setBalance()));
    }

    public void receiptCandy(Candy candy) {
        System.out.println(String.format("%1$-5s %2$-20s %3$-30s $%4$1.2f $%5$1.2f", candy.getQty(), candy.getName(), productTypesDisplayed(candy), candy.getPrice(), candy.getPrice()*candy.getQty()));

    }

    private double setBalance(){
        return 0.00;
    }





}








