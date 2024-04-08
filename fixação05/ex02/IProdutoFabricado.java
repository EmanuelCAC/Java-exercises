/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixação05.ex02;

/**
 *
 * @author cg3028691
 */
public interface IProdutoFabricado extends IProduto {
    int getNumeroIngredientes();
    ProdutoComprado getIngrediente(int numero);
}
