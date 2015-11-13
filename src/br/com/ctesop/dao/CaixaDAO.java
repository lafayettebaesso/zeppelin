package br.com.ctesop.dao;

import br.com.ctesop.to.CaixaTO;

public class CaixaDAO extends GenericDAO {

    public static CaixaTO consultarCaixaAberto() throws Exception {
        return (CaixaTO) GenericDAO.CarregarRegistroFiltrandoPorColuna(CaixaTO.class, "statusCaixa", "Aberto");
    }

}
