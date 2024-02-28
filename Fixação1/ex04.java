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
public class ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float j, c, i;
        int t;
        
        System.out.println("Digite o capital inicial: ");
        Scanner sc = new Scanner(System.in);
        c = sc.nextFloat();
        
        System.out.println("Digite a taxa de juros(%): ");
        i = sc.nextFloat();
        i = i/100f;
        
        System.out.println("Digite o tempo da aplciacao: ");
        t = sc.nextInt();
        
        j = c*i*t;
        
        System.out.println("Valor do juros: R$ " + j);
    }
    
}
