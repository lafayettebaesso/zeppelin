package br.com.ctesop.gui.tablemodel;

import br.com.ctesop.to.ClienteTO;
import br.com.ctesop.to.PessoaTO;
import java.util.List;

public class ClienteTableModel {

    String colunas[] = {"Código", "Nome", "Endereço", "Status"};
    List<ClienteTO> dados;

    public String getColumnName(int coluna) {
        return colunas[coluna];
    }    

    public int getRowCount() {
        return dados.size();
    }
    
    public int getColumnCount() {
        return colunas.length;
    }

    //O "nome", por exemplo, eu devo puxar da tabela PessoaTO?
    public Object getValueAt(int linha, int coluna) {
        ClienteTO cliente = dados.get(linha);
        
        switch (coluna) {
            case 0:
                return cliente.getIdCliente();
            case 1:
                return cliente.getStatusCliente();
//                return cliente.getClass(PessoaTO.NomePessoa);
//            case 2:
//                return cliente.getIdPessoa(Endereco);
//            case 3:
//                return cliente.getStatusCliente();
            default:
                throw new IndexOutOfBoundsException("Coluna inválida!");
        }
    }

    public void setDados(List<ClienteTO> dados){
        this.dados = dados;
//        fireTableDataChanged();
    }

    public ClienteTO get(int linha) {
        return dados.get(linha);
    }
}