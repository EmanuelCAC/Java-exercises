/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação08.ex02;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author cg3028691
 */
public class TesteHashSetCPF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<String> list = new HashSet<>();
        
        for(int i=1; i<=10; i++) {
            String cpf = JOptionPane.showInputDialog("Digite o " + i + " CPF: ");
            list.add(cpf);
        }
        
        System.out.println(list);
    }
    
}
