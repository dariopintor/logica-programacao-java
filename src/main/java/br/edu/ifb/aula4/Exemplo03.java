/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.aula4;

/**
 *
 * @author dariopintor
 */
public class Exemplo03 {
    public static void main(String[] args) {
        int a = 5, b = 5;
        
        boolean resultado;
        
        resultado = a==a;
        System.out.println(" a == a? " + resultado);
        
        resultado = a==b;
        System.out.println(" a == b? " + resultado);
        
        resultado = a != b;
        System.out.println(" a diferente b? " + resultado);
        
        resultado = a > b;
        System.out.println(" a maior b? " + resultado);
        
        resultado = a < b;
        System.out.println(" a menor b? " + resultado);
        
        resultado = a >= b;
        System.out.println(" a maior igual b? " + resultado);
        
        resultado = a <= b;
        System.out.println(" a menor igual b? " + resultado);
    }
}
