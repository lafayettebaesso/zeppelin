package br.com.ctesop.to;

import java.util.Date;

public class PessoaFisicaTO {

    private Integer idPessoaFisica;
    private String cpfPessoaFisica;
    private String rgPessoaFisica;
    private String orgaoEmissorRgPessoaFisica;
    private Date dataNascimentoPessoaFisica;
    private String inscricaoEstadualPessoaFisica;

    public Integer getIdPessoaFisica() {
        return idPessoaFisica;
    }

    public void setIdPessoaFisica(Integer idPessoaFisica) {
        this.idPessoaFisica = idPessoaFisica;
    }

    public String getCpfPessoaFisica() {
        return cpfPessoaFisica;
    }

    public void setCpfPessoaFisica(String cpfPessoaFisica) {
        this.cpfPessoaFisica = cpfPessoaFisica;
    }

    public String getRgPessoaFisica() {
        return rgPessoaFisica;
    }

    public void setRgPessoaFisica(String rgPessoaFisica) {
        this.rgPessoaFisica = rgPessoaFisica;
    }

    public String getOrgaoEmissorRgPessoaFisica() {
        return orgaoEmissorRgPessoaFisica;
    }

    public void setOrgaoEmissorRgPessoaFisica(String orgaoEmissorRgPessoaFisica) {
        this.orgaoEmissorRgPessoaFisica = orgaoEmissorRgPessoaFisica;
    }

    public Date getDataNascimentoPessoaFisica() {
        return dataNascimentoPessoaFisica;
    }

    public void setDataNascimentoPessoaFisica(Date dataNascimentoPessoaFisica) {
        this.dataNascimentoPessoaFisica = dataNascimentoPessoaFisica;
    }

    public String getInscricaoEstadualPessoaFisica() {
        return inscricaoEstadualPessoaFisica;
    }

    public void setInscricaoEstadualPessoaFisica(String inscricaoEstadualPessoaFisica) {
        this.inscricaoEstadualPessoaFisica = inscricaoEstadualPessoaFisica;
    }
}
