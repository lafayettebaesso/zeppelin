package br.com.ctesop.to;

public class IngredienteTO {

    private int idIngrediente;
    private int idItemProducao;
    private String nomeIngrediente;
    private String descricaoIngrediente;

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public int getIdItemProducao() {
        return idItemProducao;
    }

    public void setIdItemProducao(int idItemProducao) {
        this.idItemProducao = idItemProducao;
    }

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public String getDescricaoIngrediente() {
        return descricaoIngrediente;
    }

    public void setDescricaoIngrediente(String descricaoIngrediente) {
        this.descricaoIngrediente = descricaoIngrediente;
    }
}
