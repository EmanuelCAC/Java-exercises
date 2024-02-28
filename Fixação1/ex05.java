/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação1;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public class ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, n1, n2, n3;
        
        System.out.println("Digite um numero de 100-999: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        n1 = n/100;
        n2 = (n/10 - n1*10);
        n3 = (n%10);
        
        System.out.println("Valor final: "+n3+n2+n1);
    }
    
}
