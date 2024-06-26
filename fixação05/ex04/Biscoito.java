/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixação05.ex04;

/**
 *
 * @author cg3028691
 */
public class Biscoito extends Produto {
    
    public Biscoito(String nome, int preco, int qtd_comp_cancerigenos) {
        super(nome, preco, qtd_comp_cancerigenos);
    }

    @Override
    public int compareTo(Produto a) {
        return (this.preco * this.carac_unica) - (a.preco * a.carac_unica);
    }
}
