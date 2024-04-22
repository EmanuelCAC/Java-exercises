/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixação05.ex04;

/**
 *
 * @author cg3028691
 */
public class Shampoo extends Produto{
    int irritabilidade = 1;
    
    public Shampoo(String nome, int preco, int irritabilidade) {
        super(nome, preco);
        this.irritabilidade = irritabilidade;
    }
    
    @Override
    public int compareTo(Object a) {
        if(this.nome.compareTo(a.nome) != 0) {
            return this.nome.compareTo(a.nome);
        }
        else {
            return (this.preco * this.irritabilidade) - (a.preco * a.irritabilidade);
        }
    }
}
