/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsgroupsrl.linksadmin2_0.modelo;

/**
 *
 * @author Brey
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    public String db = "linksadmin01";
    public String url = "jdbc:mysql://db4free.net/"+ db;
    public String user = "jbggroupsrl";
    public String pass = "mob.BGJ.123";
    public final String success = "Conexion exitosa a la BD! :)";
    public final String failure = "No se ha podido conectar a la BD! Error: ";


    
    
    public Connection testConnection(){
           Connection link = null;
        
       try{

           Class.forName("com.mysql.jdbc.Driver");

           link = DriverManager.getConnection(this.url, this.user, this.pass);
           
           JOptionPane.showMessageDialog(null, success);
                   
       }catch(ClassNotFoundException | SQLException ex){

           JOptionPane.showMessageDialog(null, failure + ex);

       }


       return link;
       }
    
    
   public Connection Conectar(){
       
        Connection link = null;
        
       try{

           Class.forName("com.mysql.jdbc.Driver");

           link = DriverManager.getConnection(this.url, this.user, this.pass);
           
       }catch(ClassNotFoundException | SQLException ex){

           JOptionPane.showMessageDialog(null, failure + ex);

       }


       return link;

   }

}
