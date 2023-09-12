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
public class Exercicio4 {
    public static void main (String args[]){
        Scanner entrada = new Scanner (System.in);
        
        int maximo;
       
        System.out.println("Informe o valor maximo: ");
        maximo = entrada.nextInt();
        
        while (maximo >= 0){
            System.out.println(maximo);
            maximo = maximo - 1;
        }
    }   
}
