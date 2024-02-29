/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação3.ex03;

/**
 *
 * @author Emanuel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        contaBancaria conta1 = new contaBancaria("123432", 3587.63);
        
        conta1.extrato();
        conta1.saque(1500);
        conta1.deposito(200);
    }
    
}
