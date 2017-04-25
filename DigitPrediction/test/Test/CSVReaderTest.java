/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DigitPrediction.CSVReader;
import static GUI.Main.trainingDataCSV;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samkit5495
 */
public class CSVReaderTest {
    
    public static CSVReader trainingDataCSV=null;
    public static String trainingTableName="TrainTable";
    public static CSVReader testingDataCSV=null;
    public static String testingTableName ="TestTable";
    public String trainingCSV="train.csv";
    public String testingCSV="test.csv";
    public int noOfColumns=709;
            
    public CSVReaderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void test1(){
        try
        {
            trainingDataCSV = new CSVReader(trainingCSV, noOfColumns);
            assertEquals(noOfColumns, trainingDataCSV.getColumns().length);
        }
        catch(FileNotFoundException e){
            System.out.println("Invalid File Path: "+trainingCSV);
        }
        catch(IOException e){
            System.out.println("Invalid File Data: "+trainingCSV);
        }
            
    }
    
    @Test
    public void test2(){
        try
        {
            trainingDataCSV = new CSVReader(trainingCSV, noOfColumns);
            assertEquals(noOfColumns,trainingDataCSV.readnext().length);
        }
        catch(FileNotFoundException e){
            System.out.println("Invalid File Path: "+trainingCSV);
        }
        catch(IOException e){
            System.out.println("Invalid File Data: "+trainingCSV);
        }
        
    }
    
}
