/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosfixacao42;

/**
 *
 * @author julia
 */
public class Agenda {
    private Contato c[];
    
    public Agenda(int tamanho){
        c = new Contato[tamanho];
    }
    
    public void adiciona(int p, Contato c){
        this.c[p] = c;
    }
    
    public void remove(long id){
        int posicao = pesquisa(id);
        Contato aux = new Contato("");
        
        for(int i = posicao; i < c.length - 1; i++){
            c[i] = c[i+1];
        }
        
        c[c.length - 1] = aux;
        
    }
    
    public void remove(String nome){
        int posicao = pesquisa(nome);
        Contato aux = new Contato("");
        
        for(int i = posicao; i < c.length - 1; i++){
            c[i] = c[i+1];
        }
        
        c[c.length - 1] = aux;    
    }
    
    public int pesquisa(long id){
        int i = 0;
        long chave;
        
        switch (c[i]) {
            case PessoaFisica pf -> chave = pf.getCpf();
            case PessoaJuridica pj -> chave = pj.getCnpj();
            default -> chave = 0;
        }
        
        while (chave != id){
            i++;
            switch (c[i]) {
                case PessoaFisica pf -> chave = pf.getCpf();
                case PessoaJuridica pj -> chave = pj.getCnpj();
                default -> chave = 0;
            }
        }
        
        return i;    
    }
    
    public int pesquisa(String nome){
        int i = 0;
        while (!c[i].getNome().equals(nome)){
            i++;
        }
        return i;
    }
    
    public void visualizar(){
        for (Contato c1 : c) {
            switch (c1) {
                case PessoaFisica pf -> System.out.println("CPF: " + pf.getCpf());
                case PessoaJuridica pj -> System.out.println("CNPJ: " + pj.getCnpj());
                default -> System.out.println("Contato inexistente!");
            }
            System.out.println("Nome: " + c1.getNome());
        }
    }
    
    public void ordena(){
        Contato aux;
        boolean troca;
        long chave, chave1;
        do {
            troca = false;
            for (int i = 0; i < c.length - 1; i++){
                switch (c[i]) {
                    case PessoaFisica pf -> chave = pf.getCpf();
                    case PessoaJuridica pj -> chave = pj.getCnpj();
                    default -> chave = 0;
                }
                
                switch (c[i+1]) {
                    case PessoaFisica pf1 -> chave1 = pf1.getCpf();
                    case PessoaJuridica pj1 -> chave1 = pj1.getCnpj();
                    default -> chave1 = 0;
                }
                if (chave > chave1){
                    aux = c[i];
                    c[i] = c[i+1];
                    c[i+1] = aux;
                    troca = true;
                }
            }
        } while(troca);
    }
}
