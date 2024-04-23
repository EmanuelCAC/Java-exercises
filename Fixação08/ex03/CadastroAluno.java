/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação08.ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author cg3028691
 */
public class CadastroAluno {
    ArrayList<Aluno> list = new ArrayList<>();
    
    public void adicionar() {
        String nome, matricula, curso;
        nome = JOptionPane.showInputDialog("Nome do aluno: ");
        matricula = JOptionPane.showInputDialog("Matricula do aluno: ");
        curso = JOptionPane.showInputDialog("Curso do aluno: ");
        this.list.add(new Aluno(matricula, nome, curso));
    }
    
    public void ordenar() {
        Collections.sort(list, Comparator.comparing(Aluno::getMatricula));
    }
    
    public void imprimir() {
        for (Aluno a : list) {
            System.out.println(a.nome + " - " + a.matricula);
        }
    }
}
