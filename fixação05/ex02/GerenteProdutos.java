/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixação05.ex02;

/**
 *
 * @author cg3028691
 */
public class GerenteProdutos{
    static String nome;
    static double valor;
    static public String produtos[] = {
        "Fluoreto de sodio,1.00", "Silica,0.50", "Sorbitol,0.80",
        "Agua,0.20", "Lauril eter sulfato de sodio,0.30", "Cocoamidopropil betaina,0.40",
        "Farinha de trigo,1.50", "Acucar0.80", "Chocolate em po,1.20"
    };
    
    public GerenteProdutos(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    
    public static String[] ingredientes() {
        String ingredientes[] = new String[3];
        switch (GerenteProdutos.nome) {
            case "pasta de dente" -> {
                ingredientes[0] = GerenteProdutos.produtos[0];
                ingredientes[1] = GerenteProdutos.produtos[1];
                ingredientes[2] = GerenteProdutos.produtos[2];
            }
            case "Sabonete liquido" -> {
                ingredientes[0] = GerenteProdutos.produtos[3];
                ingredientes[1] = GerenteProdutos.produtos[4];
                ingredientes[2] = GerenteProdutos.produtos[5];
            }
            case "Bolacha de Chocolate" -> {
                ingredientes[0] = GerenteProdutos.produtos[6];
                ingredientes[1] = GerenteProdutos.produtos[7];
                ingredientes[2] = GerenteProdutos.produtos[8];
            }
            case "Super pasta" -> {
                ingredientes[0] =  "pasta de dente,4.0";
                ingredientes[1] = "super,3.0";
            }
            default -> {
                return null;
            }
        }
        return ingredientes;
    };
    
    public static String valorCompra() {
        return (GerenteProdutos.nome + "," + GerenteProdutos.valor);
    }

    public static String getNomeProduto() {
        return nome;
    }

    public static void setNomeProduto(String nome) {
        GerenteProdutos.nome = nome;
    }

    public static double getValor() {
        return valor;
    }

    public static void setValor(double valor) {
        GerenteProdutos.valor = valor;
    }
    
    
}
