/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação07.ex07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Emanuel
 */
public class ESArquivo {
    
    public static void copiarArquivo(String arquivoOrigem, String arquivoDestino, boolean a) {
        int c = 0;
        String r = "";
        FileReader fr = null;
        try {
            fr = new FileReader(arquivoOrigem + ".txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado! \n\n Detalhes do erro: " + e.getMessage());
        }
        if (fr != null) {
            do {
                r += (char) c;
                try {
                    c = fr.read();
                }
                catch (IOException e) {
                    System.out.println("Erro dutante a leitura do arquivo! \n\n Detalhes do erro: " + e.getMessage());
                }
            } while (c != -1);
            try  {
                fr.close();
            }
            catch (IOException e) {
                System.out.println("Erro dutante o fechamento do arquivo! \n\n Detalhes do erro: " + e.getMessage());
            }
        }
        
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivoDestino + ".txt", a);
            fw.write(r);
        }
        catch (IOException e) {
            System.out.println("Erro dutante a escrita do arquivo! \n\n Detalhes do erro: " + e.getMessage());
        }
        if (fw != null) {
            try {
                fw.close();
            }
            catch (IOException e) {
                System.out.println("Erro dutante o fechamento do arquivo! \n\n Detalhes do erro: " + e.getMessage());
            }
        }
    }
}
