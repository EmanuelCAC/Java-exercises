/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação07.ex01andex02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author cg3028691
 */
class ESArquivo {
    
    public static void escreverFileWriter(String texto, int num, boolean a) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("tabuada_" + num + ".txt", a);
            fw.write(texto);
        }
        catch (IOException e) {
            System.out.println("Erro durante a escrita no arquivo! \n\n Detalhes do erro: " + e.getMessage());
        }
        finally {
            if (fw != null) {
                try {
                    fw.close();
                }
                catch (IOException e) {
                    System.out.println("Erro durante o fechamento do arquivo \n\n Detalhes do erro: " + e.getMessage());
                }
            }
        }
    }
    
    public static String lerFileReader(String nomeArquivo) {
        int c = 0;
        String r = "";
        FileReader fr = null;
        try {
            fr = new FileReader(nomeArquivo + ".txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado! \n\n Detalhes do erro: " + e.getMessage());
        }
        if (fr != null) {
            do {
                r += (char) c;
                try {
                    c = fr.read();
                }
                catch (IOException e) {
                    System.out.println("Erro durante a leitura no arquivo! \n\n Detalhes do erro: " + e.getMessage());
                }
            } while (c != -1);
            try {
                fr.close();
            }
            catch (IOException e) {
                System.out.println("Erro durante o fechamento do arquivo \n\n Detalhes do erro: " + e.getMessage());
            }
        }
        return r;
    }
}
