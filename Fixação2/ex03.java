/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel
 */
public class ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int minhaEscolha, systemEscolha;
        String escolhas[] = {"pedra", "papel", "tesoura"};
        Random rand = new Random();
        
        minhaEscolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha pedra(1), papel(2) ou tesoura(3): "));

        systemEscolha = rand.nextInt(3) + 1;
        
        if (minhaEscolha == systemEscolha) {
            JOptionPane.showMessageDialog(null,
                    "Minha escolha: " + escolhas[(minhaEscolha-1)] +
                    "\nEscolha do sistema: " + escolhas[(systemEscolha-1)] +
                    "\nResultado: Empate!"
            );
        }
        else if ((systemEscolha == 1 && minhaEscolha == 2) || (systemEscolha == 2 && minhaEscolha == 3) || (systemEscolha == 3 && minhaEscolha == 1)) {
            JOptionPane.showMessageDialog(null,
                    "Minha escolha: " + escolhas[(minhaEscolha-1)] +
                    "\nEscolha do sistema: " + escolhas[(systemEscolha-1)] +
                    "\nResultado: Vitoria!"
            );
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Minha escolha: " + escolhas[(minhaEscolha-1)] +
                    "\nEscolha do sistema: " + escolhas[(systemEscolha-1)] +
                    "\nResultado: Derrota!"
            );
        }
        
    
    }
    
}
