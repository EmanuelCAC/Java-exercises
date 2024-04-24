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
    
    public Shampoo(String nome, int preco, int irritabilidade) {
        super(nome, preco, irritabilidade);
    }
    
    /**
     *
     * @param a
     * @return
     */
    @Override
    public int compareTo(Produto a) {
        return (this.preco * this.carac_unica) - (a.preco * a.carac_unica);
    }
}
