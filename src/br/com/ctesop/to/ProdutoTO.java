package br.com.ctesop.to;

public class ProdutoTO {

    private Integer idProduto;
    private Integer idGrupoProduto;
    private String nomeProduto;
    private float precoVendaProduto;
    private float precoCustoProduto;
    private Integer quantidadeProduto;
    private String statusProduto;

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getIdGrupoProduto() {
        return idGrupoProduto;
    }

    public void setIdGrupoProduto(Integer idGrupoProduto) {
        this.idGrupoProduto = idGrupoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getPrecoVendaProduto() {
        return precoVendaProduto;
    }

    public void setPrecoVendaProduto(float precoVendaProduto) {
        this.precoVendaProduto = precoVendaProduto;
    }

    public float getPrecoCustoProduto() {
        return precoCustoProduto;
    }

    public void setPrecoCustoProduto(float precoCustoProduto) {
        this.precoCustoProduto = precoCustoProduto;
    }

    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(Integer quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getStatusProduto() {
        return statusProduto;
    }

    public void setStatusProduto(String statusProduto) {
        this.statusProduto = statusProduto;
    }
}