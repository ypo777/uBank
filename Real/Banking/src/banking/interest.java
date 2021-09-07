/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.*;
import javax.swing.Timer;
/**
 *
 * @author Phellogen
 */
public class interest extends javax.swing.JFrame {
Connection conn;
PreparedStatement ps;
ResultSet rs;
static String sum1,ID,sum2;

    /**
     * Creates new form interest
     */
    public interest() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        conn = javaconnect.ConncerDB();
        showTime();
         String sql1 = "select * from Generator where Count='1'";    
         String text = new SimpleDateFormat("yyyy/MM/dd", Locale.FRANCE).format(new java.util.Date());
         date.setText(text);
         
       try {
           ps  = conn.prepareStatement(sql1);
           rs = ps.executeQuery();
           if(rs.next()){
                
                UID.setText(rs.getString("Current_Account"));
                ID = rs.getString("Current_Account");
           }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
       String sql = "select * from Customer_Data where ID='"+ID+"'";
       ps = conn.prepareStatement(sql);
       rs = ps.executeQuery();
       if(rs.next()){
           String ca = rs.getString("Current_Amount");
           Camount.setText(ca);
           
       }
    }
    public void cal(){
        String m = (String)monthch.getSelectedItem();
        if(m=="3months"){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new java.util.Date()); // Now use today date.
        c.add(Calendar.DATE, 90); // Adding 5 days
        String output = sdf.format(c.getTime());
        System.out.println(output);
        String a = Amount.getText();
        int cu1 = Integer.parseInt(a);
        int s = (int) ((cu1 * 9.25 * 3/100)+cu1);
         sum1 = Integer.toString(s);
         String text = new SimpleDateFormat("yyyy/MM/dd", Locale.FRANCE).format(new java.util.Date());
        String sql = "update Interest_Data set Longtime ='"+m+"',Start_Date='"+text+"',Count='1',Endtime='"+output+"',Amount='"+sum1+"' where ID='"+ID+"' ";
            try {
                ps = conn.prepareStatement(sql);
                ps.executeUpdate();
            } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e);
            }
        
        }
        if(m=="6months"){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new java.util.Date()); // Now use today date.
        c.add(Calendar.DATE, 180); // Adding 5 days
        String output = sdf.format(c.getTime());
        System.out.println(output);
        String a = Amount.getText();
        int cu1 = Integer.parseInt(a);
        int s = (int) ((cu1  * 9.50 * 6/100)+cu1);
         sum1 = Integer.toString(s);
         String text = new SimpleDateFormat("yyyy/MM/dd", Locale.FRANCE).format(new java.util.Date());
        String sql = "update Interest_Data set Longtime ='"+m+"',Start_Date='"+text+"',Count='1',Endtime='"+output+"',Amount='"+sum1+"' where ID='"+ID+"' ";
            try {
                ps = conn.prepareStatement(sql);
                ps.executeUpdate();
            } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e);
            }
        }
        if(m=="9months"){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new java.util.Date()); // Now use today date.
        c.add(Calendar.DATE, 270); // Adding 5 days
        String output = sdf.format(c.getTime());
        System.out.println(output);
        String a = Amount.getText();
        int cu1 = Integer.parseInt(a);
        int s = (int) ((cu1 * 9.75 * 9/100)+cu1);
         sum1 = Integer.toString(s);
         String text = new SimpleDateFormat("yyyy/MM/dd", Locale.FRANCE).format(new java.util.Date());
        String sql = "update Interest_Data set Longtime ='"+m+"',Start_Date='"+text+"',Count='1',Endtime='"+output+"',Amount='"+sum1+"' where ID='"+ID+"' ";
            try {
                ps = conn.prepareStatement(sql);
                ps.executeUpdate();
            } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e);
            }
        }
        if(m=="1Year"){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new java.util.Date()); // Now use today date.
        c.add(Calendar.DATE, 360); // Adding 5 days
        String output = sdf.format(c.getTime());
        System.out.println(output);
        String a = Amount.getText();
        int cu1 = Integer.parseInt(a);
        int s = (int) ((cu1 * 10 * 12/100)+cu1);
         sum1 = Integer.toString(s);
         String text = new SimpleDateFormat("yyyy/MM/dd", Locale.FRANCE).format(new java.util.Date());
        String sql = "update Interest_Data set Longtime ='"+m+"',Start_Date='"+text+"',Count='1',Endtime='"+output+"',Amount='"+sum1+"' where ID='"+ID+"' ";
            try {
                ps = conn.prepareStatement(sql);
                ps.executeUpdate();
            } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    void showTime(){
    new Timer(0,new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
        
   java.util.Date d=new java.util.Date();
SimpleDateFormat s=new SimpleDateFormat("hh:mm:ss ");
time.setText(s.format(d));
    }
}).start();
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        UID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Bamount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        Camount = new javax.swing.JTextField();
        btnback = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlablel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblfullname2 = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnconfirm = new javax.swing.JPanel();
        Calculate = new javax.swing.JLabel();
        btnconfirm1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnexit1 = new javax.swing.JLabel();
        btnexit2 = new javax.swing.JLabel();
        monthch = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(52, 52, 52));
        jLabel7.setText("ID");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 60, 50));

        UID.setEditable(false);
        UID.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        UID.setForeground(new java.awt.Color(63, 81, 181));
        UID.setBorder(null);
        jPanel2.add(UID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 150, 50));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("amount");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 80, 40));

        show.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        show.setText("Current");
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 80, 40));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(63, 81, 181));
        jLabel5.setText("Remaining amount");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 240, 40));

        Bamount.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        Bamount.setForeground(new java.awt.Color(63, 81, 181));
        Bamount.setBorder(null);
        jPanel2.add(Bamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 160));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setText("Time");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 50, 40));

        time.setEditable(false);
        time.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        time.setForeground(new java.awt.Color(63, 81, 181));
        time.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        time.setBorder(null);
        jPanel2.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 150, 40));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("Date");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 50, 40));

        date.setEditable(false);
        date.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        date.setForeground(new java.awt.Color(63, 81, 181));
        date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        date.setBorder(null);
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 150, 40));

        Camount.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Camount.setBorder(null);
        jPanel2.add(Camount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 150, 50));

        btnback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_images/darkback.png"))); // NOI18N
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackMouseClicked(evt);
            }
        });
        jPanel2.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 680));

        jPanel1.setBackground(new java.awt.Color(246, 246, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlablel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jlablel1.setForeground(new java.awt.Color(52, 52, 52));
        jlablel1.setText("Choose Month");
        jPanel1.add(jlablel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 160, -1));

        jLabel2.setBackground(new java.awt.Color(225, 225, 225));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 52, 52));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Interest");
        jLabel2.setEnabled(false);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 820, 50));

        lblfullname2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblfullname2.setForeground(new java.awt.Color(52, 52, 52));
        lblfullname2.setText("Amount");
        jPanel1.add(lblfullname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 160, -1));

        Amount.setBackground(new java.awt.Color(246, 246, 246));
        Amount.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Amount.setForeground(new java.awt.Color(52, 52, 52));
        Amount.setBorder(null);
        Amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AmountKeyReleased(evt);
            }
        });
        jPanel1.add(Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 300, 30));

        jSeparator4.setBackground(new java.awt.Color(52, 52, 52));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 300, 10));

        btnconfirm.setBackground(new java.awt.Color(63, 81, 181));

        Calculate.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        Calculate.setForeground(new java.awt.Color(255, 255, 255));
        Calculate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Calculate.setText("Calculate");
        Calculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalculateMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CalculateMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CalculateMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout btnconfirmLayout = new javax.swing.GroupLayout(btnconfirm);
        btnconfirm.setLayout(btnconfirmLayout);
        btnconfirmLayout.setHorizontalGroup(
            btnconfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Calculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnconfirmLayout.setVerticalGroup(
            btnconfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnconfirmLayout.createSequentialGroup()
                .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 110, 50));

        btnconfirm1.setBackground(new java.awt.Color(233, 30, 99));
        btnconfirm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnconfirm1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnconfirm1MouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cancel");

        javax.swing.GroupLayout btnconfirm1Layout = new javax.swing.GroupLayout(btnconfirm1);
        btnconfirm1.setLayout(btnconfirm1Layout);
        btnconfirm1Layout.setHorizontalGroup(
            btnconfirm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnconfirm1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnconfirm1Layout.setVerticalGroup(
            btnconfirm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnconfirm1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(btnconfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        btnexit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnexit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_images/darkmini.png"))); // NOI18N
        btnexit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexit1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnexit1MousePressed(evt);
            }
        });
        jPanel1.add(btnexit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 40));

        btnexit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnexit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_images/darkexit.png"))); // NOI18N
        btnexit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexit2MouseClicked(evt);
            }
        });
        jPanel1.add(btnexit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 40, 40));

        monthch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Month", "3months", "6months", "9months", "1Year" }));
        jPanel1.add(monthch, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 300, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 820, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseClicked
        userHome uhome=new userHome();
        uhome.setVisible(true);
        uhome.pack();
        uhome.setLocationRelativeTo(null);
        uhome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnbackMouseClicked

    private void AmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmountKeyReleased
        
    }//GEN-LAST:event_AmountKeyReleased

    private void CalculateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalculateMouseEntered
        setconfrimcolor(btnconfirm);
    }//GEN-LAST:event_CalculateMouseEntered

    private void CalculateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalculateMouseExited
        resetconfirmcolor(btnconfirm);
    }//GEN-LAST:event_CalculateMouseExited

    private void btnconfirm1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconfirm1MouseEntered
        setcancelcolor(btnconfirm1);
    }//GEN-LAST:event_btnconfirm1MouseEntered

    private void btnconfirm1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconfirm1MouseExited
        resetcancelcolor(btnconfirm1);
    }//GEN-LAST:event_btnconfirm1MouseExited

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

    private void CalculateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalculateMouseClicked
        // TODO add your handling code here:
          try {
            String a1 = Camount.getText();
            String a2 = Amount.getText();
            if (Integer.parseInt(a1) < Integer.parseInt(a2)) {
                JOptionPane.showMessageDialog(null, "Your Interest Amount is more than your current amount");
                        userHome uhome=new userHome();
                        uhome.setVisible(true);
                        uhome.pack();
                        uhome.setLocationRelativeTo(null);
                        uhome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
            }
            else{

            int sum = Integer.parseInt(a1) - Integer.parseInt(a2);
             sum2 = String.valueOf(sum);
            Bamount.setText(sum2);
             cal();
       String sql3 = "update Customer_Data set Current_Amount='"+sum2+"' where ID='"+ID+"'";
    try {
        ps = conn.prepareStatement(sql3);
        ps.executeUpdate();
    } catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e);
    }
    userHome uhome=new userHome();
                        uhome.setVisible(true);
                        uhome.pack();
                        uhome.setLocationRelativeTo(null);
                        uhome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
      
                         
   
    }//GEN-LAST:event_CalculateMouseClicked
  void setconfrimcolor(JPanel panel)
    {
        panel.setBackground(new Color(48, 63, 159));
        
    }
    void resetconfirmcolor(JPanel panel)
    {
        panel.setBackground(new Color(63, 81, 181));
        
    }
    
     void setcancelcolor(JPanel panel)
    {
        panel.setBackground(new Color(194, 24, 91));
        
    }
    void resetcancelcolor(JPanel panel)
    {
        panel.setBackground(new Color(233, 30, 99));
        
    }
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
                if ("Macintosh*".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new interest().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(interest.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount;
    private javax.swing.JTextField Bamount;
    private javax.swing.JLabel Calculate;
    private javax.swing.JTextField Camount;
    private javax.swing.JTextField UID;
    private javax.swing.JLabel btnback;
    private javax.swing.JPanel btnconfirm;
    private javax.swing.JPanel btnconfirm1;
    private javax.swing.JLabel btnexit1;
    private javax.swing.JLabel btnexit2;
    private javax.swing.JTextField date;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel jlablel1;
    private javax.swing.JLabel lblfullname2;
    private javax.swing.JComboBox<String> monthch;
    private javax.swing.JLabel show;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
