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
public class ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anos, meses, dias, idade;
        
        System.out.println("Qual a sua idade em anos:  ");
        Scanner sc = new Scanner(System.in);
        anos = sc.nextInt();
        
        System.out.println("meses:  ");
        meses = sc.nextInt();
        
        System.out.println("e dias:  ");
        dias = sc.nextInt();
        
        idade = dias + (meses*30) + (anos*365);
        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias = " + idade + " dias.");
    }
    
}
