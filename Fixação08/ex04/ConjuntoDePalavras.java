/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação08.ex04;

import java.util.Arrays;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author cg3028691
 */
public class ConjuntoDePalavras {
    HashSet<String> list = new HashSet<>();
    int b = 0;
    
    public ConjuntoDePalavras() {
        while(this.b == 0) {
            String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
            this.list.add(palavra);
            this.b = JOptionPane.showConfirmDialog(null, "Adicionar mais palavras?");
        }
    }
    
    public boolean contemTodas(String palavras){
        String[] listPalavras = palavras.split(" ");
        int i = 0;
        boolean equal = true;
        
        while(equal && i != listPalavras.length) {
            equal = this.list.contains(listPalavras[i]);
            i++;
        }
        return equal;
    }
}
