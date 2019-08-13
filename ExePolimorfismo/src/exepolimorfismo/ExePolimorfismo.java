/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepolimorfismo;

import exepolimorfismo.entities.ImportedProduct;
import exepolimorfismo.entities.Product;
import exepolimorfismo.entities.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ExePolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Numero de produtos:");
        int n = sc.nextInt();
        
        ArrayList<Product> productList = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Comum,Usado ou Importado(c,u,i)?");
            char produto = sc.next().charAt(0);
            System.out.print("Nome do produto:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Preco do produto");
            double price = sc.nextDouble();
            
            if(produto == 'u'){
                System.out.println("Data de fabricacao(dd/mm/aaaa)?");
                Date manufactureDate = sdf.parse(sc.next());
                productList.add(new UsedProduct(name,price,manufactureDate));
            
            }else if(produto == 'i'){
                System.out.println("Custo de Frete:");
                double customsFee = sc.nextDouble();
                productList.add(new ImportedProduct(name,price,customsFee));
            
            }else{
                productList.add(new Product(name,price));
            }
        }
        
        for (Product prod : productList) {
            System.out.println(prod.priceTag());
        }
    }
    
}
