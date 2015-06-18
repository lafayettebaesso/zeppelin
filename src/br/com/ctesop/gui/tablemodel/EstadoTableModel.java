package br.com.ctesop.gui.tablemodel;

import br.com.ctesop.to.EstadoTO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class EstadoTableModel extends AbstractTableModel {

    String colunas[] = {"Código", "Nome", "Status"};
    List<EstadoTO> dados;

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
        EstadoTO estado = dados.get(linha);
        switch (coluna) {
            case 0:
                return estado.getIdEstado();
            case 1:
                return estado.getNomeEstado();
            case 2:
                return estado.getStatusEstado();
            default:
                throw new IndexOutOfBoundsException("Coluna inválida!");
        }
    }

    public void setDados(List<EstadoTO> dados){
        this.dados = dados;
        fireTableDataChanged();
    }

    public EstadoTO get(int linha) {
        return dados.get(linha);
    }
}
