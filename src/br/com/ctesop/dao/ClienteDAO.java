package br.com.ctesop.dao;

import br.com.ctesop.to.ClienteTO;

public class ClienteDAO extends GenericDAO {

    public ClienteDAO() {
    }

    
    //Para verificar se o nome digitado em "Nome do cliente" já existe no banco de dados
    public static boolean verificaNomeExiste(String nomeCliente) throws Exception {
        return CarregarRegistroFiltrandoPorColuna(ClienteTO.class, "nomeCliente", nomeCliente) != null;
    }


}