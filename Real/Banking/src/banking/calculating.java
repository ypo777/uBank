/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author yanpaingoo
 */

public class calculating {
    static Connection conn;
    static   ResultSet rs,rs2;
       static PreparedStatement ps,ps1,ps2;
       static String camount,sum1;
    public static void main(String args[]) throws SQLException, ParseException{
        conn = javaconnect.ConncerDB();
       int k = 3;
       String id = Integer.toString(k);
       String sql2 = "select * from Interest_Data where ID='"+id+"'";
                        ps = conn.prepareStatement(sql2);
                        rs = ps.executeQuery();
                        if(rs.next()){
                            String c = rs.getString("Count");
                            int o = Integer.parseInt(c);
                            if(o==1){
                                String ed = rs.getString("Endtime");
                              System.out.print(ed);
                               Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(ed);
                               System.out.print(date1);
                               String text = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE).format(new java.util.Date());
                               Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(text);
                               System.out.print(date2);
                               if(date1.equals(date2) )
                               {
                                   JOptionPane.showMessageDialog(null,"Your Interest is success");
                                   System.out.print("Your Interest is success");
                                   String sql4  = "select * from Customer_Data where ID='"+id+"'";
                                   String sql5 = "select * from Interest_Data where ID='"+id+"'";
                                  ps1 = conn.prepareStatement(sql5);
                                  ps2 = conn.prepareStatement(sql4);
                                  rs2 = ps2.executeQuery();
                                  rs = ps1.executeQuery();
                                  if(rs2.next()){
                                      camount = rs2.getString("Current_Amount");
                                       System.out.print(camount);
                                      ps2.close();
                                      rs2.close();
                                  }
                                  if(rs.next()){
                                      String Inter = rs.getString("Amount");
                                      
                                        int i=Integer.parseInt(Inter);
                                        
                                        int i1=Integer.parseInt(camount);
                                        int sum=i+i1;
                                         sum1=String.valueOf(sum);
                                         ps1.close();
                                  }
                               
                               String sql6 = "update Customer_Data set Current_Amount = '"+sum1+"' where ID='"+id+"' ";
                               ps = conn.prepareStatement(sql6);
                               ps.executeUpdate();
                               ps.close();
                               String sql7 = "update Interest_Data set Count='0',Amount='0',Longtime='0',Start_Date='0',Endtime='0' where ID = '"+id+"'";
                               ps = conn.prepareStatement(sql7);
                               ps.executeUpdate();
                               ps.close();
                               }
                               if(date1.before(date2)){
                                   JOptionPane.showMessageDialog(null, "Your Interest is Success");
                                   System.out.print("Your Interest is success");
                                   String sql4  = "select * from Customer_Data where ID='"+id+"'";
                                   String sql5 = "select * from Interest_Data where ID='"+id+"'";
                                  ps1 = conn.prepareStatement(sql5);
                                  ps2 = conn.prepareStatement(sql4);
                                  rs2 = ps2.executeQuery();
                                  rs = ps1.executeQuery();
                                  if(rs2.next()){
                                      camount = rs2.getString("Current_Amount");
                                       System.out.print(camount);
                                      ps2.close();
                                      rs2.close();
                                  }
                                  if(rs.next()){
                                      String Inter = rs.getString("Amount");
                                      
                                        int i=Integer.parseInt(Inter);
                                        
                                        int i1=Integer.parseInt(camount);
                                        int sum=i+i1;
                                         sum1=String.valueOf(sum);
                                         ps1.close();
                                  }
                               
                               String sql6 = "update Customer_Data set Current_Amount = '"+sum1+"' where ID='"+id+"' ";
                               ps = conn.prepareStatement(sql6);
                               ps.executeUpdate();
                               ps.close();
                               String sql7 = "update Interest_Data set Count='0',Amount='0',Longtime='0',Start_Date='0',Endtime='0' where ID = '"+id+"'";
                               ps = conn.prepareStatement(sql7);
                               ps.executeUpdate();
                               ps.close();
                               }
                               
                            }
                            JOptionPane.showMessageDialog(null, "No Interest ");
                        }
    }
}
