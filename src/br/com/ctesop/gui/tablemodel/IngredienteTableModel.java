package br.com.ctesop.gui.tablemodel;

import br.com.ctesop.to.IngredienteTO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class IngredienteTableModel extends AbstractTableModel {

    String colunas[] = {"Código", "Nome", "Preço de custo", "Quantidade", "Status"};
    List<IngredienteTO> dados;

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
        IngredienteTO ingrediente = dados.get(linha);
        switch (coluna) {
            case 0:
                return ingrediente.getIdIngrediente();
            case 1:
                return ingrediente.getNomeIngrediente();
            case 2:
                return ingrediente.getPrecoCustoIngrediente();
            case 3:
                return ingrediente.getQuantidadeIngrediente();
            case 4:
                return ingrediente.getStatusIngrediente();
            default:
                throw new IndexOutOfBoundsException("Coluna inválida!");
        }
    }

    public void setDados(List<IngredienteTO> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }

    public IngredienteTO get(int linha) {
        return dados.get(linha);
    }
}
