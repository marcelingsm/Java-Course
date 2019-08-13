/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author USER
 */
public class ExeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        
        System.out.print("How many student for course A? ");
        int numA = sc.nextInt();
        for (int i = 0; i < numA; i++) {
            int id = sc.nextInt();
            a.add(id);
        }
        
        System.out.print("How many student for course B? ");
        int numB = sc.nextInt();
        for (int i = 0; i < numB; i++) {
            int id = sc.nextInt();
            b.add(id);
        }
        
        System.out.print("How many student for course C? ");
        int numC = sc.nextInt();
        for (int i = 0; i < numC; i++) {
            int id = sc.nextInt();
            c.add(id);
        }
    
        Set<Integer> total = new HashSet<>();
        total.addAll(a);
        total.addAll(b);
        total.addAll(c);
        
        System.out.println("TOTAL:" + total.size());
        
    }
    
    
}
