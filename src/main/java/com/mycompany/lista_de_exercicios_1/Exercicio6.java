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
public class Exercicio6 {
    public static void main (String args[]){
        Scanner entrada = new Scanner (System.in);
        
        int num1, num2;
        
        System.out.println("Informe o primeiro numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        num2 = entrada.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " É maior do que " + num2);
        }else{
            System.out.println(num1 + " É menor do que " + num2);
        }
    }
}
