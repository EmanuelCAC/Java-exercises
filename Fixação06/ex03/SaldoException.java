/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação06.ex03;

/**
 *
 * @author cg3028691
 */
public class SaldoException extends Exception{
    
    @Override
    public String getMessage() {
        return "Saldo insuficiente!";
    }
}
