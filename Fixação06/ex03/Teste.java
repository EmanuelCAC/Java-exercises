/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação06.ex03;

/**
 *
 * @author cg3028691
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta = new Conta();
        
        conta.depositar(-100.03);
        conta.depositar(1200.58);
        conta.sacar(3000);
        
        System.out.println("Saldo: " + conta.getSaldo());
        
        conta.sacar(500);
        System.out.println("Saldo: " + conta.getSaldo());

    }
    
}
