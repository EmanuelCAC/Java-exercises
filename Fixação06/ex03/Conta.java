/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação06.ex03;


public class Conta {
    private double saldo = 0;
    
    public void sacar(double valor) {
        try {
            if (valor > this.saldo) {
                throw new SaldoException();
            }
            this.saldo -= valor;
        }
        catch(SaldoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void depositar(double valor) {
        try {
            if (valor > 0) {
                this.saldo += valor;
            } else {
                throw new Exception("Valor invalido");
            } 
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
