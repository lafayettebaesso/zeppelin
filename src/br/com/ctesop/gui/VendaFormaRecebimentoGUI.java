package br.com.ctesop.gui;

import br.com.ctesop.dao.CaixaDAO;
import br.com.ctesop.to.CaixaTO;
import br.com.ctesop.to.VendaTO;
import java.awt.Point;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class VendaFormaRecebimentoGUI extends javax.swing.JInternalFrame {

    private VendaTO vendaTO;
    private CaixaTO caixaTO;
    
    //Atribudo para armazenar qual JDesktopPane irá receber o JInternalFrame
    private JDesktopPane dpArea = null;
    
    public VendaFormaRecebimentoGUI(VendaTO vendaTO, JDesktopPane dpArea) {
        this.vendaTO = vendaTO;
        this.dpArea = dpArea;
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
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

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

        bgFormaPagamento.add(rbAVista);
        rbAVista.setText("À vista");

        bgFormaPagamento.add(rbAPrazo);
        rbAPrazo.setText("A prazo");

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
                    .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnFormaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
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

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        //Forma de pagamento selecionada: Á vista
        if (rbAVista.isSelected()) {
            try {

                caixaTO = CaixaDAO.consultarCaixaAberto();

                if (situacaoCaixa(true)) {
                    RecebimentoGUI recebimentoGUI = new RecebimentoGUI(vendaTO, this);
                    dpArea.add(recebimentoGUI);
                    recebimentoGUI.setLocation((dpArea.getWidth() - recebimentoGUI.getWidth()) / 2,
                            (dpArea.getHeight() - recebimentoGUI.getHeight()) / 2);
                    recebimentoGUI.setVisible(true);
                }
            } catch (Exception ex) {
                ex.printStackTrace();

            }

        //Forma de recebimento selecionada: A prazo
        } else {
            ContasReceberGUI contasReceberGUI = new ContasReceberGUI(vendaTO);
            dpArea.add(contasReceberGUI);
            contasReceberGUI.setLocation((dpArea.getWidth() - contasReceberGUI.getWidth()) / 2,
                    (dpArea.getHeight() - contasReceberGUI.getHeight()) / 2);
            contasReceberGUI.setVisible(true);
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    //Método que verifica, no pagamento, a situação do caixa
    private boolean situacaoCaixa(boolean b) {
        //Verifica se o caixa está fechado. Caso esteja, é apresentada uma mensagem
        if (caixaTO == null) {
            //Para as mensagens de erro. Esta puxando do pacote "br.com.ctesop.componentes" da classe "JOptionPane"
            br.com.ctesop.componentes.JOptionPane.showWarningDialog(this, "O caixa não está aberto.\n"
                    + "É necessário abri-lo antes de confirmar o pagamento.\n\n"
                    + "Instruções:\n- Feche este alerta clicando no 'Ok';\n"
                    + "- No Menu superior clique em 'Movimentação' > 'Abrir/Fechar o caixa';\n"
                    + "- Faça o lançamento do valor de abertura e clique em 'Abrir o caixa';\n"
                    + "- Feche a tela de abertura do caixa e prossiga com a operação de pagamento.");
            return false;
        }

        //Verifica se o valor da compra é maior que o saldo do caixa. Caso seja, é apresentada uma mensagem.
        if (vendaTO.getValorTotalVenda() > caixaTO.getSaldoCaixa()) {
            //Para as mensagens de erro. Esta puxando do pacote "br.com.ctesop.componentes" da classe "JOptionPane"
            br.com.ctesop.componentes.JOptionPane.showWarningDialog(this, "O valor da compra não pode"
                    + " ser maior que o saldo do caixa.");
            return false;
        }
        return true;
    }

    //Para abrir o JInternalFrame adicional ProdutoGUI centralizados
    private Point calculaLocal(JDesktopPane dpArea, JInternalFrame p) {
        return new Point(((dpArea.getWidth() - p.getWidth()) / 2), ((dpArea.getHeight() - p.getHeight()) / 2));
    }
    

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
