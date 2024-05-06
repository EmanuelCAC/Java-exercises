/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação07.ex3andex04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Emanuel
 */
public class ESArquivo {
    public static void escreverFileWriter(String texto, String nomeArquivo, boolean a) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(nomeArquivo + ".txt", a);
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
    
    public static String lerBufferedReader(String nomeArquivo, String nome) {
        String r = "";
        String linha = "";
        FileReader fr;
        BufferedReader br = null;
        try {
            fr = new FileReader(nomeArquivo + ".txt");
            br = new BufferedReader(fr);
        }
        catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado! \n\n Detalhes do erro: " + e.getMessage());
        }
        if (br != null) {
            do {
                if (linha.contains(nome)) {
                    r += linha + " \n";
                }
                try {
                    linha = br.readLine();
                }
                catch (IOException e) {
                    System.out.println("Erro durante a leitura no arquivo! \n\n Detalhes do erro: " + e.getMessage());
                }
            } while (linha != null);
            try {
                br.close();
            }
            catch (IOException e) {
                System.out.println("Erro durante o fechamento do arquivo \n\n Detalhes do erro: " + e.getMessage());
            }
        }
        return r;
    }
}
