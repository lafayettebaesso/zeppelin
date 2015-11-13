package br.com.ctesop.to;

import java.util.Date;

public class ContasReceberTO {

    private Integer idContasReceber;
    private Integer idVenda;
    private Integer idCliente;
    private Date dataContasReceber;
    private int quantidadeParcelasContasReceber;
    private float valorTotalContasReceber;
    private String statusContasReceber;

    public Integer getIdContasReceber() {
        return idContasReceber;
    }

    public void setIdContasReceber(Integer idContasReceber) {
        this.idContasReceber = idContasReceber;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    
    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public Date getDataContasReceber() {
        return dataContasReceber;
    }

    public void setDataContasReceber(Date dataContasReceber) {
        this.dataContasReceber = dataContasReceber;
    }

    public int getQuantidadeParcelasContasReceber() {
        return quantidadeParcelasContasReceber;
    }

    public void setQuantidadeParcelasContasReceber(int quantidadeParcelasContasReceber) {
        this.quantidadeParcelasContasReceber = quantidadeParcelasContasReceber;
    }

    public float getValorTotalContasReceber() {
        return valorTotalContasReceber;
    }

    public void setValorTotalContasReceber(float valorTotalContasReceber) {
        this.valorTotalContasReceber = valorTotalContasReceber;
    }

    public String getStatusContasReceber() {
        return statusContasReceber;
    }

    public void setStatusContasReceber(String statusContasReceber) {
        this.statusContasReceber = statusContasReceber;
    }
}
