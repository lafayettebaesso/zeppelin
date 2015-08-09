package br.com.ctesop.dao;

import br.com.ctesop.to.ClienteTO;
import br.com.ctesop.to.PessoaTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    //Para verificar se o nome digitado em "Nome do cliente" já existe no banco de dados
    public static boolean verificaNomeExiste(String nomeCliente) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM Cliente WHERE nomeCliente = ?";
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setString(1, nomeCliente);
        ResultSet rs = ps.executeQuery();

        return rs.next();
    }

    //Para inserir as informações no banco de dados
    public static void inserir(ClienteTO cliente) throws Exception {
        String sql = "INSERT INTO Cliente ("
                + "idPessoa,"
                + "idPessoaJuridica,"
                + "idPessoaFisica,"

                + "localTrabalhoCliente,"
                + "statusCliente)"
                + "VALUES (?,?,?,?,?,?,?,?)";

        Conexao c = new Conexao();

        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setInt(1, cliente.getIdPessoa());
        ps.setInt(2, cliente.getIdPessoaJuridica());
        ps.setInt(3, cliente.getIdPessoaFisica());
        ps.setString(4, cliente.getLocalTrabalhoCliente());
        ps.setString(5, cliente.getStatusCliente());
        ps.execute();
        c.confirmar();
    }

    //Para alterar as informações no banco de dados
    public static void alterar(ClienteTO cliente) throws Exception {
        String sql = "UPDATE Cliente SET nomeCliente = ?,"
                + "idPessoa = ?,"
                + "idPessoaJuridica = ?,"
                + "idPessoaFisica = ?,"
                + "nomeCliente = ?,"
                + "cpfCliente = ?,"
                + "rgCliente = ?,"
                + "localTrabalhoCliente = ?,"
                + "statusCliente = ?"
                + "WHERE idCidade = ?";

        Conexao c = new Conexao();

        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setInt(1, cliente.getIdPessoa());
        ps.setInt(2, cliente.getIdPessoaJuridica());
        ps.setInt(3, cliente.getIdPessoaFisica());
        ps.setString(4, cliente.getLocalTrabalhoCliente());
        ps.setString(5, cliente.getStatusCliente());
        ps.execute();
        c.confirmar();
    }

    //Para listar todos os clientes cadastrados (utilizado no "atualizarGrade" do ClienteGUI)
    public static List<ClienteTO> listar() throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM Cliente";
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ResultSet rs = ps.executeQuery();

        List<ClienteTO> lista = new ArrayList<>();
        while (rs.next()) {
            ClienteTO e = new ClienteTO();
            e.setIdCliente(rs.getInt("IdCliente"));
            //PessoaTO.setNomePessoa(rs.getString("NomePessoa"));
            e.setStatusCliente(rs.getString("StatusCliente"));
            lista.add(e);
        }
        return lista;
    }

    //Para pesquisar os clientes cadastrados
    public static List<ClienteTO> listar(int pagina, String filtro) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM Cliente WHERE nomeCliente LIKE '%" + filtro + "%' LIMIT ?,10";
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setInt(1, pagina * 10);
        ResultSet rs = ps.executeQuery();

        List<ClienteTO> lista = new ArrayList<>();
        while (rs.next()) {
            ClienteTO e = new ClienteTO();
            e.setIdCliente(rs.getInt("IdCliente"));
            e.setStatusCliente(rs.getString("StatusCliente"));
            lista.add(e);
        }
        return lista;
    }
}