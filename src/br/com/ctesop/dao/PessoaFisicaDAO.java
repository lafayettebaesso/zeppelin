package br.com.ctesop.dao;

import br.com.ctesop.to.PessoaFisicaTO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PessoaFisicaDAO {

    //Para verificar se o CPF digitado já existe
    public static boolean verificaCpfExiste(String cpfPessoaFisica) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM PessoaFisica WHERE cpfPessoaFisica = ?";
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setString(1, cpfPessoaFisica);
        ResultSet rs = ps.executeQuery();

        return rs.next();
    }

    //Para verificar se o RG digitado já existe
    public static boolean verificaRgExiste(String rgPessoaFisica) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM PessoaFisica WHERE rgPessoaFisica = ?";
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setString(2, rgPessoaFisica);
        ResultSet rs = ps.executeQuery();

        return rs.next();
    }

    //Para verificar se a Inscrição Estadual de Pessoa Física já existe
    public static boolean verificaInscricaoEstadualExiste(String inscricaoEstadualPessoaFisica) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM PessoaFisica WHERE inscricaoEstadualPessoaFisica = ?";
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setString(5, inscricaoEstadualPessoaFisica);
        ResultSet rs = ps.executeQuery();

        return rs.next();
    }

    //Para inserir as informações no banco de dados
    public static void inserir(PessoaFisicaTO pessoaFisica) throws Exception {
        String sql = "INSERT INTO PessoaFisica ("
                + "cpfPessoaFisica,"
                + "rgPessoaFisica,"
                + "orgaoEmissorRgPessoaFisica"
                + "dataNascimentoPessoaFisica"
                + "inscricaoEstadualPessoaFisica)"
                + "VALUES (?,?,?,?,?)";

        Conexao c = new Conexao();

        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setString(1, pessoaFisica.getCpfPessoaFisica());
        ps.setString(2, pessoaFisica.getRgPessoaFisica());
        ps.setString(3, pessoaFisica.getOrgaoEmissorRgPessoaFisica());
        ps.setDate(4, (Date) pessoaFisica.getDataNascimentoPessoaFisica());
        ps.setString(5, pessoaFisica.getInscricaoEstadualPessoaFisica());
        ps.execute();
        
        c.confirmar();
    }

    //Para alterar as informações no banco de dados
    public static void alterar(PessoaFisicaTO pessoaFisica) throws Exception {
        String sql = "UPDATE PessoaFisica SET"
                + "cpfPessoaFisica = ?,"
                + "rgPessoaFisica = ?,"
                + "orgaoEmissorRgPessoaFisica = ?,"
                + "dataNascimentoPessoaFisica = ?,"
                + "inscricaoEstadualPessoaFisica = ?,"
                + "WHERE idPessoaFisica = ?";

        Conexao c = new Conexao();

        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setString(1, pessoaFisica.getCpfPessoaFisica());
        ps.setString(2, pessoaFisica.getRgPessoaFisica());
        ps.setString(3, pessoaFisica.getOrgaoEmissorRgPessoaFisica());
        ps.setDate(4, (Date) pessoaFisica.getDataNascimentoPessoaFisica());
        ps.setString(5, pessoaFisica.getInscricaoEstadualPessoaFisica());
        ps.execute();

        c.confirmar();
    }
}
