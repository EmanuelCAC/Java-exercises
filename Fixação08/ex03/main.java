/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação08.ex03;

/**
 *
 * @author cg3028691
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadastroAluno cadastros = new CadastroAluno();
        for(int i=0; i<10; i++) {
            cadastros.adicionar();
        }
        cadastros.imprimir();
        
        System.out.println("");
        cadastros.ordenar();
        cadastros.imprimir();
    }
    
}
