/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DigitPrediction;

import java.awt.HeadlessException;
import java.io.IOException; 
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;

/**
 *
 * @author samkit5495
 */
public class HBase {
    
    // Instantiating configuration class
    private Configuration hconfig = HBaseConfiguration.create();

    // Instantiating HbaseAdmin class
    private HBaseAdmin hbase_admin = null;
    
    public HBase()
    {
        System.out.println("Connecting...");
        try
        {
            hbase_admin=new HBaseAdmin(hconfig);
        }
        catch(Exception e){
            
        }
    }    
    
    public boolean checkTableExists(String tableName)
    {
        try{
            return hbase_admin.isTableAvailable(tableName);
        }
        catch(IOException e){
            return false;
        }
    }
    
    public HTable createTable(String tableName,String columnDescriptors)
    {
        try
        {
            HTableDescriptor htable = new HTableDescriptor(TableName.valueOf(tableName));
            System.out.println("Table: " + htable.getNameAsString() + " not found " + "now creating..");
            htable.addFamily(new HColumnDescriptor(columnDescriptors));
            System.out.println("Connecting...");
            System.out.println("Creating Table...");
            hbase_admin.createTable(htable);
            System.out.println(tableName+" created successfully!!!");
            Configuration config = HBaseConfiguration.create();
            return new HTable(config, tableName);
        }
        catch(IOException e){
            return null;
        }
    }
    
    public void put(HTable table,String columnFamily, String columns[], int recID, String record[])
    {
        try
        {              
            for(String s:record)
                if(s==null||s.equals(""))
                    return;
            Put p = new Put(Bytes.toBytes(Long.toString(recID)));
            
            for(int i=0;i<columns.length;i++)
                p.add(Bytes.toBytes(columnFamily), Bytes.toBytes(columns[i]), Bytes.toBytes(record[i].toUpperCase().replaceAll("\"", "")));
            table.put(p);
        }
        catch(IOException e){
            
        }
    }
    
    public ArrayList<int[]> getAll(String tableName,String columnFamily, String columns[],DefaultTableModel tbl)
    {
        try
        {
            HBaseConfiguration config = new HBaseConfiguration(new Configuration());
            HTable table=new HTable(config, tableName);
            
            ArrayList<int[]> data=new ArrayList<>();
            int row[]=new int[columns.length];
            int recID=1;
            Scan scan = new Scan();
            scan.setCaching(50);

            scan.addFamily(Bytes.toBytes(columnFamily));
            ResultScanner resScan = table.getScanner(scan);

            for (Result res = resScan.next(); (res != null); res = resScan.next()) 
            {

                for(int i=0;i<columns.length;i++)
                {
                    row[i] = Integer.parseInt(Bytes.toString(res.getValue(Bytes.toBytes(columnFamily), Bytes.toBytes(columns[i]))));
                }
                if(tbl!=null)
                {
                    Integer tblRow[]=new Integer[tbl.getColumnCount()];
                    tblRow[0]=recID++;
                    int i;
                    for(i=1;i<tbl.getColumnCount()-1;i++)
                    {
                        tblRow[i]=row[i-1];
                    }
                    tblRow[i]=row[columns.length-1];
                    tbl.addRow(tblRow);
                }
                data.add(row);
            }
            return data;
        }
        catch(IOException e)
        {
            System.err.println("error");
        }
        return null;
    }
    
    public void deleteTable(String tableName)
    {
        try 
        {
            HBaseConfiguration hconfig = new HBaseConfiguration(new Configuration());
            HTableDescriptor htable = new HTableDescriptor(tableName);
            System.out.println("Connecting...");
            HBaseAdmin hbase_admin = new HBaseAdmin(hconfig);
            System.out.println("Dropping Table...");

            if (hbase_admin.isTableAvailable(htable.getName())) 
            {
                System.out.println("table " + htable.getNameAsString() + " found " + "now deleting..");
                hbase_admin.disableTable(htable.getName());
                hbase_admin.deleteTable(htable.getName());
                System.out.println("Deleted!");
            }
            else 
            {
                System.out.println("table " + htable.getNameAsString() + "not found");
            }
        }
        catch (IOException | HeadlessException e) 
        {

        }
    }
    
}
