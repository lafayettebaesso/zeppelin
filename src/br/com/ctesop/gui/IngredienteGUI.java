package br.com.ctesop.gui;

import br.com.ctesop.componentes.JOptionPane;
import br.com.ctesop.componentes.SelecionarCampo;
import br.com.ctesop.dao.IngredienteDAO;
import br.com.ctesop.gui.tablemodel.IngredienteTableModel;
import br.com.ctesop.to.IngredienteTO;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.JDesktopPane;

public class IngredienteGUI extends javax.swing.JInternalFrame {

    //Atribudo para armazenar qual JDesktopPane irá receber o JInternalFrame
    private JDesktopPane dpArea = null;

    int pagina = 0;

    public IngredienteGUI() {
        initComponents();
        //this.tb = new TableModelGrid("Código", "Nome", "Preço de custo", "Quantidade", "Status");
        habilitarForm(false);
        atualizarGrade();
    }

    //Armazena o dpArea (JDesktopPane) recebido por parâmetro para ser usado depois
    public IngredienteGUI(JDesktopPane dpArea) {
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
        pnPesquisa = new javax.swing.JPanel();
        pnPesquisar = new javax.swing.JPanel();
        lbPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        spGrade = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();
        pnFormulario = new javax.swing.JPanel();
        lbCodigoIngrediente = new javax.swing.JLabel();
        txtCodigoIngrediente = new javax.swing.JTextField();
        lbNomeIngrediente = new javax.swing.JLabel();
        txtNomeIngrediente = new javax.swing.JTextField();
        lbPrecoCustoIngrediente = new javax.swing.JLabel();
        txtPrecoCustoIngrediente = new javax.swing.JFormattedTextField();
        lbQuantidadeIngrediente = new javax.swing.JLabel();
        txtQuantidadeIngrediente = new javax.swing.JFormattedTextField();
        lbStatusIngrediente = new javax.swing.JLabel();
        cbStatusIngrediente = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setTitle("Ingrediente");

        btNovo.setMnemonic('n');
        btNovo.setText("Novo");
        btNovo.setMaximumSize(new java.awt.Dimension(120, 40));
        btNovo.setMinimumSize(new java.awt.Dimension(120, 40));
        btNovo.setPreferredSize(new java.awt.Dimension(120, 40));
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

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
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
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

        pnPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lbPesquisar.setText("Pesquisar:");

        txtPesquisar.setDocument(new br.com.ctesop.componentes.MascaraLetrasNumeros(90));

        btPesquisar.setMnemonic('p');
        btPesquisar.setLabel("Pesquisar");
        btPesquisar.setMaximumSize(new java.awt.Dimension(120, 40));
        btPesquisar.setMinimumSize(new java.awt.Dimension(120, 40));
        btPesquisar.setPreferredSize(new java.awt.Dimension(120, 40));
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPesquisarLayout = new javax.swing.GroupLayout(pnPesquisar);
        pnPesquisar.setLayout(pnPesquisarLayout);
        pnPesquisarLayout.setHorizontalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbPesquisar)
                .addGap(12, 12, 12)
                .addComponent(txtPesquisar)
                .addGap(12, 12, 12)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnPesquisarLayout.setVerticalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGradeMouseClicked(evt);
            }
        });
        spGrade.setViewportView(tbGrade);

        javax.swing.GroupLayout pnPesquisaLayout = new javax.swing.GroupLayout(pnPesquisa);
        pnPesquisa.setLayout(pnPesquisaLayout);
        pnPesquisaLayout.setHorizontalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnPesquisaLayout.setVerticalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Pesquisar", pnPesquisa);

        pnFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulário"));

        lbCodigoIngrediente.setText("Código:");

        txtCodigoIngrediente.setEditable(false);
        txtCodigoIngrediente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbNomeIngrediente.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbNomeIngrediente.setText("Nome:");

        txtNomeIngrediente.setDocument(new br.com.ctesop.componentes.MascaraLetrasNumeros(90));

        lbPrecoCustoIngrediente.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbPrecoCustoIngrediente.setText("Preço de custo:");

        txtPrecoCustoIngrediente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPrecoCustoIngrediente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecoCustoIngrediente.setText("0,00");
        txtPrecoCustoIngrediente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoCustoIngredienteFocusGained(evt);
            }
        });

        lbQuantidadeIngrediente.setText("Quantidade");

        txtQuantidadeIngrediente.setEditable(false);
        txtQuantidadeIngrediente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbStatusIngrediente.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbStatusIngrediente.setText("Status:");

        cbStatusIngrediente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ATIVO", "INATIVO" }));

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCodigoIngrediente)
                    .addComponent(lbStatusIngrediente)
                    .addComponent(lbPrecoCustoIngrediente)
                    .addComponent(lbNomeIngrediente)
                    .addComponent(lbQuantidadeIngrediente))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeIngrediente, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                            .addComponent(txtPrecoCustoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbStatusIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addComponent(txtQuantidadeIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnFormularioLayout.setVerticalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigoIngrediente)
                    .addComponent(txtCodigoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeIngrediente)
                    .addComponent(txtNomeIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecoCustoIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrecoCustoIngrediente))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuantidadeIngrediente)
                    .addComponent(txtQuantidadeIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStatusIngrediente)
                    .addComponent(cbStatusIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
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

    //Eventos//
    //Evento para quando clicar no botão "Fechar"
    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    //Evento para quando clicar no botão "Novo"
    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        habilitarForm(true);
        txtCodigoIngrediente.setText("0");
    }//GEN-LAST:event_btNovoActionPerformed

    //Evento para quando clicar no botão "Cancelar"
    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limparForm();
        habilitarForm(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    //Evento para quando clicar no botão "Salvar"
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {

            if (!validar()) {
                return;
            }

            //Instanciação do objeto
            IngredienteTO ingredienteTO = new IngredienteTO();

            ingredienteTO.setIdIngrediente(Integer.parseInt(txtCodigoIngrediente.getText()));
            ingredienteTO.setNomeIngrediente(txtNomeIngrediente.getText());

            NumberFormat nf = NumberFormat.getNumberInstance();
            //ingredienteTO.setQuantidadeIngrediente(nf.parse(txtQuantidadeIngrediente.getText()).intValue());
            ingredienteTO.setPrecoCustoIngrediente(nf.parse(txtPrecoCustoIngrediente.getText()).floatValue());

            ingredienteTO.setQuantidadeIngrediente(Integer.parseInt(txtQuantidadeIngrediente.getText()));

            ingredienteTO.setStatusIngrediente(cbStatusIngrediente.getSelectedItem().toString());

            if (ingredienteTO.getIdIngrediente() == 0) {
                IngredienteDAO.inserir(ingredienteTO);
                JOptionPane.showMessageDialog(this, "Ingrediente cadastrado com sucesso!");
            } else {
                IngredienteDAO.alterar(ingredienteTO);
                JOptionPane.showMessageDialog(this, "Cadastro alterado com sucesso!");
            }
            
            atualizarGrade();
            limparForm();
            habilitarForm(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar!\nDados: " + e.getMessage());
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    //Evento para quando clicar no botão "Pesquisar"
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        atualizarGrade();
    }//GEN-LAST:event_btPesquisarActionPerformed

    //Evento para quando der 2 cliques em um item da grade
    private void tbGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeMouseClicked
        if (evt.getClickCount() == 2) {
            IngredienteTableModel tm = (IngredienteTableModel) tbGrade.getModel();
            IngredienteTO ingrediente = tm.get(tbGrade.getSelectedRow());

            txtCodigoIngrediente.setText(String.valueOf(ingrediente.getIdIngrediente()));
            txtNomeIngrediente.setText(ingrediente.getNomeIngrediente());
            txtPrecoCustoIngrediente.setText(ingrediente.getPrecoCustoIngrediente() + "");
            txtQuantidadeIngrediente.setText(String.valueOf(ingrediente.getQuantidadeIngrediente()));
            cbStatusIngrediente.setSelectedItem(ingrediente.getStatusIngrediente());

            habilitarForm(true);
        }
    }//GEN-LAST:event_tbGradeMouseClicked

    private void txtPrecoCustoIngredienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoCustoIngredienteFocusGained
        SelecionarCampo.selecionarTudo(evt);
    }//GEN-LAST:event_txtPrecoCustoIngredienteFocusGained

    //Métodos//
    //Método que atualiza a grade com os valores cadastrados
    private void atualizarGrade() {
        try {
            String filtro = txtPesquisar.getText();

            IngredienteTableModel tb = new IngredienteTableModel();
            tb.setDados((List<IngredienteTO>) (Object) IngredienteDAO.listar(IngredienteTO.class, pagina,
                    "nomeIngrediente", filtro));
            tbGrade.setModel(tb);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar grade");
        }
    }

    //Método que habilita o formulário
    private void habilitarForm(boolean habilitar) {
        txtCodigoIngrediente.setEnabled(habilitar);
        txtNomeIngrediente.setEnabled(habilitar);
        txtPrecoCustoIngrediente.setEnabled(habilitar);
        txtQuantidadeIngrediente.setEnabled(habilitar);
        cbStatusIngrediente.setEnabled(habilitar);

        btNovo.setEnabled(!habilitar);
        btSalvar.setEnabled(habilitar);
        btCancelar.setEnabled(habilitar);

        if (habilitar) {
            pnAbas.setSelectedIndex(1);
        } else {
            pnAbas.setSelectedIndex(0);
        }
    }

    //Método que limpa o formulário
    private void limparForm() {
        txtCodigoIngrediente.setText("");
        txtNomeIngrediente.setText("");
        txtPrecoCustoIngrediente.setText("");
        txtQuantidadeIngrediente.setText("");
    }

    //Método de validação dos TextFields
    private boolean validar() throws Exception {
        //Validação do "Nome do ingrediente"
        if (txtNomeIngrediente.getText().trim().length() < 2 || txtNomeIngrediente.getText().trim().length() > 70) {
            JOptionPane.showMessageDialog(this, "Nome do ingrediente inválido.", "Alerta",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            txtNomeIngrediente.requestFocus();
            return false;
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbStatusIngrediente;
    private javax.swing.JLabel lbCodigoIngrediente;
    private javax.swing.JLabel lbNomeIngrediente;
    private javax.swing.JLabel lbPesquisar;
    private javax.swing.JLabel lbPrecoCustoIngrediente;
    private javax.swing.JLabel lbQuantidadeIngrediente;
    private javax.swing.JLabel lbStatusIngrediente;
    private javax.swing.JTabbedPane pnAbas;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JPanel pnPesquisa;
    private javax.swing.JPanel pnPesquisar;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    private javax.swing.JTextField txtCodigoIngrediente;
    private javax.swing.JTextField txtNomeIngrediente;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtPrecoCustoIngrediente;
    private javax.swing.JFormattedTextField txtQuantidadeIngrediente;
    // End of variables declaration//GEN-END:variables
}
