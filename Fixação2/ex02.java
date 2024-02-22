/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação2;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028691
 */
public class ex02 {

    public static void main(String[] args) {
        // TODO code application logic here
        int dia, mes, ano;
        boolean v;
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes: "));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
        
        if ((ano%400 == 0 || ano%4 == 0) && ano%100 != 0) {
            switch (mes){
                case 1, 3, 5, 7, 8, 10, 12 -> v = dia <= 31 && dia > 0;
                case 4, 6, 9, 11 -> v = dia <= 30 && dia > 0;
                case 2 -> v = dia <= 29 && dia > 0;
                default -> v = false;
            }
        }
        else {
            switch (mes){
                case 1, 3, 5, 7, 8, 10, 12 -> v = dia <= 31 && dia > 0;
                case 4, 6, 9, 11 -> v = dia <= 30 && dia > 0;
                case 2 -> v = dia <= 28 && dia > 0;
                default -> v = false;
            }
        }
        
        
        if (v) System.out.println("Valido!");
        else System.out.println("Invalido!");
    }
    
}
