/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votecount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author USER
 */
public class VoteCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String path = "C:\\temp\\in.txt";
        Map<String, Integer> countVote = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String candidato = br.readLine();
            while (candidato != null) {
                
                String[] fields = candidato.split(",");
                String name = fields[0];
                Integer vote = Integer.parseInt(fields[1]);
                if (countVote.containsKey(name)) {
                    countVote.put(name, countVote.get(name) + vote);
                } else {
                    countVote.put(name, vote);
                }
                candidato = br.readLine();
            }
            for(String key : countVote.keySet()){
                System.out.println(key + ": " + countVote.get(key));
            }
        } catch (IOException e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }

}
