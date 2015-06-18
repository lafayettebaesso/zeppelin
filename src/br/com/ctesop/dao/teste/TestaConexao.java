package br.com.ctesop.dao.teste;

import br.com.ctesop.dao.Conexao;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestaConexao {

    //Clase usada para testar a conexão com o bancode dados
    public static void main(String[] args) {
        try {
            Conexao c = new Conexao();
            c.getConexao();
            System.out.println(c);
        } catch (Exception ex) {
            Logger.getLogger(TestaConexao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
