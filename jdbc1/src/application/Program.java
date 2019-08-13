/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import db.DB;
import java.sql.Connection;

/**
 *
 * @author USER
 */
public class Program {
    public static void main(String[] args){
        
        Connection conn = DB.getConnection();
        DB.closeConnection();
        
    }
}
