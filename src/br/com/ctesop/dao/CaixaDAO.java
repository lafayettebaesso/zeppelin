package br.com.ctesop.dao;

import br.com.ctesop.to.CaixaTO;
import java.sql.PreparedStatement;

public class CaixaDAO {

    //Para inserir as informações no banco de dados
    public static void inserir(CaixaTO caixa) throws Exception {
        String sql = "INSERT INTO Caixa ("
                + "dataAbertura,"
                + "dataFechamento,"
                + "saldoCaixa,"
                + "statusCaixa)"
                + "VALUES (?,?,?,?)";

        Conexao c = new Conexao();

        PreparedStatement ps = c.getConexao().prepareCall(sql);
        ps.setDate(1, caixa.getDataAberturaCaixa());
        ps.setDate(2, caixa.getDataFechamentoCaixa());
        ps.setFloat(3, caixa.getSaldoCaixa());
        ps.setString(4, caixa.getStatusCaixa());
        ps.execute();
        c.confirmar();
    }
}
