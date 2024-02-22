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
public class ex01 {
    public static float RESTO(float n){
        return n%7;
    }
    
    public static float TRUNCA(float n){
        return 2.6f * n - 0.1f;
    }
    
    public static float QUOCIENTE(float n){
        return n/4;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        float  D, A, S, M=0;
        int diaDaSemana, ano, mes;
        D = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes: "));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
        
        switch (mes) {
            case 1 -> {
                M = 11;
                ano-=1;
            }
            case 2 -> {
                M = 12;
                ano-=1;
            }
            case 3 -> M = 1;
            case 4 -> M = 2;
            case 5 -> M = 3;
            case 6 -> M = 4;
            case 7 -> M = 5;
            case 8 -> M = 6;
            case 9 -> M = 7;
            case 10 -> M = 8;
            case 11 -> M = 9;
            case 12 -> M = 10;
            default -> JOptionPane.showMessageDialog(null, "Mês invalido");
        }
        A = ano%100;
        S = ano/100;
        
        diaDaSemana = (int)RESTO((TRUNCA(M) + D + A + QUOCIENTE(A) + QUOCIENTE(S) - (2f * S)));
        System.out.println(diaDaSemana);
    }
    
}
