/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação06.ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028691
 */
public class main {

    public static void main(String[] args) {
        boolean loop = true;
        while(loop) {
            try {
                int x = Integer.parseInt(JOptionPane. showInputDialog("Digite um numero inteiro: "));
                System.out.println(x + " ** 2 = " + x*x);
                loop = false;
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opa… Acho que você se enganou! Digite novamente…");
            }
        }  
    }
    
}
