package br.com.ctesop.to;

import java.util.Date;

public class ClienteTO extends PessoaTO {

    private Integer idCliente;
    private Integer idPessoa;
    private String localTrabalhoCliente;
    private Date dataCadastroCliente;
    private String statusCliente;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public Integer getIdPessoa() {
        return idPessoa;
    }

    @Override
    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getLocalTrabalhoCliente() {
        return localTrabalhoCliente;
    }

    public void setLocalTrabalhoCliente(String localTrabalhoCliente) {
        this.localTrabalhoCliente = localTrabalhoCliente;
    }

    public Date getDataCadastroCliente() {
        return dataCadastroCliente;
    }
    
    public void setDataCadastroCliente(Date dataCadastroCliente) {
        this.dataCadastroCliente = dataCadastroCliente;
    }
    
    public String getStatusCliente() {
        return statusCliente;
    }

    public void setStatusCliente(String statusCliente) {
        this.statusCliente = statusCliente;
    }
    
    @Override
    public String toString() {
        return getNomePessoa();
    }
}