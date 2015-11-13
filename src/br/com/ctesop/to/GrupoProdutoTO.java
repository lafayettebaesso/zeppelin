package br.com.ctesop.to;

public class GrupoProdutoTO {

    private int idGrupoProduto;
    private String nomeGrupoProduto;
    private String statusGrupoProduto;

    public int getIdGrupoProduto() {
        return idGrupoProduto;
    }

    public void setIdGrupoProduto(int idGrupoProduto) {
        this.idGrupoProduto = idGrupoProduto;
    }

    public String getNomeGrupoProduto() {
        return nomeGrupoProduto;
    }

    public void setNomeGrupoProduto(String nomeGrupoProduto) {
        this.nomeGrupoProduto = nomeGrupoProduto;
    }

    public String getStatusGrupoProduto() {
        return statusGrupoProduto;
    }

    public void setStatusGrupoProduto(String statusGrupoProduto) {
        this.statusGrupoProduto = statusGrupoProduto;
    }
    
     @Override
    public String toString() {
        return getNomeGrupoProduto();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof GrupoProdutoTO)){
            return false;
        }
        GrupoProdutoTO gp = (GrupoProdutoTO) obj;
         return getIdGrupoProduto() == gp.getIdGrupoProduto();
    }
}
