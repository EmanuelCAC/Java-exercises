/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixação05.ex04;

/**
 *
 * @author cg3028691
 */
abstract class Produto implements Comparable <Produto> {
    String nome;
    int preco, carac_unica;
    
    public Produto(String nome, int preco, int carac_unica) {
        this.nome = nome;
        this.preco = preco;
        this.carac_unica = carac_unica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
