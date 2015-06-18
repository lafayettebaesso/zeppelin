package br.com.ctesop.to;

public class ContasPagarTO {

    private int idContasPagar;
    private int idCompra;
    private String descricaoContasPagar;
    private float valorTotalContasPagar;
    private String statusContasPagar;

    public int getIdContasPagar() {
        return idContasPagar;
    }

    public void setIdContasPagar(int idContasPagar) {
        this.idContasPagar = idContasPagar;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getDescricaoContasPagar() {
        return descricaoContasPagar;
    }

    public void setDescricaoContasPagar(String descricaoContasPagar) {
        this.descricaoContasPagar = descricaoContasPagar;
    }

    public float getValorTotalContasPagar() {
        return valorTotalContasPagar;
    }

    public void setValorTotalContasPagar(float valorTotalContasPagar) {
        this.valorTotalContasPagar = valorTotalContasPagar;
    }

    public String getStatusContasPagar() {
        return statusContasPagar;
    }

    public void setStatusContasPagar(String statusContasPagar) {
        this.statusContasPagar = statusContasPagar;
    }
}
