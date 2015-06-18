package br.com.ctesop.to;

public class EstadoTO {

    private int idEstado;
    private String nomeEstado;
    private String siglaEstado;
    private String statusEstado;

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

    public String getStatusEstado() {
        return statusEstado;
    }

    public void setStatusEstado(String statusEstado) {
        this.statusEstado = statusEstado;
    }

    //Para mudar o texto que será apresentado. Por exemplo, a sigla apresentada no CidadeGUI
    @Override
    public String toString() {
        return getSiglaEstado();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        } else {
            if(obj instanceof  EstadoTO){
                EstadoTO objEstado = (EstadoTO) obj;
                if(this.getIdEstado() == objEstado.getIdEstado()){
                    return true;
                }
            }
        }
        return false;
    }
    
    
}
