/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação07.ex05andex06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Emanuel
 */
public class ESArquivo {
    
    public static void escreverDataOutputStream(Aluno alunos[], String nomeArquivo, boolean a) {
        FileOutputStream fos;
        DataOutputStream dos = null;
        try {
            fos = new FileOutputStream(nomeArquivo + ".dat", a);
            dos = new DataOutputStream(fos);
        }
        catch(FileNotFoundException e) {
            System.out.println("Arquivo não encontrado! \n\n Detalhes do erro: " + e.getMessage());
        }
        if (dos != null) {
            for (Aluno aluno : alunos) {
                try {
                    dos.writeInt(aluno.nome.length());
                    dos.writeUTF(aluno.nome);
                    dos.writeInt(aluno.b1);
                    dos.writeInt(aluno.b2);
                }
                catch(IOException e) {
                    System.out.println("Erro durante a escrita do arquivo! \n\n Detalhes do erro: " + e.getMessage());
                }
            }
            try {
                dos.close();
            }
            catch(IOException e) {
                System.out.println("Erro durante o fechamento do arquivo! \n\n Detalhes do erro: " + e.getMessage());
            }
        }
    } 
    
    public static String lerDataInputStream(String nomeArquivo) {
        String r = "";
        FileInputStream fis;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream(nomeArquivo + ".dat");
            dis = new DataInputStream(fis);
        }
        catch(FileNotFoundException e) {
            System.out.println("Arquivo não encontrado! \n\n Detalhes do erro: " + e.getMessage());
        }
        if (dis != null) {
            boolean fimArquivo = false;
            while (!fimArquivo) {
                try {
                    r += dis.readInt() + "\n" + dis.readUTF() + "\n" + dis.readInt() + "\n" + dis.readInt() + "\n\n";
                }
                catch(EOFException e) {
                    fimArquivo = true;
                } 
                catch(IOException e) {
                    System.out.println("Erro durante a leitura do arquivo! \n\n Detalhes do erro: " + e.getMessage());
                } 
            }
            try {
                dis.close();
            }
            catch(IOException e) {
                System.out.println("Erro durante o fechamento do arquivo! \n\n Detalhes do erro: " + e.getMessage());
            }
        }
        return r;
    } 
}
