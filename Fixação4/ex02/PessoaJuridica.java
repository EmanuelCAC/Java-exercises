/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação4.ex02;

/**
 *
 * @author cg3028691
 */
public class PessoaJuridica extends Contato {
    String CPF, endereco, email, inscricaoEstadual, razaoSocial;
    
    public PessoaJuridica (String CPF, String nome, String endereco, String email, String inscricaoEstadual, String razaoSocial) {
        super(nome);
        this.CPF = CPF;
        this.endereco = endereco;
        this.inscricaoEstadual = inscricaoEstadual;
        this.email = email;
        this.razaoSocial = razaoSocial;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}
