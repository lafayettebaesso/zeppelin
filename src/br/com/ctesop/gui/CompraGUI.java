package br.com.ctesop.gui;

import java.awt.Point;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class CompraGUI extends javax.swing.JInternalFrame {

    //Atribudo para armazenar qual JDesktopPane irá receber o JInternalFrame
    private JDesktopPane dpArea = null;

    public CompraGUI() {
        initComponents();
    }

    public CompraGUI(JDesktopPane dpArea) {
        //Armazena o dpArea (JDesktopPane) recebido por parâmetro para ser usado depois
        this.dpArea = dpArea;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnBotoes = new javax.swing.JPanel();
        btPagamento = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        pnDadosVenda = new javax.swing.JPanel();
        pnDados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbFuncionario = new javax.swing.JComboBox();
        txtCliente = new javax.swing.JTextField();
        btCliente = new javax.swing.JButton();
        pnInformacoes = new javax.swing.JPanel();
        lbDataContaReceber = new javax.swing.JLabel();
        txtDataContaReceber = new javax.swing.JTextField();
        lbValorTotal = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        pnProdutosVenda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btLocalizarProduto = new javax.swing.JButton();
        btEditarProduto = new javax.swing.JButton();
        btExcluirProduto = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Compra");

        btPagamento.setMnemonic('p');
        btPagamento.setText("Pagamento");
        btPagamento.setMaximumSize(new java.awt.Dimension(120, 40));
        btPagamento.setMinimumSize(new java.awt.Dimension(120, 40));
        btPagamento.setPreferredSize(new java.awt.Dimension(120, 40));

        btFechar.setMnemonic('f');
        btFechar.setText("Sair");
        btFechar.setMaximumSize(new java.awt.Dimension(120, 40));
        btFechar.setMinimumSize(new java.awt.Dimension(120, 40));
        btFechar.setPreferredSize(new java.awt.Dimension(120, 40));
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBotoesLayout = new javax.swing.GroupLayout(pnBotoes);
        pnBotoes.setLayout(pnBotoesLayout);
        pnBotoesLayout.setHorizontalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createSequentialGroup()
                .addComponent(btPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnDadosVenda.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da compra"));

        pnDados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("Funcionário");

        jLabel4.setText("Fornecedor");

        cbFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btCliente.setText("...");
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDadosLayout = new javax.swing.GroupLayout(pnDados);
        pnDados.setLayout(pnDadosLayout);
        pnDadosLayout.setHorizontalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, 0, 350, Short.MAX_VALUE)
                    .addGroup(pnDadosLayout.createSequentialGroup()
                        .addComponent(txtCliente)
                        .addGap(12, 12, 12)
                        .addComponent(btCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        pnDadosLayout.setVerticalGroup(
            pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(pnDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCliente))
                .addGap(8, 8, 8))
        );

        pnInformacoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbDataContaReceber.setText("Data:");

        txtDataContaReceber.setEditable(false);

        lbValorTotal.setText("Valor total:");

        txtValorTotal.setEditable(false);

        javax.swing.GroupLayout pnInformacoesLayout = new javax.swing.GroupLayout(pnInformacoes);
        pnInformacoes.setLayout(pnInformacoesLayout);
        pnInformacoesLayout.setHorizontalGroup(
            pnInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInformacoesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbValorTotal)
                    .addComponent(lbDataContaReceber, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataContaReceber)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnInformacoesLayout.setVerticalGroup(
            pnInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInformacoesLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataContaReceber)
                    .addComponent(txtDataContaReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(pnInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorTotal)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout pnDadosVendaLayout = new javax.swing.GroupLayout(pnDadosVenda);
        pnDadosVenda.setLayout(pnDadosVendaLayout);
        pnDadosVendaLayout.setHorizontalGroup(
            pnDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosVendaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        pnDadosVendaLayout.setVerticalGroup(
            pnDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosVendaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnDados, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pnProdutosVenda.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos da compra"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        btLocalizarProduto.setMnemonic('s');
        btLocalizarProduto.setText("Pesquisar um produto");
        btLocalizarProduto.setMaximumSize(new java.awt.Dimension(120, 40));
        btLocalizarProduto.setMinimumSize(new java.awt.Dimension(120, 40));
        btLocalizarProduto.setPreferredSize(new java.awt.Dimension(120, 40));
        btLocalizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocalizarProdutoActionPerformed(evt);
            }
        });

        btEditarProduto.setMnemonic('c');
        btEditarProduto.setText("Editar");
        btEditarProduto.setMaximumSize(new java.awt.Dimension(120, 40));
        btEditarProduto.setMinimumSize(new java.awt.Dimension(120, 40));
        btEditarProduto.setPreferredSize(new java.awt.Dimension(120, 40));
        btEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarProdutoActionPerformed(evt);
            }
        });

        btExcluirProduto.setText("Excluir");

        javax.swing.GroupLayout pnProdutosVendaLayout = new javax.swing.GroupLayout(pnProdutosVenda);
        pnProdutosVenda.setLayout(pnProdutosVendaLayout);
        pnProdutosVendaLayout.setHorizontalGroup(
            pnProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutosVendaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnProdutosVendaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(pnProdutosVendaLayout.createSequentialGroup()
                        .addComponent(btLocalizarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btEditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnProdutosVendaLayout.setVerticalGroup(
            pnProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutosVendaLayout.createSequentialGroup()
                .addGroup(pnProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnProdutosVendaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btEditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btLocalizarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnProdutosVendaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnDadosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnProdutosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(pnDadosVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnProdutosVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btLocalizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocalizarProdutoActionPerformed
        //Abre a JInternalFrame no JDesktopPane dpArea
        if (dpArea != null) {
            CompraAdicionarProdutoGUI p = new CompraAdicionarProdutoGUI(dpArea);
            dpArea.add(p);
            p.setLocation(calculaLocal(dpArea, p));
            p.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Impossível abrir a janela interna, pois o \n"
                    + "DesktopPane destino não está definido!");
        }
    }//GEN-LAST:event_btLocalizarProdutoActionPerformed

    private void btEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarProdutoActionPerformed
        //Abre a JInternalFrame no JDesktopPane dpArea
        if (dpArea != null) {
            CompraAlterarProdutoGUI p = new CompraAlterarProdutoGUI();
            dpArea.add(p);
            p.setLocation(calculaLocal(dpArea, p));
            p.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Impossível abrir a janela interna, pois o \n"
                    + "DesktopPane destino não está definido!");
        }
    }//GEN-LAST:event_btEditarProdutoActionPerformed

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteActionPerformed
        //Abre a JInternalFrame no JDesktopPane dpArea
        if (dpArea != null) {
            FornecedorGUI p = new FornecedorGUI();
            dpArea.add(p);
            p.setLocation(calculaLocal(dpArea, p));
            p.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Impossível abrir a janela interna, pois o \n"
                    + "DesktopPane destino não está definido!");
        }
    }//GEN-LAST:event_btClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btEditarProduto;
    private javax.swing.JButton btExcluirProduto;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btLocalizarProduto;
    private javax.swing.JButton btPagamento;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbFuncionario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbDataContaReceber;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnDados;
    private javax.swing.JPanel pnDadosVenda;
    private javax.swing.JPanel pnInformacoes;
    private javax.swing.JPanel pnProdutosVenda;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDataContaReceber;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables

    /* 
     * Para abrir os JInternalFrame adicionais VendaAdicionarProdutoGUI
     * e VendaAlterarProdutoGUI centralizados
     */
    private Point calculaLocal(JDesktopPane dpArea, JInternalFrame p) {
        return new Point(((dpArea.getWidth() - p.getWidth()) / 2), ((dpArea.getHeight() - p.getHeight()) / 2));
    }

}
