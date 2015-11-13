package br.com.ctesop.to;

import java.sql.Date;

public class PessoaTO {

    private Integer idPessoa;
    private Integer idPessoaFisica;
    private Integer idPessoaJuridica;
    private Integer idCidade;
    private String nomePessoa;
    private String enderecoPessoa;
    private String celularPessoa;
    private String telefonePessoa;
    private String telefoneComercialPessoa;
    private String sexoPessoa;

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Integer getIdPessoaFisica() {
        return idPessoaFisica;
    }

    public void setIdPessoaFisica(Integer idPessoaFisica) {
        this.idPessoaFisica = idPessoaFisica;
    }

    public Integer getIdPessoaJuridica() {
        return idPessoaJuridica;
    }

    public void setIdPessoaJuridica(Integer idPessoaJuridica) {
        this.idPessoaJuridica = idPessoaJuridica;
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(String enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }

    public String getCelularPessoa() {
        return celularPessoa;
    }

    public void setCelularPessoa(String celularPessoa) {
        this.celularPessoa = celularPessoa;
    }

    public String getTelefonePessoa() {
        return telefonePessoa;
    }

    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }

    public String getTelefoneComercialPessoa() {
        return telefoneComercialPessoa;
    }

    public void setTelefoneComercialPessoa(String telefoneComercialPessoa) {
        this.telefoneComercialPessoa = telefoneComercialPessoa;
    }

    public String getSexoPessoa() {
        return sexoPessoa;
    }

    public void setSexoPessoa(String sexoPessoa) {
        this.sexoPessoa = sexoPessoa;
    }
    
    @Override
    public String toString() {
        return getNomePessoa();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof PessoaTO)){
            return false;
        }
        PessoaTO pessoa = (PessoaTO) obj;
         return getIdPessoa() == pessoa.getIdPessoa();
    }
}