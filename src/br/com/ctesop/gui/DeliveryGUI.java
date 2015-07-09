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
        btCancelar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        pnAbas = new javax.swing.JTabbedPane();
        pnFormulario = new javax.swing.JPanel();
        pnDadosDelivery = new javax.swing.JPanel();
        lbCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lbCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        btPesquisarCliente = new javax.swing.JButton();
        lbEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lbNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lbPontoReferencia = new javax.swing.JLabel();
        txtPontoReferencia = new javax.swing.JTextField();
        lbStatus = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox();
        pnProdutosDelivery = new javax.swing.JPanel();
        btPesquisar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        lbValorTotal = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        spGradeProdutoDelivery = new javax.swing.JScrollPane();
        tbGradeProdutoDelivery = new javax.swing.JTable();
        pnPesquisaDelivery = new javax.swing.JPanel();
        pnPesquisar = new javax.swing.JPanel();
        lbPesquisarDelivery = new javax.swing.JLabel();
        txtPesquisarDelivery = new javax.swing.JTextField();
        btPesquisarDelivery = new javax.swing.JButton();
        spGradePesquisaDelivery = new javax.swing.JScrollPane();
        tbGradePesquisaDelivery = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);

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

        btCancelar.setMnemonic('c');
        btCancelar.setText("Cancelar");
        btCancelar.setMaximumSize(new java.awt.Dimension(120, 40));
        btCancelar.setMinimumSize(new java.awt.Dimension(120, 40));
        btCancelar.setPreferredSize(new java.awt.Dimension(120, 40));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnDadosDelivery.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Delivery"));

        lbCodigo.setText("Código:");

        txtCodigo.setEditable(false);

        lbCliente.setText("Cliente:");

        btPesquisarCliente.setText("...");
        btPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarClienteActionPerformed(evt);
            }
        });

        lbEndereco.setText("Endereço:");

        lbNumero.setText("Número:");

        lbBairro.setText("Bairro:");

        lbPontoReferencia.setText("Ponto de referência:");

        lbStatus.setText("Status:");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));

        javax.swing.GroupLayout pnDadosDeliveryLayout = new javax.swing.GroupLayout(pnDadosDelivery);
        pnDadosDelivery.setLayout(pnDadosDeliveryLayout);
        pnDadosDeliveryLayout.setHorizontalGroup(
            pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosDeliveryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbStatus)
                    .addComponent(lbNumero)
                    .addComponent(lbPontoReferencia)
                    .addComponent(lbEndereco)
                    .addComponent(lbCodigo))
                .addGap(12, 12, 12)
                .addGroup(pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereco)
                    .addGroup(pnDadosDeliveryLayout.createSequentialGroup()
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro))
                    .addComponent(txtPontoReferencia)
                    .addGroup(pnDadosDeliveryLayout.createSequentialGroup()
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnDadosDeliveryLayout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliente)
                        .addGap(15, 15, 15)
                        .addComponent(btPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        pnDadosDeliveryLayout.setVerticalGroup(
            pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosDeliveryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCliente)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPontoReferencia)
                    .addComponent(txtPontoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnDadosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStatus)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pnProdutosDelivery.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos do Delivery"));

        btPesquisar.setMnemonic('p');
        btPesquisar.setText("Pesquisar");
        btPesquisar.setMaximumSize(new java.awt.Dimension(120, 40));
        btPesquisar.setMinimumSize(new java.awt.Dimension(120, 40));
        btPesquisar.setPreferredSize(new java.awt.Dimension(120, 40));
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.setMaximumSize(new java.awt.Dimension(120, 40));
        btEditar.setMinimumSize(new java.awt.Dimension(120, 40));
        btEditar.setPreferredSize(new java.awt.Dimension(120, 40));
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        lbValorTotal.setText("Valor total:");

        txtValorTotal.setEditable(false);

        tbGradeProdutoDelivery.setModel(new javax.swing.table.DefaultTableModel(
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
        spGradeProdutoDelivery.setViewportView(tbGradeProdutoDelivery);

        javax.swing.GroupLayout pnProdutosDeliveryLayout = new javax.swing.GroupLayout(pnProdutosDelivery);
        pnProdutosDelivery.setLayout(pnProdutosDeliveryLayout);
        pnProdutosDeliveryLayout.setHorizontalGroup(
            pnProdutosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutosDeliveryLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnProdutosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnProdutosDeliveryLayout.createSequentialGroup()
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spGradeProdutoDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnProdutosDeliveryLayout.setVerticalGroup(
            pnProdutosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProdutosDeliveryLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnProdutosDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValorTotal)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(pnProdutosDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Cadastro", pnFormulario);

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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spGradePesquisaDelivery.setViewportView(tbGradePesquisaDelivery);

        javax.swing.GroupLayout pnPesquisaDeliveryLayout = new javax.swing.GroupLayout(pnPesquisaDelivery);
        pnPesquisaDelivery.setLayout(pnPesquisaDeliveryLayout);
        pnPesquisaDeliveryLayout.setHorizontalGroup(
            pnPesquisaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaDeliveryLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spGradePesquisaDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnPesquisaDeliveryLayout.setVerticalGroup(
            pnPesquisaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaDeliveryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(spGradePesquisaDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnAbas.addTab("Delivery", pnPesquisaDelivery);

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
                .addComponent(pnAbas)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
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
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        //Abre a JInternalFrame no JDesktopPane dpArea
        if (dpArea != null) {
            DeliveryAlterarProdutoGUI p = new DeliveryAlterarProdutoGUI();
            dpArea.add(p);
            p.setLocation(calculaLocal(dpArea, p));
            p.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Impossível abrir a janela interna, pois o \n"
                    + "DesktopPane destino não está definido!");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarClienteActionPerformed
        //Abre a JInternalFrame no JDesktopPane dpArea
        if (dpArea != null) {
            ClienteGUI p = new ClienteGUI();
            dpArea.add(p);
            p.setLocation(calculaLocal(dpArea, p));
            p.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Impossível abrir a janela interna, pois o \n"
                    + "DesktopPane destino não está definido!");
        }
    }//GEN-LAST:event_btPesquisarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btPesquisarCliente;
    private javax.swing.JButton btPesquisarDelivery;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbStatus;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbPesquisarDelivery;
    private javax.swing.JLabel lbPontoReferencia;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbValorTotal;
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
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPesquisarDelivery;
    private javax.swing.JTextField txtPontoReferencia;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables

    /* Para abrir os JInternalFrame adicionais DeliveryAdicionarProdutoGUI
     * e DeliveryAlterarProdutoGUI centralizados */
    private Point calculaLocal(JDesktopPane dpArea, JInternalFrame p) {
        return new Point(((dpArea.getWidth() - p.getWidth()) / 2), ((dpArea.getHeight() - p.getHeight()) / 2));
    }
}
