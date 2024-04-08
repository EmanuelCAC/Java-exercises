/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fixação05.ex01;

/**
 *
 * @author cg3028691
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculadoraCientifica c = new CalculadoraCientifica();
        
        System.out.println("Soma: " + c.soma(1, 2));
        System.out.println("Subtracao: " + c.subtração(1, 2));
        System.out.println("Multiplicacao: " + c.multiplicação(1, 2));
        System.out.println("Divisao: " + c.divisão(1, 2));
        System.out.println("Raiz: " + c.raiz(4));
        System.out.println("Potencia: " + c.potencia(4, 2));
        
        
    }
    
}
