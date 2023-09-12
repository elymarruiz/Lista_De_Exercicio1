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
public class Exercicio1 {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in); 
        
        float num1, num2, resultado;
        
        System.out.println("Informe o primeiro numero ");
        num1 = entrada.nextFloat();
        
        System.out.println("Informe o segundo numero");
        num2 = entrada.nextFloat();
        
        resultado = num1 + num2;
        
        System.out.println("O resultado é " + resultado);
    }
}
