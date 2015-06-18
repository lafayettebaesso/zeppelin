package br.com.ctesop.to;

import java.sql.Date;

public class CaixaTO {

    private int idCaixa;
    private Date dataAberturaCaixa;
    private Date dataFechamentoCaixa;
    private float saldoCaixa;
    private String statusCaixa;

    public int getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }

    public Date getDataAberturaCaixa() {
        return dataAberturaCaixa;
    }

    public void setDataAberturaCaixa(Date dataAberturaCaixa) {
        this.dataAberturaCaixa = dataAberturaCaixa;
    }

    public Date getDataFechamentoCaixa() {
        return dataFechamentoCaixa;
    }

    public void setDataFechamentoCaixa(Date dataFechamentoCaixa) {
        this.dataFechamentoCaixa = dataFechamentoCaixa;
    }

    public float getSaldoCaixa() {
        return saldoCaixa;
    }

    public void setSaldoCaixa(float saldoCaixa) {
        this.saldoCaixa = saldoCaixa;
    }

    public String getStatusCaixa() {
        return statusCaixa;
    }

    public void setStatusCaixa(String statusCaixa) {
        this.statusCaixa = statusCaixa;
    }
}
