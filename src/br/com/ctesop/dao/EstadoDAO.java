package br.com.ctesop.dao;

import br.com.ctesop.to.EstadoTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstadoDAO {

    //Para verificar se o nome digitado em "Nome do estado" já existe
    public static boolean verificaNomeExiste(String nomeEstado) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM Estado WHERE nomeEstado = ?";
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setString(1, nomeEstado);
        ResultSet rs = ps.executeQuery();

        return rs.next();
    }

    //Para verificar se o sigla digitada em "Sigla do estado" já existe
    public static boolean verificaSiglaExiste(String siglaEstado) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM Estado WHERE siglaEstado = ?";
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setString(1, siglaEstado);
        ResultSet rs = ps.executeQuery();

        return rs.next();
    }

    //Para inserir as informações no banco de dados
    public static void inserir(EstadoTO estado) throws Exception {
        String sql = "INSERT INTO Estado ("
                + "nomeEstado,"
                + "siglaEstado,"
                + "statusEstado)"
                + "VALUES (?,?,?)";

        Conexao c = new Conexao();

        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setString(1, estado.getNomeEstado());
        ps.setString(2, estado.getSiglaEstado());
        ps.setString(3, estado.getStatusEstado());
        ps.execute();
        c.confirmar();
    }

    //Para alterar as informações no banco de dados
    public static void alterar(EstadoTO estado) throws Exception {
        String sql = "UPDATE Estado SET nomeEstado = ?, siglaEstado = ?, statusEstado = ? WHERE idEstado = ?";

        Conexao c = new Conexao();

        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setString(1, estado.getNomeEstado());
        ps.setString(2, estado.getSiglaEstado());
        ps.setString(3, estado.getStatusEstado());
        ps.setInt(4, estado.getIdEstado());
        ps.execute();

        c.confirmar();
    }

    //Para listar todos os estados cadastrados (utilizado no "atualizarGrade" do EstadoGUI)
    public static List<EstadoTO> listar() throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM Estado";
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ResultSet rs = ps.executeQuery();

        List<EstadoTO> lista = new ArrayList<>();
        while (rs.next()) {
            EstadoTO e = new EstadoTO();
            e.setIdEstado(rs.getInt("IdEstado"));
            e.setNomeEstado(rs.getString("NomeEstado"));
            e.setSiglaEstado(rs.getString("SiglaEstado"));
            e.setStatusEstado(rs.getString("StatusEstado"));
            lista.add(e);
        }
        return lista;
    }

    //Para pesquisar os estados cadastrados
    public static List<EstadoTO> listar(int pagina, String filtro) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM Estado WHERE nomeEstado LIKE '%" + filtro + "%' LIMIT ?,10";
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setInt(1, pagina * 10);
        ResultSet rs = ps.executeQuery();

        List<EstadoTO> lista = new ArrayList<>();
        while (rs.next()) {
            EstadoTO e = new EstadoTO();
            e.setIdEstado(rs.getInt("IdEstado"));
            e.setNomeEstado(rs.getString("NomeEstado"));
            e.setSiglaEstado(rs.getString("SiglaEstado"));
            e.setStatusEstado(rs.getString("StatusEstado"));
            lista.add(e);
        }
        return lista;
    }

    //Método criado através do CidadeGUI no parametro "carregar grade" para puxar a "Sigla do estado" quando for editar.
    public static EstadoTO get(int idEstado) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM Estado WHERE IdEstado = ?";
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setInt(1, idEstado);
        ResultSet rs = ps.executeQuery();

        EstadoTO e = new EstadoTO();
        if (rs.next()) {
            e.setIdEstado(rs.getInt("IdEstado"));
            e.setNomeEstado(rs.getString("NomeEstado"));
            e.setSiglaEstado(rs.getString("SiglaEstado"));
            e.setStatusEstado(rs.getString("StatusEstado"));

        }
        return e;
    }
}
