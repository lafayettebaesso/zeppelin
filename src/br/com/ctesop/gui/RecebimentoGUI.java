package br.com.ctesop.gui;

import br.com.ctesop.dao.CaixaDAO;
import br.com.ctesop.dao.MovimentoCaixaDAO;
import br.com.ctesop.dao.RecebimentoDAO;
import br.com.ctesop.to.CaixaTO;
import br.com.ctesop.to.MovimentoCaixaTO;
import br.com.ctesop.to.ParcelasContasReceberTO;
import br.com.ctesop.to.RecebimentoTO;
import br.com.ctesop.to.VendaTO;
import java.awt.Point;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class RecebimentoGUI extends javax.swing.JInternalFrame {
    
    private VendaTO vendaTO;
    private ParcelasContasReceberTO parcelasContasReceberTO;
    private VendaFormaRecebimentoGUI vendaFormaRecebimentoGUI;
    private JDesktopPane dpArea = null;
    private float recebimento;
    private float troco = 0;
    private float total;
    private float x = 0;
    private int idRecebimento = 0;
    private int idMovimentoCaixa = 0;
    private int idParcelasContasReceberTO = 0;

    public RecebimentoGUI(VendaTO vendaTO, VendaFormaRecebimentoGUI vendaFormaRecebimentoGUI) {
        this.vendaTO = vendaTO;
        this.vendaFormaRecebimentoGUI = vendaFormaRecebimentoGUI;
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        txtDataRecebimento.setText(sdf.format(new java.util.Date()));
        NumberFormat nf = NumberFormat.getNumberInstance();
        txtTotalContaRecebimento.setText(nf.format(vendaTO.getValorTotalVenda()));
    }
    
    public RecebimentoGUI(ParcelasContasReceberTO parcelasContasReceberTO) {
        this.parcelasContasReceberTO = parcelasContasReceberTO;
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        txtDataRecebimento.setText(sdf.format(new java.util.Date()));
        NumberFormat nf = NumberFormat.getNumberInstance();
        txtTotalContaRecebimento.setText(nf.format(parcelasContasReceberTO.getValorParcelasContasReceber()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBotoes = new javax.swing.JPanel();
        btConfirmar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        pnDescontoAcrescimo = new javax.swing.JPanel();
        lbDescontoRecebimento = new javax.swing.JLabel();
        txtDescontoRecebimento = new javax.swing.JFormattedTextField();
        lbAcrescimoRecebimento = new javax.swing.JLabel();
        txtAcrescimoRecebimento = new javax.swing.JFormattedTextField();
        lbDinheiroRecebimento = new javax.swing.JLabel();
        txtDinheiroRecebimento = new javax.swing.JFormattedTextField();
        lbDataRecebimento = new javax.swing.JLabel();
        txtDataRecebimento = new javax.swing.JFormattedTextField();
        pnLancamentos = new javax.swing.JPanel();
        lbTotalContaRecebimento = new javax.swing.JLabel();
        txtTotalContaRecebimento = new javax.swing.JFormattedTextField();
        lbTrocoRecebimento = new javax.swing.JLabel();
        txtTrocoRecebimento = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Recebimento");

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

        btCancelar.setMnemonic('f');
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
                .addGap(54, 54, 54))
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

        lbDescontoRecebimento.setText("Desconto:");

        txtDescontoRecebimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtDescontoRecebimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescontoRecebimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescontoRecebimentoFocusLost(evt);
            }
        });

        lbAcrescimoRecebimento.setText("Juros:");

        txtAcrescimoRecebimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtAcrescimoRecebimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAcrescimoRecebimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAcrescimoRecebimentoFocusLost(evt);
            }
        });

        lbDinheiroRecebimento.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbDinheiroRecebimento.setText("Valor recebido:");

        txtDinheiroRecebimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtDinheiroRecebimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDinheiroRecebimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDinheiroRecebimentoFocusLost(evt);
            }
        });

        lbDataRecebimento.setText("Data receb.:");

        txtDataRecebimento.setEditable(false);
        txtDataRecebimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnDescontoAcrescimoLayout = new javax.swing.GroupLayout(pnDescontoAcrescimo);
        pnDescontoAcrescimo.setLayout(pnDescontoAcrescimoLayout);
        pnDescontoAcrescimoLayout.setHorizontalGroup(
            pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDescontoAcrescimoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDataRecebimento)
                    .addComponent(lbDescontoRecebimento)
                    .addComponent(lbDinheiroRecebimento)
                    .addComponent(lbAcrescimoRecebimento))
                .addGap(12, 12, 12)
                .addGroup(pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDescontoRecebimento, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtAcrescimoRecebimento)
                    .addComponent(txtDataRecebimento)
                    .addComponent(txtDinheiroRecebimento))
                .addGap(12, 12, 12))
        );
        pnDescontoAcrescimoLayout.setVerticalGroup(
            pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDescontoAcrescimoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDinheiroRecebimento)
                    .addComponent(txtDinheiroRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescontoRecebimento)
                    .addComponent(txtDescontoRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAcrescimoRecebimento)
                    .addComponent(txtAcrescimoRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnDescontoAcrescimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataRecebimento)
                    .addComponent(txtDataRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pnLancamentos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbTotalContaRecebimento.setText("Total da conta:");

        txtTotalContaRecebimento.setEditable(false);
        txtTotalContaRecebimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotalContaRecebimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbTrocoRecebimento.setText("Troco:");

        txtTrocoRecebimento.setEditable(false);
        txtTrocoRecebimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtTrocoRecebimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnLancamentosLayout = new javax.swing.GroupLayout(pnLancamentos);
        pnLancamentos.setLayout(pnLancamentosLayout);
        pnLancamentosLayout.setHorizontalGroup(
            pnLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLancamentosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTrocoRecebimento)
                    .addComponent(lbTotalContaRecebimento))
                .addGap(12, 12, 12)
                .addGroup(pnLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTotalContaRecebimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtTrocoRecebimento))
                .addGap(12, 12, 12))
        );
        pnLancamentosLayout.setVerticalGroup(
            pnLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLancamentosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotalContaRecebimento)
                    .addComponent(txtTotalContaRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTrocoRecebimento)
                    .addComponent(txtTrocoRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(pnDescontoAcrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(pnLancamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
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
            RecebimentoTO recebimentoTO = new RecebimentoTO();
            MovimentoCaixaTO movimentoCaixaTO = new MovimentoCaixaTO();
            CaixaTO caixaTO = CaixaDAO.consultarCaixaAberto();
            if (caixaTO == null) {
                JOptionPane.showMessageDialog(this, "O caixa está fechado");
                return;
            }
            
            //Declaração das formatações dos dados usado logo abaixo na classe
            NumberFormat nf = NumberFormat.getNumberInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            //Inserção dos dados referente ao Recebimento
            recebimentoTO.setIdRecebimento(0);
            recebimentoTO.setIdParcelasContasReceber(null);

            recebimentoTO.setValorRecebimento(nf.parse(txtTotalContaRecebimento.getText()).floatValue());

            if (txtDescontoRecebimento.getText().trim().length() == 0) {
                recebimentoTO.setDescontoRecebimento(0);
            } else {
                recebimentoTO.setDescontoRecebimento(nf.parse(txtDescontoRecebimento.getText()).floatValue());
            }

            if (txtAcrescimoRecebimento.getText().trim().length() == 0) {
                recebimentoTO.setJurosRecebimento(0);
            } else {
                recebimentoTO.setJurosRecebimento(nf.parse(txtAcrescimoRecebimento.getText()).floatValue());
            }

            recebimentoTO.setDataRecebimento(sdf.parse(txtDataRecebimento.getText()));

            if (idRecebimento == 0) {
                idRecebimento = RecebimentoDAO.inserirRetornandoId(recebimentoTO);
                recebimentoTO.setIdRecebimento(idRecebimento);

            } else {
                RecebimentoDAO.alterar(recebimentoTO);
            }

            //Inserção dos dados referente ao MovimentoCaixa
            movimentoCaixaTO.setIdMovimentoCaixa(0);
            movimentoCaixaTO.setIdCaixa(CaixaDAO.consultarCaixaAberto().getIdCaixa());
            movimentoCaixaTO.setIdRecebimento(idRecebimento);
            movimentoCaixaTO.setIdPagamento(null);
            movimentoCaixaTO.setValorMovimentoCaixa(nf.parse(txtTotalContaRecebimento.getText()).floatValue());
            movimentoCaixaTO.setTipoMovimentoCaixa("RECEBIMENTO");

            if (idMovimentoCaixa == 0) {
                idMovimentoCaixa = MovimentoCaixaDAO.inserirRetornandoId(movimentoCaixaTO);
            } else {
                MovimentoCaixaDAO.alterar(movimentoCaixaTO);
            }

            //Atualização do saldo do caixa
            float saldoCaixa = caixaTO.getSaldoCaixa() - recebimentoTO.getValorRecebimento();
            caixaTO.setSaldoCaixa(saldoCaixa);
            CaixaDAO.alterar(caixaTO);
            
            br.com.ctesop.componentes.JOptionPane.showMessageDialog(this, "Recebimento realizado com sucesso!");
            dispose();
            vendaFormaRecebimentoGUI.dispose();
        } catch (Exception e) {
            e.printStackTrace();
            br.com.ctesop.componentes.JOptionPane.showMessageDialog(this, "Erro ao salvar!\nDados: " + e.getMessage());
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void txtDinheiroRecebimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDinheiroRecebimentoFocusLost
        try {
            NumberFormat nf = NumberFormat.getNumberInstance();
            recebimento = (nf.parse(txtDinheiroRecebimento.getText()).floatValue()
                    - nf.parse(txtTotalContaRecebimento.getText()).floatValue());
            nf.setMinimumFractionDigits(2);
            nf.setMaximumFractionDigits(2);

            if (recebimento <= troco) {
                txtTrocoRecebimento.setText("0,00");
            } else {
                txtTrocoRecebimento.setText(nf.format(recebimento));
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtDinheiroRecebimentoFocusLost

    private void txtDescontoRecebimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescontoRecebimentoFocusLost
        try {
            NumberFormat nf = NumberFormat.getNumberInstance();
            total = (vendaTO.getValorTotalVenda()- nf.parse(txtDescontoRecebimento.getText()).floatValue());
            nf.setMinimumFractionDigits(2);
            nf.setMaximumFractionDigits(2);

            txtTotalContaRecebimento.setText(nf.format(total));

            troco = (nf.parse(txtDinheiroRecebimento.getText()).floatValue()) - (total);

            if (troco <= x) {
                txtTrocoRecebimento.setText("0,00");
            } else {
                txtTrocoRecebimento.setText(nf.format(troco));
            }

            txtAcrescimoRecebimento.setEnabled(false);
            txtAcrescimoRecebimento.setText("0,00");
            btConfirmar.requestFocus();

        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtDescontoRecebimentoFocusLost

    private void txtAcrescimoRecebimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAcrescimoRecebimentoFocusLost
        try {
            NumberFormat nf = NumberFormat.getNumberInstance();
            total = (vendaTO.getValorTotalVenda()+ nf.parse(txtDescontoRecebimento.getText()).floatValue());
            nf.setMinimumFractionDigits(2);
            nf.setMaximumFractionDigits(2);

            txtTotalContaRecebimento.setText(nf.format(total));

            troco = (nf.parse(txtDinheiroRecebimento.getText()).floatValue()) - (total);

            if (troco <= x) {
                txtTrocoRecebimento.setText("0,00");
            } else {
                txtTrocoRecebimento.setText(nf.format(troco));
            }

            txtDescontoRecebimento.setEnabled(false);
            txtDescontoRecebimento.setText("0,00");
            btConfirmar.requestFocus();

        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtAcrescimoRecebimentoFocusLost

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limparForm();
    }//GEN-LAST:event_btCancelarActionPerformed

    public void limparForm() {
        txtDinheiroRecebimento.setText("");
        txtDescontoRecebimento.setText("");
        txtAcrescimoRecebimento.setText("");

        NumberFormat nf = NumberFormat.getNumberInstance();
        txtTotalContaRecebimento.setText(nf.format(vendaTO.getValorTotalVenda()));

        txtTrocoRecebimento.setText("");
        txtAcrescimoRecebimento.setEnabled(true);
        txtDescontoRecebimento.setEnabled(true);
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
    private javax.swing.JLabel lbAcrescimoRecebimento;
    private javax.swing.JLabel lbDataRecebimento;
    private javax.swing.JLabel lbDescontoRecebimento;
    private javax.swing.JLabel lbDinheiroRecebimento;
    private javax.swing.JLabel lbTotalContaRecebimento;
    private javax.swing.JLabel lbTrocoRecebimento;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnDescontoAcrescimo;
    private javax.swing.JPanel pnLancamentos;
    private javax.swing.JFormattedTextField txtAcrescimoRecebimento;
    private javax.swing.JFormattedTextField txtDataRecebimento;
    private javax.swing.JFormattedTextField txtDescontoRecebimento;
    private javax.swing.JFormattedTextField txtDinheiroRecebimento;
    private javax.swing.JFormattedTextField txtTotalContaRecebimento;
    private javax.swing.JFormattedTextField txtTrocoRecebimento;
    // End of variables declaration//GEN-END:variables
}
