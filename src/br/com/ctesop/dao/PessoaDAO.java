package br.com.ctesop.dao;

import br.com.ctesop.to.PessoaTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PessoaDAO {

    //Para verificar se o nome digitado em "Nome da pessoa" já existe
    public static boolean verificaNomeExiste(String nomePessoa) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM Cidade WHERE nomePessoa = ?";
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setString(1, nomePessoa);
        ResultSet rs = ps.executeQuery();

        return rs.next();
    }

    //Para inserir as informações no banco de dados
    public static void inserir(PessoaTO pessoa) throws Exception {
        String sql = "INSERT INTO Pessoa ("
                + "idCidade,"
                + "nomePessoa,"
                + "enderecoPessoa,"
                + "telefonePessoa,"
                + "telefoneComercialPessoa,"
                + "celularPessoa,"
                + "dataNascimentoPessoa,"
                + "sexoPessoa)"
                + "VALUES (?,?,?,?,?,?,?,?)";

        Conexao c = new Conexao();

        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setInt(1, pessoa.getIdCidade());
        ps.setString(2, pessoa.getNomePessoa());
        ps.setString(3, pessoa.getEnderecoPessoa());
        ps.setString(4, pessoa.getTelefonePessoa());
        ps.setString(5, pessoa.getTelefoneComercialPessoa());
        ps.setString(6, pessoa.getCelularPessoa());
        ps.setString(7, pessoa.getDataNascimentoPessoa());
        ps.setString(8, pessoa.getSexoPessoa());
        ps.execute();
        c.confirmar();
    }

    //Para alterar as informações no banco de dados
    public static void alterar(PessoaTO pessoa) throws Exception {
        String sql = "UPDATE Pessoa SET nomePessoa = ?,"
                + "enderecoPessoa = ?,"
                + "telefonePessoa = ?,"
                + "telefonePessoaComercial = ?,"
                + "celularPessoa = ?,"
                + "dataNascimentoPessoa = ?,"
                + "sexoPessoa = ?"
                + "WHERE idPessoa = ?";

        Conexao c = new Conexao();

        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setInt(1, pessoa.getIdCidade());
        ps.setString(2, pessoa.getNomePessoa());
        ps.setString(3, pessoa.getEnderecoPessoa());
        ps.setString(4, pessoa.getTelefonePessoa());
        ps.setString(5, pessoa.getTelefoneComercialPessoa());
        ps.setString(6, pessoa.getCelularPessoa());
        ps.setString(7, pessoa.getDataNascimentoPessoa());
        ps.setString(8, pessoa.getSexoPessoa());
        ps.execute();

        c.confirmar();
    }
}

