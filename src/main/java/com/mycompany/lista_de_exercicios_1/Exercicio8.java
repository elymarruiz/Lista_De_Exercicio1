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
public class Exercicio8 {
    public static void main (String args[]){
        Scanner entrada = new Scanner (System.in);
        
        float nota1, nota2, nota3, nota4, media;
        
        System.out.println("Informe a primeira nota");
        nota1 = entrada.nextFloat();
        
        System.out.println("Informe a segunda nota");
        nota2 = entrada.nextFloat();
        
        System.out.println("Informe a terceira nota");
        nota3 = entrada.nextFloat();
        
        System.out.println("Informe a quarta nota");
        nota4 = entrada.nextFloat();
        
        media = nota1 + nota2 + nota3 + nota4;
        
        System.out.println("Media final do aluno " + media);
        
        if (media >= 7.0){
            System.out.println("Aluno aprovado!");   
        }else{
            System.out.println("Aluno reprovado!");
        }
    }
}
