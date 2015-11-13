package br.com.ctesop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private Connection conexao;

    public Conexao() throws Exception {
        //Estabelece a conexão com o banco de dados
        try {
            String url = "jdbc:mysql://localhost:3306/zeppelin";
            String usuario = "root";
            String senha = "";

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexao = DriverManager.getConnection(url, usuario, senha);
            conexao.setAutoCommit(false);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            throw new Exception("Houve algum problema para realizar a conexão com o bando de dados.\n" + e);
        }
    }

    public Connection getConexao() {
        return conexao;
    }

    public void confirmar() throws Exception {
        try {
            conexao.commit();
            conexao.close();

        } catch (Exception se) {
            throw new Exception("Problemas na instrução SQL.");
        }
    }
}
