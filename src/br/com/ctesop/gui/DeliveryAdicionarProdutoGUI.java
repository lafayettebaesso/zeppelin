package br.com.ctesop.gui;

import java.awt.Point;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class DeliveryAdicionarProdutoGUI extends javax.swing.JInternalFrame {

    //Atribudo para armazenar qual JDesktopPane irá receber o JInternalFrame
    private JDesktopPane dpArea = null;

    public DeliveryAdicionarProdutoGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPesquisarProduto = new javax.swing.JPanel();
        txtNomeProduto = new javax.swing.JTextField();
        lbNomeProduto = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        btProduto = new javax.swing.JButton();
        spGradePesquisarProduto = new javax.swing.JScrollPane();
        tbGradePesquisarProduto = new javax.swing.JTable();
        pnBotoes = new javax.swing.JPanel();
        btAdicionar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        pnPesquisarProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar produto"));

        lbNomeProduto.setText("Nome do produto:");

        btPesquisar.setText("Pesquisar");
        btPesquisar.setMaximumSize(new java.awt.Dimension(120, 40));
        btPesquisar.setMinimumSize(new java.awt.Dimension(120, 40));
        btPesquisar.setPreferredSize(new java.awt.Dimension(120, 40));

        btProduto.setText("...");
        btProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPesquisarProdutoLayout = new javax.swing.GroupLayout(pnPesquisarProduto);
        pnPesquisarProduto.setLayout(pnPesquisarProdutoLayout);
        pnPesquisarProdutoLayout.setHorizontalGroup(
            pnPesquisarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarProdutoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbNomeProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btProduto)
                .addContainerGap())
        );
        pnPesquisarProdutoLayout.setVerticalGroup(
            pnPesquisarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarProdutoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnPesquisarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNomeProduto)
                        .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbGradePesquisarProduto.setModel(new javax.swing.table.DefaultTableModel(
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
        spGradePesquisarProduto.setViewportView(tbGradePesquisarProduto);

        btAdicionar.setMnemonic('a');
        btAdicionar.setText("Adicionar");
        btAdicionar.setMaximumSize(new java.awt.Dimension(120, 40));
        btAdicionar.setMinimumSize(new java.awt.Dimension(120, 40));
        btAdicionar.setPreferredSize(new java.awt.Dimension(120, 40));

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
                .addGap(8, 8, 8)
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
                    .addComponent(spGradePesquisarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
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

    private void btProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdutoActionPerformed
        //Abre a JInternalFrame no JDesktopPane dpArea
        if (dpArea != null) {
            ProdutoGUI p = new ProdutoGUI();
            dpArea.add(p);
            p.setLocation(calculaLocal(dpArea, p));
            p.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Impossível abrir a janela interna, pois o \n"
                    + "DesktopPane destino não está definido!");
        }
    }//GEN-LAST:event_btProdutoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btProduto;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel lbNomeProduto;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnPesquisarProduto;
    private javax.swing.JScrollPane spGradePesquisarProduto;
    private javax.swing.JTable tbGradePesquisarProduto;
    private javax.swing.JTextField txtNomeProduto;
    // End of variables declaration//GEN-END:variables

    //Para abrir o JInternalFrame adicional ProdutoGUI centralizados
    private Point calculaLocal(JDesktopPane dpArea, JInternalFrame p) {
        return new Point(((dpArea.getWidth() - p.getWidth()) / 2), ((dpArea.getHeight() - p.getHeight()) / 2));
    }
}
