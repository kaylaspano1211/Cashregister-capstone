package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * This class would be a GREAT place to read in a file and return a data structure matching the one in
 * your Inventory class. (You probably saw something similiar in some review code we did....)
 */
public class InventoryFileReader {

    // Hmmm.... looks like a great place to create some form or method called readFile....
    private String filename = "inventory.csv";

    public Map<String, Candy> readFile() {


        Map<String, Candy> candy = new TreeMap<>();

        File path = new File(filename);
        Scanner scanner = null;
        try {
            scanner = new Scanner(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(scanner.hasNextLine()) {

            String record = scanner.nextLine();

            String [] fields = record.split("|");

            if(fields[0].equals("CH")) {


            }
















        }


        return candy;
    }

}
