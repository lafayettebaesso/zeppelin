package br.com.ctesop.to;

import java.util.Date;

public class ParcelasContasPagarTO {

    private int idParcelasContasPagar;
    private int idContasPagar;
    private int numeroParcelasContasPagar;
    private float valorParcelasContasPagar;
    private Date vencimentoParcelasContasPagar;
    private String statusParcelasContasPagar;

    public int getIdParcelasContasPagar() {
        return idParcelasContasPagar;
    }

    public void setIdParcelasContasPagar(int idParcelasContasPagar) {
        this.idParcelasContasPagar = idParcelasContasPagar;
    }

    public int getIdContasPagar() {
        return idContasPagar;
    }

    public void setIdContasPagar(int idContasPagar) {
        this.idContasPagar = idContasPagar;
    }

    public int getNumeroParcelasContasPagar() {
        return numeroParcelasContasPagar;
    }

    public void setNumeroParcelasContasPagar(int numeroParcelasContasPagar) {
        this.numeroParcelasContasPagar = numeroParcelasContasPagar;
    }

    public float getValorParcelasContasPagar() {
        return valorParcelasContasPagar;
    }

    public void setValorParcelasContasPagar(float valorParcelasContasPagar) {
        this.valorParcelasContasPagar = valorParcelasContasPagar;
    }

    public Date getVencimentoParcelasContasPagar() {
        return vencimentoParcelasContasPagar;
    }

    public void setVencimentoParcelasContasPagar(Date vencimentoParcelasContasPagar) {
        this.vencimentoParcelasContasPagar = vencimentoParcelasContasPagar;
    }

    public String getStatusParcelasContasPagar() {
        return statusParcelasContasPagar;
    }

    public void setStatusParcelasContasPagar(String statusParcelasContasPagar) {
        this.statusParcelasContasPagar = statusParcelasContasPagar;
    }
    
    
}
