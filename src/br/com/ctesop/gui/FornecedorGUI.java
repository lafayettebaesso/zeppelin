package br.com.ctesop.gui;

import br.com.ctesop.componentes.JOptionPane;
import br.com.ctesop.dao.CidadeDAO;
import br.com.ctesop.dao.ClienteDAO;
import br.com.ctesop.dao.FornecedorDAO;
import br.com.ctesop.dao.FuncionarioDAO;
import br.com.ctesop.dao.PessoaDAO;
import br.com.ctesop.dao.PessoaFisicaDAO;
import br.com.ctesop.dao.PessoaJuridicaDAO;
import br.com.ctesop.gui.tablemodel.TableModelGrid;
import br.com.ctesop.to.CidadeTO;
import br.com.ctesop.to.FornecedorTO;
import br.com.ctesop.to.FornecedorTO;
import br.com.ctesop.to.PessoaFisicaTO;
import br.com.ctesop.to.PessoaJuridicaTO;
import br.com.ctesop.to.PessoaTO;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

public class FornecedorGUI extends javax.swing.JInternalFrame {

    int pagina = 0;
    TableModelGrid tb;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public FornecedorGUI() {
        initComponents();
        this.tb = new TableModelGrid("Código", "Nome", "Endereço", "Status");
        carregaCidades();
        atualizarGrade();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        lbCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lbNomeFornecedor = new javax.swing.JLabel();
        txtNomeFornecedor = new javax.swing.JTextField();
        lbSexo = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        lbEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lbCidade = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox();
        lbCNPJ = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JFormattedTextField();
        lbInscricaoEstadual = new javax.swing.JLabel();
        txtInscricaoEstadual = new javax.swing.JFormattedTextField();
        lbCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        lbTelefone = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        lbStatus = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Fornecedor");
        setMaximumSize(new java.awt.Dimension(700, 563));
        setMinimumSize(new java.awt.Dimension(700, 563));
        setPreferredSize(new java.awt.Dimension(700, 563));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        btNovo.setText("Novo");
        btNovo.setMaximumSize(new java.awt.Dimension(120, 40));
        btNovo.setMinimumSize(new java.awt.Dimension(120, 40));
        btNovo.setPreferredSize(new java.awt.Dimension(120, 40));

        btSalvar.setText("Salvar");
        btSalvar.setMaximumSize(new java.awt.Dimension(120, 40));
        btSalvar.setMinimumSize(new java.awt.Dimension(120, 40));
        btSalvar.setPreferredSize(new java.awt.Dimension(120, 40));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.setMaximumSize(new java.awt.Dimension(120, 40));
        btCancelar.setMinimumSize(new java.awt.Dimension(120, 40));
        btCancelar.setPreferredSize(new java.awt.Dimension(120, 40));

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

        pnPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        lbPesquisar.setText("Pesquisar:");

        btPesquisar.setText("Pesquisar");
        btPesquisar.setMaximumSize(new java.awt.Dimension(120, 40));
        btPesquisar.setMinimumSize(new java.awt.Dimension(120, 40));
        btPesquisar.setPreferredSize(new java.awt.Dimension(120, 40));

        javax.swing.GroupLayout pnPesquisarLayout = new javax.swing.GroupLayout(pnPesquisar);
        pnPesquisar.setLayout(pnPesquisarLayout);
        pnPesquisarLayout.setHorizontalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(12, 12, 12))
        );

        tbGrade.setModel(new javax.swing.table.DefaultTableModel(
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
                .addGroup(pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPesquisaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))
                    .addGroup(pnPesquisaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(pnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnPesquisaLayout.setVerticalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Pesquisar", pnPesquisa);

        pnFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulário"));

        lbCodigo.setText("Código:");

        lbNomeFornecedor.setText("Nome do fornecedor:");

        txtNomeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFornecedorActionPerformed(evt);
            }
        });

        lbSexo.setText("Sexo:");

        buttonGroup1.add(rbMasculino);
        rbMasculino.setText("Masculino");

        buttonGroup1.add(rbFeminino);
        rbFeminino.setText("Feminino");

        lbEndereco.setText("Endereço:");

        lbCidade.setText("Cidade:");

        lbCNPJ.setText("CNPJ:");

        lbInscricaoEstadual.setText("Inscrição estadual:");

        lbCelular.setText("Celular:");

        lbTelefone.setText("Telefone:");

        lbStatus.setText("Status:");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));

        jLabel1.setText("Nome fantasia:");

        jLabel2.setText("Razão social:");

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCelular)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(lbCNPJ)
                    .addComponent(lbTelefone)
                    .addComponent(lbCodigo)
                    .addComponent(lbNomeFornecedor)
                    .addComponent(lbStatus)
                    .addComponent(lbEndereco)
                    .addComponent(lbCidade)
                    .addComponent(lbSexo))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbInscricaoEstadual)
                        .addGap(12, 12, 12)
                        .addComponent(txtInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco)
                            .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRazaoSocial)
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addComponent(rbMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE))
                            .addComponent(txtDataNascimento))
                        .addGap(12, 12, 12))))
        );
        pnFormularioLayout.setVerticalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeFornecedor)
                    .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexo)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCidade)
                    .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInscricaoEstadual)
                    .addComponent(txtInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCNPJ))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStatus)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Cadastro", pnFormulario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnAbas)
                    .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    //Habilitar o formulário
    private void habilitarForm(boolean habilitar) {
        /*txtCodigo.setEnabled(habilitar);
         txtNome.setEnabled(habilitar);
         rbPessoaFisica.setEnabled(habilitar);
         rbPessoaFisica.setSelected(true);
         rbPessoaJuridica.setEnabled(habilitar);
         rbMasculino.setEnabled(habilitar);
         rbMasculino.setSelected(true);
         rbFeminino.setEnabled(habilitar);
         txtEndereco.setEnabled(habilitar);
         cbCidade.setEnabled(habilitar);
         txtCPF.setEnabled(habilitar);
         txtRG.setEnabled(habilitar);
         txtCNPJ.setEnabled(habilitar);
         txtRazaoSocial.setEnabled(habilitar);
         txtInscricaoEstadual.setEnabled(habilitar);
         txtTelefoneResidencial.setEnabled(habilitar);
         txtCelular.setEnabled(habilitar);
         txtTelefoneComercial.setEnabled(habilitar);
         txtDataNascimento.setEnabled(habilitar);
         txtLocalTrabalho.setEnabled(habilitar);
         txtDataCadastro.setEnabled(habilitar);
         cbStatus.setEnabled(habilitar);

         btNovo.setEnabled(!habilitar);
         btSalvar.setEnabled(habilitar);
         btCancelar.setEnabled(habilitar);*/
    }

    private void limparForm() {
        /*    txtCodigo.setText("");
         txtNome.setText("");
         txtEndereco.setText("");
         txtCPF.setText("");
         txtRG.setText("");
         txtCNPJ.setText("");
         txtRazaoSocial.setText("");
         txtInscricaoEstadual.setText("");
         txtTelefoneResidencial.setText("");
         txtCelular.setText("");
         txtTelefoneComercial.setText("");
         txtDataNascimento.setText("");
         txtLocalTrabalho.setText("");
         txtDataCadastro.setText("");*/
    }

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved

    }//GEN-LAST:event_formComponentMoved

    //Ações para o botão "Salvar"
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
         //   if (!validar()) {
            //        return;
            //  }

            FornecedorTO fornecedorTO = new FornecedorTO();
            PessoaTO pessoaTO = new PessoaTO();
            //PessoaFisicaTO pessoaFisicaTO = new PessoaFisicaTO();
            PessoaJuridicaTO pessoaJuridicaTO = new PessoaJuridicaTO();
            //Cria uma nova cidade, dá um nome para ela e recupera o objeto Cidade selecionado
            CidadeTO cidade = (CidadeTO) cbCidade.getSelectedItem();

            fornecedorTO.setIdFornecedor(Integer.parseInt(txtCodigo.getText()));
            pessoaTO.setNomePessoa(txtNomeFornecedor.getText());
            pessoaTO.setIdCidade(cidade.getIdCidade());
            pessoaTO.setEnderecoPessoa(txtEndereco.getText());
            //pessoaFisicaTO.setCpfPessoaFisica(txtCPF.getText());
            //pessoaFisicaTO.setRgPessoaFisica(txtRG.getText());
            pessoaJuridicaTO.setCnpjPessoaJuridica(txtCNPJ.getText());
            pessoaJuridicaTO.setRazaoSocialPessoaJuridica(txtRazaoSocial.getText());
            pessoaJuridicaTO.setInscricaoEstadualPessoaJuridica(txtInscricaoEstadual.getText());
            pessoaTO.setCelularPessoa(txtCelular.getText());
            pessoaTO.setTelefonePessoa(txtCelular.getText());
            pessoaTO.setTelefoneComercialPessoa(txtTelefone.getText());
            /*if (!txtDataNascimento.getText().trim().isEmpty()) {
                Date data = new Date(dateFormat.parse(txtDataNascimento.getText()).getTime());
                pessoaTO.setDataNascimentoPessoa(data);
            }*/

            fornecedorTO.setStatusFornecedor(cbStatus.getSelectedItem().toString());

            if (fornecedorTO.getIdFornecedor() == 0) {
                if (!pessoaJuridicaTO.getCnpjPessoaJuridica().isEmpty()) {
                    pessoaJuridicaTO.setIdPessoaJuridica(0);
                    pessoaTO.setIdPessoaJuridica(PessoaJuridicaDAO.inserirRetornandoId(pessoaJuridicaTO));
                    fornecedorTO.setIdPessoaJuridica(pessoaTO.getIdPessoaJuridica());
                }

                pessoaTO.setIdPessoa(0);
                fornecedorTO.setIdPessoa(PessoaDAO.inserirRetornandoId(pessoaTO));
                FornecedorDAO.inserir(fornecedorTO);
            } else {
                FornecedorTO fornecedorBaseDados = (FornecedorTO) FornecedorDAO.get(FornecedorTO.class, fornecedorTO.getIdFornecedor());
                fornecedorTO.setIdPessoa(fornecedorBaseDados.getIdPessoa());
                fornecedorTO.setIdPessoaFisica(fornecedorBaseDados.getIdPessoaFisica());
                fornecedorTO.setIdPessoaJuridica(fornecedorBaseDados.getIdPessoaJuridica());
                pessoaTO.setIdPessoa(fornecedorBaseDados.getIdPessoa());
                pessoaTO.setIdPessoaFisica(fornecedorBaseDados.getIdPessoaFisica());
                pessoaTO.setIdPessoaJuridica(fornecedorBaseDados.getIdPessoaJuridica());

                if (!pessoaJuridicaTO.getCnpjPessoaJuridica().isEmpty()) {
                    pessoaJuridicaTO.setIdPessoaJuridica(fornecedorBaseDados.getIdPessoaJuridica());
                    PessoaJuridicaDAO.alterar(pessoaJuridicaTO);
                }

                pessoaTO.setIdPessoa(fornecedorBaseDados.getIdPessoa());
                PessoaDAO.alterar(pessoaTO);
                FornecedorDAO.alterar(fornecedorTO);
            }

            JOptionPane.showMessageDialog(this, "Fornecedor cadastrado com sucesso!");

            atualizarGrade();
            limparForm();
            habilitarForm(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar!\nDados: " + e.getMessage());
        }

    }//GEN-LAST:event_btSalvarActionPerformed

    private void txtNomeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFornecedorActionPerformed

    private void tbGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeMouseClicked
        /* Código para carregar as informações da grade para o formulário
         Quando o usuário der dois cliques no Estado o mesmo é carregado no formulário */
        if (evt.getClickCount() == 2) {

            try {
                TableModelGrid tm = (TableModelGrid) tbGrade.getModel();
                int idEntidade = tm.getIntValueAt(tbGrade.getSelectedRow(), 0);
                if (idEntidade <= 0) {
                    return;
                }

                FornecedorTO fornecedorTO = (FornecedorTO) ClienteDAO.get(FornecedorTO.class, idEntidade);
                PessoaTO pessoaTO = (PessoaTO) PessoaDAO.get(PessoaTO.class, fornecedorTO.getIdPessoa());
                PessoaFisicaTO pessoaFisicaTO = null;
                PessoaJuridicaTO pessoaJuridicaTO = null;

                if (fornecedorTO.getIdPessoaFisica() != null) {
                    pessoaFisicaTO = (PessoaFisicaTO) PessoaFisicaDAO.get(PessoaFisicaTO.class, fornecedorTO.getIdPessoaFisica());
                } else {
                    pessoaJuridicaTO = (PessoaJuridicaTO) PessoaJuridicaDAO.get(PessoaJuridicaTO.class, fornecedorTO.getIdPessoaJuridica());
                }

                //CidadeTO cidade = (CidadeTO) cbCidade.getSelectedItem(); //pessoaTO.getIdCidade()
                txtCodigo.setText("" + fornecedorTO.getIdFornecedor());
                txtNomeFornecedor.setText(pessoaTO.getNomePessoa());
                txtEndereco.setText(pessoaTO.getEnderecoPessoa());
                txtCelular.setText(pessoaTO.getCelularPessoa());
                txtTelefone.setText(pessoaTO.getTelefonePessoa());
                //txtTelefoneComercial.setText(pessoaTO.getTelefoneComercialPessoa());

                if (pessoaTO.getDataNascimentoPessoa() != null) {
                    txtDataNascimento.setText(dateFormat.format(pessoaTO.getDataNascimentoPessoa()));
                }

               

                cbStatus.setSelectedItem(fornecedorTO.getStatusFornecedor());

                if (pessoaFisicaTO != null) {
                    txtCNPJ.setText(pessoaFisicaTO.getCpfPessoaFisica());
                    txtInscricaoEstadual.setText(pessoaFisicaTO.getRgPessoaFisica());
                }

                if (pessoaJuridicaTO != null) {
                    txtCNPJ.setText(pessoaJuridicaTO.getCnpjPessoaJuridica());
                    txtRazaoSocial.setText(pessoaJuridicaTO.getRazaoSocialPessoaJuridica());
                    //pessoaJuridicaTO.(txtInscricaoEstadual.getText());
                }

                habilitarForm(true);
            } catch (Exception ex) {
                Logger.getLogger(ClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                                
    }//GEN-LAST:event_tbGradeMouseClicked

    private void atualizarGrade() {
        try {
            String filtro = txtPesquisar.getText();
            List<Class<?>> classes = new ArrayList<>();
            classes.add(FornecedorTO.class);
            classes.add(PessoaTO.class);

            String[] camposSelect = new String[]{"Fornecedor.idFornecedor", "Pessoa.nomePessoa", "Pessoa.enderecoPessoa", "Fornecedor.StatusFornecedor"};
            tb.setDados(FuncionarioDAO.listarUtilizandoComandoInnerJoin(classes, camposSelect, pagina, "nomePessoa", filtro));
            tbGrade.setModel((TableModel) tb);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao atualizar grade");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbCidade;
    private javax.swing.JComboBox cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbCNPJ;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbInscricaoEstadual;
    private javax.swing.JLabel lbNomeFornecedor;
    private javax.swing.JLabel lbPesquisar;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JTabbedPane pnAbas;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JPanel pnPesquisa;
    private javax.swing.JPanel pnPesquisar;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtInscricaoEstadual;
    private javax.swing.JTextField txtNomeFornecedor;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    //Para carregar a "Sigla do estado" no formulário Cidade
    private void carregaCidades() {
        try {
            List<Object> listaCidade = CidadeDAO.listar(CidadeTO.class);
            for (Object e : listaCidade) {
                cbCidade.addItem((CidadeTO) e);
            }

        } catch (Exception ex) {
            //Para as mensagens de erro. Esta puxando do pacote "br.com.ctesop.componentes" da classe "JOptionPane"
            JOptionPane.showWarningDialog(this, "Ocorreu um erro ao listar as cidades.");
        }

    }

}
