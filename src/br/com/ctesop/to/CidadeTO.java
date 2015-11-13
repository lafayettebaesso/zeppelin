package br.com.ctesop.to;

public class CidadeTO {

    private int idCidade;
    private int idEstado;
    private String nomeCidade;
    private String statusCidade;

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getStatusCidade() {
        return statusCidade;
    }

    public void setStatusCidade(String statusCidade) {
        this.statusCidade = statusCidade;
    }

    @Override
    public String toString() {
        return getNomeCidade();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof CidadeTO)){
            return false;
        }
        CidadeTO cidade = (CidadeTO) obj;
         return getIdCidade() == cidade.getIdCidade();
    }
    
    
}
