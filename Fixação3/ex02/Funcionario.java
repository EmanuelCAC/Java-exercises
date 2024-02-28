/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação3.ex02;

/**
 *
 * @author Emanuel
 */
public class Funcionario {
    String nome, departamento, dataIngresso, RG;
    double salario;
    
    Funcionario(
            String nome,
            String departamento,
            String dataIngresso,
            String RG,
            double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.dataIngresso = dataIngresso;
        this.RG = RG;
        this.salario = salario;
    }
    
    void recebeAumento(double aumento) {
        this.salario += aumento;
    }
    
    double calculaGanhoAnual() {
        return this.salario * 12;
    }
}
