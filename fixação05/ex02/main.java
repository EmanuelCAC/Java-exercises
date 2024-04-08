/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fixação05.ex02;

/**
 *
 * @author cg3028691
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here      
        ProdutoComprado p1 = new ProdutoComprado("pasta de dente", 3.6);
        System.out.println(p1.transform().getCusto());
        
        ProdutoComprado p2 = new ProdutoComprado("Super pasta", 10);
        System.out.println(p2.transform().getCusto());
        
        ProdutoFabricado p3 = p2.transform();
        p3.transform();
        System.out.println(p3.getCusto());
    };
    
}
