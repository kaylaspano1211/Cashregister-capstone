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
				userInterface.printMessage("Invalid Choice!");
				continue;
			}

			if (choice == SHOW_INVENTORY){

				List<Candy> candyList = candyInventory.retrieveCandyList();
				userInterface.printCandy(candyList);

			}





		}


	}

	//feel free to create private methods here if you are feeling up to it, so run() doesn't get so long...


}
