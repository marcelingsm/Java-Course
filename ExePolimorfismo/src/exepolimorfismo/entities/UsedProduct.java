/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepolimorfismo.entities;

import java.util.Date;

/**
 *
 * @author USER
 */
public class UsedProduct extends Product {
    private Date manufactureDate;

    public UsedProduct() {       
    }

    public UsedProduct(String name, double price,Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    @Override
    public String priceTag(){
       return getName()+ " (used) $ " + String.format("%.2f", getPrice()) 
               + " (Manufacture date: " + manufactureDate + ")";
    }
}
