/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifb.aula3;

/**
 *
 * @author dariopintor
 */
public class Exemplo04 {
    public static void main(String[] args) {
        String idade = "18";
        String altura = "1.78";
        String num1 = "2";
        String num2 = "3.5";
        
        double num3 = Integer.parseInt(num1) + Double.parseDouble(num2);
        System.out.println(num3);
        
        // Conversão de String para long
        String numLong = "12345678910";
        long valorLong = Long.parseLong(numLong);
        System.out.println("Valor long: " + valorLong);

        // Conversão de String para float
        String numFloat = "123.45";
        float valorFloat = Float.parseFloat(numFloat);
        System.out.println("Valor float: " + valorFloat);

        // Conversão de String para short
        String numShort = "123";
        short valorShort = Short.parseShort(numShort);
        System.out.println("Valor short: " + valorShort);

        // Conversão de String para byte
        String numByte = "127";
        byte valorByte = Byte.parseByte(numByte);
        System.out.println("Valor byte: " + valorByte);

        
    }
    
}
