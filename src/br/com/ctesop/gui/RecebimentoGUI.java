package br.com.ctesop.gui;

public class RecebimentoGUI extends javax.swing.JInternalFrame {

    public RecebimentoGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBotoes = new javax.swing.JPanel();
        btConcluir = new javax.swing.JButton();
        btExcluirPedido = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        pn = new javax.swing.JPanel();
        lbDinheiro = new javax.swing.JLabel();
        txtDinheiro = new javax.swing.JTextField();
        btDinheiro = new javax.swing.JButton();
        lbDebito = new javax.swing.JLabel();
        txtDebito = new javax.swing.JTextField();
        btDebito = new javax.swing.JButton();
        lbCredito = new javax.swing.JLabel();
        txtCredito = new javax.swing.JTextField();
        btCredito = new javax.swing.JButton();
        lbCheque = new javax.swing.JLabel();
        txtCheque = new javax.swing.JTextField();
        btCheque = new javax.swing.JButton();
        pnTotal = new javax.swing.JPanel();
        lbTotalConta = new javax.swing.JLabel();
        txtTotalConta = new javax.swing.JTextField();
        lbTotalDesconto = new javax.swing.JLabel();
        txtTotalDesconto = new javax.swing.JTextField();
        lbTotalAcrescimo = new javax.swing.JLabel();
        txtTotalAcrescimo = new javax.swing.JTextField();
        lbTotalPagar = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        spGrade = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();
        pnDescontoAcrescimo = new javax.swing.JPanel();
        lbDesconto = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JTextField();
        btDesconto = new javax.swing.JButton();
        lbAcrescimo = new javax.swing.JLabel();
        txtAcrescimo = new javax.swing.JTextField();
        btAcrescimo = new javax.swing.JButton();
        pnTotalCliente = new javax.swing.JPanel();
        lbTotalRecebido = new javax.swing.JLabel();
        txtTotalRecebido = new javax.swing.JTextField();
        lbTotalRestante = new javax.swing.JLabel();
        txtTotalRestante = new javax.swing.JTextField();
        lbTroco = new javax.swing.JLabel();
        txtTroco = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Recebimento");

        btConcluir.setMnemonic('c');
        btConcluir.setText("Concluir");
        btConcluir.setMaximumSize(new java.awt.Dimension(120, 40));
        btConcluir.setMinimumSize(new java.awt.Dimension(120, 40));
        btConcluir.setPreferredSize(new java.awt.Dimension(120, 40));

        btExcluirPedido.setMnemonic('e');
        btExcluirPedido.setText("Excluir pedido");
        btExcluirPedido.setMaximumSize(new java.awt.Dimension(120, 40));
        btExcluirPedido.setMinimumSize(new java.awt.Dimension(120, 40));
        btExcluirPedido.setPreferredSize(new java.awt.Dimension(120, 40));

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
                .addComponent(btConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btExcluirPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btExcluirPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbDinheiro.setText("Dinheiro:");

        btDinheiro.setText("Adicionar");

        lbDebito.setText("Débito:");

        btDebito.setText("Adicionar");

        lbCredito.setText("Crédito:");

        btCredito.setText("Adicionar");

        lbCheque.setText("Cheque:");

        btCheque.setText("Adicionar");

        javax.swing.GroupLayout pnLayout = new javax.swing.GroupLayout(pn);
        pn.setLayout(pnLayout);
        pnLayout.setHorizontalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDinheiro)
                    .addComponent(lbCredito)
                    .addComponent(lbCheque)
                    .addComponent(lbDebito))
                .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(txtDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(txtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)
                            .addComponent(btDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnLayout.createSequentialGroup()
                                .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(btCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnLayout.createSequentialGroup()
                                .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(btCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnLayout.setVerticalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDinheiro)
                    .addComponent(txtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDebito))
                .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDebito))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDinheiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCredito)
                    .addComponent(btCredito))
                .addGap(8, 8, 8)
                .addGroup(pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCheque)
                    .addComponent(btCheque))
                .addGap(8, 8, 8))
        );

        pnTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnTotal.setPreferredSize(new java.awt.Dimension(320, 120));

        lbTotalConta.setText("Total da conta:");

        txtTotalConta.setEditable(false);

        lbTotalDesconto.setText("Desconto:");

        txtTotalDesconto.setEditable(false);

        lbTotalAcrescimo.setText("Acréscimo:");

        txtTotalAcrescimo.setEditable(false);

        lbTotalPagar.setText("Total a receber:");

        txtTotalPagar.setEditable(false);

        javax.swing.GroupLayout pnTotalLayout = new javax.swing.GroupLayout(pnTotal);
        pnTotal.setLayout(pnTotalLayout);
        pnTotalLayout.setHorizontalGroup(
            pnTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTotalConta)
                    .addComponent(lbTotalAcrescimo)
                    .addComponent(lbTotalPagar)
                    .addComponent(lbTotalDesconto))
                .addGap(12, 12, 12)
                .addGroup(pnTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTotalLayout.createSequentialGroup()
                        .addGroup(pnTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalAcrescimo)
                            .addComponent(txtTotalDesconto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTotalPagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(pnTotalLayout.createSequentialGroup()
                        .addComponent(txtTotalConta)
                        .addContainerGap())))
        );
        pnTotalLayout.setVerticalGroup(
            pnTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTotalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalConta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTotalConta))
                .addGap(8, 8, 8)
                .addGroup(pnTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotalDesconto)
                    .addComponent(txtTotalDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(pnTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotalAcrescimo)
                    .addComponent(txtTotalAcrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(pnTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotalPagar)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        spGrade.setViewportView(tbGrade);

        pnDescontoAcrescimo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnDescontoAcrescimo.setPreferredSize(new java.awt.Dimension(285, 78));

        lbDesconto.setText("Desconto:");

        btDesconto.setText("Adicionar");

        lbAcrescimo.setText("Acréscimo:");

        btAcrescimo.setText("Adicionar");

        javax.swing.GroupLayout pnDescontoAcrescimoLayout = new javax.swing.GroupLayout(pnDescontoAcrescimo);
        pnDescontoAcrescimo.setLayout(pnDescontoAcrescimoLayout);
        pnDescontoAcrescimoLayout.setHorizontalGroup(
            pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDescontoAcrescimoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbAcrescimo)
                    .addComponent(lbDesconto))
                .addGap(14, 14, 14)
                .addGroup(pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDescontoAcrescimoLayout.createSequentialGroup()
                        .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDescontoAcrescimoLayout.createSequentialGroup()
                        .addComponent(txtAcrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btAcrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        pnDescontoAcrescimoLayout.setVerticalGroup(
            pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDescontoAcrescimoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDesconto)
                    .addComponent(btDesconto))
                .addGap(8, 8, 8)
                .addGroup(pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAcrescimo)
                    .addComponent(txtAcrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAcrescimo))
                .addGap(8, 8, 8))
        );

        pnTotalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnTotalCliente.setPreferredSize(new java.awt.Dimension(320, 120));

        lbTotalRecebido.setText("Total recebido:");

        txtTotalRecebido.setEditable(false);

        lbTotalRestante.setText("Total estante:");

        txtTotalRestante.setEditable(false);

        lbTroco.setText("Troco:");

        txtTroco.setEditable(false);

        javax.swing.GroupLayout pnTotalClienteLayout = new javax.swing.GroupLayout(pnTotalCliente);
        pnTotalCliente.setLayout(pnTotalClienteLayout);
        pnTotalClienteLayout.setHorizontalGroup(
            pnTotalClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTotalClienteLayout.createSequentialGroup()
                .addGroup(pnTotalClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTotalClienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnTotalClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTroco)
                            .addComponent(lbTotalRestante))
                        .addGap(12, 12, 12)
                        .addGroup(pnTotalClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTroco, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(txtTotalRestante)))
                    .addGroup(pnTotalClienteLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbTotalRecebido)
                        .addGap(12, 12, 12)
                        .addComponent(txtTotalRecebido)))
                .addGap(12, 12, 12))
        );
        pnTotalClienteLayout.setVerticalGroup(
            pnTotalClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTotalClienteLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnTotalClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTotalRecebido))
                .addGap(13, 13, 13)
                .addGroup(pnTotalClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTotalRestante))
                .addGap(13, 13, 13)
                .addGroup(pnTotalClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTroco)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pnDescontoAcrescimo, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addComponent(spGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnTotalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnDescontoAcrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnTotalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcrescimo;
    private javax.swing.JButton btCheque;
    private javax.swing.JButton btConcluir;
    private javax.swing.JButton btCredito;
    private javax.swing.JButton btDebito;
    private javax.swing.JButton btDesconto;
    private javax.swing.JButton btDinheiro;
    private javax.swing.JButton btExcluirPedido;
    private javax.swing.JButton btFechar;
    private javax.swing.JLabel lbAcrescimo;
    private javax.swing.JLabel lbCheque;
    private javax.swing.JLabel lbCredito;
    private javax.swing.JLabel lbDebito;
    private javax.swing.JLabel lbDesconto;
    private javax.swing.JLabel lbDinheiro;
    private javax.swing.JLabel lbTotalAcrescimo;
    private javax.swing.JLabel lbTotalConta;
    private javax.swing.JLabel lbTotalDesconto;
    private javax.swing.JLabel lbTotalPagar;
    private javax.swing.JLabel lbTotalRecebido;
    private javax.swing.JLabel lbTotalRestante;
    private javax.swing.JLabel lbTroco;
    private javax.swing.JPanel pn;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnDescontoAcrescimo;
    private javax.swing.JPanel pnTotal;
    private javax.swing.JPanel pnTotalCliente;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    private javax.swing.JTextField txtAcrescimo;
    private javax.swing.JTextField txtCheque;
    private javax.swing.JTextField txtCredito;
    private javax.swing.JTextField txtDebito;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtDinheiro;
    private javax.swing.JTextField txtTotalAcrescimo;
    private javax.swing.JTextField txtTotalConta;
    private javax.swing.JTextField txtTotalDesconto;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtTotalRecebido;
    private javax.swing.JTextField txtTotalRestante;
    private javax.swing.JTextField txtTroco;
    // End of variables declaration//GEN-END:variables
}
