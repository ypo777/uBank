/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Phellogen
 */
public class admin extends javax.swing.JFrame {

   Connection conn;
PreparedStatement ps;
ResultSet rs;
Statement stmt;


    public admin() {
        initComponents();
        conn = javaconnect.ConncerDB();
        showData();
         this.setLocationRelativeTo(null);
    }
    
    public String edit;
    private void showData()
    {
        
        try{
              String tablesel = (String)Table.getSelectedItem();
            String sql = "select * from "+tablesel+" ";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            jTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        nrc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btnback = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnexit1 = new javax.swing.JLabel();
        btnexit2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jselect = new javax.swing.JComboBox<>();
        Search = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Table = new javax.swing.JComboBox<>();
        btnrefresh = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnedit = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        SearchData = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btndelete = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        currentamount = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(null);
        jScrollPane2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        jTable.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jTable.setShowGrid(false);
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable.setAlignmentX(0.0F);
        jTable.setAlignmentY(0.0F);
        jTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable.setRowHeight(30);
        jTable.setSelectionBackground(new java.awt.Color(63, 81, 181));
        jTable.setShowHorizontalLines(false);
        jTable.setShowVerticalLines(false);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1190, 150));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(63, 81, 181));
        jLabel6.setText("Email");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 100, 40));

        email.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        email.setBorder(null);
        email.setSelectionColor(new java.awt.Color(0, 121, 107));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 170, 40));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(63, 81, 181));
        jLabel7.setText("Password");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 100, 40));

        password.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        password.setBorder(null);
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, 170, 40));

        nrc.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nrc.setBorder(null);
        nrc.setSelectionColor(new java.awt.Color(0, 121, 107));
        jPanel1.add(nrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 170, 40));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(63, 81, 181));
        jLabel16.setText("Phone");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 100, 40));

        phone.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        phone.setBorder(null);
        phone.setSelectionColor(new java.awt.Color(0, 121, 107));
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 170, 40));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(63, 81, 181));
        jLabel17.setText("Address");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, 130, 40));

        date.setEditable(false);
        date.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        date.setBorder(null);
        date.setSelectionColor(new java.awt.Color(0, 121, 107));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 590, 170, 40));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(63, 81, 181));
        jLabel19.setText("ID");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 100, 40));

        ID.setEditable(false);
        ID.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ID.setBorder(null);
        ID.setSelectionColor(new java.awt.Color(0, 121, 107));
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 170, 40));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(63, 81, 181));
        jLabel4.setText("Name");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 100, 40));

        name.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        name.setBorder(null);
        name.setSelectionColor(new java.awt.Color(0, 121, 107));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 170, 40));

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(63, 81, 181));
        jLabel20.setText("NRC");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 100, 40));

        btnback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_images/darkback.png"))); // NOI18N
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackMouseClicked(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 40, 40));

        jPanel2.setBackground(new java.awt.Color(63, 81, 181));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("UserData");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 40));

        btnexit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnexit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_images/mwhitemini.png"))); // NOI18N
        btnexit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexit1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnexit1MousePressed(evt);
            }
        });
        jPanel2.add(btnexit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 40, 40));

        btnexit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnexit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_images/mwhiteexit.png"))); // NOI18N
        btnexit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexit2MouseClicked(evt);
            }
        });
        jPanel2.add(btnexit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 40, 40));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Search by");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 40));

        jselect.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Kinds", "Name", "ID", "Date", "Email", "NRC", "Gender", "Phonenumber", " " }));
        jPanel2.add(jselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, -1));

        Search.setBackground(new java.awt.Color(63, 81, 181));
        Search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setBorder(null);
        Search.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, 40));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 150, 20));

        Table.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer_Data", "History" }));
        jPanel2.add(Table, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 140, -1));

        btnrefresh.setBackground(new java.awt.Color(255, 255, 255));
        btnrefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrefreshMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Refresh");

        javax.swing.GroupLayout btnrefreshLayout = new javax.swing.GroupLayout(btnrefresh);
        btnrefresh.setLayout(btnrefreshLayout);
        btnrefreshLayout.setHorizontalGroup(
            btnrefreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnrefreshLayout.setVerticalGroup(
            btnrefreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnrefreshLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel2.add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, -1, -1));

        btnedit.setBackground(new java.awt.Color(255, 255, 255));
        btnedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneditMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Edit");

        javax.swing.GroupLayout btneditLayout = new javax.swing.GroupLayout(btnedit);
        btnedit.setLayout(btneditLayout);
        btneditLayout.setHorizontalGroup(
            btneditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btneditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        btneditLayout.setVerticalGroup(
            btneditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btneditLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel2.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, -1, -1));

        SearchData.setBackground(new java.awt.Color(255, 255, 255));
        SearchData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchDataMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Search");

        javax.swing.GroupLayout SearchDataLayout = new javax.swing.GroupLayout(SearchData);
        SearchData.setLayout(SearchDataLayout);
        SearchDataLayout.setHorizontalGroup(
            SearchDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );
        SearchDataLayout.setVerticalGroup(
            SearchDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchDataLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(SearchData, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, -1, -1));

        btndelete.setBackground(new java.awt.Color(255, 255, 255));
        btndelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndeleteMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Delete");

        javax.swing.GroupLayout btndeleteLayout = new javax.swing.GroupLayout(btndelete);
        btndelete.setLayout(btndeleteLayout);
        btndeleteLayout.setHorizontalGroup(
            btndeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btndeleteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        btndeleteLayout.setVerticalGroup(
            btndeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btndeleteLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel2.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 150, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 210));

        currentamount.setEditable(false);
        currentamount.setBorder(null);
        jPanel1.add(currentamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 590, 160, 40));

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(63, 81, 181));
        jLabel22.setText("Birthday");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 100, 40));

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(63, 81, 181));
        jLabel23.setText("Current Amount");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 130, 40));

        Address.setBorder(null);
        jPanel1.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void btndeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteMouseClicked
         
        
    try {
         String tablesel = (String)Table.getSelectedItem();
         if(tablesel=="History" ){
             JOptionPane.showMessageDialog(null,"You cannot delete this Data");
         }
          if(tablesel=="Customer_Data"){
             dcustomer();
         }
         if(tablesel=="Admin_Data"){
             
             dadmin();
         }
         if(tablesel==""){
             JOptionPane.showMessageDialog(null,"Choose Table");
         }
    } catch (SQLException ex) {
        Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    
    }//GEN-LAST:event_btndeleteMouseClicked

    private void btnrefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrefreshMouseClicked
         showData();
        Search.setText("");
        name.setText("");
        email.setText("");
        password.setText("");
      
        ID.setText("");
        phone.setText("");
       date.setText("");
        nrc.setText("");
        Address.setText("");
        currentamount.setText("");
       
       
    }//GEN-LAST:event_btnrefreshMouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void btneditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseClicked
        try{
           String tablesel = (String)Table.getSelectedItem();
           if(tablesel =="Customer_Data"){
               ucustomer();
           }
           if(tablesel =="Admin_Data"){
               uadmin();
           }
           if(tablesel=="History"){

               JOptionPane.showMessageDialog(null,"You cannot edit this Data!");
           }
            
        }
        catch(SQLException  e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btneditMouseClicked

    private void SearchDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchDataMouseClicked

        try{
            String selection  = (String)jselect.getSelectedItem();
             String tablesel = (String)Table.getSelectedItem();
         
            String sql = "select  * from "+tablesel+" where "+selection+" =?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,Search.getText());
            rs = ps.executeQuery();
            jTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_SearchDataMouseClicked

    private void btnexit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnexit1MouseClicked

    private void btnexit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexit1MousePressed
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnexit1MousePressed

    private void btnexit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexit2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnexit2MouseClicked

    private void btnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseClicked
        adminlogin alogin=new adminlogin();
        alogin.setVisible(true);
        alogin.pack();
        alogin.setLocationRelativeTo(null);
        alogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnbackMouseClicked

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        try{
            String tablesel = (String)Table.getSelectedItem();
            if(tablesel=="Customer_Data"){
                scustomer();
            }
            if(tablesel=="Admin_Data"){
                sadmin();
            }
            if(tablesel=="History"){
                shistory();
            }

        }
        catch(Exception e){

        }
    }//GEN-LAST:event_jTableMouseClicked
    
    
     void setColor(JPanel panel)
    {
        panel.setBackground(new Color(48, 63, 159));
    }
    void resetColor(JPanel panel)
    {
        panel.setBackground(new Color(63, 81, 181));
    }
    
   
    public void dcustomer() throws SQLException{
 String id = ID.getText();
        int selectrow = jTable.getSelectedRow();
      String did = (jTable.getModel().getValueAt(selectrow,0).toString());
      System.out.print(did);
       stmt = conn.createStatement();
       
        String sql = "delete   from Customer_Data where ID='"+did+"'";
       
        int i = stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Success");    
    
    }
    
    public void dadmin() throws SQLException{
         String id = ID.getText();
        int selectrow = jTable.getSelectedRow();
      String did = (jTable.getModel().getValueAt(selectrow,0).toString());
      System.out.print(did);
       stmt = conn.createStatement();
       
        String sql = "delete   from Admin_Data where ID='"+did+"'";
       
        int i = stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Success");
    }
    
    public void ucustomer() throws SQLException{
            String n = name.getText();
            String e = email.getText();
            String p = password.getText();
           
            String ph = phone.getText();
            String ad = Address.getText();
            
            String i = ID.getText();
           String sql = "update Customer_Data  set Name ='"+n+"',Email='"+e+"',Password='"+p+"',Phone='"+ph+"',Address='"+ad+"'where ID='"+i+"'";
           
            
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Account Updated!");
    }
    public void uadmin(){
        String n = name.getText();
            String e = email.getText();
            String p = password.getText();
          
            String ph = phone.getText();
            String ad = Address.getText();
           
            String i = ID.getText();
            String sql = "update Admin_Data set Name ='"+n+"',Email='"+e+"',Password='"+p+"',Phone='"+ph+"',Address='"+ad+"' where ID='"+i+"'";
    }
     public void scustomer() throws SQLException{
       
            
         try{
          int row = jTable.getSelectedRow();
             String tablesel = (String)Table.getSelectedItem();
         
            String OnClick = (jTable.getModel().getValueAt(row,0).toString());
            String sql = "select * from Customer_Data where ID = '"+OnClick+"'";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                ID.setText(rs.getString("ID"));
                name.setText(rs.getString("Name"));
                email.setText(rs.getString("Email"));
                password.setText(rs.getString("Password"));
                nrc.setText(rs.getString("NRC"));
                currentamount.setText(rs.getString("Current_Amount"));
                Address.setText(rs.getString("Address"));
                
                
                phone.setText(rs.getString("Phone"));
               
                date.setText(rs.getString("BD"));
                ID.setText(rs.getString("ID"));
            }
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }      
           
    }
     public void sadmin(){
          try{
          int row = jTable.getSelectedRow();
             String tablesel = (String)Table.getSelectedItem();
         
            String OnClick = (jTable.getModel().getValueAt(row,0).toString());
            String sql = "select * from Admin_Data where ID = '"+OnClick+"'";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                ID.setText(rs.getString("ID"));
                name.setText(rs.getString("Name"));
                email.setText(rs.getString("Email"));
                password.setText(rs.getString("Password"));
                nrc.setText(rs.getString("NRC"));
                
                Address.setText(rs.getString("Addresss"));
                
                
               
            }
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }     
     }
     public void shistory(){
          try{
          int row = jTable.getSelectedRow();
             String tablesel = (String)Table.getSelectedItem();
         
            String OnClick = (jTable.getModel().getValueAt(row,0).toString());
            String sql = "select * from History where ID = '"+OnClick+"'";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                ID.setText(rs.getString("ID"));
                name.setText(rs.getString("Name"));
               
              
                
            }
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }     
     }
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Macintosh*".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Search;
    private javax.swing.JPanel SearchData;
    private javax.swing.JComboBox<String> Table;
    private javax.swing.JLabel btnback;
    private javax.swing.JPanel btndelete;
    private javax.swing.JPanel btnedit;
    private javax.swing.JLabel btnexit1;
    private javax.swing.JLabel btnexit2;
    private javax.swing.JPanel btnrefresh;
    private javax.swing.JTextField currentamount;
    private javax.swing.JTextField date;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable;
    public javax.swing.JComboBox<String> jselect;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nrc;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phone;
    // End of variables declaration//GEN-END:variables
}

