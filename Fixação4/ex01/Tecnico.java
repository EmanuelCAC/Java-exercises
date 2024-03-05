/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação4.ex01;

import java.text.DecimalFormat;

/**
 *
 * @author cg3028691
 */
public class Tecnico extends Assistente {
    private double bonus=1;

    public Tecnico (String nome, double salario, String matricula, double bonus) {
        super(nome, salario, matricula);
        this.bonus += bonus;
    }

    @Override
    public double ganhoAnual() {
        return (this.getSalario() * 12) * this.bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
