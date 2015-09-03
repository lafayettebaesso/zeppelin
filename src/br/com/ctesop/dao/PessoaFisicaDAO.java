package br.com.ctesop.dao;

import br.com.ctesop.to.PessoaFisicaTO;

public class PessoaFisicaDAO extends GenericDAO{

    //Para verificar se o CPF digitado já existe
    public static boolean verificaCpfExiste(String cpfPessoaFisica) throws Exception {
        return CarregarRegistroFiltrandoPorColuna(PessoaFisicaTO.class, "cpfPessoaFisica", cpfPessoaFisica) != null;
    }

    //Para verificar se o RG digitado já existe
    public static boolean verificaRgExiste(String rgPessoaFisica) throws Exception {
        return CarregarRegistroFiltrandoPorColuna(PessoaFisicaTO.class, "rgPessoaFisica", rgPessoaFisica) != null;
    }

    //Para verificar se a Inscrição Estadual de Pessoa Física já existe
    public static boolean verificaInscricaoEstadualExiste(String inscricaoEstadualPessoaFisica) throws Exception {
        return CarregarRegistroFiltrandoPorColuna(PessoaFisicaTO.class, "inscricaoEstadualPessoaFisica", inscricaoEstadualPessoaFisica) != null;
    }
}
