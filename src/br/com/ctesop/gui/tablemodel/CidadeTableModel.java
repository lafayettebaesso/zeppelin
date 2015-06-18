package br.com.ctesop.gui.tablemodel;

import br.com.ctesop.to.CidadeTO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class CidadeTableModel extends AbstractTableModel {
    
    String colunas[] = {"Código", "Nome", "Status"};
    List<CidadeTO> dados;

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
        CidadeTO cidade = dados.get(linha);
        switch (coluna) {
            case 0:
                return cidade.getIdCidade();
            case 1:
                return cidade.getNomeCidade();
            case 2:
                return cidade.getStatusCidade();
            default:
                throw new IndexOutOfBoundsException("Coluna inválida!");
        }
    }

    public void setDados(List<CidadeTO> dados){
        this.dados = dados;
        fireTableDataChanged();
    }

    public CidadeTO get(int linha) {
        return dados.get(linha);
    }
}