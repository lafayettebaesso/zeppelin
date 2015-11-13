package br.com.ctesop.gui;

import br.com.ctesop.dao.ProdutoDAO;
import br.com.ctesop.gui.tablemodel.TableModelGrid;
import br.com.ctesop.to.ProdutoTO;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class CompraAdicionarProdutoGUI extends javax.swing.JInternalFrame {

    TableModelGrid tb;

    //Atribudo para armazenar qual JDesktopPane irá receber o JInternalFrame
    private JDesktopPane dpArea = null;
    private CompraGUI janelaCompra;

    public CompraAdicionarProdutoGUI() {
        this.tb = new TableModelGrid("Código", "Nome", "Preço de custo", "Preço de venda", "Status");
        initComponents();
        carregaGrade();
    }

    public CompraAdicionarProdutoGUI(JDesktopPane dpArea, CompraGUI janelaCompra) {
        //Armazena o dpArea (JDesktopPane) recebido por parâmetro para ser usado depois
        this.tb = new TableModelGrid("Código", "Nome", "Preço de custo", "Preço de venda", "Status");
        this.dpArea = dpArea;
        this.janelaCompra = janelaCompra;
        initComponents();
        carregaGrade();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPesquisarProduto = new javax.swing.JPanel();
        txtNomeProduto = new javax.swing.JTextField();
        lbNomeProduto = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        spGradePesquisarProduto = new javax.swing.JScrollPane();
        tbGradePesquisarProduto = new javax.swing.JTable();
        pnBotoes = new javax.swing.JPanel();
        btAdicionar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Adicionar produto na compra");

        pnPesquisarProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar produto"));

        lbNomeProduto.setText("Nome do produto:");

        btPesquisar.setText("Pesquisar");
        btPesquisar.setMaximumSize(new java.awt.Dimension(120, 40));
        btPesquisar.setMinimumSize(new java.awt.Dimension(120, 40));
        btPesquisar.setPreferredSize(new java.awt.Dimension(120, 40));

        javax.swing.GroupLayout pnPesquisarProdutoLayout = new javax.swing.GroupLayout(pnPesquisarProduto);
        pnPesquisarProduto.setLayout(pnPesquisarProdutoLayout);
        pnPesquisarProdutoLayout.setHorizontalGroup(
            pnPesquisarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarProdutoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbNomeProduto)
                .addGap(12, 12, 12)
                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnPesquisarProdutoLayout.setVerticalGroup(
            pnPesquisarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarProdutoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeProduto)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        tbGradePesquisarProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        spGradePesquisarProduto.setViewportView(tbGradePesquisarProduto);

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
                    .addComponent(spGradePesquisarProduto)
                    .addComponent(pnPesquisarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pnPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(spGradePesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        try {
            int idProduto = Integer.parseInt(tb.get(tbGradePesquisarProduto.getSelectedRow()).get(0));
            ProdutoTO produtoTO = (ProdutoTO) ProdutoDAO.get(ProdutoTO.class, idProduto);

            //Instanciação do objeto CompraEditarProdutoGUI e localização dele no meio da tela
            CompraEditarProdutoGUI cep = new CompraEditarProdutoGUI(produtoTO, janelaCompra);
            dpArea.add(cep);
            cep.setLocation((dpArea.getWidth() - cep.getWidth()) / 2, (dpArea.getHeight() - cep.getHeight()) / 2);
            cep.setVisible(true);
            //dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar o produto.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    //Métodos//
    //Método para listar os produtos
    private void carregaGrade() {
        try {
            String filtro = txtNomeProduto.getText();
            List<Class<?>> classes = new ArrayList<>();
            classes.add(ProdutoTO.class);

            String[] camposSelect = new String[]{"Produto.idProduto", "Produto.nomeProduto",
                "Produto.precoCustoProduto", "Produto.precoVendaProduto", "Produto.statusProduto"};
            tb.setDados(ProdutoDAO.listarUtilizandoComandoInnerJoin(classes, camposSelect, 0, "nomeProduto", filtro));
            tbGradePesquisarProduto.setModel(tb);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao atualizar grade");
        }
    }

    //Para abrir o JInternalFrame adicional ProdutoGUI centralizados
    private Point calculaLocal(JDesktopPane dpArea, JInternalFrame p) {
        return new Point(((dpArea.getWidth() - p.getWidth()) / 2), ((dpArea.getHeight() - p.getHeight()) / 2));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel lbNomeProduto;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnPesquisarProduto;
    private javax.swing.JScrollPane spGradePesquisarProduto;
    private javax.swing.JTable tbGradePesquisarProduto;
    private javax.swing.JTextField txtNomeProduto;
    // End of variables declaration//GEN-END:variables
}
