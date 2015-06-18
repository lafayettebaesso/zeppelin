package br.com.ctesop.to;

import java.util.Date;

public class ContasReceberTO {

    private int idContasReceber;
    private int idVenda;
    private Date dataContasReceber;
    private String descricaoContasReceber;
    private int quantidadeParcelasContasReceber;
    private float valorTotalContasReceber;
    private String statusContasReceber;

    public int getIdContasReceber() {
        return idContasReceber;
    }

    public void setIdContasReceber(int idContasReceber) {
        this.idContasReceber = idContasReceber;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Date getDataContasReceber() {
        return dataContasReceber;
    }

    public void setDataContasReceber(Date dataContasReceber) {
        this.dataContasReceber = dataContasReceber;
    }

    public String getDescricaoContasReceber() {
        return descricaoContasReceber;
    }

    public void setDescricaoContasReceber(String descricaoContasReceber) {
        this.descricaoContasReceber = descricaoContasReceber;
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
