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
    
    public Biscoito(String nome, int preco) {
        super(nome, preco);
    }

    @Override
    public int compareTo(Object a) {
        return 1;
    }
    
}
