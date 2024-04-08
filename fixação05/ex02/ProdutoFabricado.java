/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixação05.ex02;

/**
 *
 * @author cg3028691
 */
public class ProdutoFabricado extends GerenteProdutos implements IProdutoFabricado {
    String ingredientes[], compra;
    
    public ProdutoFabricado (String nome) {
        super(nome, valor);
        this.ingredientes = GerenteProdutos.ingredientes();
        this.compra = GerenteProdutos.valorCompra();
    }
    
    @Override
    public int getNumeroIngredientes() {
        return this.ingredientes.length;
    }
        
    @Override
    public ProdutoComprado getIngrediente(int numero) {
        return new ProdutoComprado(ingredientes[numero].split(",")[0], Float.parseFloat(ingredientes[numero].split(",")[1]));
    };
    
    @Override
    public String getNome() {
        return this.compra.split(",")[0];
    }
    
    @Override
    public float getCusto() {
        float valor=0;
        for(String item : ingredientes) {
            if (item != null) valor += Float.parseFloat(item.split(",")[1]);
        }
        return valor;
    }
    
    public void transform() {
        float novoValor=0;
        for(int i=0; i<ingredientes.length; i++) {
            if (ingredientes[i] != null) {
                ProdutoComprado item = new ProdutoComprado(ingredientes[i].split(",")[0], Float.parseFloat(ingredientes[i].split(",")[1]));
                ProdutoFabricado novoItem = item.transform();
                if (novoItem != null) {
                    ingredientes[i] = novoItem.getNome() + "," + novoItem.getCusto();
                }
            }
        } 
    }
}
