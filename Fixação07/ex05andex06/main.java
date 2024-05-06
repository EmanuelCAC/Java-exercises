/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fixação07.ex05andex06;

import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno alunos[] = new Aluno[3];
        
        for(int i=0; i<3; i++) {
            String nome = JOptionPane.showInputDialog("DIgite o nome do aluno: ");
            String codigo = JOptionPane.showInputDialog("DIgite o codigo do aluno: ");
            int b1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota: "));
            int b2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota: "));
            alunos[i] = new Aluno(nome, codigo, b1, b2);
        }
        
       ESArquivo.escreverDataOutputStream(alunos, "alunos", false);
       String res = ESArquivo.lerDataInputStream("alunos");
       
       int x = 0;
       for (int i=0; i<3; i++) {
           int tamanhoNome = Character.getNumericValue(res.charAt(x));
           String nome = "";
           int b1, b2;
           
           for(int j=0; j<tamanhoNome; j++) {
               nome += res.charAt(x+j+2);
           }
           
           b1 = Character.getNumericValue(res.charAt(x+tamanhoNome+3));
           b2 = Character.getNumericValue(res.charAt(x+tamanhoNome+5));
           x = x+tamanhoNome+8;
           
           int media = (b1 + b2) / 2;
           
           if (media >= 6) System.out.println("Aluno " + nome + " aprovado!");
           else if (media < 4) System.out.println("Aluno " + nome + " reprovado!");
           else System.out.println("Aluno " + nome + " em IFA!");
        }
    }
}
