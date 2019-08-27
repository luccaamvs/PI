/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucca.pbordin
 */
public class Ex01 {

    public static void main(String[] args) {
        // vetor criação

        int v[] = new int[10];      

        //designar posição e valores
        for (int i = 0; i < 10; i++) {

            v[i] = i;
            
            System.out.println("Ordem numerica:");
            System.out.println(" ");
            System.out.println(v[i]);
        }
        for (int i = 9; i >= 0; i--) {
            
            int temp = v[i];
            
            System.out.println("Ordem reversa:");
            System.out.println(" ");
            System.out.println(temp);  
        }
}}
