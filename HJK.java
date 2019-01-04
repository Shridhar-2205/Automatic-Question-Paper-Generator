/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paper;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author Dell
 */
public class HJK {
    public static void main (String hsg[]) throws IOException
    {
        Scanner in =new Scanner(System.in);
        String str;
        str=in.next();
         Statement stmt=null;
int marks[]=new int[20000];
int i=0,j=1;
String que[]=new String[20000];
try{
        String url="jdbc:derby://localhost:1527/question paper";
        String username="qa";
        String password="qa";
                Connection con= DriverManager.getConnection(url,username,password);
         stmt=con.createStatement();
        String sql = "SELECT * FROM OOP ORDER BY MARK ";
        ResultSet rs = stmt.executeQuery(sql);
File fout = new File("dj.txt");
	FileOutputStream fos = new FileOutputStream(fout);
 
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
 
        while(rs.next()){
         //Retrieve by column name
          marks[i] = rs.getInt("MARK");
         
         que[i] = rs.getString("QUESTIONS");
        
        bw.write(j+". "+que[i]+" "+marks[i]);
        bw.newLine();
        i++;
        j++;
               
         
      }
	
		
 
	bw.close();


        }
       catch(SQLException ex)
       {
           JOptionPane.showMessageDialog(null,ex.toString());
       }
    }
    
}
