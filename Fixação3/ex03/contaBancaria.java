/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação3.ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel
 */
public class contaBancaria {
    String numeroConta;
    double saldo;
    
    contaBancaria (String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    void extrato() {
        JOptionPane.showMessageDialog(null, 
                    "Numero da conta: " + this.numeroConta +
                    "\nSaldo: " + this.saldo);
    }
    
    void saque(double saque) {
        if (saque <= this.saldo) {
            this.saldo -= saque;
            JOptionPane.showMessageDialog(null, "Saque no valor de: " + saque);
        } 
        else JOptionPane.showMessageDialog(null, "Saldo invalido!");
        this.extrato();
    }
    
    void deposito(double valor) {
        this.saldo += valor;
        JOptionPane.showMessageDialog(null, "Deposito no valor de: " + valor);
        this.extrato();
    }
}
