/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação3.ex04;

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
        Data nascimento = new Data(29, 07, 2004);
        Data hoje = new Data();
        
        System.out.println("Data de nascimento: " + nascimento.ToString());
        System.out.println("Hoje: " + hoje.ToString());
        
        hoje.proximoDia();
        System.out.println("Amanha: " + hoje.ToString());
        
        int c = nascimento.comparação(hoje.getDia(), hoje.getMes(), hoje.getAno());
        System.out.println(c);
        
        if (nascimento.isBissexto()) System.out.println("e bissexto");
        else System.out.println("nao e bissexto");
        
    }
    
}
