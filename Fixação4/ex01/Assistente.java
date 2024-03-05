/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação4.ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028691
 */
public class Assistente extends Funcionario {
    private String matricula;

    public Assistente (String nome, double salario, String matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }
    @Override
    public void exibeDados() {
    JOptionPane.showMessageDialog(null,
            "Nome: " + this.getNome() +
            "\nMatricula: " + this.matricula +
            "\nSalario: " + this.getSalario());
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
