/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fixação05.ex03;

/**
 *
 * @author cg3028691
 */
public class TestaTributavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.depositar(1000);
        poupanca.sacar(500);
        System.out.println("Poupanca: " + poupanca.obterSaldo());

        ContaCorrente corrente = new ContaCorrente();
        System.out.println("Corrente: " + corrente.obterSaldo());
        System.out.println("Tributo: " + corrente.calculaTributos());
        
        corrente.depositar(2000);
        System.out.println("Corrente: " + corrente.obterSaldo());
        System.out.println("Tributo: " + corrente.calculaTributos());
        
        corrente.sacar(500);
        System.out.println("Corrente: " + corrente.obterSaldo());
        System.out.println("Tributo: " + corrente.calculaTributos());
        
        SeguroDeVida seguro = new SeguroDeVida();
        
        System.out.println("Seguro: " + seguro.calculaTributos());
    }
    
}
