/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DigitPrediction;

import RandomForestClassifier.RandomForest;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.hadoop.hbase.client.HTable;

/**
 *
 * @author samkit5495
 */
public class Project {
    
    public static HBase hbase=new HBase();
    public static void load(CSVReader csvReader,String tableName,String columnFamily,int noOfColumns)
    {
        if(!hbase.checkTableExists(tableName))
        {
            HTable table=hbase.createTable(tableName, columnFamily);
            String record[]=csvReader.readnext();
            int recID=1;
            while(!record[0].equals("-2"))//end of file
            {
                if(record!=null&&!record[0].equals("-1"))//invalid row
                {
                    hbase.put(table, columnFamily, csvReader.getColumns(), recID++, record);
                }
                record=csvReader.readnext();
            }
            System.out.println("Table Loaded Soccessfully");
        }
        else
        {
            System.out.println("Table Already Present");
        }
    }
    public static ArrayList display(CSVReader csvReader,String tableName,String columnFamily,DefaultTableModel tbl)
    {
        if(hbase.checkTableExists(tableName))
        {         
            return hbase.getAll(tableName, columnFamily,csvReader.getColumns(),tbl);
        }
        return null;
    }
    
    public static RandomForest train(int numTrees,ArrayList<int[]> Input, ArrayList<int[]> Test,OutputStream out)
    {
        int categ=9;
        RandomForest RaF =new RandomForest(numTrees, Input, Test,out);
        RaF.C=categ;
        RaF.M=Input.get(0).length-1;
        RaF.Ms=(int)Math.round(Math.log(RaF.M)/Math.log(2)+1);
        RaF.Start();
        return RaF;
    }
    public static void deleteTable(String tableName)
    {
        hbase.deleteTable(tableName);
    }
}
