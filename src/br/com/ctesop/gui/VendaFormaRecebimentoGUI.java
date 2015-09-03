package br.com.ctesop.gui;

public class VendaFormaRecebimentoGUI extends javax.swing.JInternalFrame {

    public VendaFormaRecebimentoGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgFormaPagamento = new javax.swing.ButtonGroup();
        pnBotoes = new javax.swing.JPanel();
        btConfirmar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        pnFormaPagamento = new javax.swing.JPanel();
        rbAVista = new javax.swing.JRadioButton();
        rbAPrazo = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Forma de recebimento");

        btConfirmar.setMnemonic('n');
        btConfirmar.setText("Confirmar");
        btConfirmar.setMaximumSize(new java.awt.Dimension(120, 40));
        btConfirmar.setMinimumSize(new java.awt.Dimension(120, 40));
        btConfirmar.setPreferredSize(new java.awt.Dimension(120, 40));

        btSair.setMnemonic('s');
        btSair.setText("Sair");
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
                .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnFormaPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Forma de recebimento"));

        rbAVista.setText("À vista");

        rbAPrazo.setText("À prazo");

        javax.swing.GroupLayout pnFormaPagamentoLayout = new javax.swing.GroupLayout(pnFormaPagamento);
        pnFormaPagamento.setLayout(pnFormaPagamentoLayout);
        pnFormaPagamentoLayout.setHorizontalGroup(
            pnFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormaPagamentoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAVista)
                    .addComponent(rbAPrazo))
                .addGap(0, 0, 0))
        );
        pnFormaPagamentoLayout.setVerticalGroup(
            pnFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormaPagamentoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(rbAVista)
                .addGap(12, 12, 12)
                .addComponent(rbAPrazo)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnFormaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgFormaPagamento;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnFormaPagamento;
    private javax.swing.JRadioButton rbAPrazo;
    private javax.swing.JRadioButton rbAVista;
    // End of variables declaration//GEN-END:variables
}
