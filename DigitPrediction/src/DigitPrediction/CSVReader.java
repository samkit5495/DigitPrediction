/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DigitPrediction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author samkit5495
 */
public class CSVReader {
    private String fileName;
    private int noOfColumns;
    private String[] columns;
    private String delimiter = ",";
    private BufferedReader bf;
    
    public CSVReader(String fileName, int noOfColumns) throws FileNotFoundException,IOException {
        this.fileName = fileName;
        this.noOfColumns = noOfColumns;
        startReading();
    }

    public CSVReader(String fileName, int noOfColumns, String delimiter ) throws FileNotFoundException,IOException {
        this.fileName = fileName;
        this.noOfColumns = noOfColumns;
        this.delimiter = delimiter;
        startReading();
    }
    
    private void startReading() throws FileNotFoundException,IOException
    {
        bf = new BufferedReader(new FileReader(fileName));
        System.out.println("Reading data from "+fileName);
        columns = bf.readLine().split(delimiter);
        System.out.println();
    }

    public String[] getColumns() {
        return columns;
    }

    
    public String[] readnext(){
        try{

            String line = "";

            if ((line = bf.readLine()) != null)
            {
                String[] record = line.split(delimiter);

                if(record.length==noOfColumns)
                {
                    for (int i = 0; i < noOfColumns; i++) 
                    {
                        System.out.print(" " + record[i].toUpperCase().replaceAll("\"", "") + " ");
                    }
                    System.out.print("\n");
                    return record;
                }
                else
                {
                    return new String[]{"-1"};
                }
            }
            return new String[]{"-2"};//end of file
        } 
        catch(IOException e){
            return null;
        }
    }
    
}
