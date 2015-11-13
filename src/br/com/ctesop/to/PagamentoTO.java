package br.com.ctesop.to;

import java.util.Date;

public class PagamentoTO {

    private Integer idPagamento;
    private Integer idParcelasContasPagar;
    private float valorPagamento;
    private float jurosPagamento;
    private float descontoPagamento;
    private Date dataPagamento;

    public Integer getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Integer idPagamento) {
        this.idPagamento = idPagamento;
    }

    public Integer getIdParcelasContasPagar() {
        return idParcelasContasPagar;
    }

    public void setIdParcelasContasPagar(Integer idParcelasContasPagar) {
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
}
