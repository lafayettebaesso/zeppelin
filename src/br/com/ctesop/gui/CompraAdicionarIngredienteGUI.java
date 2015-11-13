package br.com.ctesop.gui;

import br.com.ctesop.dao.IngredienteDAO;
import br.com.ctesop.gui.tablemodel.TableModelGrid;
import br.com.ctesop.to.IngredienteTO;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class CompraAdicionarIngredienteGUI extends javax.swing.JInternalFrame {

    TableModelGrid tb;

    //Atribudo para armazenar qual JDesktopPane irá receber o JInternalFrame
    private JDesktopPane dpArea = null;
    private CompraGUI janelaCompra;

    public CompraAdicionarIngredienteGUI() {
        this.tb = new TableModelGrid("Código", "Nome", "Preço de custo", "Status");
        initComponents();
        carregaGrade();
    }

    public CompraAdicionarIngredienteGUI(JDesktopPane dpArea, CompraGUI janelaCompra) {
        //Armazena o dpArea (JDesktopPane) recebido por parâmetro para ser usado depois
        this.tb = new TableModelGrid("Código", "Nome", "Preço de custo", "Status");
        this.dpArea = dpArea;
        this.janelaCompra = janelaCompra;
        initComponents();
        carregaGrade();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPesquisarIngrediente = new javax.swing.JPanel();
        txtNomeIngrediente = new javax.swing.JTextField();
        lbNomeIngrediente = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        spGradePesquisarIngrediente = new javax.swing.JScrollPane();
        tbGradePesquisarIngrediente = new javax.swing.JTable();
        pnBotoes = new javax.swing.JPanel();
        btAdicionar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Adicionar ingrediente na compra");

        pnPesquisarIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar ingrediente"));

        lbNomeIngrediente.setText("Nome do ingrediente:");

        btPesquisar.setText("Pesquisar");
        btPesquisar.setMaximumSize(new java.awt.Dimension(120, 40));
        btPesquisar.setMinimumSize(new java.awt.Dimension(120, 40));
        btPesquisar.setPreferredSize(new java.awt.Dimension(120, 40));

        javax.swing.GroupLayout pnPesquisarIngredienteLayout = new javax.swing.GroupLayout(pnPesquisarIngrediente);
        pnPesquisarIngrediente.setLayout(pnPesquisarIngredienteLayout);
        pnPesquisarIngredienteLayout.setHorizontalGroup(
            pnPesquisarIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarIngredienteLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbNomeIngrediente)
                .addGap(12, 12, 12)
                .addComponent(txtNomeIngrediente, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnPesquisarIngredienteLayout.setVerticalGroup(
            pnPesquisarIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarIngredienteLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisarIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeIngrediente)
                    .addComponent(txtNomeIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        tbGradePesquisarIngrediente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spGradePesquisarIngrediente.setViewportView(tbGradePesquisarIngrediente);

        btAdicionar.setMnemonic('a');
        btAdicionar.setText("Adicionar");
        btAdicionar.setMaximumSize(new java.awt.Dimension(120, 40));
        btAdicionar.setMinimumSize(new java.awt.Dimension(120, 40));
        btAdicionar.setPreferredSize(new java.awt.Dimension(120, 40));
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btSair.setMnemonic('f');
        btSair.setText("Fechar");
        btSair.setMaximumSize(new java.awt.Dimension(120, 40));
        btSair.setMinimumSize(new java.awt.Dimension(120, 40));
        btSair.setPreferredSize(new java.awt.Dimension(120, 40));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBotoesLayout = new javax.swing.GroupLayout(pnBotoes);
        pnBotoes.setLayout(pnBotoesLayout);
        pnBotoesLayout.setHorizontalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spGradePesquisarIngrediente, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                    .addComponent(pnPesquisarIngrediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pnPesquisarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(spGradePesquisarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        try {
            int idIngrediente = Integer.parseInt(tb.get(tbGradePesquisarIngrediente.getSelectedRow()).get(0));
            IngredienteTO ingredienteTO = (IngredienteTO) IngredienteDAO.get(IngredienteTO.class, idIngrediente);
            
            CompraEditarIngredienteGUI cep = new CompraEditarIngredienteGUI(ingredienteTO, janelaCompra);
            dpArea.add(cep);
            cep.setLocation((dpArea.getWidth() - cep.getWidth()) / 2, (dpArea.getHeight() - cep.getHeight()) / 2);
            cep.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar o ingrediente.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    //Métodos//
    //Método para listar os ingrediente
    private void carregaGrade() {
        try {
            String filtro = txtNomeIngrediente.getText();
            List<Class<?>> classes = new ArrayList<>();
            classes.add(IngredienteTO.class);

            String[] camposSelect = new String[]{"Ingrediente.idIngrediente", "Ingrediente.nomeIngrediente",
                "Ingrediente.precoCustoIngrediente", "Ingrediente.statusIngrediente"};
            tb.setDados(IngredienteDAO.listarUtilizandoComandoInnerJoin(classes, camposSelect, 0, "nomeIngrediente", filtro));
            tbGradePesquisarIngrediente.setModel(tb);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao atualizar grade");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel lbNomeIngrediente;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnPesquisarIngrediente;
    private javax.swing.JScrollPane spGradePesquisarIngrediente;
    private javax.swing.JTable tbGradePesquisarIngrediente;
    private javax.swing.JTextField txtNomeIngrediente;
    // End of variables declaration//GEN-END:variables

    //Para abrir o JInternalFrame adicional IngredienteGUI centralizados
    private Point calculaLocal(JDesktopPane dpArea, JInternalFrame p) {
        return new Point(((dpArea.getWidth() - p.getWidth()) / 2), ((dpArea.getHeight() - p.getHeight()) / 2));
    }
}
