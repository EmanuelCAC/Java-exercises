/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel
 */
public class ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, randN, c=0;
        Random rand = new Random();
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1-99: "));
        
        do {
            randN = rand.nextInt(99) + 1;
            c++;
        } while(n != randN);
        
        JOptionPane.showMessageDialog(null, "O numero que escolhido foi: " + randN + "\nTentativas: " + c);
    }
    
}
