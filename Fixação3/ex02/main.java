/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação3.ex02;

/**
 *
 * @author Emanuel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario f1 = new Funcionario("Joao", "A12", "02/02/2000", "55544433322", 2800);
        
        System.out.println("Slario: " + f1.salario);
        
        f1.recebeAumento(120.12);
        System.out.println("Novo salario: " + f1.salario);
        
        System.out.println("Novo salario anual: " + f1.calculaGanhoAnual());

    }
    
}
