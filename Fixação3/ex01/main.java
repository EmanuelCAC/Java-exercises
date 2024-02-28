/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação3.ex01;

/**
 *
 * @author Emanuel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("cg3028691", "Emanuel", 7.5f, 8, 9);
        System.out.println("Media: " + aluno1.media());
        System.out.println("Nota que precisa: " + aluno1.rec());
    }
    
}
