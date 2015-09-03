package br.com.ctesop.dao;

import br.com.ctesop.to.PessoaTO;

public class PessoaDAO extends GenericDAO {

    //Para verificar se o nome digitado em "Nome da pessoa" já existe
    public static boolean verificaNomeExiste(String nomePessoa) throws Exception {
        return CarregarRegistroFiltrandoPorColuna(PessoaTO.class, "nomePessoa", nomePessoa) != null;
    }
}