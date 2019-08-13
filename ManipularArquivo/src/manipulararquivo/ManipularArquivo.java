/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulararquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import manipulararquivo.produto.Product;

/**
 *
 * @author USER
 */
public class ManipularArquivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = null;
        String path = "C:\\Users\\USER\\Documents\\Sourcefile.txt";
        List<Product> listProduct = new ArrayList();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            sc = new Scanner(br);
            while (sc.hasNextLine()) {
                String parts[] = sc.nextLine().split(",");
                String name = parts[0];
                double valor = Double.parseDouble(parts[1]);
                int amount = Integer.parseInt(parts[2]);
                Product product = new Product(name, valor, amount);
                listProduct.add(product);
            }

            //System.out.println(Arrays.toString(listProduct.toArray()));
            System.out.println(listProduct.toString());
            boolean success = new File(path, "\\out").mkdir();

        } catch (IOException e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
}
