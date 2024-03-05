/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação4.ex02;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cg3028691
 */
public class agenda {

    public static Contato addContato(String tipo) {
        switch (tipo) {
            case "pessoa fisica" -> {
                String CPF = JOptionPane.showInputDialog("CPF: ");
                String nome = JOptionPane.showInputDialog("nome: ");
                String endereco = JOptionPane.showInputDialog("endereco: ");
                String dataNascimento = JOptionPane.showInputDialog("dataNascimento: ");
                String email = JOptionPane.showInputDialog("email: ");
                String estadoCivil = JOptionPane.showInputDialog("estadoCivil: ");
                return (new PessoaFisica(CPF, nome, endereco, dataNascimento, email, estadoCivil));
            }
            case "pessoa juridica" -> {
                String CNPJ = JOptionPane.showInputDialog("CNPJ: ");
                String nome = JOptionPane.showInputDialog("nome: ");
                String endereco = JOptionPane.showInputDialog("endereco: ");
                String email = JOptionPane.showInputDialog("email: ");
                String inscricaoEstadual = JOptionPane.showInputDialog("dataNascimento: ");
                String razaoSocial = JOptionPane.showInputDialog("estadoCivil: ");
                return (new PessoaJuridica(CNPJ, nome, endereco, email, inscricaoEstadual, razaoSocial));
            }
            default -> {
                JOptionPane.showMessageDialog(null, "Tipo invalido!");
                break;
            }
        }
        error;
    }
    
    public static void main(String[] args) {
        var contatos = new ArrayList<Contato>();
        Contato Emanuel = addContato("pessoa fisica");
        contatos.add(Emanuel);
        
        System.out.println(contatos.get(0).getNome());
    }
    
}
