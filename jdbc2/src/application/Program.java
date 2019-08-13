/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import db.DB;
import db.DbExceptions;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class Program {
    public static void main(String[] args){
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        try{
            conn = DB.getConnection();
            
            st = conn.createStatement();
            rs = st.executeQuery("select * from department");
            while(rs.next()){
                System.out.println(rs.getInt("Id")+", "+rs.getString("Name"));
            }
        }
        catch(SQLException e){
            throw new DbExceptions(e.getMessage()); 
        }
    }
}
