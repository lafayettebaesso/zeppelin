package br.com.ctesop.to;

public class ItemProducaoTO {

    private int idItemProducao;
    private int idOrdemProducao;
    private String nomeItemProducao;
    private float quantidadeItemProducao;

    public int getIdItemProducao() {
        return idItemProducao;
    }

    public void setIdItemProducao(int idItemProducao) {
        this.idItemProducao = idItemProducao;
    }

    public int getIdOrdemProducao() {
        return idOrdemProducao;
    }

    public void setIdOrdemProducao(int idOrdemProducao) {
        this.idOrdemProducao = idOrdemProducao;
    }

    public String getNomeItemProducao() {
        return nomeItemProducao;
    }

    public void setNomeItemProducao(String nomeItemProducao) {
        this.nomeItemProducao = nomeItemProducao;
    }

    public float getQuantidadeItemProducao() {
        return quantidadeItemProducao;
    }

    public void setQuantidadeItemProducao(float quantidadeItemProducao) {
        this.quantidadeItemProducao = quantidadeItemProducao;
    }
}
