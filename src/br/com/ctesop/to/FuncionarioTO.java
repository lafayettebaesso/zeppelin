package br.com.ctesop.to;

import java.util.Date;

public class FuncionarioTO extends PessoaTO {

    //A Classe "Integer" é para poder setar o código como nulo no banco de dados (em vez do "0" referente ao int)
    private Integer idFuncionario;
    private Integer idPessoa;
    private String nomeMaeFuncionario;
    private Date dataCadastroFuncionario;
    private float salarioFuncionario;
    private String statusFuncionario;

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }
    
    public String getNomeMaeFuncionario() {
        return nomeMaeFuncionario;
    }

    public void setNomeMaeFuncionario(String nomeMaeFuncionario) {
        this.nomeMaeFuncionario = nomeMaeFuncionario;
    }

    public Date getDataCadastroFuncionario() {
        return dataCadastroFuncionario;
    }

    public void setDataCadastroFuncionario(Date dataCadastroFuncionario) {
        this.dataCadastroFuncionario = dataCadastroFuncionario;
    }

    public float getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(float salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public String getStatusFuncionario() {
        return statusFuncionario;
    }

    public void setStatusFuncionario(String statusFuncionario) {
        this.statusFuncionario = statusFuncionario;
    }
    
    @Override
    public String toString() {
        return getNomePessoa();
    }
}
