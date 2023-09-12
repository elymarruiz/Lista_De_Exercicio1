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
public class Exercicio5 {
    public static void main (String args[]){
        Scanner entrada = new Scanner (System.in);
        
        int num1;
    
        System.out.println("Digite o numero da tabuada que deseja:");
        num1 = entrada.nextInt();
        
        for (int i = 0; i <= 10; i++){
        
            System.out.println(num1 + " x " + i + " = " + (num1*i));
        }
    
    }
    
}
