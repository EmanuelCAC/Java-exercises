/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação1;

import java.util.Scanner;

/**
 *
 * @author cg3028691
 */
public class ex01 {

    public static void main(String[] args) {
        
        float temp, newTemp;
        
        System.out.println("Digite a temperatura em Fahrenheit: ");
        Scanner sc = new Scanner(System.in);
        temp = sc.nextFloat();
        
        newTemp = 5f / 9f * (temp - 32f);
        
        System.out.println(newTemp);
    }
}
