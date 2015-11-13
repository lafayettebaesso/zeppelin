package br.com.ctesop.to;

public class ItemVendaTO {

    private Integer idItemVenda;
    private Integer idVenda;
    private Integer idProduto;
    private Integer quantidadeItemVendaProduto;
    private float valorItemVendaProduto;

    public Integer getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(Integer idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getQuantidadeItemVendaProduto() {
        return quantidadeItemVendaProduto;
    }

    public void setQuantidadeItemVendaProduto(Integer quantidadeItemVendaProduto) {
        this.quantidadeItemVendaProduto = quantidadeItemVendaProduto;
    }

    public float getValorItemVendaProduto() {
        return valorItemVendaProduto;
    }

    public void setValorItemVendaProduto(float valorItemVendaProduto) {
        this.valorItemVendaProduto = valorItemVendaProduto;
    }
}
