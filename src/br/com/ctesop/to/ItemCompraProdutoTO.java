package br.com.ctesop.to;

public class ItemCompraProdutoTO {

    private Integer idItemCompraProduto;
    private Integer idProduto;
    private Integer idCompra;
    private Integer quantidadeItemCompraProduto;
    private float valorItemCompraProduto;

    public Integer getIdItemCompraProduto() {
        return idItemCompraProduto;
    }

    public void setIdItemCompraProduto(Integer idItemCompraProduto) {
        this.idItemCompraProduto = idItemCompraProduto;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getQuantidadeItemCompraProduto() {
        return quantidadeItemCompraProduto;
    }

    public void setQuantidadeItemCompraProduto(Integer quantidadeItemCompraProduto) {
        this.quantidadeItemCompraProduto = quantidadeItemCompraProduto;
    }

    public float getValorItemCompraProduto() {
        return valorItemCompraProduto;
    }

    public void setValorItemCompraProduto(float valorItemCompraProduto) {
        this.valorItemCompraProduto = valorItemCompraProduto;
    }
}
