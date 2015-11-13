package br.com.ctesop.to;

public class ItemCompraIngredienteTO {

    private int idItemCompraIngrediente;
    private int idIngrediente;
    private int idCompra;
    private int quantidadeItemCompraIngrediente;
    private float valorItemCompraIngrediente;

    public int getIdItemCompraIngrediente() {
        return idItemCompraIngrediente;
    }

    public void setIdItemCompraIngrediente(int idItemCompraIngrediente) {
        this.idItemCompraIngrediente = idItemCompraIngrediente;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getQuantidadeItemCompraIngrediente() {
        return quantidadeItemCompraIngrediente;
    }

    public void setQuantidadeItemCompraIngrediente(int quantidadeItemCompraIngrediente) {
        this.quantidadeItemCompraIngrediente = quantidadeItemCompraIngrediente;
    }

    public float getValorItemCompraIngrediente() {
        return valorItemCompraIngrediente;
    }

    public void setValorItemCompraIngrediente(float valorItemCompraIngrediente) {
        this.valorItemCompraIngrediente = valorItemCompraIngrediente;
    }   
}
