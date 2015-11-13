package br.com.ctesop.gui;

import java.awt.Point;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class DeliveryGUI extends javax.swing.JInternalFrame {

    //Atribudo para armazenar qual JDesktopPane irá receber o JInternalFrame
    private JDesktopPane dpArea = null;

    public DeliveryGUI() {
        initComponents();
    }
    
    public DeliveryGUI(JDesktopPane dpArea) {
        //Armazena o dpArea (JDesktopPane) recebido por parâmetro para ser usado depois
        this.dpArea = dpArea;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBotoes = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btFinalizar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        pnAbas = new javax.swing.JTabbedPane();
        pnPesquisaDelivery = new javax.swing.JPanel();
        pnPesquisar = new javax.swing.JPanel();
        lbPesquisarDelivery = new javax.swing.JLabel();
        txtPesquisarDelivery = new javax.swing.JTextField();
        btPesquisarDelivery = new javax.swing.JButton();
        spGradePesquisaDelivery = new javax.swing.JScrollPane();
        tbGradePesquisaDelivery = new javax.swing.JTable();
        pnFormulario = new javax.swing.JPanel();
        pnDadosDelivery = new javax.swing.JPanel();
        lbCodigoDelivery = new javax.swing.JLabel();
        txtCodigoDelivery = new javax.swing.JTextField();
        lbClienteDelivery = new javax.swing.JLabel();
        lbEnderecoDelivery = new javax.swing.JLabel();
        txtEnderecoDelivery = new javax.swing.JTextField();
        lbNumeroDelivery = new javax.swing.JLabel();
        txtNumeroDelivery = new javax.swing.JTextField();
        lbBairroDelivery = new javax.swing.JLabel();
        txtBairroDelivery = new javax.swing.JTextField();
        lbPontoReferenciaDelivery = new javax.swing.JLabel();
        txtPontoReferenciaDelivery = new javax.swing.JTextField();
        lbStatusDelivery = new javax.swing.JLabel();
        cbStatusDelivery = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        pnProdutosDelivery = new javax.swing.JPanel();
        btAdicionarProduto = new javax.swing.JButton();
        btExcluirProduto = new javax.swing.JButton();
        lbValorTotalDelivery = new javax.swing.JLabel();
        txtValorTotalDelivery = new javax.swing.JFormattedTextField();
        spGradeProdutoDelivery = new javax.swing.JScrollPane();
        tbGradeProdutoDelivery = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Delivery");

        btNovo.setMnemonic('n');
        btNovo.setText("Novo");
        btNovo.setMaximumSize(new java.awt.Dimension(120, 40));
        btNovo.setMinimumSize(new java.awt.Dimension(120, 40));
        btNovo.setPreferredSize(new java.awt.Dimension(120, 40));

        btSalvar.setMnemonic('s');
        btSalvar.setText("Salvar");
        btSalvar.setMaximumSize(new java.awt.Dimension(120, 40));
        btSalvar.setMinimumSize(new java.awt.Dimension(120, 40));
        btSalvar.setPreferredSize(new java.awt.Dimension(120, 40));

        btFinalizar.setMnemonic('c');
        btFinalizar.setText("Finalizar");
        btFinalizar.setMaximumSize(new java.awt.Dimension(120, 40));
        btFinalizar.setMinimumSize(new java.awt.Dimension(120, 40));
        btFinalizar.setPreferredSize(new java.awt.Dimension(120, 40));

        btFechar.setMnemonic('f');
        btFechar.setText("Fechar");
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
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lbPesquisarDelivery.setText("Pesquisar:");

        btPesquisarDelivery.setMnemonic('p');
        btPesquisarDelivery.setLabel("Pesquisar");
        btPesquisarDelivery.setMaximumSize(new java.awt.Dimension(120, 40));
        btPesquisarDelivery.setMinimumSize(new java.awt.Dimension(120, 40));
        btPesquisarDelivery.setPreferredSize(new java.awt.Dimension(120, 40));

        javax.swing.GroupLayout pnPesquisarLayout = new javax.swing.GroupLayout(pnPesquisar);
        pnPesquisar.setLayout(pnPesquisarLayout);
        pnPesquisarLayout.setHorizontalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbPesquisarDelivery)
                .addGap(12, 12, 12)
                .addComponent(txtPesquisarDelivery)
                .addGap(12, 12, 12)
                .addComponent(btPesquisarDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnPesquisarLayout.setVerticalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPesquisarDelivery)
                    .addComponent(txtPesquisarDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisarDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        tbGradePesquisaDelivery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Endereço", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spGradePesquisaDelivery.setViewportView(tbGradePesquisaDelivery);

        javax.swing.GroupLayout pnPesquisaDeliveryLayout = new javax.swing.GroupLayout(pnPesquisaDelivery);
        pnPesquisaDelivery.setLayout(pnPesquisaDeliveryLayout);
        pnPesquisaDeliveryLayout.setHorizontalGroup(
            pnPesquisaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaDeliveryLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spGradePesquisaDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnPesquisaDeliveryLayout.setVerticalGroup(
            pnPesquisaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaDeliveryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(spGradePesquisaDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnAbas.addTab("Delivery", pnPesquisaDelivery);

        pnDadosDelivery.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Delivery"));

        lbCodigoDelivery.setText("Código:");

        txtCodigoDelivery.setEditable(false);

        lbClienteDelivery.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbClienteDelivery.setText("Cliente:");

        lbEnderecoDelivery.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbEnderecoDelivery.setText("Endereço:");

        lbNumeroDelivery.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbNumeroDelivery.setText("Número:");

        lbBairroDelivery.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbBairroDelivery.setText("Bairro:");

        lbPontoReferenciaDelivery.setText("Ponto de referência:");

        lbStatusDelivery.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbStatusDelivery.setText("Status:");

        cbStatusDelivery.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnDadosDeliveryLayout = new javax.swing.GroupLayout(pnDadosDelivery);
        pnDadosDelivery.setLayout(pnDadosDeliveryLayout);
        pnDadosDeliveryLayout.setHorizontalGroup(
            pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosDeliveryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbStatusDelivery)
                    .addComponent(lbNumeroDelivery)
                    .addComponent(lbPontoReferenciaDelivery)
                    .addComponent(lbEnderecoDelivery)
                    .addComponent(lbCodigoDelivery))
                .addGap(12, 12, 12)
                .addGroup(pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEnderecoDelivery)
                    .addGroup(pnDadosDeliveryLayout.createSequentialGroup()
                        .addComponent(txtNumeroDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbBairroDelivery)
                        .addGap(12, 12, 12)
                        .addComponent(txtBairroDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
                    .addComponent(txtPontoReferenciaDelivery)
                    .addComponent(cbStatusDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnDadosDeliveryLayout.createSequentialGroup()
                        .addComponent(txtCodigoDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbClienteDelivery)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        pnDadosDeliveryLayout.setVerticalGroup(
            pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosDeliveryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigoDelivery)
                    .addComponent(txtCodigoDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbClienteDelivery)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEnderecoDelivery)
                    .addComponent(txtEnderecoDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumeroDelivery)
                    .addComponent(txtNumeroDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBairroDelivery)
                    .addComponent(txtBairroDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPontoReferenciaDelivery)
                    .addComponent(txtPontoReferenciaDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStatusDelivery)
                    .addComponent(cbStatusDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pnProdutosDelivery.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos do Delivery"));

        btAdicionarProduto.setMnemonic('p');
        btAdicionarProduto.setText("Adicionar produto");
        btAdicionarProduto.setMaximumSize(new java.awt.Dimension(120, 40));
        btAdicionarProduto.setMinimumSize(new java.awt.Dimension(120, 40));
        btAdicionarProduto.setPreferredSize(new java.awt.Dimension(120, 40));
        btAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarProdutoActionPerformed(evt);
            }
        });

        btExcluirProduto.setText("Excluir lançamento");
        btExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirProdutoActionPerformed(evt);
            }
        });

        lbValorTotalDelivery.setText("Valor total:");

        txtValorTotalDelivery.setEditable(false);

        tbGradeProdutoDelivery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spGradeProdutoDelivery.setViewportView(tbGradeProdutoDelivery);

        javax.swing.GroupLayout pnProdutosDeliveryLayout = new javax.swing.GroupLayout(pnProdutosDelivery);
        pnProdutosDelivery.setLayout(pnProdutosDeliveryLayout);
        pnProdutosDeliveryLayout.setHorizontalGroup(
            pnProdutosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutosDeliveryLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnProdutosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnProdutosDeliveryLayout.createSequentialGroup()
                        .addComponent(btAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbValorTotalDelivery)
                        .addGap(12, 12, 12)
                        .addComponent(txtValorTotalDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spGradeProdutoDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnProdutosDeliveryLayout.setVerticalGroup(
            pnProdutosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProdutosDeliveryLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnProdutosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValorTotalDelivery)
                    .addComponent(txtValorTotalDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(spGradeProdutoDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnDadosDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnProdutosDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnFormularioLayout.setVerticalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnDadosDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnProdutosDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Cadastro", pnFormulario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnAbas))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pnAbas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarProdutoActionPerformed
        //Abre a JInternalFrame no JDesktopPane dpArea
        if (dpArea != null) {
            DeliveryAdicionarProdutoGUI p = new DeliveryAdicionarProdutoGUI(dpArea);
            dpArea.add(p);
            p.setLocation(calculaLocal(dpArea, p));
            p.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Impossível abrir a janela interna, pois o \n"
                    + "DesktopPane destino não está definido!");
        }
    }//GEN-LAST:event_btAdicionarProdutoActionPerformed

    private void btExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExcluirProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarProduto;
    private javax.swing.JButton btExcluirProduto;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisarDelivery;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbStatusDelivery;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel lbBairroDelivery;
    private javax.swing.JLabel lbClienteDelivery;
    private javax.swing.JLabel lbCodigoDelivery;
    private javax.swing.JLabel lbEnderecoDelivery;
    private javax.swing.JLabel lbNumeroDelivery;
    private javax.swing.JLabel lbPesquisarDelivery;
    private javax.swing.JLabel lbPontoReferenciaDelivery;
    private javax.swing.JLabel lbStatusDelivery;
    private javax.swing.JLabel lbValorTotalDelivery;
    private javax.swing.JTabbedPane pnAbas;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnDadosDelivery;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JPanel pnPesquisaDelivery;
    private javax.swing.JPanel pnPesquisar;
    private javax.swing.JPanel pnProdutosDelivery;
    private javax.swing.JScrollPane spGradePesquisaDelivery;
    private javax.swing.JScrollPane spGradeProdutoDelivery;
    private javax.swing.JTable tbGradePesquisaDelivery;
    private javax.swing.JTable tbGradeProdutoDelivery;
    private javax.swing.JTextField txtBairroDelivery;
    private javax.swing.JTextField txtCodigoDelivery;
    private javax.swing.JTextField txtEnderecoDelivery;
    private javax.swing.JTextField txtNumeroDelivery;
    private javax.swing.JTextField txtPesquisarDelivery;
    private javax.swing.JTextField txtPontoReferenciaDelivery;
    private javax.swing.JFormattedTextField txtValorTotalDelivery;
    // End of variables declaration//GEN-END:variables

    /* Para abrir os JInternalFrame adicionais DeliveryAdicionarProdutoGUI
     * e DeliveryAlterarProdutoGUI centralizados */
    private Point calculaLocal(JDesktopPane dpArea, JInternalFrame p) {
        return new Point(((dpArea.getWidth() - p.getWidth()) / 2), ((dpArea.getHeight() - p.getHeight()) / 2));
    }
}
