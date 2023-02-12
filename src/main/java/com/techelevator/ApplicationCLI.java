package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ApplicationCLI {

	private final int SHOW_INVENTORY = 1;
	private final int MAKE_SALE = 2;
	private final int QUIT = 3;
	final int TAKE_MONEY = 1;
	final int SELECT_PRODUCTS = 2;
	final int COMPLETE_SALE = 3;



	// probably should leave this method alone... and go do stuff in the run method....
	public static void main(String[] args) {
		ApplicationCLI cli = new ApplicationCLI();
		cli.run();
	}

	/**
	 * This is the main method that controls the flow of the program.. Probably could look at the review code for ideas of what to put here...
	 */
	public void run() {

		Inventory candyInventory = new Inventory();
		UserInterface userInterface = new UserInterface();
		CashBox cashBox = new CashBox();
		ShoppingCart shoppingCart = new ShoppingCart();


		// Good place to create references for UserInterface, Inventory class, and Register class.... (There should NEVER be more than one instance of these)


		//probably a great place to create a loop that manages the main menu and delegates all work to the other classes....
		// Hint: for the submenu, maybe a loop inside this main loop? If you break out of the sub-loop(sub-menu), you would reach the
		//outer loop....

		while(true){

			int choice;

			try {
				choice = userInterface.PrintMenu();
			}
			catch (Exception e) {
				//printing message to alert the user they made an invalid choice
				userInterface.printMessage("**** Invalid Choice! ****");
				continue;
			}

			if (choice == SHOW_INVENTORY){


				List<Candy> candyList = candyInventory.retrieveCandyList();


				userInterface.printCandy(candyList);


			}

			if (choice == MAKE_SALE) {

				while (true) {
					int subMenuChoice;

					try {
						subMenuChoice = userInterface.PrintSubMenu(cashBox); // method that prints subMenu
					} catch (Exception e) {
						userInterface.printMessage("**** Invalid Choice! ****");
						continue;
					}
					if (subMenuChoice == TAKE_MONEY) {

						// ask user for amount of Money
						userInterface.printMessage("Please Enter Amount: ");

						try {
							// taking that moneyAdded and adding it to our CashBox, catching any num formatting exceptions.
							userInterface.MoneyAdded(cashBox);
						} catch (NumberFormatException e) {
							userInterface.printMessage("**** Invalid amount entered, please select another choice and try again ****");
							continue;
						}
					}

					if (subMenuChoice == SELECT_PRODUCTS) {
						//fetching our candy list
						List<Candy> candyList = candyInventory.retrieveCandyList();
						userInterface.printCandy(candyList);

						//calling the UI class to ask for candyId
						String candyId = userInterface.askUserForCandyId();
						//calling the UI class to ask user for qty
						String candyQty = userInterface.askUserForQty();

						Candy foundCandy = null;
						String userInputCheck = null;

						try {
							//taking the Id the user input and going to the candyInventory to retrieve the specific id
							foundCandy = candyInventory.retrieveCandyId(candyId);
							//We are calling the UI to ask if the sale proves successful, then assign that to the UserInputCheck variable we created
							userInputCheck = userInterface.isSaleSuccessful(foundCandy, Integer.parseInt(candyQty), cashBox.getBalance());
							//calling the UI to access the PrintMessage method, which takes in our values for UserInputCheck
							userInterface.printMessage(userInputCheck);
							//getting the current balance from Cashbox and assigning it to a local variable, balance.
							double balance = cashBox.getBalance();
							//updating balance in Cashbox by passing through the updateBalance method - Which subtracts price*qty from current balance. .
							cashBox.updatedBalance(foundCandy, Integer.parseInt(candyQty));
							//updating the inventory list
							candyInventory.updatedCandyInventory(foundCandy, Integer.parseInt(candyQty), balance);
							//adding candy and qty to the shopping cart by calling the shopping cart class, add to cart method.
							shoppingCart.addToCart(foundCandy, Integer.parseInt(candyQty));


						} catch (CandyNotFoundException e) {
							userInterface.printMessage("**** Candy " + e.getCandyId() + " does not exist. Please try again. ****");
							continue;
						}


					}
					if (subMenuChoice == COMPLETE_SALE) {

						//fetching our list in the shopping cart class.
						List<Candy> boughtCandy = shoppingCart.getCandyToBuy();


						userInterface.printReceipt(cashBox, boughtCandy);

						cashBox.setBalance(0.0);
						break;
					}


				}

			}
			if (choice == QUIT) {
				return;

			}


		}


	}

	//feel free to create private methods here if you are feeling up to it, so run() doesn't get so long...


}
