/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios_1;

import java.util.Scanner;

/**
 *
 * @author elymar.8221
 */
public class Exercicio7 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        
        int a, b;
                
        System.out.println("Informe o valor de A");
        a = entrada.nextInt();
        
        System.out.println("Informe o valor de B");
        b = entrada.nextInt();
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("O valor de A é " + a + " e o valor de B é " + b);
    }
    
}
