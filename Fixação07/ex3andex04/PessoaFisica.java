/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fixação07.ex3andex04;

import java.util.Date;

/**
 *
 * @author julia
 */
public class PessoaFisica extends Contato{
    private long cpf;
    private Date dataNascimento;
    private String estadoCivil;

    public PessoaFisica(long cpf, String nome){
        super(nome);
        this.cpf = cpf;
    }
    
    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    
}
