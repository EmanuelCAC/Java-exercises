/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação07.ex07;

import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel
 */
public class mian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ao = JOptionPane.showInputDialog("Nome do arquivo para ser copiado: ");
        String ad = JOptionPane.showInputDialog("Nome da copia: ");
        int b = JOptionPane.showInternalConfirmDialog(null, "Sobreescrever caso arquivo de destino ja exista?");
        
        ESArquivo.copiarArquivo(ao, ad, b==1);
    }
    
}
