package br.com.ctesop.gui.tablemodel;

import br.com.ctesop.to.GrupoProdutoTO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class GrupoProdutoTableModel extends AbstractTableModel {
    
    String colunas[] = {"Código", "Nome", "Status"};
    List<GrupoProdutoTO> dados;

    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }    

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        GrupoProdutoTO estado = dados.get(linha);
        switch (coluna) {
            case 0:
                return estado.getIdGrupoProduto();
            case 1:
                return estado.getNomeGrupoProduto();
            case 2:
                return estado.getStatusGrupoProduto();
            default:
                throw new IndexOutOfBoundsException("Coluna inválida!");
        }
    }

    public void setDados(List<GrupoProdutoTO> dados){
        this.dados = dados;
        fireTableDataChanged();
    }

    public GrupoProdutoTO get(int linha) {
        return dados.get(linha);
    }
}
