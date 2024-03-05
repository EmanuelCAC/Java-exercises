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
public class Administrativo extends Assistente {
    private String turno;
    private String adicional = "noturno";

    public Administrativo (String nome, double salario, String matricula, String turno) {
        super(nome, salario, matricula);
        this.turno = turno;
    }

    @Override
    public double ganhoAnual() {
        if (this.turno == "dia" )  return this.getSalario() * 12;
        else if (this.turno == "noite" )  return (this.getSalario() * 12) * 1.12;
        else {
            JOptionPane.showMessageDialog(null, "Turno invalido!");
            return 0;
        }
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getAdicional() {
        return adicional;
    }
}
