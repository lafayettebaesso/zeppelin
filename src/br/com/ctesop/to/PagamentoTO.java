package br.com.ctesop.to;

import java.util.Date;

public class PagamentoTO {

    private int idPagamento;
    private int idParcelasContasPagar;
    private float valorPagamento;
    private float jurosPagamento;
    private float descontoPagamento;
    private Date dataPagamento;
    private String statusPagamento;

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public int getIdParcelasContasPagar() {
        return idParcelasContasPagar;
    }

    public void setIdParcelasContasPagar(int idParcelasContasPagar) {
        this.idParcelasContasPagar = idParcelasContasPagar;
    }

    public float getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(float valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public float getJurosPagamento() {
        return jurosPagamento;
    }

    public void setJurosPagamento(float jurosPagamento) {
        this.jurosPagamento = jurosPagamento;
    }

    public float getDescontoPagamento() {
        return descontoPagamento;
    }

    public void setDescontoPagamento(float descontoPagamento) {
        this.descontoPagamento = descontoPagamento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
}
