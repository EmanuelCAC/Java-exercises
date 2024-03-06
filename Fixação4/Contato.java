/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação4.ex02;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028691
 */
public class Contato {
    String nome, CPF="", CNPJ="", endereco, email, dataNascimento="", estadoCivil="", inscricaoEstadual="", razaoSocial="", tipo;

    public Contato(String nome, String tipo, String identificacao, String endereco, String email, String data, String motivo) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.tipo = tipo;
        if (null == this.tipo) JOptionPane.showMessageDialog(null, "Tipo invalido"); else switch (this.tipo) {
            case "PF" -> {
                this.dataNascimento = data;
                this.estadoCivil = motivo;
                if (identificacao.length() == 11)this.CPF = identificacao;
                else JOptionPane.showMessageDialog(null, "CPF invalido!");

            }
            case "PJ" -> {
                this.inscricaoEstadual = data;
                this.razaoSocial = motivo;
                if (identificacao.length() == 14)this.CNPJ = identificacao;
                else JOptionPane.showMessageDialog(null, "CNPJ invalido!");

            }
            default -> JOptionPane.showMessageDialog(null, "Tipo invalido");
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
