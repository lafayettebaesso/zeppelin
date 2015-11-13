package br.com.ctesop.to;

import java.util.Date;

public class VendaTO {

    private int idVenda;
    private int idCliente;
    private int numeroMesaVenda;
    private float valorTotalVenda;
    private Date dataVenda;
    private String statusVenda;

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getNumeroMesaVenda() {
        return numeroMesaVenda;
    }

    public void setNumeroMesaVenda(int numeroMesaVenda) {
        this.numeroMesaVenda = numeroMesaVenda;
    }

    public float getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(float valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(String statusVenda) {
        this.statusVenda = statusVenda;
    }
}
