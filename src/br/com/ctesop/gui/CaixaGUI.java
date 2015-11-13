package br.com.ctesop.gui;

import br.com.ctesop.componentes.JOptionPane;
import br.com.ctesop.componentes.SelecionarCampo;
import br.com.ctesop.dao.CaixaDAO;
import br.com.ctesop.to.CaixaTO;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CaixaGUI extends javax.swing.JInternalFrame {

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    CaixaTO caixaTO = null;

    public CaixaGUI() {
        initComponents();
        txtStatusCaixa.setText("Fechado");
        habilitarForm(false);
        carregarCaixaAberto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnFormulario = new javax.swing.JPanel();
        pnInformacoes = new javax.swing.JPanel();
        btAbrirCaixa = new javax.swing.JButton();
        btFecharCaixa = new javax.swing.JButton();
        pnAbertura = new javax.swing.JPanel();
        lbValorAberturaCaixa = new javax.swing.JLabel();
        txtValorAberturaCaixa = new javax.swing.JTextField();
        lbDataAberturaCaixa = new javax.swing.JLabel();
        txtDataAberturaCaixa = new javax.swing.JFormattedTextField();
        lbDataFechamentoCaixa = new javax.swing.JLabel();
        txtDataFechamentoCaixa = new javax.swing.JFormattedTextField();
        lbSaldoCaixa = new javax.swing.JLabel();
        txtSaldoCaixa = new javax.swing.JFormattedTextField();
        lbStatusCaixa = new javax.swing.JLabel();
        txtStatusCaixa = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Caixa");

        btAbrirCaixa.setMnemonic('a');
        btAbrirCaixa.setText("Abrir o caixa");
        btAbrirCaixa.setMaximumSize(new java.awt.Dimension(120, 40));
        btAbrirCaixa.setMinimumSize(new java.awt.Dimension(120, 40));
        btAbrirCaixa.setPreferredSize(new java.awt.Dimension(120, 40));
        btAbrirCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirCaixaActionPerformed(evt);
            }
        });

        btFecharCaixa.setMnemonic('e');
        btFecharCaixa.setText("Fechar o caixa");
        btFecharCaixa.setMaximumSize(new java.awt.Dimension(120, 40));
        btFecharCaixa.setMinimumSize(new java.awt.Dimension(120, 40));
        btFecharCaixa.setPreferredSize(new java.awt.Dimension(120, 40));
        btFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharCaixaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnInformacoesLayout = new javax.swing.GroupLayout(pnInformacoes);
        pnInformacoes.setLayout(pnInformacoesLayout);
        pnInformacoesLayout.setHorizontalGroup(
            pnInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInformacoesLayout.createSequentialGroup()
                .addComponent(btAbrirCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btFecharCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnInformacoesLayout.setVerticalGroup(
            pnInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btAbrirCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btFecharCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnAbertura.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbValorAberturaCaixa.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbValorAberturaCaixa.setText("Valor de abertura:");

        txtValorAberturaCaixa.setDocument(new br.com.ctesop.componentes.MascaraNumerosDecimais(0));
        txtValorAberturaCaixa.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        txtValorAberturaCaixa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorAberturaCaixa.setPreferredSize(new java.awt.Dimension(10, 20));
        txtValorAberturaCaixa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorAberturaCaixaFocusGained(evt);
            }
        });

        lbDataAberturaCaixa.setText("Data de abertura:");

        txtDataAberturaCaixa.setEditable(false);
        txtDataAberturaCaixa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataAberturaCaixa.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N

        lbDataFechamentoCaixa.setText("Data de fechamento:");

        txtDataFechamentoCaixa.setEditable(false);
        txtDataFechamentoCaixa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataFechamentoCaixa.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N

        lbSaldoCaixa.setText("Saldo:");

        txtSaldoCaixa.setEditable(false);
        txtSaldoCaixa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaldoCaixa.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N

        lbStatusCaixa.setText("Status");

        txtStatusCaixa.setEditable(false);
        txtStatusCaixa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStatusCaixa.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnAberturaLayout = new javax.swing.GroupLayout(pnAbertura);
        pnAbertura.setLayout(pnAberturaLayout);
        pnAberturaLayout.setHorizontalGroup(
            pnAberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAberturaLayout.createSequentialGroup()
                .addGroup(pnAberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAberturaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnAberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbStatusCaixa)
                            .addComponent(lbSaldoCaixa)
                            .addComponent(lbDataAberturaCaixa)
                            .addComponent(lbValorAberturaCaixa)))
                    .addGroup(pnAberturaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbDataFechamentoCaixa)))
                .addGap(12, 12, 12)
                .addGroup(pnAberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSaldoCaixa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataFechamentoCaixa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorAberturaCaixa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDataAberturaCaixa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStatusCaixa, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(12, 12, 12))
        );
        pnAberturaLayout.setVerticalGroup(
            pnAberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAberturaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnAberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorAberturaCaixa)
                    .addComponent(txtValorAberturaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnAberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataAberturaCaixa)
                    .addComponent(txtDataAberturaCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnAberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataFechamentoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDataFechamentoCaixa))
                .addGap(12, 12, 12)
                .addGroup(pnAberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSaldoCaixa)
                    .addComponent(txtSaldoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnAberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStatusCaixa)
                    .addComponent(txtStatusCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(pnInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnAbertura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        pnFormularioLayout.setVerticalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addComponent(pnInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pnAbertura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pnFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Eventos//
    //Evento para quando clicar no botão "Abrir o caixa"
    private void btAbrirCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirCaixaActionPerformed
        try {
            if (!validar()) {
                return;
            }

            //Instanciação do objeto utilizados na classe
            caixaTO = new CaixaTO();

            //Preenchimento dos atributos
            NumberFormat nf = NumberFormat.getNumberInstance();
            caixaTO.setValorAbertura(nf.parse(txtValorAberturaCaixa.getText()).floatValue());

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            txtDataAberturaCaixa.setText(sdf.format(new Date()));
            caixaTO.setDataAberturaCaixa(sdf.parse(txtDataAberturaCaixa.getText()));

            txtSaldoCaixa.setText(txtValorAberturaCaixa.getText());
            caixaTO.setSaldoCaixa(nf.parse(txtValorAberturaCaixa.getText()).floatValue());

            txtStatusCaixa.setText("Aberto");
            caixaTO.setStatusCaixa(txtStatusCaixa.getText());

            //Gravar as informações
            CaixaDAO.inserir(caixaTO);

            JOptionPane.showMessageDialog(this, "Caixa aberto!");

            habilitarForm(true);
            carregarCaixaAberto();
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btAbrirCaixaActionPerformed

    //Evento para quando clicar no botão "Fechar o caixa"
    private void btFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharCaixaActionPerformed
        try {
            //Preenchimento dos atributos
            NumberFormat nf = NumberFormat.getNumberInstance();
            caixaTO.setValorAbertura(nf.parse(txtValorAberturaCaixa.getText()).floatValue());

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            txtDataFechamentoCaixa.setText(sdf.format(new Date()));
            caixaTO.setDataFechamentoCaixa(sdf.parse(txtDataFechamentoCaixa.getText()));

            txtSaldoCaixa.setText(txtValorAberturaCaixa.getText());
            caixaTO.setSaldoCaixa(nf.parse(txtValorAberturaCaixa.getText()).floatValue());

            txtStatusCaixa.setText("Fechado");
            caixaTO.setStatusCaixa(txtStatusCaixa.getText());

            //Gravar as informações
            CaixaDAO.alterar(caixaTO);

            JOptionPane.showMessageDialog(this, "Caixa fechado!");

            limparForm();
            habilitarForm(false);
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btFecharCaixaActionPerformed

    private void txtValorAberturaCaixaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorAberturaCaixaFocusGained
        SelecionarCampo.selecionarTudo(evt);
    }//GEN-LAST:event_txtValorAberturaCaixaFocusGained

    //Métodos//
    //Método que habilita o formulário
    private void habilitarForm(boolean habilitar) {
        btAbrirCaixa.setEnabled(!habilitar);
        btFecharCaixa.setEnabled(habilitar);
    }

    //Método que limpa o formulário
    private void limparForm() {
        txtValorAberturaCaixa.setText("");
        //txtDataAberturaCaixa.setText("");
        //txtDataFechamentoCaixa.setText("");
        //txtSaldoCaixa.setText("");
        txtStatusCaixa.setText("Fechado");
    }

    //Método para validar
    private boolean validar() {
        //Validação para verificar se o valor de abertura está em branco ou é menor que 1
        if (txtValorAberturaCaixa.getText().trim().length() < 1) {
            JOptionPane.showMessageDialog(this, "Você esqueceu de preencher o valor de abertura.", "Alerta",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            txtValorAberturaCaixa.requestFocus();
            return false;
        } else {

        }
        return true;
    }

    //Método que verifica a situação do caixa
    private void carregarCaixaAberto() {
        try {
            NumberFormat nf = NumberFormat.getNumberInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            caixaTO = CaixaDAO.consultarCaixaAberto();

            if (caixaTO != null) {
                txtValorAberturaCaixa.setText(nf.format(caixaTO.getValorAbertura()));
                txtDataAberturaCaixa.setText(sdf.format(caixaTO.getDataAberturaCaixa()));
                txtSaldoCaixa.setText(nf.format(caixaTO.getSaldoCaixa()));
                txtStatusCaixa.setText(caixaTO.getStatusCaixa());

                habilitarForm(true);
            } else {
                limparForm();
                habilitarForm(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrirCaixa;
    private javax.swing.JButton btFecharCaixa;
    private javax.swing.JLabel lbDataAberturaCaixa;
    private javax.swing.JLabel lbDataFechamentoCaixa;
    private javax.swing.JLabel lbSaldoCaixa;
    private javax.swing.JLabel lbStatusCaixa;
    private javax.swing.JLabel lbValorAberturaCaixa;
    private javax.swing.JPanel pnAbertura;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JPanel pnInformacoes;
    private javax.swing.JFormattedTextField txtDataAberturaCaixa;
    private javax.swing.JFormattedTextField txtDataFechamentoCaixa;
    private javax.swing.JFormattedTextField txtSaldoCaixa;
    private javax.swing.JFormattedTextField txtStatusCaixa;
    private javax.swing.JTextField txtValorAberturaCaixa;
    // End of variables declaration//GEN-END:variables
}
