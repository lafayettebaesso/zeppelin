package br.com.ctesop.to;

public class MovimentoCaixaTO {

    private Integer idMovimentoCaixa;
    private Integer idCaixa;
    private Integer idRecebimento;
    private Integer idPagamento;
    private float valorMovimentoCaixa;
    private String tipoMovimentoCaixa;

    public Integer getIdMovimentoCaixa() {
        return idMovimentoCaixa;
    }

    public void setIdMovimentoCaixa(Integer idMovimentoCaixa) {
        this.idMovimentoCaixa = idMovimentoCaixa;
    }

    public Integer getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(Integer idCaixa) {
        this.idCaixa = idCaixa;
    }

    public Integer getIdRecebimento() {
        return idRecebimento;
    }

    public void setIdRecebimento(Integer idRecebimento) {
        this.idRecebimento = idRecebimento;
    }

    public Integer getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Integer idPagamento) {
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
