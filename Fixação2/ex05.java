/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação2;

import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel
 */
public class ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String senha;
        boolean tam, maiu=false, minu=false, num=false, esp=false;
        char especial[] = {'!', '@', '#', '$', '%', '&'};
        
        senha = JOptionPane.showInputDialog(null, "Digite uma senha: ");
        
        tam = senha.length() >= 8;
        
        for(int i = 0; i < senha.length(); i++) {
            if (senha.charAt(i) >= 'A' && senha.charAt(i) <= 'Z') {
                maiu = true;
                break;
            }
            maiu = false;
        }
        
        for(int i = 0; i < senha.length(); i++) {
            if (senha.charAt(i) >= 'a' && senha.charAt(i) <= 'z') {
                minu = true;
                break;
            }
            minu = false;
        }
        
        for(int i = 0; i < senha.length(); i++) {
            if (senha.charAt(i) >= '0' && senha.charAt(i) <= '9') {
                num = true;
                break;
            }
            num = false;
        }
        
        for(int i = 0; i < senha.length(); i++) {
            for(int j = 0; j < 5; j++){
                if (senha.charAt(i) == especial[j]) {
                    esp = true;
                    break;
                }
                esp = false;
            }
        }
        
        JOptionPane.showMessageDialog(null,
                "Tamanho >= 8: " + tam +
                "\nLetra maiuscula: " + maiu +
                "\nLetra minuscula: " + minu +
                "\nNumero: " + num +
                "\nCaractere especial: " + esp);
        
    }
    
}
