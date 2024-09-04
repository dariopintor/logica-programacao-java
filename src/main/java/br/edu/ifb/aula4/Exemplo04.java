/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.aula4;

/**
 *
 * @author dariopintor
 */
public class Exemplo04 {

    public static void main(String[] args) {
        boolean a = 5 > 3;
        boolean b = 8 < 5;
        boolean resultado;

        resultado = a && b;

        System.out.println("A && B " + resultado);

        char sexo = 'm';
        int idade = 18;

        resultado = sexo == 'm' && idade >= 18;

        System.out.println("Pode se alistar? " + resultado);

        resultado = a || b;

        System.out.println("A || B " + resultado);
        
        resultado = a || b;

        System.out.println("negação de (A || B) " + !resultado);

    }
}
