/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação07.ex3andex04;

import javax.swing.JOptionPane;

/**
 *
 * @author julia
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long id;
        String nome;
        int n = 2;
        Agenda a = new Agenda(n);
        
        for(int i = 0; i < n; i++) {
            id = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF ou o CNPJ: "));
            nome = JOptionPane.showInputDialog("Digite o nome do seu contato: ");
        
            int digitos = Long.toString(id).length();
        
            switch(digitos){
                case 11 -> {
                    PessoaFisica pf = new PessoaFisica(id, nome);
                    a.adiciona(i,pf);
                }
                case 14 -> {
                    PessoaJuridica pj = new PessoaJuridica(id, nome);
                    a.adiciona(i,pj);
                }
                default -> JOptionPane.showMessageDialog(null,"CPF/CNPJ incorreto!"); 
            }
        }
        
        //a.visualizar();
        
        //nome = JOptionPane.showInputDialog("Digite o nome do seu contato: ");
        //System.out.println("Posicao: " + a.pesquisa(nome));
        
        //id = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF ou o CNPJ: "));
        //System.out.println("Posicao: " + a.pesquisa(id));
        
        //nome = JOptionPane.showInputDialog("Digite o nome do seu contato: ");
        //a.remove(nome);
        
        //a.visualizar();
        
        //id = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF ou o CNPJ: "));;
        //a.remove(id);
        
        //a.ordena();
        
        a.salvarAgenda("Agenda");
        switch (a.lerAgenda("Agenda", "emanuel")) {
            case PessoaFisica pf -> System.out.println("CPF: " + pf.getCpf() + " Nome: " + pf.getNome());
            case PessoaJuridica pj -> System.out.println("CNPJ: " + pj.getCnpj() + " Nome: " + pj.getNome());
            default -> System.out.println("Contato inexistente!");
        }
    }
}
