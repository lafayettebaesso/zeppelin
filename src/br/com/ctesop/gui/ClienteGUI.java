package br.com.ctesop.gui;

import br.com.ctesop.componentes.JOptionPane;
import br.com.ctesop.dao.CidadeDAO;
import br.com.ctesop.dao.ClienteDAO;
import br.com.ctesop.dao.PessoaDAO;
import br.com.ctesop.dao.PessoaFisicaDAO;
import br.com.ctesop.dao.PessoaJuridicaDAO;
import br.com.ctesop.gui.tablemodel.TableModelGrid;
import br.com.ctesop.to.ClienteTO;
import br.com.ctesop.to.CidadeTO;
import br.com.ctesop.to.PessoaFisicaTO;
import br.com.ctesop.to.PessoaJuridicaTO;
import br.com.ctesop.to.PessoaTO;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.ctesop.componentes.ValidarCPF;

public class ClienteGUI extends javax.swing.JInternalFrame {

    int pagina = 0;
    TableModelGrid tb;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    CidadeTO cidade = new CidadeTO();

    public ClienteGUI() {
        initComponents();
        this.tb = new TableModelGrid("Código", "Nome", "Endereço", "Status");
        carregaCidades();
        habilitarForm(false);
        habilitarPessoaJuridica(false);
        atualizarGrade();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoPessoa = new javax.swing.ButtonGroup();
        bgSexo = new javax.swing.ButtonGroup();
        pnBotoes = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        pnAbas = new javax.swing.JTabbedPane();
        pnPesquisar = new javax.swing.JPanel();
        pnPesquisa = new javax.swing.JPanel();
        lbPesquisarCliente = new javax.swing.JLabel();
        txtPesquisarCliente = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        spGrade = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();
        pnFormulario = new javax.swing.JPanel();
        lbCodigoCliente = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        lbNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        lbTipoPessoaCliente = new javax.swing.JLabel();
        rbPessoaFisicaCliente = new javax.swing.JRadioButton();
        rbPessoaJuridicaCliente = new javax.swing.JRadioButton();
        lbSexoCliente = new javax.swing.JLabel();
        rbMasculinoCliente = new javax.swing.JRadioButton();
        rbFemininoCliente = new javax.swing.JRadioButton();
        lbCidadeCliente = new javax.swing.JLabel();
        cbCidadeCliente = new javax.swing.JComboBox();
        lbEnderecoCliente = new javax.swing.JLabel();
        txtEnderecoCliente = new javax.swing.JTextField();
        lbCPFCliente = new javax.swing.JLabel();
        lbRGCliente = new javax.swing.JLabel();
        txtRGCliente = new javax.swing.JFormattedTextField();
        lbOrgaoEmissor = new javax.swing.JLabel();
        txtOrgaoEmissor = new javax.swing.JTextField();
        lbCNPJCliente = new javax.swing.JLabel();
        txtCNPJCliente = new javax.swing.JFormattedTextField();
        lbRazaoSocialCliente = new javax.swing.JLabel();
        txtRazaoSocialCliente = new javax.swing.JTextField();
        lbInscricaoEstadualCliente = new javax.swing.JLabel();
        txtInscricaoEstadualCliente = new javax.swing.JTextField();
        lbLocalTrabalhoCliente = new javax.swing.JLabel();
        txtLocalTrabalhoCliente = new javax.swing.JTextField();
        lbCelularCliente = new javax.swing.JLabel();
        txtCelularCliente = new javax.swing.JFormattedTextField();
        lbTelefoneResidencialCliente = new javax.swing.JLabel();
        txtTelefoneResidencialCliente = new javax.swing.JFormattedTextField();
        lbTelefoneComercialCliente = new javax.swing.JLabel();
        txtTelefoneComercialCliente = new javax.swing.JFormattedTextField();
        lbDataNascimentoCliente = new javax.swing.JLabel();
        txtDataNascimentoCliente = new javax.swing.JFormattedTextField();
        lbDataCadastroCliente = new javax.swing.JLabel();
        txtDataCadastroCliente = new javax.swing.JFormattedTextField();
        lbStatusCliente = new javax.swing.JLabel();
        cbStatusCliente = new javax.swing.JComboBox();
        txtCPFCliente = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cliente");

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

        pnPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lbPesquisarCliente.setText("Pesquisar:");

        txtPesquisarCliente.setDocument(new br.com.ctesop.componentes.MascaraLetras(90));

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

        javax.swing.GroupLayout pnPesquisaLayout = new javax.swing.GroupLayout(pnPesquisa);
        pnPesquisa.setLayout(pnPesquisaLayout);
        pnPesquisaLayout.setHorizontalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbPesquisarCliente)
                .addGap(12, 12, 12)
                .addComponent(txtPesquisarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnPesquisaLayout.setVerticalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPesquisarCliente)
                    .addComponent(txtPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout pnPesquisarLayout = new javax.swing.GroupLayout(pnPesquisar);
        pnPesquisar.setLayout(pnPesquisarLayout);
        pnPesquisarLayout.setHorizontalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnPesquisarLayout.setVerticalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Pesquisar", pnPesquisar);

        pnFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulário"));

        lbCodigoCliente.setText("Código:");

        txtCodigoCliente.setEditable(false);
        txtCodigoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbNomeCliente.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbNomeCliente.setText("Nome do cliente:");

        txtNomeCliente.setDocument(new br.com.ctesop.componentes.MascaraLetras(90));

        lbTipoPessoaCliente.setText("Tipo:");

        bgTipoPessoa.add(rbPessoaFisicaCliente);
        rbPessoaFisicaCliente.setText("Pessoa física");
        rbPessoaFisicaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPessoaFisicaClienteActionPerformed(evt);
            }
        });

        bgTipoPessoa.add(rbPessoaJuridicaCliente);
        rbPessoaJuridicaCliente.setText("Pessoa jurídica");
        rbPessoaJuridicaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPessoaJuridicaClienteActionPerformed(evt);
            }
        });

        lbSexoCliente.setText("Sexo:");

        bgSexo.add(rbMasculinoCliente);
        rbMasculinoCliente.setText("Masculino");

        bgSexo.add(rbFemininoCliente);
        rbFemininoCliente.setText("Feminino");

        lbCidadeCliente.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbCidadeCliente.setText("Cidade:");

        lbEnderecoCliente.setText("Endereço:");

        txtEnderecoCliente.setDocument(new br.com.ctesop.componentes.MascaraLetrasNumeros(150));

        lbCPFCliente.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbCPFCliente.setText("CPF:");

        lbRGCliente.setText("RG:");

        txtRGCliente.setDocument(new br.com.ctesop.componentes.MascaraLetrasNumeros(9));

        lbOrgaoEmissor.setText("Orgão emissor:");

        txtOrgaoEmissor.setDocument(new br.com.ctesop.componentes.MascaraLetrasSimbolos(50));

        lbCNPJCliente.setText("CNPJ:");

        try {
            txtCNPJCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbRazaoSocialCliente.setText("Razão social:");

        txtRazaoSocialCliente.setDocument(new br.com.ctesop.componentes.MascaraLetrasSimbolos(150));

        lbInscricaoEstadualCliente.setText("Inscrição estadual:");

        txtInscricaoEstadualCliente.setDocument(new br.com.ctesop.componentes.MascaraNumeros(10));

        lbLocalTrabalhoCliente.setText("Local de trabalho:");

        txtLocalTrabalhoCliente.setDocument(new br.com.ctesop.componentes.MascaraLetrasSimbolos(45));

        lbCelularCliente.setText("Celular:");

        try {
            txtCelularCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelularCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbTelefoneResidencialCliente.setText("Telefone residencial:");

        try {
            txtTelefoneResidencialCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneResidencialCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbTelefoneComercialCliente.setText("Telefone comercial:");

        try {
            txtTelefoneComercialCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneComercialCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbDataNascimentoCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDataNascimentoCliente.setText("Data de nascimento:");

        try {
            txtDataNascimentoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimentoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbDataCadastroCliente.setText("Data de cadastro:");

        txtDataCadastroCliente.setEditable(false);
        try {
            txtDataCadastroCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataCadastroCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbStatusCliente.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbStatusCliente.setText("Status:");

        cbStatusCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ATIVO", "INATIVO" }));

        txtCPFCliente.setDocument(new br.com.ctesop.componentes.MascaraNumeros(11));

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lbCelularCliente)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbLocalTrabalhoCliente)
                        .addGap(12, 12, 12)))
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocalTrabalhoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnFormularioLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbInscricaoEstadualCliente)
                                .addComponent(lbTipoPessoaCliente)
                                .addComponent(lbCodigoCliente)
                                .addComponent(lbStatusCliente)
                                .addComponent(lbDataNascimentoCliente)
                                .addComponent(lbSexoCliente)))
                        .addComponent(lbCPFCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbEnderecoCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbCNPJCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lbTelefoneResidencialCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbNomeCliente)
                        .addGap(12, 12, 12)
                        .addComponent(txtNomeCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormularioLayout.createSequentialGroup()
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                                .addGap(15, 15, 15)
                                .addComponent(lbCidadeCliente))
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbStatusCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnFormularioLayout.createSequentialGroup()
                                        .addComponent(rbMasculinoCliente)
                                        .addGap(8, 8, 8)
                                        .addComponent(rbFemininoCliente))
                                    .addGroup(pnFormularioLayout.createSequentialGroup()
                                        .addComponent(rbPessoaFisicaCliente)
                                        .addGap(8, 8, 8)
                                        .addComponent(rbPessoaJuridicaCliente))
                                    .addGroup(pnFormularioLayout.createSequentialGroup()
                                        .addComponent(txtTelefoneResidencialCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(lbTelefoneComercialCliente)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtTelefoneComercialCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnFormularioLayout.createSequentialGroup()
                                        .addComponent(txtDataNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(lbDataCadastroCliente)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtDataCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, 0)))
                        .addGap(12, 12, 12)
                        .addComponent(cbCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtInscricaoEstadualCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtCNPJCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addComponent(lbRazaoSocialCliente)
                        .addGap(12, 12, 12)
                        .addComponent(txtRazaoSocialCliente))
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(txtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbRGCliente)
                        .addGap(12, 12, 12)
                        .addComponent(txtRGCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbOrgaoEmissor)
                        .addGap(12, 12, 12)
                        .addComponent(txtOrgaoEmissor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)))
                .addGap(12, 12, 12))
        );
        pnFormularioLayout.setVerticalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeCliente)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodigoCliente))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPessoaFisicaCliente)
                    .addComponent(rbPessoaJuridicaCliente)
                    .addComponent(lbTipoPessoaCliente))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexoCliente)
                    .addComponent(rbMasculinoCliente)
                    .addComponent(rbFemininoCliente))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCidadeCliente)
                    .addComponent(lbEnderecoCliente)
                    .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRGCliente)
                    .addComponent(txtRGCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCPFCliente)
                    .addComponent(lbOrgaoEmissor)
                    .addComponent(txtOrgaoEmissor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRazaoSocialCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbRazaoSocialCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCNPJCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCNPJCliente)))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInscricaoEstadualCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInscricaoEstadualCliente))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLocalTrabalhoCliente)
                    .addComponent(txtLocalTrabalhoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCelularCliente)
                    .addComponent(txtCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefoneResidencialCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefoneComercialCliente)
                    .addComponent(txtTelefoneResidencialCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneComercialCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataNascimentoCliente)
                    .addComponent(txtDataNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDataCadastroCliente)
                    .addComponent(txtDataCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStatusCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbStatusCliente))
                .addGap(12, 12, 12))
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

    //Evento para quando clicar no botão "Cancelar"
    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limparForm();
        habilitarForm(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    //Evento para quando clicar no botão "Novo"
    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        habilitarForm(true);
        txtCodigoCliente.setText("0");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        txtDataCadastroCliente.setText(sdf.format(new java.util.Date()));
    }//GEN-LAST:event_btNovoActionPerformed

    //Evento para quando clicar no botão "Salvar"
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            //Valida os campos, se necessário, e verifica se já há algum cadastro igual
            //Valida também o CPF
            if ((!validarCPF() || !validar())) {
                return;
            }

            //Instanciação dos objetos utilizados na classe
            ClienteTO clienteTO = new ClienteTO();
            PessoaTO pessoaTO = new PessoaTO();
            PessoaFisicaTO pessoaFisicaTO = new PessoaFisicaTO();
            PessoaJuridicaTO pessoaJuridicaTO = new PessoaJuridicaTO();

            //Cria uma nova cidade, dá um nome para ela e recupera o objeto Cidade selecionado
            cidade = (CidadeTO) cbCidadeCliente.getSelectedItem();

            //Inserção das informações no banco de dados
            clienteTO.setIdCliente(Integer.parseInt(txtCodigoCliente.getText()));
            pessoaTO.setNomePessoa(txtNomeCliente.getText().trim());

            if (rbMasculinoCliente.isSelected()) {
                pessoaTO.setSexoPessoa("M");
            } else {
                pessoaTO.setSexoPessoa("F");
            }

            pessoaTO.setEnderecoPessoa(txtEnderecoCliente.getText().trim());
            pessoaTO.setIdCidade(cidade.getIdCidade());

            if (rbPessoaFisicaCliente.isSelected()) {
                pessoaFisicaTO.setCpfPessoaFisica(txtCPFCliente.getText().trim());
                pessoaFisicaTO.setRgPessoaFisica(txtRGCliente.getText().trim());
                pessoaFisicaTO.setOrgaoEmissorRgPessoaFisica(txtOrgaoEmissor.getText().trim());
                pessoaFisicaTO.setInscricaoEstadualPessoaFisica(txtInscricaoEstadualCliente.getText().trim());
            } else {
                pessoaJuridicaTO.setCnpjPessoaJuridica(txtCNPJCliente.getText().trim());
                pessoaJuridicaTO.setRazaoSocialPessoaJuridica(txtRazaoSocialCliente.getText().trim());
                pessoaJuridicaTO.setInscricaoEstadualPessoaJuridica(txtInscricaoEstadualCliente.getText().trim());
            }

            clienteTO.setLocalTrabalhoCliente(txtLocalTrabalhoCliente.getText().trim());
            pessoaTO.setCelularPessoa(txtTelefoneResidencialCliente.getText());
            pessoaTO.setTelefonePessoa(txtCelularCliente.getText());
            pessoaTO.setTelefoneComercialPessoa(txtTelefoneComercialCliente.getText());

            if (!txtDataNascimentoCliente.getText().trim().isEmpty()) {
                Date data = new Date(dateFormat.parse(txtDataNascimentoCliente.getText()).getTime());
                pessoaFisicaTO.setDataNascimentoPessoaFisica(data);
            }

            if (!txtDataCadastroCliente.getText().trim().isEmpty()) {
                Date data = new Date(dateFormat.parse(txtDataCadastroCliente.getText()).getTime());
                clienteTO.setDataCadastroCliente(data);
            }

            clienteTO.setStatusCliente(cbStatusCliente.getSelectedItem().toString());

            if (clienteTO.getIdCliente() == 0) {
                //Insere o novo cadastro
                if (pessoaFisicaTO.getCpfPessoaFisica() != null && !pessoaFisicaTO.getCpfPessoaFisica().isEmpty()) {
                    pessoaFisicaTO.setIdPessoaFisica(0);
                    pessoaTO.setIdPessoaFisica(PessoaFisicaDAO.inserirRetornandoId(pessoaFisicaTO));
                    clienteTO.setIdPessoaFisica(pessoaTO.getIdPessoaFisica());
                } else {
                    pessoaTO.setIdPessoaJuridica(PessoaJuridicaDAO.inserirRetornandoId(pessoaJuridicaTO));
                    clienteTO.setIdPessoaJuridica(pessoaTO.getIdPessoaJuridica());
                }

                clienteTO.setIdPessoa(PessoaDAO.inserirRetornandoId(pessoaTO));
                ClienteDAO.inserir(clienteTO);
                JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");

            } else {
                ClienteTO clienteBaseDados = (ClienteTO) ClienteDAO.get(ClienteTO.class, clienteTO.getIdCliente());
                PessoaTO pessoaBaseDados = (PessoaTO) PessoaDAO.get(PessoaTO.class, clienteBaseDados.getIdPessoa());

                clienteTO.setIdPessoa(clienteBaseDados.getIdPessoa());
                clienteTO.setIdPessoaFisica(pessoaBaseDados.getIdPessoaFisica());
                clienteTO.setIdPessoaJuridica(pessoaBaseDados.getIdPessoaJuridica());
                pessoaTO.setIdPessoa(clienteBaseDados.getIdPessoa());
                pessoaTO.setIdPessoaFisica(pessoaBaseDados.getIdPessoaFisica());
                pessoaTO.setIdPessoaJuridica(pessoaBaseDados.getIdPessoaJuridica());

                if (!pessoaFisicaTO.getCpfPessoaFisica().isEmpty()) {
                    pessoaFisicaTO.setIdPessoaFisica(clienteBaseDados.getIdPessoaFisica());
                    PessoaFisicaDAO.alterar(pessoaFisicaTO);
                }

                pessoaTO.setIdPessoa(clienteBaseDados.getIdPessoa());
                PessoaDAO.alterar(pessoaTO);
                ClienteDAO.alterar(clienteTO);
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

    //Chama os métodos que habilitam os componentes da checkbox PessoaJuridica
    private void rbPessoaJuridicaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPessoaJuridicaClienteActionPerformed
        habilitarPessoaJuridica(true);
        habilitarPessoaFisica(false);
    }//GEN-LAST:event_rbPessoaJuridicaClienteActionPerformed

    //Chama os métodos que habilitam os componentes da checkbox PessoaFisica
    private void rbPessoaFisicaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPessoaFisicaClienteActionPerformed
        habilitarPessoaFisica(true);
        habilitarPessoaJuridica(false);
    }//GEN-LAST:event_rbPessoaFisicaClienteActionPerformed

    //Evento para quando clicar no botão "Pesquisar"
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        atualizarGrade();
    }//GEN-LAST:event_btPesquisarActionPerformed

    //Evento para quando der 2 cliques em um item da grade
    private void tbGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeMouseClicked
        if (evt.getClickCount() == 2) {

            try {
                TableModelGrid tm = (TableModelGrid) tbGrade.getModel();
                int idEntidade = tm.getIntValueAt(tbGrade.getSelectedRow(), 0);
                if (idEntidade <= 0) {
                    return;
                }

                ClienteTO clienteTO = (ClienteTO) ClienteDAO.get(ClienteTO.class, idEntidade);
                PessoaTO pessoaTO = (PessoaTO) PessoaDAO.get(PessoaTO.class, clienteTO.getIdPessoa());
                PessoaFisicaTO pessoaFisicaTO = null;
                PessoaJuridicaTO pessoaJuridicaTO = null;

                if (pessoaTO.getIdPessoaFisica() != null) {
                    pessoaFisicaTO = (PessoaFisicaTO) PessoaFisicaDAO.get(PessoaFisicaTO.class, pessoaTO.getIdPessoaFisica());
                } else {
                    pessoaJuridicaTO = (PessoaJuridicaTO) PessoaJuridicaDAO.get(PessoaJuridicaTO.class, pessoaTO.getIdPessoaJuridica());
                }

                txtCodigoCliente.setText("" + clienteTO.getIdCliente());
                txtNomeCliente.setText(pessoaTO.getNomePessoa());

                if (pessoaTO.getSexoPessoa().equals("M")) {
                    rbMasculinoCliente.setSelected(true);
                } else {
                    rbFemininoCliente.setSelected(true);
                }

                txtEnderecoCliente.setText(pessoaTO.getEnderecoPessoa());

                CidadeTO cidadeTO = (CidadeTO) CidadeDAO.get(CidadeTO.class, pessoaTO.getIdCidade());
                cbCidadeCliente.setSelectedItem(cidadeTO);

                if (pessoaTO.getIdPessoaFisica() != null) {
                    txtCPFCliente.setText(pessoaFisicaTO.getCpfPessoaFisica());
                    txtRGCliente.setText(pessoaFisicaTO.getRgPessoaFisica());
                    txtOrgaoEmissor.setText(pessoaFisicaTO.getOrgaoEmissorRgPessoaFisica());
                    txtInscricaoEstadualCliente.setText(pessoaFisicaTO.getInscricaoEstadualPessoaFisica());
                } else {
                    txtCNPJCliente.setText(pessoaJuridicaTO.getCnpjPessoaJuridica());
                    txtRazaoSocialCliente.setText(pessoaJuridicaTO.getRazaoSocialPessoaJuridica());
                    txtInscricaoEstadualCliente.setText(pessoaJuridicaTO.getInscricaoEstadualPessoaJuridica());
                }

                txtLocalTrabalhoCliente.setText(clienteTO.getLocalTrabalhoCliente());
                txtCelularCliente.setText(pessoaTO.getTelefonePessoa());
                txtTelefoneResidencialCliente.setText(pessoaTO.getCelularPessoa());
                txtTelefoneComercialCliente.setText(pessoaTO.getTelefoneComercialPessoa());

                if (pessoaFisicaTO.getDataNascimentoPessoaFisica() != null) {
                    txtDataNascimentoCliente.setText(dateFormat.format(pessoaFisicaTO.getDataNascimentoPessoaFisica()));
                }

                if (clienteTO.getDataCadastroCliente() != null) {
                    txtDataCadastroCliente.setText(dateFormat.format(clienteTO.getDataCadastroCliente()));
                }

                cbStatusCliente.setSelectedItem(clienteTO.getStatusCliente());

                habilitarForm(true);
            } catch (Exception ex) {
                ex.printStackTrace();
                Logger.getLogger(ClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tbGradeMouseClicked

    //Métodos//
    //Método que atualiza a grade com os valores cadastrados
    private void atualizarGrade() {
        try {
            String filtro = txtPesquisarCliente.getText();
            List<Class<?>> classes = new ArrayList<>();
            classes.add(ClienteTO.class);
            classes.add(PessoaTO.class);

            String[] camposSelect = new String[]{"Cliente.idCliente", "Pessoa.nomePessoa",
                "Pessoa.enderecoPessoa", "Cliente.statusCliente"};
            tb.setDados(ClienteDAO.listarUtilizandoComandoInnerJoin(classes, camposSelect, pagina, "nomePessoa", filtro));
            tbGrade.setModel(tb);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao atualizar grade");
        }
    }

    //Método que habilita o formulário
    private void habilitarForm(boolean habilitar) {
        txtCodigoCliente.setEnabled(habilitar);
        txtNomeCliente.setEnabled(habilitar);
        rbPessoaFisicaCliente.setEnabled(habilitar);
        rbPessoaFisicaCliente.setSelected(true);
        rbPessoaJuridicaCliente.setEnabled(habilitar);
        rbMasculinoCliente.setEnabled(habilitar);
        rbMasculinoCliente.setSelected(true);
        rbFemininoCliente.setEnabled(habilitar);
        txtEnderecoCliente.setEnabled(habilitar);
        cbCidadeCliente.setEnabled(habilitar);
        txtCPFCliente.setEnabled(habilitar);
        txtRGCliente.setEnabled(habilitar);
        txtOrgaoEmissor.setEnabled(habilitar);
        txtCNPJCliente.setEnabled(habilitar);
        txtRazaoSocialCliente.setEnabled(habilitar);
        txtInscricaoEstadualCliente.setEnabled(habilitar);
        txtTelefoneResidencialCliente.setEnabled(habilitar);
        txtCelularCliente.setEnabled(habilitar);
        txtTelefoneComercialCliente.setEnabled(habilitar);
        txtDataNascimentoCliente.setEnabled(habilitar);
        txtLocalTrabalhoCliente.setEnabled(habilitar);
        txtDataCadastroCliente.setEnabled(habilitar);
        cbStatusCliente.setEnabled(habilitar);

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
        txtCodigoCliente.setText("");
        txtNomeCliente.setText("");
        txtEnderecoCliente.setText("");
        txtCPFCliente.setText("");
        txtRGCliente.setText("");
        txtOrgaoEmissor.setText("");
        txtCNPJCliente.setText("");
        txtRazaoSocialCliente.setText("");
        txtInscricaoEstadualCliente.setText("");
        txtTelefoneResidencialCliente.setText("");
        txtCelularCliente.setText("");
        txtTelefoneComercialCliente.setText("");
        txtDataNascimentoCliente.setText("");
        txtLocalTrabalhoCliente.setText("");
        txtDataCadastroCliente.setText("");
    }

    //Método para quando clicar no RadioButton "Pessoa Física"   
    private void habilitarPessoaFisica(boolean habilitar) {
        lbCPFCliente.setVisible(habilitar);
        txtCPFCliente.setVisible(habilitar);
        lbRGCliente.setVisible(habilitar);
        txtRGCliente.setVisible(habilitar);
        lbOrgaoEmissor.setVisible(habilitar);
        txtOrgaoEmissor.setVisible(habilitar);
    }

    //Método para quando clicar no RadioButton "Pessoa Jurídica"   
    private void habilitarPessoaJuridica(boolean habilitar) {
        lbCNPJCliente.setVisible(habilitar);
        txtCNPJCliente.setVisible(habilitar);
        lbRazaoSocialCliente.setVisible(habilitar);
        txtRazaoSocialCliente.setVisible(habilitar);
    }

    //Para carregar a "Cidade" no formulário Cliente
    private void carregaCidades() {
        try {
            List<Object> listaCidade = CidadeDAO.listar(CidadeTO.class);
            for (Object e : listaCidade) {
                cbCidadeCliente.addItem((CidadeTO) e);
            }

        } catch (Exception ex) {
            //Para as mensagens de erro. Esta puxando do pacote "br.com.ctesop.componentes" da classe "JOptionPane"
            JOptionPane.showWarningDialog(this, "Ocorreu um erro ao listar as cidades.");
        }
    }

    //Método de validação do CPF
    private boolean validarCPF() throws Exception {
        //Validação do CPF
        String CPF = txtCPFCliente.getText().trim();
        if (ValidarCPF.isCPF(CPF) != true) {
            br.com.ctesop.componentes.JOptionPane.showWarningDialog(this, "CPF inválido.");
            txtCPFCliente.requestFocus();
            return false;
        }
        
        return true;
    }

    //Método de validação do TextField
    private boolean validar() throws Exception {
        //Validação do "Nome do cliente"
        if (txtNomeCliente.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Nome do cliente inválido.", "Alerta",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            txtNomeCliente.requestFocus();
            return false;
        }

        //Para verificar se o CPF do cliente já está cadastrado
//        if (PessoaFisicaDAO.verificaCpfExiste(txtCPFCliente.getText().trim())) {
//            javax.swing.JOptionPane.showMessageDialog(this, "CPF já cadastrado.", "Alerta", javax.swing.JOptionPane.WARNING_MESSAGE);
//            txtCPFCliente.requestFocus();
//            return false;
//        }
        
        //Verificação do status do grupo de produto
        cidade = (CidadeTO) cbCidadeCliente.getSelectedItem();
        if (cidade.getStatusCidade().equals("INATIVO")) {
            JOptionPane.showMessageDialog(this, "Impossível cadastrar um cliente nesta cidade, pois "
                    + "o status da cidade está como inativo.");
            return false;
        }

        //Verificação da data de nascimento do cliente
        if (txtDataNascimentoCliente.getText().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(this, "A data de nascimento é inválida.");
            txtDataNascimentoCliente.requestFocus();
            return false;
        }

        Date data = new Date(dateFormat.parse(txtDataNascimentoCliente.getText()).getTime());
        if (data.after(new java.util.Date())) {
            JOptionPane.showMessageDialog(this, "A data de nascimento não pode ser superior a data atual.");
            txtDataNascimentoCliente.requestFocus();
            return false;
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.ButtonGroup bgTipoPessoa;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbCidadeCliente;
    private javax.swing.JComboBox cbStatusCliente;
    private javax.swing.JLabel lbCNPJCliente;
    private javax.swing.JLabel lbCPFCliente;
    private javax.swing.JLabel lbCelularCliente;
    private javax.swing.JLabel lbCidadeCliente;
    private javax.swing.JLabel lbCodigoCliente;
    private javax.swing.JLabel lbDataCadastroCliente;
    private javax.swing.JLabel lbDataNascimentoCliente;
    private javax.swing.JLabel lbEnderecoCliente;
    private javax.swing.JLabel lbInscricaoEstadualCliente;
    private javax.swing.JLabel lbLocalTrabalhoCliente;
    private javax.swing.JLabel lbNomeCliente;
    private javax.swing.JLabel lbOrgaoEmissor;
    private javax.swing.JLabel lbPesquisarCliente;
    private javax.swing.JLabel lbRGCliente;
    private javax.swing.JLabel lbRazaoSocialCliente;
    private javax.swing.JLabel lbSexoCliente;
    private javax.swing.JLabel lbStatusCliente;
    private javax.swing.JLabel lbTelefoneComercialCliente;
    private javax.swing.JLabel lbTelefoneResidencialCliente;
    private javax.swing.JLabel lbTipoPessoaCliente;
    private javax.swing.JTabbedPane pnAbas;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JPanel pnPesquisa;
    private javax.swing.JPanel pnPesquisar;
    private javax.swing.JRadioButton rbFemininoCliente;
    private javax.swing.JRadioButton rbMasculinoCliente;
    private javax.swing.JRadioButton rbPessoaFisicaCliente;
    private javax.swing.JRadioButton rbPessoaJuridicaCliente;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    private javax.swing.JFormattedTextField txtCNPJCliente;
    private javax.swing.JTextField txtCPFCliente;
    private javax.swing.JFormattedTextField txtCelularCliente;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JFormattedTextField txtDataCadastroCliente;
    private javax.swing.JFormattedTextField txtDataNascimentoCliente;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JTextField txtInscricaoEstadualCliente;
    private javax.swing.JTextField txtLocalTrabalhoCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtOrgaoEmissor;
    private javax.swing.JTextField txtPesquisarCliente;
    private javax.swing.JFormattedTextField txtRGCliente;
    private javax.swing.JTextField txtRazaoSocialCliente;
    private javax.swing.JFormattedTextField txtTelefoneComercialCliente;
    private javax.swing.JFormattedTextField txtTelefoneResidencialCliente;
    // End of variables declaration//GEN-END:variables
}
