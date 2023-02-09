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

    public TreeMap<String, Candy> readFile() {

        TreeMap<String, Candy> candy = new TreeMap<>();

        File path = new File(filename);
        Scanner scanner = null;
        try {
            scanner = new Scanner(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        while (scanner.hasNextLine()) {

            String record = scanner.nextLine();

            String[] fields = record.split("\\|");

            if (fields[0].equals("CH")) {
                    Chocolate candies = new Chocolate(fields[1], fields[2], Double.parseDouble(fields[3]), Boolean.parseBoolean(fields[4]));
                    candy.put(fields[1], candies);
                } else if (fields[0].equals("SR")) {
                    if (fields[4].equals("T") || fields[4].equals("F")) {
                        Sour candies = new Sour(fields[1], fields[2], Double.parseDouble(fields[3]), Boolean.parseBoolean(fields[4]));
                        candy.put(fields[1], candies);
                    }


                }

            } return candy;
        }
    }

