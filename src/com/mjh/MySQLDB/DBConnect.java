/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjh.MySQLDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mike
 */
public class DBConnect {
       private static Connection conn = null;
       private static String driver = "com.mysql.jdbc.Driver";
       private static String db = "U04FFh";
       private static String url = "jdbc:mysql://52.206.157.109/" + db;
       private static String user = "U04FFh";
       private static String pass = "53688223001"; 
       
       public static Connection connect() throws SQLException{
           try{
                 Class.forName(driver).newInstance();
           }catch(ClassNotFoundException cnfe){
               System.err.println("Error: "+cnfe.getMessage());
           }
           catch(InstantiationException ie){
               System.err.println("Error: "+ie.getMessage());
           }catch(IllegalAccessException iae){
               System.err.println("Error: "+iae.getMessage()); 
           }
        conn = DriverManager.getConnection(url,user,pass);
        return conn;
       }
       
       public static Connection getConnection() throws SQLException, ClassNotFoundException{
            if(conn !=null && !conn.isClosed())
                return conn;
            connect();
            return conn;    
       } 
        
}
