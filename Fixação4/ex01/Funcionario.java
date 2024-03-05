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
public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void addAumento(double valor) {
        this.salario += valor;
    }
    
    public double ganhoAnual() {
        return this.salario * 12;
    }
    
    public void exibeDados() {
        JOptionPane.showMessageDialog(null,
                "Nome: " + this.nome +
                "\nSalario: " + this.salario);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}


