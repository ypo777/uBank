/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.awt.Color;
import javax.swing.JFrame;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Phellogen
 */
public class adminregister extends javax.swing.JFrame {

   static  Connection conn;
    static PreparedStatement ps,ps1;
    static ResultSet rs,rs1;
    static int u;
    /**
     * Creates new form AdminRegister
     */
    public adminregister() {
        initComponents();
        //com.sun.awt.AWTUtilities.setWindowOpacity(this,0.9f);
        indadmin.setOpaque(true);
        this.setLocationRelativeTo(null);
        //overlay.setBackground(new Color(0,0,0,100));
        conn = javaconnect.ConncerDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnback1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblusername = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lbldateofbirth1 = new javax.swing.JLabel();
        Phonenumber = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        NRC = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        Password = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        btnnext = new javax.swing.JLabel();
        lblfullname1 = new javax.swing.JLabel();
        lbldateofbirth2 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        btnexit1 = new javax.swing.JLabel();
        btnexit2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnback = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        lbladmin = new javax.swing.JLabel();
        induser = new javax.swing.JPanel();
        indadmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        btnback1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnback1MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1120, 680));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblusername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblusername.setForeground(new java.awt.Color(52, 52, 52));
        lblusername.setText("Email");
        jPanel2.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 130, -1));

        Email.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(52, 52, 52));
        Email.setBorder(null);
        jPanel2.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 300, 30));

        lblemail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblemail.setForeground(new java.awt.Color(52, 52, 52));
        lblemail.setText("Password");
        jPanel2.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 160, -1));

        lblpassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(52, 52, 52));
        lblpassword.setText("NRC");
        jPanel2.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 120, -1));

        Username.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(52, 52, 52));
        Username.setBorder(null);
        jPanel2.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 300, 30));

        jSeparator3.setBackground(new java.awt.Color(52, 52, 52));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 300, 10));

        jSeparator4.setBackground(new java.awt.Color(52, 52, 52));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 300, 10));

        jSeparator6.setBackground(new java.awt.Color(52, 52, 52));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 300, 10));

        lbldateofbirth1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbldateofbirth1.setForeground(new java.awt.Color(52, 52, 52));
        lbldateofbirth1.setText("Phone");
        jPanel2.add(lbldateofbirth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 130, -1));

        Phonenumber.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Phonenumber.setForeground(new java.awt.Color(52, 52, 52));
        Phonenumber.setBorder(null);
        jPanel2.add(Phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 300, 30));

        jSeparator9.setBackground(new java.awt.Color(52, 52, 52));
        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 300, 10));

        NRC.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        NRC.setForeground(new java.awt.Color(52, 52, 52));
        NRC.setBorder(null);
        jPanel2.add(NRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 300, 30));

        jSeparator10.setForeground(new java.awt.Color(52, 52, 52));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 300, 10));

        Password.setBorder(null);
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 300, 30));

        jPanel1.setBackground(new java.awt.Color(63, 81, 181));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnnext.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnnext.setForeground(new java.awt.Color(255, 255, 255));
        btnnext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnnext.setText("Sign up");
        btnnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnnextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnnextMouseExited(evt);
            }
        });
        jPanel1.add(btnnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 100, 40));

        lblfullname1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblfullname1.setForeground(new java.awt.Color(52, 52, 52));
        lblfullname1.setText("Name");
        jPanel2.add(lblfullname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 160, -1));

        lbldateofbirth2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbldateofbirth2.setForeground(new java.awt.Color(52, 52, 52));
        lbldateofbirth2.setText("Address");
        jPanel2.add(lbldateofbirth2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 130, -1));

        Address.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Address.setForeground(new java.awt.Color(52, 52, 52));
        Address.setBorder(null);
        jPanel2.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 300, 30));

        jSeparator11.setBackground(new java.awt.Color(52, 52, 52));
        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 300, 10));

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
        jPanel2.add(btnexit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 40, 40));

        btnexit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnexit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_images/darkexit.png"))); // NOI18N
        btnexit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexit2MouseClicked(evt);
            }
        });
        jPanel2.add(btnexit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 40));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Terms and conditons");
        jLabel7.setEnabled(false);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 790, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 790, 680));

        jPanel3.setBackground(new java.awt.Color(63, 81, 181));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_images/mwhiteback.png"))); // NOI18N
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackMouseClicked(evt);
            }
        });
        jPanel3.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 40, 40));

        jLabel6.setBackground(new java.awt.Color(225, 225, 225));
        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sign up");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 390, 80));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("part of our great management.");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 350, 30));

        lbluser.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbluser.setForeground(new java.awt.Color(204, 204, 204));
        lbluser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbluser.setText("User");
        lbluser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbluserMouseClicked(evt);
            }
        });
        jPanel3.add(lbluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 40));

        lbladmin.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbladmin.setForeground(new java.awt.Color(204, 204, 204));
        lbladmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbladmin.setText("Admin");
        lbladmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbladminMouseClicked(evt);
            }
        });
        jPanel3.add(lbladmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 80, 40));

        induser.setBackground(new java.awt.Color(255, 255, 255));
        induser.setOpaque(false);
        jPanel3.add(induser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 5));

        indadmin.setBackground(new java.awt.Color(255, 255, 255));
        indadmin.setOpaque(false);
        jPanel3.add(indadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 80, 5));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_images/museradd.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 390, 200));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Please enter your details to sign up and be");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 350, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnback1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnback1MouseClicked
        // TODO add your handling code here:
        Home h = new Home();
        h.setVisible(true);
        h.pack();
        h.setLocationRelativeTo(null);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnback1MouseClicked

    private void btnexit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexit2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnexit2MouseClicked

    private void btnexit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexit1MousePressed
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnexit1MousePressed

    private void btnexit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnexit1MouseClicked

    private void btnnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnextMouseClicked
        
            // TODO add your handling code here:
            String sql = "insert into Admin_Data(ID,Name,Email,Password,Phone,Addresss,NRC,Create_Date)values(?,?,?,?,?,?,?,?)";

            try {
                String text = new SimpleDateFormat("yyyy-MM-dd", Locale.FRANCE).format(new java.util.Date());
                 String sql4 = "select * from Generator where Count=?";
                ps = conn.prepareStatement(sql);
                ps1 = conn.prepareStatement(sql4);
                int c = 1;
             int i =0;
             ps1.setInt(1,c);
            rs1 = ps1.executeQuery();
            if(rs1.next()){
                 String ch = rs1.getString("Admin");
                  i = Integer.parseInt(ch);
                 i++;
            }
            u=i;
           String C = Integer.toString(i);
           C = "000"+C;
                ps.setString(1, C);
                ps.setString(2, Username.getText());
                ps.setString(3, Email.getText());
                String pass = new String(Password.getPassword());
                ps.setString(4, pass);
                ps.setString(7, NRC.getText());
                ps.setString(5, Phonenumber.getText());
                ps.setString(6,Address.getText());
                ps.setString(8,text);

                JOptionPane.showMessageDialog(null, "Account Created!");
                ps.execute();
                ps1.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
         String si =  "update Generator set Admin= '"+u+"' where Count ='1'";
    try {
        ps1 = conn.prepareStatement(si);
        ps1.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(userregister.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnnextMouseClicked

    private void lbladminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbladminMouseClicked
        indadmin.setOpaque(true);
        induser.setOpaque(false);
        adminregister aregister=new adminregister();
        aregister.setVisible(true);
        aregister.pack();
        aregister.setLocationRelativeTo(null);
        aregister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_lbladminMouseClicked

    private void lbluserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbluserMouseClicked
        // TODO add your handling code here:
        induser.setOpaque(true);
        indadmin.setOpaque(false);
        userregister uregister=new userregister();
        uregister.setVisible(true);
        uregister.pack();
        uregister.setLocationRelativeTo(null);
        uregister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_lbluserMouseClicked

    private void btnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseClicked
        userregister uregister=new userregister();
        uregister.setVisible(true);
        uregister.pack();
        uregister.setLocationRelativeTo(null);
        uregister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnbackMouseClicked

    private void btnnextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnextMouseEntered
       setColor(jPanel1);
    }//GEN-LAST:event_btnnextMouseEntered

    private void btnnextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnextMouseExited
       resetColor(jPanel1);
    }//GEN-LAST:event_btnnextMouseExited
     void setColor(JPanel panel)
    {
        panel.setBackground(new Color(48, 63, 159));
        
    }
    void resetColor(JPanel panel)
    {
        panel.setBackground(new Color(63, 81, 181));
        
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
            java.util.logging.Logger.getLogger(adminregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminregister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField NRC;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Phonenumber;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel btnback;
    private javax.swing.JLabel btnback1;
    private javax.swing.JLabel btnexit1;
    private javax.swing.JLabel btnexit2;
    private javax.swing.JLabel btnnext;
    private javax.swing.JPanel indadmin;
    private javax.swing.JPanel induser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbladmin;
    private javax.swing.JLabel lbldateofbirth1;
    private javax.swing.JLabel lbldateofbirth2;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblfullname1;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lbluser;
    private javax.swing.JLabel lblusername;
    // End of variables declaration//GEN-END:variables
}
