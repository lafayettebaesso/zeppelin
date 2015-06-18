package br.com.ctesop.to;

public class MovimentoCaixaTO {

    private int idMovimentoCaixa;
    private int idCaixa;
    private int idRecebimento;
    private int idPagamento;
    private float valorMovimentoCaixa;
    private String tipoMovimentoCaixa;

    public int getIdMovimentoCaixa() {
        return idMovimentoCaixa;
    }

    public void setIdMovimentoCaixa(int idMovimentoCaixa) {
        this.idMovimentoCaixa = idMovimentoCaixa;
    }

    public int getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }

    public int getIdRecebimento() {
        return idRecebimento;
    }

    public void setIdRecebimento(int idRecebimento) {
        this.idRecebimento = idRecebimento;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public float getValorMovimentoCaixa() {
        return valorMovimentoCaixa;
    }

    public void setValorMovimentoCaixa(float valorMovimentoCaixa) {
        this.valorMovimentoCaixa = valorMovimentoCaixa;
    }

    public String getTipoMovimentoCaixa() {
        return tipoMovimentoCaixa;
    }

    public void setTipoMovimentoCaixa(String tipoMovimentoCaixa) {
        this.tipoMovimentoCaixa = tipoMovimentoCaixa;
    }
}
