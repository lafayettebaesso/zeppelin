package br.com.ctesop.to;

import java.util.Date;

public class ParcelasContasReceberTO {

    private int idParcelasContasReceber;
    private int idContasReceber;
    private int numeroParcelasContasReceber;
    private float valorParcelasContasReceber;
    private Date vencimentoParcelasContasReceber;
    private String statusParcelasContasReceber;

    public int getIdParcelasContasReceber() {
        return idParcelasContasReceber;
    }

    public void setIdParcelasContasReceber(int idParcelasContasReceber) {
        this.idParcelasContasReceber = idParcelasContasReceber;
    }

    public int getIdContasReceber() {
        return idContasReceber;
    }

    public void setIdContasReceber(int idContasReceber) {
        this.idContasReceber = idContasReceber;
    }

    public int getNumeroParcelasContasReceber() {
        return numeroParcelasContasReceber;
    }

    public void setNumeroParcelasContasReceber(int numeroParcelasContasReceber) {
        this.numeroParcelasContasReceber = numeroParcelasContasReceber;
    }

    public float getValorParcelasContasReceber() {
        return valorParcelasContasReceber;
    }

    public void setValorParcelasContasReceber(float valorParcelasContasReceber) {
        this.valorParcelasContasReceber = valorParcelasContasReceber;
    }

    public Date getVencimentoParcelasContasReceber() {
        return vencimentoParcelasContasReceber;
    }

    public void setVencimentoParcelasContasReceber(Date vencimentoParcelasContasReceber) {
        this.vencimentoParcelasContasReceber = vencimentoParcelasContasReceber;
    }

    public String getStatusParcelasContasReceber() {
        return statusParcelasContasReceber;
    }

    public void setStatusParcelasContasReceber(String statusParcelasContasReceber) {
        this.statusParcelasContasReceber = statusParcelasContasReceber;
    }
}
