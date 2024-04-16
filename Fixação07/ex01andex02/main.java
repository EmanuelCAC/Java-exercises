/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação07.ex01andex02;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028691
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        String texto = "";
        
        for (int i=1; i <= 10; i++) {
            texto += num + " * " + i + " = " + (num*i) + " \n";
        }
        
        ESArquivo.escreverFileWriter(texto, num, false);
        System.out.println(ESArquivo.lerFileReader("tabuada_" + num));
    }
    
}
