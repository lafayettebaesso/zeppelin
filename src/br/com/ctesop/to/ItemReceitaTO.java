package br.com.ctesop.to;

public class ItemReceitaTO {

    private int idItemReceita;
    private int idReceita;
    private String nomeItemReceita;
    private float quantidadeReceita;

    public int getIdItemReceita() {
        return idItemReceita;
    }

    public void setIdItemReceita(int idItemReceita) {
        this.idItemReceita = idItemReceita;
    }

    public int getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

    public String getNomeItemReceita() {
        return nomeItemReceita;
    }

    public void setNomeItemReceita(String nomeItemReceita) {
        this.nomeItemReceita = nomeItemReceita;
    }

    public float getQuantidadeReceita() {
        return quantidadeReceita;
    }

    public void setQuantidadeReceita(float quantidadeReceita) {
        this.quantidadeReceita = quantidadeReceita;
    }
}
