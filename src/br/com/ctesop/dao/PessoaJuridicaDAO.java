package br.com.ctesop.dao;

import br.com.ctesop.to.PessoaJuridicaTO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PessoaJuridicaDAO {

    //Para verificar se o CNPJ digitado já existe
    public static boolean verificaCnpjExiste(String cnpjPessoaJuridica) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM PessoaJuridica WHERE cnpjPessoaJuridica = ?";
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setString(1, cnpjPessoaJuridica);
        ResultSet rs = ps.executeQuery();

        return rs.next();
    }

    //Para inserir as informações no banco de dados
    public static void inserir(PessoaJuridicaTO pessoaJuridica) throws Exception {
        String sql = "INSERT INTO PessoaJuridica ("
                + "cnpjPessoaJuridica,"
                + "razaoSocialPessoaJuridica,"
                + "VALUES (?,?)";

        Conexao c = new Conexao();

        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setString(1, pessoaJuridica.getCnpjPessoaJuridica());
        ps.setString(2, pessoaJuridica.getRazaoSocialPessoaJuridica());
        ps.execute();

        c.confirmar();
    }

    //Para alterar as informações no banco de dados
    public static void alterar(PessoaJuridicaTO pessoaJuridica) throws Exception {
        String sql = "UPDATE PessoaJuridica SET"
                + "cnpjPessoaJuridica = ?,"
                + "razaoSocialPessoaJuridica = ?,"
                + "WHERE idPessoaJuridica = ?";

        Conexao c = new Conexao();

        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setString(1, pessoaJuridica.getCnpjPessoaJuridica());
        ps.setString(2, pessoaJuridica.getRazaoSocialPessoaJuridica());
        ps.execute();

        c.confirmar();
    }
}
