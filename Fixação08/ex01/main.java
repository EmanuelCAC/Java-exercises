/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação08.ex01;

import java.util.ArrayList;
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
        ArrayList<Circulo> lista = new ArrayList<>();
        
        for (int i=1; i<=5; i++) {
            double r = Double.parseDouble(JOptionPane.showInputDialog("Raio do circulo " + i + ": "));
            lista.add(new Circulo(r));
        }
        System.out.println(lista.toString());
        
        for (int i=0; i<5; i++) {
            System.out.println(lista.get(i).area());
        }
    }
    
}
