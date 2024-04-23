/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação08.ex05;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author cg3028691
 */
public class TesteMapaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Aluno> cadastros = new HashMap<>();
        
        for(int i=0; i<5; i++) {
            String nome, matricula, curso;
            nome = JOptionPane.showInputDialog("Nome do aluno: ");
            matricula = JOptionPane.showInputDialog("Matricula do aluno: ");
            curso = JOptionPane.showInputDialog("Curso do aluno: ");
            Aluno a = new Aluno(matricula, nome, curso);
            cadastros.put(matricula, a);
        }
        
        String search = JOptionPane.showInputDialog("Digite a matricula para pesquisar: ");
        
        if(cadastros.containsKey(search)) {
            System.out.println(cadastros.get(search).nome);
            System.out.println(cadastros.get(search).matricula);
        } else {
            System.out.println("Aluno nao encontrado!");
        }
    }
}
