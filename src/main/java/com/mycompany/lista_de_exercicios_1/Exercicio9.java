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
public class Exercicio9 {
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);
        
        float kg, mts, imc;
        
        System.out.println("Informe o seu peso");
        kg = entrada.nextFloat();
        
        System.out.println("Informe a sua altura");
        mts = entrada.nextFloat();
        
        imc = kg / (mts * mts);
        
        System.out.println("O seu indice corporal é " + imc);
    }
}
