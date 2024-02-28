/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class ex06 {

    public static float adicao(float x, float y) {
        return x + y;
    };
    
    public static float subtracao(float x, float y) {
        return x - y;
    };
    
    public static float multiplicacao(float x, float y) {
        return x * y;
    };
    
    public static float divisao(float x, float y) {
        return x / y;
    };
    public static void main(String[] args) {
        // TODO code application logic here
        float x, y;
        
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("#.0");
      
        System.out.println("Entre com o primeiro valor: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        
        System.out.println("Entre com o segundo valor: ");
        y = sc.nextFloat();
        
        System.out.println(x + " + " + y + " = " + df.format(adicao(x,y)));
        System.out.println(x + " - " + y + " = " + df.format(subtracao(x,y)));
        System.out.println(x + " * " + y + " = " + df.format(multiplicacao(x,y)));
        System.out.println(x + " / " + y + " = " + df.format(divisao(x,y)));
    }
    
}
