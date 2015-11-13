package br.com.ctesop.to;

import java.util.Date;

public class RecebimentoTO {

    private Integer idRecebimento;
    private Integer idParcelasContasReceber;
    private float valorRecebimento;
    private float jurosRecebimento;
    private float descontoRecebimento;
    private Date dataRecebimento;

    public Integer getIdRecebimento() {
        return idRecebimento;
    }

    public void setIdRecebimento(Integer idRecebimento) {
        this.idRecebimento = idRecebimento;
    }

    public Integer getIdParcelasContasReceber() {
        return idParcelasContasReceber;
    }

    public void setIdParcelasContasReceber(Integer idParcelasContasReceber) {
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
}
