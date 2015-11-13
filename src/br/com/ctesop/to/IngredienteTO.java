package br.com.ctesop.to;

public class IngredienteTO {

    private Integer idIngrediente;
    //private int idItemProducao;
    private String nomeIngrediente;
    private float precoCustoIngrediente;
    private Integer quantidadeIngrediente;
    private String statusIngrediente;

    public Integer getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(Integer idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public float getPrecoCustoIngrediente() {
        return precoCustoIngrediente;
    }

    public void setPrecoCustoIngrediente(float precoCustoIngrediente) {
        this.precoCustoIngrediente = precoCustoIngrediente;
    }

    public Integer getQuantidadeIngrediente() {
        return quantidadeIngrediente;
    }

    public void setQuantidadeIngrediente(Integer quantidadeIngrediente) {
        this.quantidadeIngrediente = quantidadeIngrediente;
    }

    public String getStatusIngrediente() {
        return statusIngrediente;
    }

    public void setStatusIngrediente(String statusIngrediente) {
        this.statusIngrediente = statusIngrediente;
    }

    
}