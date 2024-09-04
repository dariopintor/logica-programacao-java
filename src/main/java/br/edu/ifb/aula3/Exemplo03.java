/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.aula3;

/**
 *
 * @author dariopintor
 */
public class Exemplo03 {
    public static void main(String[] args) {
        int num1 = 3;
        long num2 = 4;
        double num3 = 4;
        byte num4 = 5;
        int resultado;
        long num5 = 10000000;
        
        
       // resultado = num1+num3;//casting explicito
        //resultado = num1+num4; //casting implicito
        resultado =  num1+(int)num5;
        System.out.println(""+resultado);
    }
}
