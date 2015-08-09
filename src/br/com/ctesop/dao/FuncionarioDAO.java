package br.com.ctesop.dao;

import br.com.ctesop.to.FuncionarioTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FuncionarioDAO {

    //Para verificar se o nome digitado em "Nome do funcionário" já existe
    public static boolean verificaNomeExiste(String nomePessoa) throws Exception {
        Conexao c = new Conexao();
        String sql = "SELECT * FROM Pessoa WHERE nomePessoa = ?";
        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setString(1, nomePessoa);
        ResultSet rs = ps.executeQuery();

        return rs.next();
    }
    
    //Para inserir as informações no banco de dados
    public static void inserir(FuncionarioTO funcionario) throws Exception {
        
//        if(funcionario.getIdPessoa() )
//        
//        
//        
//        
//        String sql = "INSERT INTO Funcionario ("
//                + "idPessoa,"
//                + "nomeMaeFuncionario,"
//                + "dataCadastroFuncionario,"
//                + "salarioFuncionario,"
//                + "statusFuncionario)"
//                + "VALUES (?,?,?,?,?)";
//
//        Conexao c = new Conexao();
//
//        PreparedStatement ps = c.getConexao().prepareCall(sql);
//        ps.setInt(1, funcionario.getIdPessoa());
//        ps.setInt(2, funcionario.getIdPessoaJuridica());
//        ps.setInt(3, cliente.getIdPessoaFisica());
//        ps.setString(4, cliente.getLocalTrabalhoCliente());
//        ps.setString(5, cliente.getStatusCliente());
//        ps.execute();
//        c.confirmar();
    }
}
