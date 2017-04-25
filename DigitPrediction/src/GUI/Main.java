/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DigitPrediction.CSVReader;
import RandomForestClassifier.RandomForest;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author samkit5495
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public static CSVReader trainingDataCSV=null;
    public static CSVReader testingDataCSV=null;
    public ArrayList<int[]> trainData=null;
    public ArrayList<int[]> testData=null;
    public RandomForest Raf=null;
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnLoadTrainingData = new javax.swing.JButton();
        txtTrainingDataCSVPath = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTestingDataCSVPath = new javax.swing.JTextField();
        btnLoadTestingData = new javax.swing.JButton();
        btnShowTrainingData = new javax.swing.JButton();
        btnShowTestingData = new javax.swing.JButton();
        btnClearDatabase = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOutput = new javax.swing.JTable();
        btnClassify = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editorData = new javax.swing.JEditorPane();
        btnPredict = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTrainingTableName = new javax.swing.JTextField();
        txtTestingTableName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNoOfColumns = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtColumnFamilyName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLoadTrainingData.setText("Load Data");
        btnLoadTrainingData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadTrainingDataActionPerformed(evt);
            }
        });

        txtTrainingDataCSVPath.setText("train.csv");

        jLabel2.setText("Testing CSV File Path");

        jLabel3.setText("Training CSV File Path");

        txtTestingDataCSVPath.setText("test.csv");

        btnLoadTestingData.setText("Load Data");
        btnLoadTestingData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadTestingDataActionPerformed(evt);
            }
        });

        btnShowTrainingData.setText("Show Data");
        btnShowTrainingData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTrainingDataActionPerformed(evt);
            }
        });

        btnShowTestingData.setText("Show Data");
        btnShowTestingData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTestingDataActionPerformed(evt);
            }
        });

        btnClearDatabase.setText("Clear Database");
        btnClearDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearDatabaseActionPerformed(evt);
            }
        });

        tblOutput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8", "P9", "P10", "Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOutput);

        btnClassify.setText("Classify");
        btnClassify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTrainingDataCSVPath, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLoadTrainingData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnShowTrainingData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClassify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTestingDataCSVPath, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLoadTestingData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnShowTestingData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClearDatabase)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrainingDataCSVPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoadTrainingData)
                    .addComponent(jLabel3)
                    .addComponent(btnShowTrainingData)
                    .addComponent(btnClassify))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTestingDataCSVPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoadTestingData)
                    .addComponent(btnShowTestingData)
                    .addComponent(btnClearDatabase))
                .addGap(28, 28, 28)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Basic Operations", jPanel1);

        editorData.setText("0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,63,255,119,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,53,175,253,180,63,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,32,191,252,253,252,215,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,63,237,252,252,253,252,215,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,63,171,252,252,189,191,252,153,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11,175,253,252,241,77,15,222,227,93,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,53,191,252,253,210,71,0,63,237,231,46,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,155,252,252,253,210,31,0,63,237,252,108,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,110,253,253,253,145,0,0,84,255,253,232,47,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11,73,233,252,241,179,20,0,0,42,253,252,200,77,0,0,0,0,0,0,0,0,0,0,0,0,0,0,37,252,253,252,215,0,0,0,0,125,253,252,92,0,0,0,0,0,0,0,0,0,0,0,0,0,0,120,252,253,252,215,0,0,0,0,0,253,252,215,0,0,0,0,0,0,0,63,0,0,0,0,156,253,253,255,253,72,0,0,0,37,253,255,98,0,0,0,0,0,0,0,0,0,20,0,0,1,73,207,252,252,222,138,10,0,0,21,181,252,222,128,0,0,0,0,0,0,0,0,0,0,0,0,1,252,252,252,252,144,0,0,0,0,31,211,252,207,20,0,0,0,0,0,0,0,0,0,0,0,0,0,84,252,252,252,168,62,0,0,0,63,175,252,168,62,0,0,0,0,0,0,0,0,0,0,0,0,0,145,253,253,253,108,0,0,16,109,171,253,253,191,0,0,0,0,0,0,0,0,0,0,0,0,0,21,206,252,252,252,232,218,217,222,252,253,252,179,15,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,144,252,252,252,252,253,252,252,252,217,215,61,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,62,169,252,252,252,253,252,148,108,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0");
        jScrollPane1.setViewportView(editorData);

        btnPredict.setText("Predict");
        btnPredict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPredictActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Pixel values in CSV (Comma Seperated Format):");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(311, 311, 311)
                                .addComponent(btnPredict))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)))
                        .addGap(0, 343, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnPredict)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Prediction", jPanel2);

        jLabel4.setText("Training Table Name");

        txtTrainingTableName.setText("TrainTable");

        txtTestingTableName.setText("TestTable");

        jLabel5.setText("Testing Table Name");

        jLabel6.setText("No of Columns in CSV");

        txtNoOfColumns.setText("709");

        jLabel7.setText("Column Family Name");

        txtColumnFamilyName.setText("cf");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtColumnFamilyName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTestingTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTrainingTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNoOfColumns, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNoOfColumns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTrainingTableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTestingTableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtColumnFamilyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(343, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Settings", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void clearTable() {
        DefaultTableModel tbl=(DefaultTableModel) tblOutput.getModel();
        int rowCount = tbl.getRowCount();
        for (int n = 0; n < rowCount; n++) {
            tbl.removeRow(0);
        }
    }
    private void btnLoadTrainingDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadTrainingDataActionPerformed
        // TODO add your handling code here:
        jProgressBar1.setIndeterminate(true);
        int noOfColumns=0;
        try
        {
            noOfColumns=Integer.parseInt(txtNoOfColumns.getText().trim());
            trainingDataCSV = new CSVReader(txtTrainingDataCSVPath.getText().trim(), noOfColumns);
            if(DigitPrediction.Project.hbase.checkTableExists(txtTrainingTableName.getText().trim()))
            {
                JOptionPane.showMessageDialog(null, "Training Table Already Present", null, JOptionPane.INFORMATION_MESSAGE);
                jProgressBar1.setIndeterminate(false);
                return;
            }
            JOptionPane.showMessageDialog(null, "Creating Training Table: "+txtTrainingDataCSVPath.getText().trim(), null, JOptionPane.INFORMATION_MESSAGE);
            DigitPrediction.Project.load(trainingDataCSV,txtTrainingTableName.getText().trim(),txtColumnFamilyName.getText().trim(), noOfColumns);
            JOptionPane.showMessageDialog(null, "Training Data Loaded!", null, JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Enter valid not in No of Columns Field in Setting Tab!", null, JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Enter valid not in No of Columns Field in Setting Tab!");
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Invalid File Path: "+txtTrainingDataCSVPath.getText().trim(), null, JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Invalid File Path: "+txtTrainingDataCSVPath.getText().trim());
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Invalid File Data: "+txtTrainingDataCSVPath.getText().trim(), null, JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Invalid File Data: "+txtTrainingDataCSVPath.getText().trim());
        }
        jProgressBar1.setIndeterminate(false);
    }//GEN-LAST:event_btnLoadTrainingDataActionPerformed

    private void btnClearDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearDatabaseActionPerformed
        // TODO add your handling code here:
        jProgressBar1.setIndeterminate(true);
        clearTable();
        DigitPrediction.Project.deleteTable(txtTrainingTableName.getText().trim());
        JOptionPane.showMessageDialog(null, "Training Table: "+txtTrainingTableName.getText().trim()+" deleted successfully!!!", null, JOptionPane.INFORMATION_MESSAGE);
        DigitPrediction.Project.deleteTable(txtTestingTableName.getText().trim());
        JOptionPane.showMessageDialog(null, "Testing Table: "+txtTestingTableName.getText().trim()+" deleted successfully!!!", null, JOptionPane.INFORMATION_MESSAGE);
        jProgressBar1.setIndeterminate(false);
    }//GEN-LAST:event_btnClearDatabaseActionPerformed

    private void btnLoadTestingDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadTestingDataActionPerformed
        // TODO add your handling code here:
        jProgressBar1.setIndeterminate(true);
        int noOfColumns=0;
        try
        {
            noOfColumns=Integer.parseInt(txtNoOfColumns.getText().trim());
            testingDataCSV = new CSVReader(txtTestingDataCSVPath.getText().trim(), noOfColumns);
            if(DigitPrediction.Project.hbase.checkTableExists(txtTestingTableName.getText().trim()))
            {
                JOptionPane.showMessageDialog(null, "Testing Table Already Present", null, JOptionPane.INFORMATION_MESSAGE);
                jProgressBar1.setIndeterminate(false);
                return;
            }
            JOptionPane.showMessageDialog(null, "Creating Testing Table: "+txtTestingDataCSVPath.getText().trim(), null, JOptionPane.INFORMATION_MESSAGE);
            DigitPrediction.Project.load(testingDataCSV,txtTestingTableName.getText().trim(),txtColumnFamilyName.getText().trim(), noOfColumns);
            JOptionPane.showMessageDialog(null, "Testing Data Loaded!", null, JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Enter valid not in No of Columns Field in Setting Tab!");
            JOptionPane.showMessageDialog(null, "Enter valid not in No of Columns Field in Setting Tab!", null, JOptionPane.INFORMATION_MESSAGE);
        }
        catch(FileNotFoundException e){
            System.out.println("Invalid File Path: "+txtTestingDataCSVPath.getText().trim());
            JOptionPane.showMessageDialog(null, "Invalid File Path: "+txtTestingDataCSVPath.getText().trim(), null, JOptionPane.INFORMATION_MESSAGE);
        }
        catch(IOException e){
            System.out.println("Invalid File Data: "+txtTestingDataCSVPath.getText().trim());
            JOptionPane.showMessageDialog(null, "Invalid File Data: "+txtTestingDataCSVPath.getText().trim(), null, JOptionPane.INFORMATION_MESSAGE);
        }       
        jProgressBar1.setIndeterminate(false);
    }//GEN-LAST:event_btnLoadTestingDataActionPerformed

    private void btnShowTrainingDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTrainingDataActionPerformed
        // TODO add your handling code here:
        jProgressBar1.setIndeterminate(true);
        if(trainingDataCSV==null)
        {
            JOptionPane.showMessageDialog(null, "Training Data Not Yet Loaded!!!", null, JOptionPane.INFORMATION_MESSAGE);
            jProgressBar1.setIndeterminate(false);
            return;
        }
        clearTable();
        trainData=DigitPrediction.Project.display(trainingDataCSV,txtTrainingTableName.getText().trim(),txtColumnFamilyName.getText().trim(),(DefaultTableModel) tblOutput.getModel());
        JOptionPane.showMessageDialog(null, "Training Data Retrieved", null, JOptionPane.INFORMATION_MESSAGE);
        jProgressBar1.setIndeterminate(false);
    }//GEN-LAST:event_btnShowTrainingDataActionPerformed

    private void btnShowTestingDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTestingDataActionPerformed
        // TODO add your handling code here:
        jProgressBar1.setIndeterminate(true);
        if(testingDataCSV==null)
        {
            JOptionPane.showMessageDialog(null, "Testing Data Not Yet Loaded!!!", null, JOptionPane.INFORMATION_MESSAGE);
            jProgressBar1.setIndeterminate(false);
            return;
        }
        clearTable();
        testData=DigitPrediction.Project.display(testingDataCSV,txtTestingTableName.getText().trim(),txtColumnFamilyName.getText().trim(),(DefaultTableModel) tblOutput.getModel());
        JOptionPane.showMessageDialog(null, "Testing Data Retrieved", null, JOptionPane.INFORMATION_MESSAGE);
        jProgressBar1.setIndeterminate(false);
    }//GEN-LAST:event_btnShowTestingDataActionPerformed

    private void btnClassifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassifyActionPerformed
        // TODO add your handling code here:
        jProgressBar1.setIndeterminate(false);
        if(trainData==null)
        {
            System.err.println("Training Data Not Loaded");
            JOptionPane.showMessageDialog(null, "Training Data Not Loaded", null, JOptionPane.INFORMATION_MESSAGE);
        }
        else if(testData==null)
        {
            System.err.println("Testing Data Not Loaded");
            JOptionPane.showMessageDialog(null, "Testing Data Not Loaded", null, JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            ByteArrayOutputStream out=new ByteArrayOutputStream();
            Raf=DigitPrediction.Project.train(100,trainData,testData,out);
            JOptionPane.showMessageDialog(null, out.toString(), null, JOptionPane.INFORMATION_MESSAGE);
        }
        jProgressBar1.setIndeterminate(false);
    }//GEN-LAST:event_btnClassifyActionPerformed

    private void btnPredictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPredictActionPerformed
        // TODO add your handling code here:
        if(Raf==null)
        {
            JOptionPane.showMessageDialog(null, "Still Model not trained press Classify button in Basic Operations Tab!!!", null, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String data=editorData.getText();
        String row[]=data.split(",");
        try
        {
            int noOfColumns=Integer.parseInt(txtNoOfColumns.getText().trim());
            if(row.length!=noOfColumns)
            {
                JOptionPane.showMessageDialog(null, "Invalid no of columns", null, JOptionPane.INFORMATION_MESSAGE);
                jProgressBar1.setIndeterminate(false);
                return;
            }
            int intRow[]=new int[noOfColumns];
            for(int i=0;i<noOfColumns;i++)
                intRow[i]=Integer.parseInt(row[i]);
            int prediciton=Raf.Evaluate(intRow);
            JOptionPane.showMessageDialog(null, "Predicted No: "+intRow[noOfColumns-1], null, JOptionPane.INFORMATION_MESSAGE);     
        }
        catch(NumberFormatException e)
        {
            System.err.println("Enter valid integer value in No of colmns field in settings tab");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPredictActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClassify;
    private javax.swing.JButton btnClearDatabase;
    private javax.swing.JButton btnLoadTestingData;
    private javax.swing.JButton btnLoadTrainingData;
    private javax.swing.JButton btnPredict;
    private javax.swing.JButton btnShowTestingData;
    private javax.swing.JButton btnShowTrainingData;
    private javax.swing.JEditorPane editorData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblOutput;
    private javax.swing.JTextField txtColumnFamilyName;
    private javax.swing.JTextField txtNoOfColumns;
    private javax.swing.JTextField txtTestingDataCSVPath;
    private javax.swing.JTextField txtTestingTableName;
    private javax.swing.JTextField txtTrainingDataCSVPath;
    private javax.swing.JTextField txtTrainingTableName;
    // End of variables declaration//GEN-END:variables
}
