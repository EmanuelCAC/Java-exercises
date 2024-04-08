/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixação05.ex02;

/**
 *
 * @author cg3028691
 */
public class ProdutoComprado extends GerenteProdutos implements IProduto {
    String ingredientes[], compra;
    
    
    public ProdutoComprado(String nome, double valor) {
        super(nome, valor);
        this.ingredientes = GerenteProdutos.ingredientes();
        this.compra = GerenteProdutos.valorCompra();
    }
    
    @Override
    public float getCusto() {
        return Float.parseFloat(this.compra.split(",")[1]);
    }
    
    @Override
    public String getNome() {
        return this.compra.split(",")[0];
    }
    
    public ProdutoFabricado transform() {
        if (ingredientes != null) {
            float novoValor=0;
        for(String item : ingredientes) {
            if (item != null) novoValor += Float.parseFloat(item.split(",")[1]);
        }
        if (!(novoValor < this.getCusto())) return null;
        
        return new ProdutoFabricado(this.getNome());
        }
        return null;
    }
}
