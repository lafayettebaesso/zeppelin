package br.com.ctesop.gui;

import br.com.ctesop.dao.CaixaDAO;
import br.com.ctesop.dao.MovimentoCaixaDAO;
import br.com.ctesop.dao.PagamentoDAO;
import br.com.ctesop.to.CaixaTO;
import br.com.ctesop.to.CompraTO;
import br.com.ctesop.to.MovimentoCaixaTO;
import br.com.ctesop.to.PagamentoTO;
import br.com.ctesop.to.ParcelasContasPagarTO;
import java.awt.Point;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class PagamentoGUI extends javax.swing.JInternalFrame {

    private CompraTO compraTO;
    private ParcelasContasPagarTO parcelasContasPagarTO;
    private CompraFormaPagamentoGUI compraFormaRecebimentoGUI;
    private JDesktopPane dpArea = null;
    private float pagamento;
    private float troco = 0;
    private float total;
    private float x = 0;
    private int idPagamento = 0;
    private int idMovimentoCaixa = 0;
    private int idParcelasContasPagarTO = 0;

    public PagamentoGUI(CompraTO compraTO, CompraFormaPagamentoGUI compraFormaRecebimentoGUI) {
        this.compraTO = compraTO;
        this.compraFormaRecebimentoGUI = compraFormaRecebimentoGUI;
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        txtDataPagamento.setText(sdf.format(new java.util.Date()));
        NumberFormat nf = NumberFormat.getNumberInstance();
        txtTotalContaPagamento.setText(nf.format(compraTO.getValorCompra()));
    }

    public PagamentoGUI(ParcelasContasPagarTO parcelasContasPagarTO) {
        this.parcelasContasPagarTO = parcelasContasPagarTO;
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        txtDataPagamento.setText(sdf.format(new java.util.Date()));
        NumberFormat nf = NumberFormat.getNumberInstance();
        txtTotalContaPagamento.setText(nf.format(parcelasContasPagarTO.getValorParcelasContasPagar()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBotoes = new javax.swing.JPanel();
        btConfirmar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        pnDescontoAcrescimo = new javax.swing.JPanel();
        lbDescontoPagamento = new javax.swing.JLabel();
        txtDescontoPagamento = new javax.swing.JFormattedTextField();
        lbAcrescimoPagamento = new javax.swing.JLabel();
        txtAcrescimoPagamento = new javax.swing.JFormattedTextField();
        lbDinheiroPagamento = new javax.swing.JLabel();
        txtDinheiroPagamento = new javax.swing.JFormattedTextField();
        lbDataPagamento = new javax.swing.JLabel();
        txtDataPagamento = new javax.swing.JFormattedTextField();
        pnLancamentos = new javax.swing.JPanel();
        lbTotalContaPagamento = new javax.swing.JLabel();
        txtTotalContaPagamento = new javax.swing.JFormattedTextField();
        lbTrocoPagamento = new javax.swing.JLabel();
        txtTrocoPagamento = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Pagamento");

        btConfirmar.setMnemonic('o');
        btConfirmar.setText("Confirmar");
        btConfirmar.setMaximumSize(new java.awt.Dimension(120, 40));
        btConfirmar.setMinimumSize(new java.awt.Dimension(120, 40));
        btConfirmar.setPreferredSize(new java.awt.Dimension(120, 40));
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

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

        btCancelar.setMnemonic('c');
        btCancelar.setText("Cancelar");
        btCancelar.setMaximumSize(new java.awt.Dimension(120, 40));
        btCancelar.setMinimumSize(new java.awt.Dimension(120, 40));
        btCancelar.setPreferredSize(new java.awt.Dimension(120, 40));
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBotoesLayout = new javax.swing.GroupLayout(pnBotoes);
        pnBotoes.setLayout(pnBotoesLayout);
        pnBotoesLayout.setHorizontalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createSequentialGroup()
                .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnDescontoAcrescimo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnDescontoAcrescimo.setPreferredSize(new java.awt.Dimension(285, 78));

        lbDescontoPagamento.setText("Desconto:");

        txtDescontoPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtDescontoPagamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescontoPagamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescontoPagamentoFocusLost(evt);
            }
        });

        lbAcrescimoPagamento.setText("Juros:");

        txtAcrescimoPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtAcrescimoPagamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAcrescimoPagamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAcrescimoPagamentoFocusLost(evt);
            }
        });

        lbDinheiroPagamento.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbDinheiroPagamento.setText("Valor pago:");

        txtDinheiroPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtDinheiroPagamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDinheiroPagamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDinheiroPagamentoFocusLost(evt);
            }
        });

        lbDataPagamento.setText("Data pgto:");

        txtDataPagamento.setEditable(false);
        txtDataPagamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnDescontoAcrescimoLayout = new javax.swing.GroupLayout(pnDescontoAcrescimo);
        pnDescontoAcrescimo.setLayout(pnDescontoAcrescimoLayout);
        pnDescontoAcrescimoLayout.setHorizontalGroup(
            pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDescontoAcrescimoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDataPagamento)
                    .addComponent(lbDescontoPagamento)
                    .addComponent(lbDinheiroPagamento)
                    .addComponent(lbAcrescimoPagamento))
                .addGap(12, 12, 12)
                .addGroup(pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDescontoPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtAcrescimoPagamento)
                    .addComponent(txtDataPagamento)
                    .addComponent(txtDinheiroPagamento))
                .addGap(12, 12, 12))
        );
        pnDescontoAcrescimoLayout.setVerticalGroup(
            pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDescontoAcrescimoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDinheiroPagamento)
                    .addComponent(txtDinheiroPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescontoPagamento)
                    .addComponent(txtDescontoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAcrescimoPagamento)
                    .addComponent(txtAcrescimoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataPagamento)
                    .addComponent(txtDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pnLancamentos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbTotalContaPagamento.setText("Total da conta:");

        txtTotalContaPagamento.setEditable(false);
        txtTotalContaPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotalContaPagamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbTrocoPagamento.setText("Troco:");

        txtTrocoPagamento.setEditable(false);
        txtTrocoPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtTrocoPagamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnLancamentosLayout = new javax.swing.GroupLayout(pnLancamentos);
        pnLancamentos.setLayout(pnLancamentosLayout);
        pnLancamentosLayout.setHorizontalGroup(
            pnLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLancamentosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTrocoPagamento)
                    .addComponent(lbTotalContaPagamento))
                .addGap(12, 12, 12)
                .addGroup(pnLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTotalContaPagamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtTrocoPagamento))
                .addGap(12, 12, 12))
        );
        pnLancamentosLayout.setVerticalGroup(
            pnLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLancamentosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotalContaPagamento)
                    .addComponent(txtTotalContaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTrocoPagamento)
                    .addComponent(txtTrocoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(pnDescontoAcrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(pnLancamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnLancamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnDescontoAcrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        try {
            if (!validar()) {
                return;
            }

            //Instanciação do objeto utilizados na classe
            PagamentoTO pagamentoTO = new PagamentoTO();
            MovimentoCaixaTO movimentoCaixaTO = new MovimentoCaixaTO();
            CaixaTO caixaTO = CaixaDAO.consultarCaixaAberto();
            if (caixaTO == null) {
                JOptionPane.showMessageDialog(this, "O caixa está fechado");
                return;
            }
            
            //Declaração das formatações dos dados usado logo abaixo na classe
            NumberFormat nf = NumberFormat.getNumberInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            //Inserção dos dados referente ao Pagamento
            pagamentoTO.setIdPagamento(0);
            pagamentoTO.setIdParcelasContasPagar(null);

            pagamentoTO.setValorPagamento(nf.parse(txtTotalContaPagamento.getText()).floatValue());

            if (txtDescontoPagamento.getText().trim().length() == 0) {
                pagamentoTO.setDescontoPagamento(0);
            } else {
                pagamentoTO.setDescontoPagamento(nf.parse(txtDescontoPagamento.getText()).floatValue());
            }

            if (txtAcrescimoPagamento.getText().trim().length() == 0) {
                pagamentoTO.setJurosPagamento(0);
            } else {
                pagamentoTO.setJurosPagamento(nf.parse(txtAcrescimoPagamento.getText()).floatValue());
            }

            pagamentoTO.setDataPagamento(sdf.parse(txtDataPagamento.getText()));

            if (idPagamento == 0) {
                idPagamento = PagamentoDAO.inserirRetornandoId(pagamentoTO);
                pagamentoTO.setIdPagamento(idPagamento);

            } else {
                PagamentoDAO.alterar(pagamentoTO);
            }

            //Inserção dos dados referente ao MovimentoCaixa
            movimentoCaixaTO.setIdMovimentoCaixa(0);
            movimentoCaixaTO.setIdCaixa(CaixaDAO.consultarCaixaAberto().getIdCaixa());
            movimentoCaixaTO.setIdRecebimento(null);
            movimentoCaixaTO.setIdPagamento(idPagamento);
            movimentoCaixaTO.setValorMovimentoCaixa(nf.parse(txtTotalContaPagamento.getText()).floatValue());
            movimentoCaixaTO.setTipoMovimentoCaixa("PAGAMENTO");

            if (idMovimentoCaixa == 0) {
                idMovimentoCaixa = MovimentoCaixaDAO.inserirRetornandoId(movimentoCaixaTO);
            } else {
                MovimentoCaixaDAO.alterar(movimentoCaixaTO);
            }

            //Atualização do saldo do caixa
            float saldoCaixa = caixaTO.getSaldoCaixa() - pagamentoTO.getValorPagamento();
            caixaTO.setSaldoCaixa(saldoCaixa);
            CaixaDAO.alterar(caixaTO);
            
            br.com.ctesop.componentes.JOptionPane.showMessageDialog(this, "Pagamento realizado com sucesso!");
            dispose();
            compraFormaRecebimentoGUI.dispose();
        } catch (Exception e) {
            e.printStackTrace();
            br.com.ctesop.componentes.JOptionPane.showMessageDialog(this, "Erro ao salvar!\nDados: " + e.getMessage());
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void txtDinheiroPagamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDinheiroPagamentoFocusLost
        try {
            NumberFormat nf = NumberFormat.getNumberInstance();
            pagamento = (nf.parse(txtDinheiroPagamento.getText()).floatValue()
                    - nf.parse(txtTotalContaPagamento.getText()).floatValue());
            nf.setMinimumFractionDigits(2);
            nf.setMaximumFractionDigits(2);

            if (pagamento <= troco) {
                txtTrocoPagamento.setText("0,00");
            } else {
                txtTrocoPagamento.setText(nf.format(pagamento));
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtDinheiroPagamentoFocusLost

    private void txtDescontoPagamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescontoPagamentoFocusLost
        try {
            NumberFormat nf = NumberFormat.getNumberInstance();
            total = (compraTO.getValorCompra() - nf.parse(txtDescontoPagamento.getText()).floatValue());
            nf.setMinimumFractionDigits(2);
            nf.setMaximumFractionDigits(2);

            txtTotalContaPagamento.setText(nf.format(total));

            troco = (nf.parse(txtDinheiroPagamento.getText()).floatValue()) - (total);

            if (troco <= x) {
                txtTrocoPagamento.setText("0,00");
            } else {
                txtTrocoPagamento.setText(nf.format(troco));
            }

            txtAcrescimoPagamento.setEnabled(false);
            txtAcrescimoPagamento.setText("0,00");
            btConfirmar.requestFocus();

        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtDescontoPagamentoFocusLost

    private void txtAcrescimoPagamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAcrescimoPagamentoFocusLost
        try {
            NumberFormat nf = NumberFormat.getNumberInstance();
            total = (compraTO.getValorCompra() + nf.parse(txtDescontoPagamento.getText()).floatValue());
            nf.setMinimumFractionDigits(2);
            nf.setMaximumFractionDigits(2);

            txtTotalContaPagamento.setText(nf.format(total));

            troco = (nf.parse(txtDinheiroPagamento.getText()).floatValue()) - (total);

            if (troco <= x) {
                txtTrocoPagamento.setText("0,00");
            } else {
                txtTrocoPagamento.setText(nf.format(troco));
            }

            txtDescontoPagamento.setEnabled(false);
            txtDescontoPagamento.setText("0,00");
            btConfirmar.requestFocus();

        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtAcrescimoPagamentoFocusLost

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limparForm();
    }//GEN-LAST:event_btCancelarActionPerformed

    public void limparForm() {
        txtDinheiroPagamento.setText("");
        txtDescontoPagamento.setText("");
        txtAcrescimoPagamento.setText("");

        NumberFormat nf = NumberFormat.getNumberInstance();
        txtTotalContaPagamento.setText(nf.format(compraTO.getValorCompra()));

        txtTrocoPagamento.setText("");
        txtAcrescimoPagamento.setEnabled(true);
        txtDescontoPagamento.setEnabled(true);
    }

    private boolean validar() {
        return true;
    }

    /* Para abrir os JInternalFrame adicionais DeliveryAdicionarProdutoGUI
     * e DeliveryAlterarProdutoGUI centralizados */
    private Point calculaLocal(JDesktopPane dpArea, JInternalFrame p) {
        return new Point(((dpArea.getWidth() - p.getWidth()) / 2), ((dpArea.getHeight() - p.getHeight()) / 2));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btFechar;
    private javax.swing.JLabel lbAcrescimoPagamento;
    private javax.swing.JLabel lbDataPagamento;
    private javax.swing.JLabel lbDescontoPagamento;
    private javax.swing.JLabel lbDinheiroPagamento;
    private javax.swing.JLabel lbTotalContaPagamento;
    private javax.swing.JLabel lbTrocoPagamento;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnDescontoAcrescimo;
    private javax.swing.JPanel pnLancamentos;
    private javax.swing.JFormattedTextField txtAcrescimoPagamento;
    private javax.swing.JFormattedTextField txtDataPagamento;
    private javax.swing.JFormattedTextField txtDescontoPagamento;
    private javax.swing.JFormattedTextField txtDinheiroPagamento;
    private javax.swing.JFormattedTextField txtTotalContaPagamento;
    private javax.swing.JFormattedTextField txtTrocoPagamento;
    // End of variables declaration//GEN-END:variables

}
