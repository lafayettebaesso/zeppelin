package br.com.ctesop.dao;

import br.com.ctesop.to.PessoaJuridicaTO;

public class PessoaJuridicaDAO extends GenericDAO {

    //Para verificar se o CNPJ digitado já existe
    public static boolean verificaCnpjExiste(String cnpjPessoaJuridica) throws Exception {
        return CarregarRegistroFiltrandoPorColuna(PessoaJuridicaTO.class, "cnpjPessoaJuridica", cnpjPessoaJuridica) != null;
    }
}
