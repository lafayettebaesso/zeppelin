package br.com.ctesop.to;

import java.util.Date;

public class FornecedorTO extends PessoaTO {

    //A Classe "Integer" é para poder setar o código como nulo no banco de dados (em vez do "0" referente ao int)
    private Integer idFornecedor;
    private Integer idPessoa;
    private Date dataCadastroFornecedor;
    private String statusFornecedor;

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Date getDataCadastroFornecedor() {
        return dataCadastroFornecedor;
    }

    public void setDataCadastroFornecedor(Date dataCadastroFornecedor) {
        this.dataCadastroFornecedor = dataCadastroFornecedor;
    }

    public String getStatusFornecedor() {
        return statusFornecedor;
    }

    public void setStatusFornecedor(String statusFornecedor) {
        this.statusFornecedor = statusFornecedor;
    }
    
    @Override
    public String toString() {
        return getNomePessoa();
    }
}
