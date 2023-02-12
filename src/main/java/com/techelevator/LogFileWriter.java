package com.techelevator;

import java.io.*;

/**
 * This would be a GREAT place to have a public method that could take a formatted String and log it out to a file.
 */
public class LogFileWriter {



    public void logTransactions(String logStatement){

        try {
            File file = new File("src/main/resources/Log.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(logStatement);
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
