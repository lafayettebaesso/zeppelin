package br.com.ctesop.dao;

import br.com.ctesop.to.EstadoTO;

public class EstadoDAO extends GenericDAO {

    //Para verificar se o nome digitado em "Nome do estado" já existe
    public static boolean verificaNomeExiste(String nomeEstado) throws Exception {
        return CarregarRegistroFiltrandoPorColuna(EstadoTO.class, "nomeEstado", nomeEstado) != null;
    }

    //Para verificar se o sigla digitada em "Sigla do estado" já existe
    public static boolean verificaSiglaExiste(String siglaEstado) throws Exception {
        return CarregarRegistroFiltrandoPorColuna(EstadoTO.class, "siglaEstado", siglaEstado) != null;
    }

    
}
