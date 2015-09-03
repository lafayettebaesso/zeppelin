package br.com.ctesop.dao;

import br.com.ctesop.to.CidadeTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CidadeDAO extends GenericDAO {
    
    //Para verificar se o nome digitado em "Nome da cidade" já existe
    public static boolean verificaNomeExiste(String nomeCidade) throws Exception {
        return CarregarRegistroFiltrandoPorColuna(CidadeTO.class, "nomeCidade", nomeCidade) != null;
    }
    
//    //Para inserir as informações no banco de dados
//    public static void inserir(CidadeTO cidade) throws Exception {
//        String sql = "INSERT INTO Cidade ("
//                + "nomeCidade,"
//                + "statusCidade,"
//                + "idEstado)"
//                + "VALUES (?,?,?)";
//
//        Conexao c = new Conexao();
//
//        PreparedStatement ps = c.getConexao().prepareCall(sql);
//        ps.setString(1, cidade.getNomeCidade());
//        ps.setString(2, cidade.getStatusCidade());
//        ps.setInt(3, cidade.getIdEstado());
//        ps.execute();
//        c.confirmar();
//    }
//    
//    //Para alterar as informações no banco de dados
//    public static void alterar(CidadeTO cidade) throws Exception {
//        String sql = "UPDATE Cidade SET nomeCidade = ?, siglaEstado = ?, statusCidade = ? WHERE idCidade = ?";
//
//        Conexao c = new Conexao();
//
//        PreparedStatement ps = c.getConexao().prepareCall(sql);
//        ps.setString(1, cidade.getNomeCidade());
//        ps.setString(2, cidade.getStatusCidade());
//        ps.setInt(3, cidade.getIdCidade());
//        ps.execute();
//
//        c.confirmar();
//    }
//    
//    //Para listar todos as cidades cadastradas (utilizado no "atualizarGrade" do CidadeGUI)
//    public static List<CidadeTO> listar() throws Exception {
//        Conexao c = new Conexao();
//        String sql = "SELECT * FROM Cidade";
//        PreparedStatement ps = c.getConexao().prepareCall(sql);
//        ResultSet rs = ps.executeQuery();
//
//        List<CidadeTO> lista = new ArrayList<>();
//        while (rs.next()) {
//            CidadeTO e = new CidadeTO();
//            e.setIdCidade(rs.getInt("IdCidade"));
//            e.setNomeCidade(rs.getString("NomeCidade"));
//            e.setStatusCidade(rs.getString("StatusCidade"));
//            lista.add(e);
//        }
//        return lista;
//    }
//    
//    //Para pesquisar as cidades cadastradas
//    public static List<CidadeTO> listar(int pagina, String filtro) throws Exception {
//        Conexao c = new Conexao();
//        String sql = "SELECT * FROM Cidade WHERE nomeCidade LIKE '%" + filtro + "%' LIMIT ?,10";
//        PreparedStatement ps = c.getConexao().prepareCall(sql);
//        ps.setInt(1, pagina * 10);
//        ResultSet rs = ps.executeQuery();
//
//        List<CidadeTO> lista = new ArrayList<>();
//        while (rs.next()) {
//            CidadeTO e = new CidadeTO();
//            e.setIdCidade(rs.getInt("IdCidade"));
//            e.setIdEstado(rs.getInt("IdEstado"));
//            e.setNomeCidade(rs.getString("NomeCidade"));
//            e.setStatusCidade(rs.getString("StatusCidade"));
//            lista.add(e);
//        }
//        return lista;
//    }
//    
}
