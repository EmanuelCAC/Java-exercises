/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fixação05.ex04;

/**
 *
 * @author Emanuel
 */
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shampoo[] s = new Shampoo[3];
        Biscoito[] b = new Biscoito[3];
        Leite[] l = new Leite[3];
        
        s[0] = new Shampoo("s1", 10, 1);
        s[1] = new Shampoo("s2", 20, 2);
        s[2] = new Shampoo("s3", 40, 0);
        
        b[0] = new Biscoito("b1", 3, 4);
        b[1] = new Biscoito("b2", 7, 1);
        b[2] = new Biscoito("b3", 4, 2);
        
        l[0] = new Leite("l1", 5, 5);
        l[1] = new Leite("l2", 6, 7);
        l[2] = new Leite("l3", 8, 2);
        
        if (s[0].compareTo(s[1]) > 0) {
            if (s[1].compareTo(s[2]) > 0 ) {
                System.out.println("Custo-beneficio: " + s[2].getNome());
            }
            else {
                System.out.println("Custo-beneficio: " + s[1].getNome());
            }
        } else {
            if (s[0].compareTo(s[2]) > 0 ) {
                System.out.println("Custo-beneficio: " + s[2].getNome());
            }
            else {
                System.out.println("Custo-beneficio: " + s[0].getNome());
            }
        }
        
        if (b[0].compareTo(b[1]) > 0) {
            if (b[1].compareTo(b[2]) > 0 ) {
                System.out.println("Custo-beneficio: " + b[2].getNome());
            }
            else {
                System.out.println("Custo-beneficio: " + b[1].getNome());
            }
        } else {
            if (b[0].compareTo(b[2]) > 0 ) {
                System.out.println("Custo-beneficio: " + b[2].getNome());
            }
            else {
                System.out.println("Custo-beneficio: " + b[0].getNome());
            }
        }
        
        if (l[0].compareTo(l[1]) > 0) {
            if (l[1].compareTo(l[2]) > 0 ) {
                System.out.println("Custo-beneficio: " + l[2].getNome());
            }
            else {
                System.out.println("Custo-beneficio: " + l[1].getNome());
            }
        } else {
            if (l[0].compareTo(l[2]) > 0 ) {
                System.out.println("Custo-beneficio: " + l[2].getNome());
            }
            else {
                System.out.println("Custo-beneficio: " + l[0].getNome());
            }
        }  
    }   
}
