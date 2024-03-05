/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação4.ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028691
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administrativo f1 = new Administrativo("Lucas", 1977.61, "34525", "noit");
        Tecnico f2 = new Tecnico("Emanuel", 2142.34, "98453", 0.1);
        
        f1.exibeDados();
        f2.exibeDados();
        
        JOptionPane.showMessageDialog(null, "Salario de " + f1.getNome() + ": " + f1.ganhoAnual());
        JOptionPane.showMessageDialog(null, "Salario de " + f2.getNome() + ": " + f2.ganhoAnual());
        f2.addAumento(150.22);
        JOptionPane.showMessageDialog(null, "Salario de " + f2.getNome() + ": " + f2.ganhoAnual());
    }
    
}
