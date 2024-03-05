/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação4.ex02;

/**
 *
 * @author cg3028691
 */
public class PessoaFisica extends Contato {
    String CPF, endereco, dataNascimento, email, estadoCivil;
    
    public PessoaFisica (String CPF, String nome, String endereco, String dataNascimento, String email, String estadoCivil) {
        super(nome);
        this.CPF = CPF;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.estadoCivil = estadoCivil;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    
}
