/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepolimorfismo.entities;

/**
 *
 * @author USER
 */
public class ImportedProduct extends Product{
    private double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }
    
    @Override
    public String priceTag(){
        return super.priceTag()+"(Customs fee: $ "+ String.format("%.2f",customsFee)+")";
        
    }
}
