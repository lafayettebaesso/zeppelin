package br.com.ctesop.to;

import java.util.Date;

public class FuncionarioTO extends PessoaTO {

    private int idFuncionario;
    private String nomeMaeFuncionario;
    private Date dataCadastroFuncionario;
    private float salarioFuncionario;
    private String statusFuncionario;

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
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
}
