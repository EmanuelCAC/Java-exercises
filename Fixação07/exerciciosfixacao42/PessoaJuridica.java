/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosfixacao42;

/**
 *
 * @author julia
 */
public class PessoaJuridica extends Contato{
    private long cnpj;
    private long ie;
    private String razãoSocial;

    public PessoaJuridica(long cnpj, String nome){
        super(nome);
        this.cnpj = cnpj;
    }
    
    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public long getIe() {
        return ie;
    }

    public void setIe(long ie) {
        this.ie = ie;
    }

    public String getRazãoSocial() {
        return razãoSocial;
    }

    public void setRazãoSocial(String razãoSocial) {
        this.razãoSocial = razãoSocial;
    }
    
    
}
