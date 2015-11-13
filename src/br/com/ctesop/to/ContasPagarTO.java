package br.com.ctesop.to;

import java.util.Date;

public class ContasPagarTO {

    private Integer idContasPagar;
    private Integer idCompra;
    private Integer idFornecedor;
    private Date dataContasPagar;
    private int quantidadeParcelasContasPagar;
    private float valorTotalContasPagar;
    private String statusContasPagar;

    public Integer getIdContasPagar() {
        return idContasPagar;
    }

    public void setIdContasPagar(Integer idContasPagar) {
        this.idContasPagar = idContasPagar;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public Date getDataContasPagar() {
        return dataContasPagar;
    }

    public void setDataContasPagar(Date dataContasPagar) {
        this.dataContasPagar = dataContasPagar;
    }

    public int getQuantidadeParcelasContasPagar() {
        return quantidadeParcelasContasPagar;
    }

    public void setQuantidadeParcelasContasPagar(int quantidadeParcelasContasPagar) {
        this.quantidadeParcelasContasPagar = quantidadeParcelasContasPagar;
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
