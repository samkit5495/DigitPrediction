/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samkit5495
 */
import DigitPrediction.CSVReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author samkit5495
 */
public class Main {

    public static Scanner sc=new Scanner(System.in);
    
    public static CSVReader trainingDataCSV=null;
    public static String trainingTableName="TrainTable";
    public static CSVReader testingDataCSV=null;
    public static String testingTableName ="TestTable";
    public static void main(String args[])
    {
//        System.out.println("Enter CSV File Path:");
//        String fileName=sc.next();
//        System.out.println("Enter No of Columns in CSV File:");
//        int noOfColumns=sc.nextInt();
//        System.out.println("Enter Table Name:");
//        String tableName=sc.next();
//        System.out.println("Enter Column Family Name:");
//        String columnFamily=sc.next();
        try
        {
            DigitPrediction.Project.deleteTable(trainingTableName);
            DigitPrediction.Project.deleteTable(testingTableName);
   
            String trainingCSV="train.csv";
            trainingTableName="TrainTable";
            int noOfColumns=709;
            try
            {
                trainingDataCSV = new CSVReader(trainingCSV, noOfColumns);
            }
            catch(FileNotFoundException e){
                System.out.println("Invalid File Path: "+trainingCSV);
            }
            catch(IOException e){
                System.out.println("Invalid File Data: "+trainingCSV);
            }
            DigitPrediction.Project.load(trainingDataCSV,trainingTableName,"cf", noOfColumns);
            
            ArrayList<int[]> trainData=DigitPrediction.Project.display(trainingDataCSV,trainingTableName,"cf",null);
            
            String testingCSV="test.csv";
            testingTableName ="TestTable";
            try
            {
                testingDataCSV = new CSVReader(testingCSV, noOfColumns);
            }
            catch(FileNotFoundException e){
                System.out.println("Invalid File Path: "+testingCSV);
            }
            catch(IOException e){
                System.out.println("Invalid File Data: "+testingCSV);
            }
            DigitPrediction.Project.load(testingDataCSV,testingTableName,"cf", noOfColumns);
            
            ArrayList<int[]> testData=DigitPrediction.Project.display(testingDataCSV,testingTableName,"cf",null);
            
            DigitPrediction.Project.train(100,trainData,testData,System.out);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
//            DigitPrediction.Project.deleteTable(trainingTableName);
//            DigitPrediction.Project.deleteTable(testingTableName);
        }
    }
}
