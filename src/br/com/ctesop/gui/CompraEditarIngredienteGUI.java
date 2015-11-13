package br.com.ctesop.gui;

import br.com.ctesop.componentes.MascaraNumerosDecimais;
import br.com.ctesop.componentes.SelecionarCampo;
import br.com.ctesop.to.IngredienteTO;
import br.com.ctesop.to.ItemCompraIngredienteTO;
import java.text.NumberFormat;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class CompraEditarIngredienteGUI extends javax.swing.JInternalFrame {

    private JDesktopPane dpArea = null;
    private IngredienteTO ingredienteTO;
    private CompraGUI compraGUI;
    
    public CompraEditarIngredienteGUI() {
        initComponents();
    }
    
    public CompraEditarIngredienteGUI(IngredienteTO ingredienteTO, CompraGUI compraGUI) {
        this.ingredienteTO = ingredienteTO;
        this.compraGUI = compraGUI;
        initComponents();
        txtNomeIngrediente.setText(ingredienteTO.getNomeIngrediente());
        //Formação do valor do ingrediente para exibir formatado na tela
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        txtPrecoIngrediente.setText(nf.format(ingredienteTO.getPrecoCustoIngrediente()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBotoes = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        pnFormulario = new javax.swing.JPanel();
        lbNomeIngrediente = new javax.swing.JLabel();
        txtNomeIngrediente = new javax.swing.JTextField();
        lbQuantidadeIngrediente = new javax.swing.JLabel();
        txtQuantidadeIngrediente = new javax.swing.JFormattedTextField();
        lbPrecoIngrediente = new javax.swing.JLabel();
        txtPrecoIngrediente = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Alterar ingrediente da compra");
        setPreferredSize(new java.awt.Dimension(377, 260));

        btSalvar.setMnemonic('s');
        btSalvar.setText("Salvar");
        btSalvar.setMaximumSize(new java.awt.Dimension(120, 40));
        btSalvar.setMinimumSize(new java.awt.Dimension(120, 40));
        btSalvar.setPreferredSize(new java.awt.Dimension(120, 40));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
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

        javax.swing.GroupLayout pnBotoesLayout = new javax.swing.GroupLayout(pnBotoes);
        pnBotoes.setLayout(pnBotoesLayout);
        pnBotoesLayout.setHorizontalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createSequentialGroup()
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pnFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do ingrediente"));

        lbNomeIngrediente.setText("Nome do ingrediente:");

        txtNomeIngrediente.setEditable(false);

        lbQuantidadeIngrediente.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbQuantidadeIngrediente.setText("Quantidade:");

        txtQuantidadeIngrediente.setDocument(new br.com.ctesop.componentes.MascaraNumeros(3));
        txtQuantidadeIngrediente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQuantidadeIngrediente.setText("0");
        txtQuantidadeIngrediente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantidadeIngredienteFocusGained(evt);
            }
        });

        lbPrecoIngrediente.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbPrecoIngrediente.setText("Preço unitário:");

        txtPrecoIngrediente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPrecoIngrediente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecoIngrediente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoIngredienteFocusGained(evt);
            }
        });

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbPrecoIngrediente)
                    .addComponent(lbQuantidadeIngrediente)
                    .addComponent(lbNomeIngrediente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(txtNomeIngrediente, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantidadeIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnFormularioLayout.setVerticalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeIngrediente)
                    .addComponent(txtNomeIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuantidadeIngrediente)
                    .addComponent(txtQuantidadeIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecoIngrediente)
                    .addComponent(txtPrecoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            NumberFormat nf = NumberFormat.getNumberInstance();
            ItemCompraIngredienteTO icto = new ItemCompraIngredienteTO();
            icto.setIdIngrediente(ingredienteTO.getIdIngrediente());
            icto.setQuantidadeItemCompraIngrediente(nf.parse(txtQuantidadeIngrediente.getText()).intValue());
            icto.setValorItemCompraIngrediente(nf.parse(txtPrecoIngrediente.getText()).floatValue());
            compraGUI.adicionarIngrediente(icto);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void txtQuantidadeIngredienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeIngredienteFocusGained
        SelecionarCampo.selecionarTudo(evt);
    }//GEN-LAST:event_txtQuantidadeIngredienteFocusGained

    private void txtPrecoIngredienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoIngredienteFocusGained
        SelecionarCampo.selecionarTudo(evt);
    }//GEN-LAST:event_txtPrecoIngredienteFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel lbNomeIngrediente;
    private javax.swing.JLabel lbPrecoIngrediente;
    private javax.swing.JLabel lbQuantidadeIngrediente;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JTextField txtNomeIngrediente;
    private javax.swing.JFormattedTextField txtPrecoIngrediente;
    private javax.swing.JFormattedTextField txtQuantidadeIngrediente;
    // End of variables declaration//GEN-END:variables
}
