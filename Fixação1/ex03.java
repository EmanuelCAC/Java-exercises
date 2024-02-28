/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação1;
import java.util.Scanner;
/**
 *
 * @author Emanuel
 */
public class ex03 {
    
    public static void main(String[] args) {
        float sena, quina, quadra, v;

        System.out.println("Qual o valor do premio: ");
        Scanner sc = new Scanner(System.in);
        v = sc.nextFloat();
        
        sena = v * 0.6f;
        quina = v * 0.3f;
        quadra = v * 0.1f;
        
        System.out.println("Sena(60%): "+sena);
        System.out.println("Quina(30%): "+quina);
        System.out.println("Quadra(10%): "+quadra);
        
    }
}
