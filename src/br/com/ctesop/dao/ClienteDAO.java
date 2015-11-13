package br.com.ctesop.dao;

import br.com.ctesop.to.ClienteTO;

public class ClienteDAO extends GenericDAO {

    //Para verificar se o nome digitado em "Nome da cidade" já existe
    public static boolean verificaCpfExiste(String cpfPessoaFisica) throws Exception {
        return CarregarRegistroFiltrandoPorColuna(ClienteTO.class, "cpfPessoaFisica", cpfPessoaFisica) != null;
    }
}