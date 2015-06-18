package br.com.ctesop.to;

import java.util.Date;

public class RecebimentoTO {

    private int idRecebimento;
    private int idParcelasContasReceber;
    private float valorRecebimento;
    private float jurosRecebimento;
    private float descontoRecebimento;
    private Date dataRecebimento;
    private String statusRecebimento;

    public int getIdRecebimento() {
        return idRecebimento;
    }

    public void setIdRecebimento(int idRecebimento) {
        this.idRecebimento = idRecebimento;
    }

    public int getIdParcelasContasReceber() {
        return idParcelasContasReceber;
    }

    public void setIdParcelasContasReceber(int idParcelasContasReceber) {
        this.idParcelasContasReceber = idParcelasContasReceber;
    }

    public float getValorRecebimento() {
        return valorRecebimento;
    }

    public void setValorRecebimento(float valorRecebimento) {
        this.valorRecebimento = valorRecebimento;
    }

    public float getJurosRecebimento() {
        return jurosRecebimento;
    }

    public void setJurosRecebimento(float jurosRecebimento) {
        this.jurosRecebimento = jurosRecebimento;
    }

    public float getDescontoRecebimento() {
        return descontoRecebimento;
    }

    public void setDescontoRecebimento(float descontoRecebimento) {
        this.descontoRecebimento = descontoRecebimento;
    }

    public Date getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(Date dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public String getStatusRecebimento() {
        return statusRecebimento;
    }

    public void setStatusRecebimento(String statusRecebimento) {
        this.statusRecebimento = statusRecebimento;
    }
}
