/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DigitPrediction;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.util.Bytes;
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
public class HBaseTest {
    
    public HBaseTest() {
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

    /**
     * Test of checkTableExists method, of class HBase.
     */
    @Test
    public void testCheckTableExists() {
        System.out.println("checkTableExists");
        String tableName = "Test";
        HBase instance = new HBase();
        boolean expResult = true;
        boolean result = instance.checkTableExists(tableName);
        assertEquals(expResult, result);
    }

    /**
     * Test of createTable method, of class HBase.
     */
    @Test
    public void testCreateTable() {
        System.out.println("createTable");
        String tableName = "Test";
        String columnDescriptors = "cf";
        HBase instance = new HBase();
        String expResult = "Test";
        String result = Bytes.toString(instance.createTable(tableName, columnDescriptors).getTableName());
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteTable method, of class HBase.
     */
    @Test
    public void testDeleteTable() {
        System.out.println("deleteTable");
        String tableName = "Test";
        HBase instance = new HBase();
        instance.deleteTable(tableName);
        assertEquals(instance.checkTableExists(tableName), false);
    }
    
}
