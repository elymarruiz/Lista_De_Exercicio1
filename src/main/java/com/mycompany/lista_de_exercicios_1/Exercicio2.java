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
public class Exercicio2 {
    public static void main (String args []){
        Scanner entrada = new Scanner (System.in);
        
        float num1, num2, num3, media;
        
        System.out.println("Informe o primeiro numero.");
        num1 = entrada.nextFloat();
       
        System.out.println("Informe o segundo numero.");
        num2 = entrada.nextFloat();
        
        System.out.println("Informe o terceiro numero.");
        num3 = entrada.nextFloat();
        
        media = (num1 + num2 + num3) / 3;
        
        System.out.println("Os numeros informados são " + num1 + "," + num2 + "," + num3);
        
        System.out.println("A média dos numeros é " + media);
    }
    
}
