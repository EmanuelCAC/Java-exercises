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

    public static int find(ArrayList<Contato> lista, String chave, String tipo) {
        switch (tipo) {
            case "CPF" -> {
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getCPF().equals(chave)) return i;
                }
            }
            case "CNPJ" -> {
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getCNPJ().equals(chave)) return i;
                }
            }
            case "nome" -> {
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getNome().equals(chave)) return i;
                }
            }
            default -> {
                JOptionPane.showMessageDialog(null, "Tipo invalido!");
                return lista.size();
            }
        }
        JOptionPane.showMessageDialog(null, chave + " nao existe!");
        for (Contato contato : lista) System.out.println(contato.getCPF());
        return lista.size();
    }
    
    public static ArrayList<Contato> ordena(ArrayList<Contato> contatos) {
        ArrayList<Contato> newContatos = new ArrayList<>();
        int tamanho = contatos.size();
        
        
        for (int i=0; i < tamanho; i++) {
            if ("PF".equals(contatos.get(0).getTipo())) {
                long menor = Long.parseLong(contatos.get(0).getCPF());
                for (Contato contato : contatos) {
                    if ("PF".equals(contato.getTipo())) {
                        if (Long.parseLong(contato.getCPF()) < menor) {
                            menor = Long.parseLong(contato.getCPF());
                        }
                    } 
                }
                newContatos.add(contatos.get(find(contatos, Long.toString(menor), "CPF")));
                contatos.remove(find(contatos, Long.toString(menor), "CPF"));
            }
            
        }
        
        tamanho = contatos.size();
        for (int i=0; i < tamanho; i++) {
            if ("PJ".equals(contatos.get(0).getTipo())) {
                long menor = Long.parseLong(contatos.get(0).getCNPJ());
                for (Contato contato : contatos) {
                    if (Long.parseLong(contato.getCNPJ()) < menor) {
                        menor = Long.parseLong(contato.getCNPJ());
                    }
                }
                newContatos.add(contatos.get(find(contatos, Long.toString(menor), "CNPJ")));
                contatos.remove(find(contatos, Long.toString(menor), "CNPJ"));
            }
            
        }
                
        return newContatos;
    }
    
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();
        Contato emanuel = new Contato("Emanuel", "PF", "54595780869", "Rua Luiz Lyria Martinez", "emanuelc279@gmail.com", "29/07/2004", "Solteiro");
        contatos.add(emanuel);
        Contato emanuel1 = new Contato("Emanuel1", "PF", "24595780869", "Rua Luiz Lyria Martinez", "emanuelc279@gmail.com", "29/07/2004", "Solteiro");
        contatos.add(emanuel1);
        Contato emanuel2 = new Contato("Emanuel2", "PJ", "34595780869345", "Rua Luiz Lyria Martinez", "emanuelc279@gmail.com", "29/07/2004", "Solteiro");
        contatos.add(emanuel2);
        Contato emanuel3 = new Contato("Emanuel3", "PJ", "34595780869305", "Rua Luiz Lyria Martinez", "emanuelc279@gmail.com", "29/07/2004", "Solteiro");
        contatos.add(emanuel3);
        Contato emanuel4 = new Contato("Emanuel4", "PF", "24595780868", "Rua Luiz Lyria Martinez", "emanuelc279@gmail.com", "29/07/2004", "Solteiro");
        contatos.add(emanuel4);
        
        contatos = ordena(contatos);
        for (Contato contato : contatos) System.out.println(contato.getNome());
    }
    
}
