package br.com.ctesop.to;

import java.util.Date;

public class ParcelasContasPagarTO {

    private Integer idParcelasContasPagar;
    private Integer idContasPagar;
    private int numeroParcelasContasPagar;
    private float valorParcelasContasPagar;
    private Date vencimentoParcelasContasPagar;
    private String statusParcelasContasPagar;

    public Integer getIdParcelasContasPagar() {
        return idParcelasContasPagar;
    }

    public void setIdParcelasContasPagar(Integer idParcelasContasPagar) {
        this.idParcelasContasPagar = idParcelasContasPagar;
    }

    public Integer getIdContasPagar() {
        return idContasPagar;
    }

    public void setIdContasPagar(Integer idContasPagar) {
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
