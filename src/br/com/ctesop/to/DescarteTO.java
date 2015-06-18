package br.com.ctesop.to;

import java.util.Date;

public class DescarteTO {

    private int idDescarte;
    private int idIngrediente;
    private int quantidadeDescarte;
    private Date dataDescarte;

    public int getIdDescarte() {
        return idDescarte;
    }

    public void setIdDescarte(int idDescarte) {
        this.idDescarte = idDescarte;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public int getQuantidadeDescarte() {
        return quantidadeDescarte;
    }

    public void setQuantidadeDescarte(int quantidadeDescarte) {
        this.quantidadeDescarte = quantidadeDescarte;
    }

    public Date getDataDescarte() {
        return dataDescarte;
    }

    public void setDataDescarte(Date dataDescarte) {
        this.dataDescarte = dataDescarte;
    }
}
