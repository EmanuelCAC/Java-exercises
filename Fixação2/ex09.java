/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação2;

import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel
 */
public class ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ordem, maior, menor, temp=0;
        
        ordem = Integer.parseInt(JOptionPane.showInputDialog("Qual a ordem da matriz: "));
        int[][] matriz = new int[ordem][ordem];
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero matriz["+i+"]["+j+"]: "));
            }
        }
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        maior = matriz[0][0];
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if (maior < matriz[i][j]) {
                    maior = matriz[i][j];
                    temp = i;
                } 
            }
        }
        
        menor = maior;
        for(int j = 0; j < matriz[temp].length; j++) {
            if (menor > matriz[temp][j]) {
                menor = matriz[temp][j];
            } 
        }
        
        System.out.println("MINIMAX = " + menor);
    }
    
}
