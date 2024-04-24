/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixação05.ex04;
/**
 *
 * @author Emanuel
 */
public class Leite extends Produto {
    
    public Leite(String nome, int preco, int validade) {
        super(nome, preco, validade);
    }

    @Override
    public int compareTo(Produto a) {
        return  (this.preco * 100 / this.carac_unica) - (a.preco * 100 / a.carac_unica);
    }
}
