/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exefuncio;

import exefuncio.entities.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author USER
 */
public class ExeFuncio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = "C://temp//in.txt";
        
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            List<Employee> listEmplo = new ArrayList<>();
            
            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                Double salary = Double.parseDouble(fields[2]);
                
                Employee employee = new Employee(name,email,salary);
                listEmplo.add(employee);
                line = br.readLine();
            }
            System.out.println("Salary:");
            double salaryLimit = sc.nextDouble();
            
            List<String> list = listEmplo.stream()
                    .filter(x -> x.getSalary() > salaryLimit)
                    .map(x-> x.getEmail())
                    .sorted()
                    .collect(Collectors.toList());
            
            list.forEach(System.out::println);
            
           Double listSum = listEmplo.stream()
                    .filter(x -> x.getName().charAt(0)=='M')
                    .map(x -> x.getSalary())
                    .reduce(0.0 ,(x,y) -> x + y);
            System.out.println("SALARY SUM : " + listSum);
        
        
        
        }
        catch(IOException e){
            System.out.println("Erro:" + e.getMessage());
        }
    }
    
}
