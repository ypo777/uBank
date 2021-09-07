/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;


import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Phellogen
 */
public class userregister extends javax.swing.JFrame {
Connection conn;
PreparedStatement ps,ps1,ps2,ps3,ps4,ps5;
ResultSet rs,rs1,rs2,rs3,rs4,rs5;
static int u;
static String iu,C;
    /**
     * Creates new form userregister
     */
    public userregister() {
        initComponents();
        induser.setOpaque(true);
       //overlay.setBackground(new Color(0,0,0,100));
        this.setLocationRelativeTo(null);
        conn=javaconnect.ConncerDB();
       
    }
    
   
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        overlay = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnback = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        induser = new javax.swing.JPanel();
        lbladmin = new javax.swing.JLabel();
        indadmin = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblemail = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        lblpassword = new javax.swing.JLabel();
        lblnrc = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        lbldateofbirth = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lblphone = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        Phonenumber = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        NRC = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        Password = new javax.swing.JPasswordField();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        btnnext = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        lbladdress = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btnexit2 = new javax.swing.JLabel();
        btnexit1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        overlay.setBackground(new java.awt.Color(63, 81, 181));
        overlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_images/muserface.png"))); // NOI18N
        overlay.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 390, 190));

        btnback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_images/mwhiteback.png"))); // NOI18N
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackMouseClicked(evt);
            }
        });
        overlay.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 40, 40));

        jLabel2.setBackground(new java.awt.Color(225, 225, 225));
        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sign in ");
        overlay.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 390, 80));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Do you already have an account? Click here to login. ");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        overlay.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 310, 40));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Start managing your life");
        overlay.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 350, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Hello there. Sign in and ");
        overlay.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 350, 30));

        lbluser.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbluser.setForeground(new java.awt.Color(204, 204, 204));
        lbluser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbluser.setText("User");
        lbluser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbluserMouseClicked(evt);
            }
        });
        overlay.add(lbluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 40));

        induser.setBackground(new java.awt.Color(255, 255, 255));
        induser.setOpaque(false);
        overlay.add(induser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 5));

        lbladmin.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbladmin.setForeground(new java.awt.Color(204, 204, 204));
        lbladmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbladmin.setText("Admin");
        lbladmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbladminMouseClicked(evt);
            }
        });
        overlay.add(lbladmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 80, 40));

        indadmin.setBackground(new java.awt.Color(255, 255, 255));
        indadmin.setOpaque(false);
        overlay.add(indadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 80, 5));

        getContentPane().add(overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 680));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblemail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblemail.setForeground(new java.awt.Color(52, 52, 52));
        lblemail.setText("Email");
        jPanel2.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 140, -1));

        Email.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(52, 52, 52));
        Email.setBorder(null);
        jPanel2.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 310, 30));

        lblpassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(52, 52, 52));
        lblpassword.setText("Password");
        jPanel2.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 170, -1));

        lblnrc.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblnrc.setForeground(new java.awt.Color(52, 52, 52));
        lblnrc.setText("NRC");
        jPanel2.add(lblnrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 130, -1));

        Username.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(52, 52, 52));
        Username.setBorder(null);
        jPanel2.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 310, 30));

        lbldateofbirth.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbldateofbirth.setForeground(new java.awt.Color(52, 52, 52));
        lbldateofbirth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldateofbirth.setText("Date of birth");
        jPanel2.add(lbldateofbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 90, -1));

        jSeparator3.setBackground(new java.awt.Color(52, 52, 52));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 310, 10));

        jSeparator4.setBackground(new java.awt.Color(52, 52, 52));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 310, 10));

        jSeparator6.setBackground(new java.awt.Color(52, 52, 52));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 310, 10));

        lblphone.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblphone.setForeground(new java.awt.Color(52, 52, 52));
        lblphone.setText("Phone");
        jPanel2.add(lblphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 140, -1));

        lblgender.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblgender.setForeground(new java.awt.Color(52, 52, 52));
        lblgender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblgender.setText("Gender");
        jPanel2.add(lblgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 60, -1));

        Phonenumber.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Phonenumber.setForeground(new java.awt.Color(52, 52, 52));
        Phonenumber.setBorder(null);
        jPanel2.add(Phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 310, 30));

        jSeparator9.setBackground(new java.awt.Color(52, 52, 52));
        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 310, 10));

        NRC.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        NRC.setForeground(new java.awt.Color(52, 52, 52));
        NRC.setBorder(null);
        jPanel2.add(NRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 310, 30));

        jSeparator10.setForeground(new java.awt.Color(52, 52, 52));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 310, 10));

        Password.setBorder(null);
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 310, 30));

        Male.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Male);
        Male.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Male.setText("Male");
        Male.setBorder(null);
        Male.setFocusPainted(false);
        jPanel2.add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 80, 20));

        Female.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Female);
        Female.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Female.setText("Female");
        Female.setBorder(null);
        Female.setFocusPainted(false);
        jPanel2.add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 80, 20));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 310, -1));

        jPanel1.setBackground(new java.awt.Color(63, 81, 181));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnnext.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnnext.setForeground(new java.awt.Color(255, 255, 255));
        btnnext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnnext.setText("Next");
        btnnext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(btnnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 110, 40));

        lblusername.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblusername.setForeground(new java.awt.Color(52, 52, 52));
        lblusername.setText("UserName");
        jPanel2.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 170, -1));

        Address.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Address.setForeground(new java.awt.Color(52, 52, 52));
        Address.setBorder(null);
        jPanel2.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 310, 30));

        lbladdress.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbladdress.setForeground(new java.awt.Color(52, 52, 52));
        lbladdress.setText("Address");
        jPanel2.add(lbladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 170, -1));

        jSeparator5.setBackground(new java.awt.Color(52, 52, 52));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 310, 10));

        btnexit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnexit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_images/darkexit.png"))); // NOI18N
        btnexit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexit2MouseClicked(evt);
            }
        });
        jPanel2.add(btnexit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 40));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 790, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseClicked
        Home h=new Home();
        h.setVisible(true);
        h.pack();
        h.setLocationRelativeTo(null);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnbackMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        userlogin ulogin=new userlogin();
        ulogin.setVisible(true);
        ulogin.pack();
        ulogin.setLocationRelativeTo(null);
        ulogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnexit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexit1MousePressed
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnexit1MousePressed

    private void btnexit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnexit1MouseClicked

    private void btnexit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexit2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnexit2MouseClicked

@SuppressWarnings("StringEquality")
    private void btnnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnextMouseClicked

        if(Username.getText()==""||Email.getText()==""||Password.getText()==""||NRC.getText()==""||Phonenumber.getText()==""||
            Address.getText()=="")
        {
            if(Username.getText()=="")
            {
                JOptionPane.showMessageDialog(this,"Name must be filled");
            }
            if(Email.getText()=="")
            {
                JOptionPane.showMessageDialog(this,"Email must be filled");
            }

            if(Password.getText()=="")
            {
                JOptionPane.showMessageDialog(this,"Password must be filled");
            }

            if(NRC.getText()=="")
            {
                JOptionPane.showMessageDialog(this,"NRC must be filled");

            }
            if(Phonenumber.getText()=="")
            {
                JOptionPane.showMessageDialog(this,"Phonenumber must be filled");
            }
            if(Address.getText()=="")
            {
                JOptionPane.showMessageDialog(this,"Account must be filled");
            }
        }
        
        else{
        try{
          
            
                
             String sql = "insert into CUSTOMER_DATA(ID,Name,Email,Password,Phone,Address,Gender,NRC,BD,Create_Date,CT,REC)values(?,?,?,?,?,?,?,?,?,?,?,?) ";
             
             
             String sql3 = "insert into Transfer_Data(ID,Name,Password,Count)values(?,?,?,?)";
             String sql4 = "select * from Generator where Count=?";
             String sql5 = "insert into Interest_Data(ID,Name,Password,Count)values(?,?,?,?)";
             String text = new SimpleDateFormat("yyyy-MM-dd", Locale.FRANCE).format(new Date());
             ps5 = conn.prepareStatement(sql5);
             ps4 = conn.prepareStatement(sql4);
             
             
             ps3 = conn.prepareStatement(sql3);
             ps = conn.prepareStatement(sql);
             int c = 1;
             int i =0;
             ps4.setInt(1,c);
            rs4 = ps4.executeQuery();
            if(rs4.next()){
                 String ch = rs4.getString("Customer");
                  i = Integer.parseInt(ch);
                 i++;
            }
            u=i;
            C = Integer.toString(i);
           C = "000"+C;
            SimpleDateFormat Date_Format = new SimpleDateFormat("MM-dd-yyyy");
            
             ButtonGroup bg = new ButtonGroup();
             String date = Date_Format.format(jDateChooser1.getDate());
             String passText = new String(Password.getPassword());
            ps.setString(1,C);
            
            ps3.setString(3,passText);
            ps3.setString(2,Username.getText());
            ps3.setString(1,C);
            
            ps.setString(2,Username.getText());
            ps.setString(3,Email.getText());
            ps.setString(4, passText);
            ps.setString(9,date );
            ps.setString(8,NRC.getText());
            ps.setString(5,Phonenumber.getText());
            ps.setString(6,Address.getText());
            ps.setString(10,text);
            ps.setString(11, "0");
            ps.setString(12, "0");
            ps.setString(7, buttonGroup1.getSelection().getActionCommand());
            
            //ps1.setString(1,strid);
           
            
            ps5.setString(2, Username.getText());
            ps5.setString(1, C);
            ps5.setString(3,passText);
            
            Male.setActionCommand("Male");
            Female.setActionCommand("Female");
           
           bg.add(Male);
           bg.add(Female);
          
            
            ps3.setString(4,"0");
            ps5.setString(4,"0");
           
            
            ps.execute();
            ps.close();
            ps3.execute();
            ps3.close();
            ps5.execute();
            ps5.close();
            //ps4.execute();
            JOptionPane.showMessageDialog(null,"Account Created");
             String sql10 = "update Generator set Current_Account='"+C+"' where Count='1'";
            ps = conn.prepareStatement(sql10);
            ps.executeUpdate();
            ps.close();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
         String si =  "update Generator set Customer= '"+u+"' where Count ='1'";
    try {
        ps = conn.prepareStatement(si);
        ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(userregister.class.getName()).log(Level.SEVERE, null, ex);
    }
    accounttype type=new accounttype();
        type.setVisible(true);
        type.pack();
        type.setLocationRelativeTo(null);
        type.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        }
    }//GEN-LAST:event_btnnextMouseClicked

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

    private void lbladminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbladminMouseClicked
        indadmin.setOpaque(true);
        induser.setOpaque(false);
        adminlogin alogin=new adminlogin();
        alogin.setVisible(true);
        alogin.pack();
        alogin.setLocationRelativeTo(null);
        alogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_lbladminMouseClicked

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
    
    
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userregister().setVisible(true);
            }
            
        });
        
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Email;
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JTextField NRC;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Phonenumber;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel btnback;
    private javax.swing.JLabel btnexit1;
    private javax.swing.JLabel btnexit2;
    private javax.swing.JLabel btnnext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel indadmin;
    private javax.swing.JPanel induser;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lbladmin;
    private javax.swing.JLabel lbldateofbirth;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblnrc;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lbluser;
    private javax.swing.JLabel lblusername;
    private javax.swing.JPanel overlay;
    // End of variables declaration//GEN-END:variables
}
