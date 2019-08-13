/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author USER
 */
public class DbExceptions extends RuntimeException {
    
    public DbExceptions(String msg){
        super(msg);
    }
}
