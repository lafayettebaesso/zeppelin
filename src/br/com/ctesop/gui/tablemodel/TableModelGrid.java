package br.com.ctesop.gui.tablemodel;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelGrid extends AbstractTableModel {
  
    String colunas[];
    List<List<String>> dados;

    public TableModelGrid(String... colunas) {
       this.colunas = colunas; 
    }
    
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

    public void setDados(List<List<String>> dados){
        this.dados = dados;
    }

    public List<String> get(int linha) {
        return dados.get(linha);
    }
    
    @Override
    public Object getValueAt(int linha, int coluna) {
        List<String> registro = dados.get(linha);
        return registro.get(coluna);
    }
    
    public String getStringValueAt(int linha, int coluna) {
        List<String> registro = dados.get(linha);
        return registro.get(coluna);
    }
    
    public int getIntValueAt(int linha, int coluna) {
        List<String> registro = dados.get(linha);
        if(registro.get(coluna).isEmpty())
            return 0;
        else
            return Integer.parseInt(registro.get(coluna));
    }
}
