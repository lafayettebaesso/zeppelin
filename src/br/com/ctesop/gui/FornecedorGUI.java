package br.com.ctesop.gui;

import br.com.ctesop.to.CidadeTO;
import br.com.ctesop.to.FornecedorTO;
import br.com.ctesop.to.PessoaFisicaTO;
import br.com.ctesop.to.PessoaJuridicaTO;
import br.com.ctesop.to.PessoaTO;
import br.com.ctesop.dao.CidadeDAO;
import br.com.ctesop.dao.FornecedorDAO;
import br.com.ctesop.dao.PessoaDAO;
import br.com.ctesop.dao.PessoaFisicaDAO;
import br.com.ctesop.dao.PessoaJuridicaDAO;
import br.com.ctesop.gui.tablemodel.TableModelGrid;
import br.com.ctesop.componentes.JOptionPane;
import br.com.ctesop.componentes.ValidarCNPJ;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FornecedorGUI extends javax.swing.JInternalFrame {

    int pagina = 0;
    TableModelGrid tb;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    CidadeTO cidade = new CidadeTO();

    public FornecedorGUI() {
        initComponents();
        this.tb = new TableModelGrid("Código", "Nome", "Endereço", "Status");
        carregaCidades();
        habilitarForm(false);
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
        lbPesquisarFornecedor = new javax.swing.JLabel();
        txtPesquisarFornecedor = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        spGrade = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();
        pnFormulario = new javax.swing.JPanel();
        lbCodigoFornecedor = new javax.swing.JLabel();
        txtCodigoFornecedor = new javax.swing.JTextField();
        lbNomeFornecedor = new javax.swing.JLabel();
        txtNomeFornecedor = new javax.swing.JTextField();
        lbSexoFornecedor = new javax.swing.JLabel();
        rbMasculinoFornecedor = new javax.swing.JRadioButton();
        rbFemininoFornecedor = new javax.swing.JRadioButton();
        lbEnderecoFornecedor = new javax.swing.JLabel();
        txtEnderecoFornecedor = new javax.swing.JTextField();
        lbCidadeFornecedor = new javax.swing.JLabel();
        cbCidadeFornecedor = new javax.swing.JComboBox();
        lbCNPJFornecedor = new javax.swing.JLabel();
        txtCNPJFornecedor = new javax.swing.JTextField();
        lbInscricaoEstadualFornecedor = new javax.swing.JLabel();
        lbNomeFantasiaFornecedor = new javax.swing.JLabel();
        txtNomeFantasiaFornecedor = new javax.swing.JFormattedTextField();
        lbRazaoSocialFornecedor = new javax.swing.JLabel();
        txtRazaoSocialFornecedor = new javax.swing.JTextField();
        lbCelularFornecedor = new javax.swing.JLabel();
        txtCelularFornecedor = new javax.swing.JFormattedTextField();
        lbTelefoneFornecedor = new javax.swing.JLabel();
        txtTelefoneFornecedor = new javax.swing.JFormattedTextField();
        lbDataCadastroFornecedor = new javax.swing.JLabel();
        txtDataCadastroFornecedor = new javax.swing.JFormattedTextField();
        lbStatusFornecedor = new javax.swing.JLabel();
        cbStatusFornecedor = new javax.swing.JComboBox();
        txtInscricaoEstadualFornecedor = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Fornecedor");
        setMaximumSize(new java.awt.Dimension(700, 563));
        setMinimumSize(new java.awt.Dimension(700, 563));

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

        pnPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        lbPesquisarFornecedor.setText("Pesquisar:");

        btPesquisar.setText("Pesquisar");
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
                .addComponent(lbPesquisarFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisarFornecedor)
                .addGap(12, 12, 12)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnPesquisarLayout.setVerticalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPesquisarFornecedor)
                    .addComponent(txtPesquisarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        tbGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
                    .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                    .addComponent(pnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
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

        lbCodigoFornecedor.setText("Código:");

        txtCodigoFornecedor.setEditable(false);
        txtCodigoFornecedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbNomeFornecedor.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbNomeFornecedor.setText("Nome do fornecedor:");

        txtNomeFornecedor.setDocument(new br.com.ctesop.componentes.MascaraLetras(90));

        lbSexoFornecedor.setText("Sexo:");

        buttonGroup1.add(rbMasculinoFornecedor);
        rbMasculinoFornecedor.setText("Masculino");

        buttonGroup1.add(rbFemininoFornecedor);
        rbFemininoFornecedor.setText("Feminino");

        lbEnderecoFornecedor.setText("Endereço:");

        txtEnderecoFornecedor.setDocument(new br.com.ctesop.componentes.MascaraLetrasNumeros(150));

        lbCidadeFornecedor.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbCidadeFornecedor.setText("Cidade:");

        lbCNPJFornecedor.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbCNPJFornecedor.setText("CNPJ:");

        txtCNPJFornecedor.setDocument(new br.com.ctesop.componentes.MascaraNumeros(14));

        lbInscricaoEstadualFornecedor.setText("Inscrição estadual:");

        lbNomeFantasiaFornecedor.setText("Nome fantasia:");

        txtNomeFantasiaFornecedor.setDocument(new br.com.ctesop.componentes.MascaraLetrasNumeros(90));

        lbRazaoSocialFornecedor.setText("Razão social:");

        txtRazaoSocialFornecedor.setDocument(new br.com.ctesop.componentes.MascaraLetrasNumeros(150));

        lbCelularFornecedor.setText("Celular:");

        try {
            txtCelularFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelularFornecedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbTelefoneFornecedor.setText("Telefone:");

        try {
            txtTelefoneFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneFornecedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbDataCadastroFornecedor.setText("Data de cadastro:");

        txtDataCadastroFornecedor.setEditable(false);
        try {
            txtDataCadastroFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataCadastroFornecedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbStatusFornecedor.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbStatusFornecedor.setText("Status:");

        cbStatusFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ATIVO", "INATIVO" }));

        txtInscricaoEstadualFornecedor.setDocument(new br.com.ctesop.componentes.MascaraNumeros(10));

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDataCadastroFornecedor)
                    .addComponent(lbCelularFornecedor)
                    .addComponent(lbRazaoSocialFornecedor)
                    .addComponent(lbNomeFantasiaFornecedor)
                    .addComponent(lbCNPJFornecedor)
                    .addComponent(lbCodigoFornecedor)
                    .addComponent(lbNomeFornecedor)
                    .addComponent(lbStatusFornecedor)
                    .addComponent(lbEnderecoFornecedor)
                    .addComponent(lbCidadeFornecedor)
                    .addComponent(lbSexoFornecedor))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnderecoFornecedor)
                            .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRazaoSocialFornecedor)
                            .addComponent(txtNomeFantasiaFornecedor)
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnFormularioLayout.createSequentialGroup()
                                        .addComponent(rbMasculinoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbFemininoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnFormularioLayout.createSequentialGroup()
                                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtCelularFornecedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(cbStatusFornecedor, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)
                                            .addComponent(txtDataCadastroFornecedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                        .addGap(15, 15, 15)
                                        .addComponent(lbTelefoneFornecedor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbCidadeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)))
                        .addGap(12, 12, 12))
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(txtCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbInscricaoEstadualFornecedor)
                        .addGap(12, 12, 12)
                        .addComponent(txtInscricaoEstadualFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0))))
        );
        pnFormularioLayout.setVerticalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigoFornecedor)
                    .addComponent(txtCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeFornecedor)
                    .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexoFornecedor)
                    .addComponent(rbMasculinoFornecedor)
                    .addComponent(rbFemininoFornecedor))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEnderecoFornecedor)
                    .addComponent(txtEnderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCidadeFornecedor)
                    .addComponent(cbCidadeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbInscricaoEstadualFornecedor)
                    .addComponent(lbCNPJFornecedor)
                    .addComponent(txtCNPJFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInscricaoEstadualFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeFantasiaFornecedor)
                    .addComponent(txtNomeFantasiaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRazaoSocialFornecedor)
                    .addComponent(txtRazaoSocialFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCelularFornecedor)
                    .addComponent(txtCelularFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataCadastroFornecedor)
                    .addComponent(txtDataCadastroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStatusFornecedor)
                    .addComponent(cbStatusFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Cadastro", pnFormulario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnAbas)
                        .addGap(8, 8, 8))))
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

    //Evento para quando clicar no botão "Salvar"
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            //Valida os campos, se necessário, e verifica se já há algum cadastro igual
            //Valida também o CNPJ
            if ((!validarCNPJ() || !validar())) {
                return;
            }
            
            //Instanciação dos objetos utilizados na classe
            FornecedorTO fornecedorTO = new FornecedorTO();
            PessoaTO pessoaTO = new PessoaTO();
            PessoaFisicaTO pessoaFisicaTO = new PessoaFisicaTO();
            PessoaJuridicaTO pessoaJuridicaTO = new PessoaJuridicaTO();

            //Cria uma nova cidade, dá um nome para ela e recupera o objeto Cidade selecionado
            cidade = (CidadeTO) cbCidadeFornecedor.getSelectedItem();

            //Inserção das informações no banco de dados
            fornecedorTO.setIdFornecedor(Integer.parseInt(txtCodigoFornecedor.getText()));
            pessoaTO.setNomePessoa(txtNomeFornecedor.getText());

            if (rbMasculinoFornecedor.isSelected()) {
                pessoaTO.setSexoPessoa("M");
            } else {
                pessoaTO.setSexoPessoa("F");
            }

            pessoaTO.setEnderecoPessoa(txtEnderecoFornecedor.getText());
            pessoaTO.setIdCidade(cidade.getIdCidade());
            pessoaJuridicaTO.setCnpjPessoaJuridica(txtCNPJFornecedor.getText());
            pessoaJuridicaTO.setInscricaoEstadualPessoaJuridica(txtInscricaoEstadualFornecedor.getText());
            pessoaJuridicaTO.setNomeFantasiaPessoaJuridica(txtNomeFantasiaFornecedor.getText());
            pessoaJuridicaTO.setRazaoSocialPessoaJuridica(txtRazaoSocialFornecedor.getText());
            pessoaTO.setCelularPessoa(txtCelularFornecedor.getText());
            pessoaTO.setTelefonePessoa(txtTelefoneFornecedor.getText());

            if (!txtDataCadastroFornecedor.getText().trim().isEmpty()) {
                Date data = new Date(dateFormat.parse(txtDataCadastroFornecedor.getText()).getTime());
                fornecedorTO.setDataCadastroFornecedor(data);
            }

            fornecedorTO.setStatusFornecedor(cbStatusFornecedor.getSelectedItem().toString());

            if (fornecedorTO.getIdFornecedor() == 0) {
                if (pessoaJuridicaTO.getCnpjPessoaJuridica() != null && !pessoaJuridicaTO.getCnpjPessoaJuridica().isEmpty()) {
                    pessoaJuridicaTO.setIdPessoaJuridica(0);
                    pessoaTO.setIdPessoaJuridica(PessoaJuridicaDAO.inserirRetornandoId(pessoaJuridicaTO));
                    fornecedorTO.setIdPessoaJuridica(pessoaTO.getIdPessoaJuridica());
                } else {
                    pessoaTO.setIdPessoaFisica(PessoaFisicaDAO.inserirRetornandoId(pessoaFisicaTO));
                    fornecedorTO.setIdPessoaFisica(pessoaTO.getIdPessoaFisica());
                }
                
                fornecedorTO.setIdPessoa(PessoaDAO.inserirRetornandoId(pessoaTO));
                FornecedorDAO.inserir(fornecedorTO);
                JOptionPane.showMessageDialog(this, "Funcionário cadastrado com sucesso!");
            } else {
                FornecedorTO fornecedorBaseDados = (FornecedorTO) FornecedorDAO.get(FornecedorTO.class,
                        fornecedorTO.getIdFornecedor());
                PessoaTO pessoaBaseDados = (PessoaTO) PessoaDAO.get(PessoaTO.class, fornecedorBaseDados.getIdPessoa());
                fornecedorTO.setIdPessoa(fornecedorBaseDados.getIdPessoa());
                fornecedorTO.setIdPessoaFisica(pessoaBaseDados.getIdPessoaFisica());
                fornecedorTO.setIdPessoaJuridica(pessoaBaseDados.getIdPessoaJuridica());
                pessoaTO.setIdPessoa(fornecedorBaseDados.getIdPessoa());
                pessoaTO.setIdPessoaFisica(pessoaBaseDados.getIdPessoaFisica());
                pessoaTO.setIdPessoaJuridica(pessoaBaseDados.getIdPessoaJuridica());

                if (!pessoaJuridicaTO.getCnpjPessoaJuridica().isEmpty()) {
                    pessoaJuridicaTO.setIdPessoaJuridica(pessoaBaseDados.getIdPessoaJuridica());
                    PessoaJuridicaDAO.alterar(pessoaJuridicaTO);
                }

                pessoaTO.setIdPessoa(fornecedorBaseDados.getIdPessoa());
                PessoaDAO.alterar(pessoaTO);
                FornecedorDAO.alterar(fornecedorTO);
                JOptionPane.showMessageDialog(this, "Cadastro alterado com sucesso!");
            }

           

            atualizarGrade();
            limparForm();
            habilitarForm(false);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao salvar!\nDados: " + e.getMessage());
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    //Evento para quando der 2 cliques em um item da grade
    private void tbGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeMouseClicked
        if (evt.getClickCount() == 2) {

            try {
                TableModelGrid tm = (TableModelGrid) tbGrade.getModel();
                int idEntidade = tm.getIntValueAt(tbGrade.getSelectedRow(), 0);
                if (idEntidade <= 0) {
                    return;
                }

                FornecedorTO fornecedorTO = (FornecedorTO) FornecedorDAO.get(FornecedorTO.class, idEntidade);
                PessoaTO pessoaTO = (PessoaTO) PessoaDAO.get(PessoaTO.class, fornecedorTO.getIdPessoa());
                PessoaJuridicaTO pessoaJuridicaTO = null;
                PessoaFisicaTO pessoaFisicaTO = null;

                if (pessoaTO.getIdPessoaJuridica() != null) {
                    pessoaJuridicaTO = (PessoaJuridicaTO) PessoaJuridicaDAO.get(PessoaJuridicaTO.class, pessoaTO.getIdPessoaJuridica());
                } else {
                    pessoaFisicaTO = (PessoaFisicaTO) PessoaFisicaDAO.get(PessoaFisicaTO.class, pessoaTO.getIdPessoaFisica());
                }
                
                txtCodigoFornecedor.setText("" + fornecedorTO.getIdFornecedor());
                txtNomeFornecedor.setText(pessoaTO.getNomePessoa());
                
                if(pessoaTO.getSexoPessoa().equals("M")) {
                    rbMasculinoFornecedor.setSelected(true);
                } else {
                    rbFemininoFornecedor.setSelected(true);
                }
                
                txtEnderecoFornecedor.setText(pessoaTO.getEnderecoPessoa());
                
                CidadeTO cidadeTO = (CidadeTO) CidadeDAO.get(CidadeTO.class, pessoaTO.getIdCidade());
                cbCidadeFornecedor.setSelectedItem(cidadeTO);
                
                txtCNPJFornecedor.setText(pessoaJuridicaTO.getCnpjPessoaJuridica());
                txtInscricaoEstadualFornecedor.setText(pessoaJuridicaTO.getInscricaoEstadualPessoaJuridica());
                txtNomeFantasiaFornecedor.setText(pessoaJuridicaTO.getNomeFantasiaPessoaJuridica());
                txtRazaoSocialFornecedor.setText(pessoaJuridicaTO.getRazaoSocialPessoaJuridica());
                txtCelularFornecedor.setText(pessoaTO.getCelularPessoa());
                txtTelefoneFornecedor.setText(pessoaTO.getTelefonePessoa());

                if (fornecedorTO.getDataCadastroFornecedor() != null) {
                    txtDataCadastroFornecedor.setText(dateFormat.format(fornecedorTO.getDataCadastroFornecedor()));
                }

                cbStatusFornecedor.setSelectedItem(fornecedorTO.getStatusFornecedor());
                        
                habilitarForm(true);
            } catch (Exception ex) {
                ex.printStackTrace();
                Logger.getLogger(FornecedorGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tbGradeMouseClicked

    //Evento para quando clicar no botão "Novo"
    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        habilitarForm(true);
        txtCodigoFornecedor.setText("0");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        txtDataCadastroFornecedor.setText(sdf.format(new java.util.Date()));
    }//GEN-LAST:event_btNovoActionPerformed

    //Evento para quando clicar no botão "Cancelar"
    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limparForm();
        habilitarForm(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    //Evento para quando clicar no botão "Pesquisar"
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        atualizarGrade();
    }//GEN-LAST:event_btPesquisarActionPerformed

    //Métodos//
    //Método que atualiza a grade com os valores cadastrados
    private void atualizarGrade() {
        try {
            String filtro = txtPesquisarFornecedor.getText();
            List<Class<?>> classes = new ArrayList<>();
            classes.add(FornecedorTO.class);
            classes.add(PessoaTO.class);

            String[] camposSelect = new String[]{"Fornecedor.idFornecedor", "Pessoa.nomePessoa",
                "Pessoa.enderecoPessoa", "Fornecedor.statusFornecedor"};
            tb.setDados(FornecedorDAO.listarUtilizandoComandoInnerJoin(classes, camposSelect, pagina, "nomePessoa", filtro));
            tbGrade.setModel(tb);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao atualizar grade");
        }
    }

    //Método que habilita o formulário
    private void habilitarForm(boolean habilitar) {
        txtCodigoFornecedor.setEnabled(habilitar);
        txtNomeFornecedor.setEnabled(habilitar);
        rbMasculinoFornecedor.setSelected(true);
        rbFemininoFornecedor.setEnabled(habilitar);
        txtEnderecoFornecedor.setEnabled(habilitar);
        cbCidadeFornecedor.setEnabled(habilitar);
        txtCNPJFornecedor.setEnabled(habilitar);
        txtInscricaoEstadualFornecedor.setEnabled(habilitar);
        txtNomeFantasiaFornecedor.setEnabled(habilitar);
        txtRazaoSocialFornecedor.setEnabled(habilitar);
        txtCelularFornecedor.setEnabled(habilitar);
        txtTelefoneFornecedor.setEnabled(habilitar);
        txtDataCadastroFornecedor.setEnabled(habilitar);
        cbStatusFornecedor.setEnabled(habilitar);

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
        txtCodigoFornecedor.setText("");
        txtNomeFornecedor.setText("");
        txtEnderecoFornecedor.setText("");
        txtCNPJFornecedor.setText("");
        txtInscricaoEstadualFornecedor.setText("");
        txtNomeFantasiaFornecedor.setText("");
        txtRazaoSocialFornecedor.setText("");
        txtCelularFornecedor.setText("");
        txtTelefoneFornecedor.setText("");
        txtDataCadastroFornecedor.setText("");
    }

    //Método de validação do CPF
    private boolean validarCNPJ() throws Exception {
        //Validação do CPF
        String CNPJ = txtCNPJFornecedor.getText().trim();
        if (ValidarCNPJ.isCNPJ(CNPJ) != true) {
            br.com.ctesop.componentes.JOptionPane.showWarningDialog(this, "CNPJ inválido.");
            txtCNPJFornecedor.requestFocus();
            return false;
        }
        
        return true;
    }
    
    //Método de validação dos TextFields
    private boolean validar() throws Exception {
        //Validação do "Nome"
        if (txtNomeFornecedor.getText().trim().length() < 2 || txtNomeFornecedor.getText().trim().length() > 90) {
            JOptionPane.showMessageDialog(this, "Nome do fornecedor inválido.", "Alerta",
                    JOptionPane.WARNING_MESSAGE);
            txtNomeFornecedor.requestFocus();
            return false;
        }

        //Verificação do status do grupo de produto
        cidade = (CidadeTO) cbCidadeFornecedor.getSelectedItem();
        if (cidade.getStatusCidade().equals("INATIVO")) {
            JOptionPane.showMessageDialog(this, "Impossível cadastrar um cliente nesta cidade, pois "
                    + "o status da cidade está como inativo.");
            return false;
        }

        return true;
    }

    //Para carregar a "Cidade" no formulário Fornecedor
    private void carregaCidades() {
        try {
            List<Object> listaCidade = CidadeDAO.listar(CidadeTO.class);
            for (Object e : listaCidade) {
                cbCidadeFornecedor.addItem((CidadeTO) e);
            }

        } catch (Exception ex) {
            //Para as mensagens de erro. Esta puxando do pacote "br.com.ctesop.componentes" da classe "JOptionPane"
            JOptionPane.showWarningDialog(this, "Ocorreu um erro ao listar as cidades.");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbCidadeFornecedor;
    private javax.swing.JComboBox cbStatusFornecedor;
    private javax.swing.JLabel lbCNPJFornecedor;
    private javax.swing.JLabel lbCelularFornecedor;
    private javax.swing.JLabel lbCidadeFornecedor;
    private javax.swing.JLabel lbCodigoFornecedor;
    private javax.swing.JLabel lbDataCadastroFornecedor;
    private javax.swing.JLabel lbEnderecoFornecedor;
    private javax.swing.JLabel lbInscricaoEstadualFornecedor;
    private javax.swing.JLabel lbNomeFantasiaFornecedor;
    private javax.swing.JLabel lbNomeFornecedor;
    private javax.swing.JLabel lbPesquisarFornecedor;
    private javax.swing.JLabel lbRazaoSocialFornecedor;
    private javax.swing.JLabel lbSexoFornecedor;
    private javax.swing.JLabel lbStatusFornecedor;
    private javax.swing.JLabel lbTelefoneFornecedor;
    private javax.swing.JTabbedPane pnAbas;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JPanel pnPesquisa;
    private javax.swing.JPanel pnPesquisar;
    private javax.swing.JRadioButton rbFemininoFornecedor;
    private javax.swing.JRadioButton rbMasculinoFornecedor;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    private javax.swing.JTextField txtCNPJFornecedor;
    private javax.swing.JFormattedTextField txtCelularFornecedor;
    private javax.swing.JTextField txtCodigoFornecedor;
    private javax.swing.JFormattedTextField txtDataCadastroFornecedor;
    private javax.swing.JTextField txtEnderecoFornecedor;
    private javax.swing.JTextField txtInscricaoEstadualFornecedor;
    private javax.swing.JFormattedTextField txtNomeFantasiaFornecedor;
    private javax.swing.JTextField txtNomeFornecedor;
    private javax.swing.JTextField txtPesquisarFornecedor;
    private javax.swing.JTextField txtRazaoSocialFornecedor;
    private javax.swing.JFormattedTextField txtTelefoneFornecedor;
    // End of variables declaration//GEN-END:variables
}
