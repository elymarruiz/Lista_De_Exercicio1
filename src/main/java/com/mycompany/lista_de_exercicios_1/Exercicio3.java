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
public class Exercicio3 {
    public static void main (String args []){
        Scanner entrada = new Scanner (System.in);
     
        int num1;
        
        System.out.println("Infome um numero.");
        num1 = entrada.nextInt(); 
        
        if (num1%2==0){
            System.out.println("O numero " + num1 + " é par.");
        }
        else{
            System.out.println("O numero " + num1 + " é impar.");
        }
    }
}

















