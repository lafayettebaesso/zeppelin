package br.com.ctesop.gui;

import br.com.ctesop.componentes.JOptionPane;
import br.com.ctesop.componentes.SelecionarCampo;
import br.com.ctesop.componentes.ValidarCPF;
import br.com.ctesop.dao.CidadeDAO;
import br.com.ctesop.dao.FuncionarioDAO;
import br.com.ctesop.dao.PessoaDAO;
import br.com.ctesop.dao.PessoaFisicaDAO;
import br.com.ctesop.dao.PessoaJuridicaDAO;
import br.com.ctesop.gui.tablemodel.TableModelGrid;
import br.com.ctesop.to.CidadeTO;
import br.com.ctesop.to.FuncionarioTO;
import br.com.ctesop.to.PessoaFisicaTO;
import br.com.ctesop.to.PessoaJuridicaTO;
import br.com.ctesop.to.PessoaTO;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncionarioGUI extends javax.swing.JInternalFrame {

    int pagina = 0;
    TableModelGrid tb;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    CidadeTO cidade = new CidadeTO();

    public FuncionarioGUI() {
        initComponents();
        this.tb = new TableModelGrid("Código", "Nome", "Status");
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
        btPesquisar = new javax.swing.JButton();
        lbPesquisarFuncionario = new javax.swing.JLabel();
        txtPesquisarFuncionario = new javax.swing.JTextField();
        spGrade = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();
        pnFormulario = new javax.swing.JPanel();
        lbCodigoFuncionario = new javax.swing.JLabel();
        txtCodigoFuncionario = new javax.swing.JTextField();
        lbNomeFuncionario = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        lbSexoFuncionario = new javax.swing.JLabel();
        rbMasculinoFuncionario = new javax.swing.JRadioButton();
        rbFemininoFuncionario = new javax.swing.JRadioButton();
        lbEnderecoFuncionario = new javax.swing.JLabel();
        txtEnderecoFuncionario = new javax.swing.JTextField();
        lbCidadeFuncionario = new javax.swing.JLabel();
        cbCidadeFuncionario = new javax.swing.JComboBox();
        lbCPFFuncionario = new javax.swing.JLabel();
        lbRGFuncionario = new javax.swing.JLabel();
        txtRGFuncionario = new javax.swing.JFormattedTextField();
        lbCelularFuncionario = new javax.swing.JLabel();
        txtCelularFuncionario = new javax.swing.JFormattedTextField();
        lbTelefoneResidencialFuncionario = new javax.swing.JLabel();
        txtTelefoneResidencialFuncionario = new javax.swing.JFormattedTextField();
        lbDataNascimentoFuncionario = new javax.swing.JLabel();
        txtDataNascimentoFuncionario = new javax.swing.JFormattedTextField();
        lbNomeMaeFuncionario = new javax.swing.JLabel();
        txtNomeMaeFuncionario = new javax.swing.JTextField();
        lbDataCadastroFuncionario = new javax.swing.JLabel();
        txtDataCadastroFuncionario = new javax.swing.JFormattedTextField();
        lbSalarioFuncionario = new javax.swing.JLabel();
        txtSalarioFuncionario = new javax.swing.JFormattedTextField();
        lbStatusFuncionario = new javax.swing.JLabel();
        cbStatusFuncionario = new javax.swing.JComboBox();
        txtCPFFuncionario = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Funcionário");

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
                .addGap(8, 8, 8)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
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

        btPesquisar.setText("Pesquisar");
        btPesquisar.setMaximumSize(new java.awt.Dimension(120, 40));
        btPesquisar.setMinimumSize(new java.awt.Dimension(120, 40));
        btPesquisar.setPreferredSize(new java.awt.Dimension(120, 40));
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        lbPesquisarFuncionario.setText("Pesquisar:");

        javax.swing.GroupLayout pnPesquisarLayout = new javax.swing.GroupLayout(pnPesquisar);
        pnPesquisar.setLayout(pnPesquisarLayout);
        pnPesquisarLayout.setHorizontalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbPesquisarFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisarFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnPesquisarLayout.setVerticalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPesquisarFuncionario)
                    .addComponent(txtPesquisarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(12, 12, 12)
                .addGroup(pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addComponent(pnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnPesquisaLayout.setVerticalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Pesquisar", pnPesquisa);

        pnFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulário"));

        lbCodigoFuncionario.setText("Código:");

        txtCodigoFuncionario.setEditable(false);
        txtCodigoFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbNomeFuncionario.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbNomeFuncionario.setText("Nome do funcionário:");

        txtNomeFuncionario.setDocument(new br.com.ctesop.componentes.MascaraLetras(90));

        lbSexoFuncionario.setText("Sexo:");

        buttonGroup1.add(rbMasculinoFuncionario);
        rbMasculinoFuncionario.setText("Masculino");

        buttonGroup1.add(rbFemininoFuncionario);
        rbFemininoFuncionario.setText("Feminino");

        lbEnderecoFuncionario.setText("Endereço:");

        txtEnderecoFuncionario.setDocument(new br.com.ctesop.componentes.MascaraLetrasNumeros(150));

        lbCidadeFuncionario.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbCidadeFuncionario.setText("Cidade:");

        lbCPFFuncionario.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbCPFFuncionario.setText("CPF:");

        lbRGFuncionario.setText("RG:");

        lbCelularFuncionario.setText("Celular:");

        try {
            txtCelularFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelularFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbTelefoneResidencialFuncionario.setText("Telefone residencial:");

        try {
            txtTelefoneResidencialFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneResidencialFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbDataNascimentoFuncionario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDataNascimentoFuncionario.setText("Data de nascimento:");

        try {
            txtDataNascimentoFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimentoFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbNomeMaeFuncionario.setText("Nome da mãe:");

        txtNomeMaeFuncionario.setDocument(new br.com.ctesop.componentes.MascaraLetras(90));

        lbDataCadastroFuncionario.setText("Data de cadastro:");

        txtDataCadastroFuncionario.setEditable(false);
        try {
            txtDataCadastroFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataCadastroFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbSalarioFuncionario.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbSalarioFuncionario.setText("Salário:");

        txtSalarioFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtSalarioFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSalarioFuncionario.setText("0,00");
        txtSalarioFuncionario.setValue(new Float(0));
        txtSalarioFuncionario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSalarioFuncionarioFocusGained(evt);
            }
        });

        lbStatusFuncionario.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbStatusFuncionario.setText("Status:");

        cbStatusFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ATIVO", "INATIVO" }));

        txtCPFFuncionario.setDocument(new br.com.ctesop.componentes.MascaraNumeros(11));

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCPFFuncionario)
                    .addComponent(lbNomeMaeFuncionario)
                    .addComponent(lbTelefoneResidencialFuncionario)
                    .addComponent(lbCelularFuncionario)
                    .addComponent(lbDataNascimentoFuncionario)
                    .addComponent(lbDataCadastroFuncionario)
                    .addComponent(lbCodigoFuncionario)
                    .addComponent(lbNomeFuncionario)
                    .addComponent(lbStatusFuncionario)
                    .addComponent(lbEnderecoFuncionario)
                    .addComponent(lbCidadeFuncionario)
                    .addComponent(lbSexoFuncionario))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEnderecoFuncionario)
                    .addComponent(txtNomeFuncionario)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(rbMasculinoFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbFemininoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDataNascimentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(txtDataCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbSalarioFuncionario)
                        .addGap(12, 12, 12)
                        .addComponent(txtSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbCidadeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneResidencialFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelularFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStatusFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(txtCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbRGFuncionario)
                        .addGap(12, 12, 12)
                        .addComponent(txtRGFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNomeMaeFuncionario))
                .addGap(12, 12, 12))
        );
        pnFormularioLayout.setVerticalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigoFuncionario)
                    .addComponent(txtCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeFuncionario)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexoFuncionario)
                    .addComponent(rbMasculinoFuncionario)
                    .addComponent(rbFemininoFuncionario))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEnderecoFuncionario)
                    .addComponent(txtEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCidadeFuncionario)
                    .addComponent(cbCidadeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRGFuncionario)
                    .addComponent(txtRGFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCPFFuncionario)
                    .addComponent(txtCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCelularFuncionario)
                    .addComponent(txtCelularFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefoneResidencialFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneResidencialFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataNascimentoFuncionario)
                    .addComponent(txtDataNascimentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeMaeFuncionario)
                    .addComponent(txtNomeMaeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataCadastroFuncionario)
                    .addComponent(txtDataCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSalarioFuncionario)
                    .addComponent(txtSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStatusFuncionario)
                    .addComponent(cbStatusFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(pnAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    //Evento para quando clicar no botão "Pesquisar"
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        atualizarGrade();
    }//GEN-LAST:event_btPesquisarActionPerformed

    //Evento para quando clicar no botão "Novo"
    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        habilitarForm(true);
        txtCodigoFuncionario.setText("0");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        txtDataCadastroFuncionario.setText(sdf.format(new java.util.Date()));
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
            FuncionarioTO funcionarioTO = new FuncionarioTO();
            PessoaTO pessoaTO = new PessoaTO();
            PessoaFisicaTO pessoaFisicaTO = new PessoaFisicaTO();
            PessoaJuridicaTO pessoaJuridicaTO = new PessoaJuridicaTO();

            //Cria uma nova cidade, dá um nome para ela e recupera o objeto Cidade selecionado
            cidade = (CidadeTO) cbCidadeFuncionario.getSelectedItem();

            //Inserção das informações no banco de dados
            funcionarioTO.setIdFuncionario(Integer.parseInt(txtCodigoFuncionario.getText()));
            pessoaTO.setNomePessoa(txtNomeFuncionario.getText());

            if (rbMasculinoFuncionario.isSelected()) {
                pessoaTO.setSexoPessoa("M");
            } else {
                pessoaTO.setSexoPessoa("F");
            }

            pessoaTO.setEnderecoPessoa(txtEnderecoFuncionario.getText());
            pessoaTO.setIdCidade(cidade.getIdCidade());
            pessoaFisicaTO.setCpfPessoaFisica(txtCPFFuncionario.getText());
            pessoaFisicaTO.setRgPessoaFisica(txtRGFuncionario.getText());
            pessoaTO.setCelularPessoa(txtCelularFuncionario.getText());
            pessoaTO.setTelefonePessoa(txtTelefoneResidencialFuncionario.getText());

            if (!txtDataNascimentoFuncionario.getText().trim().isEmpty()) {
                Date data = new Date(dateFormat.parse(txtDataNascimentoFuncionario.getText()).getTime());
                pessoaFisicaTO.setDataNascimentoPessoaFisica(data);
            }

            funcionarioTO.setNomeMaeFuncionario(txtNomeMaeFuncionario.getText());

            if (!txtDataCadastroFuncionario.getText().trim().isEmpty()) {
                Date data = new Date(dateFormat.parse(txtDataCadastroFuncionario.getText()).getTime());
                funcionarioTO.setDataCadastroFuncionario(data);
            }

            NumberFormat nf = NumberFormat.getNumberInstance();
            funcionarioTO.setSalarioFuncionario(nf.parse(txtSalarioFuncionario.getText()).floatValue());

            funcionarioTO.setStatusFuncionario(cbStatusFuncionario.getSelectedItem().toString());

            if (funcionarioTO.getIdFuncionario() == 0) {
                //Insere o novo cadastro
                if (pessoaFisicaTO.getCpfPessoaFisica() != null && !pessoaFisicaTO.getCpfPessoaFisica().isEmpty()) {
                    pessoaFisicaTO.setIdPessoaFisica(0);
                    pessoaTO.setIdPessoaFisica(PessoaFisicaDAO.inserirRetornandoId(pessoaFisicaTO));
                    funcionarioTO.setIdPessoaFisica(pessoaTO.getIdPessoaFisica());
                } else {
                    pessoaTO.setIdPessoaJuridica(PessoaJuridicaDAO.inserirRetornandoId(pessoaJuridicaTO));
                    funcionarioTO.setIdPessoaJuridica(pessoaTO.getIdPessoaJuridica());
                }

                funcionarioTO.setIdPessoa(PessoaDAO.inserirRetornandoId(pessoaTO));
                FuncionarioDAO.inserir(funcionarioTO);
                JOptionPane.showMessageDialog(this, "Funcionário cadastrado com sucesso!");
            } else {
                //Altera um cadastro já salvo
                FuncionarioTO funcionarioBaseDados = (FuncionarioTO) FuncionarioDAO.get(FuncionarioTO.class,
                        funcionarioTO.getIdFuncionario());
                PessoaTO pessoaBaseDados = (PessoaTO) PessoaDAO.get(PessoaTO.class, funcionarioBaseDados.getIdPessoa());
                funcionarioTO.setIdPessoa(funcionarioBaseDados.getIdPessoa());
                funcionarioTO.setIdPessoaFisica(pessoaBaseDados.getIdPessoaFisica());
                funcionarioTO.setIdPessoaJuridica(pessoaBaseDados.getIdPessoaJuridica());
                pessoaTO.setIdPessoa(funcionarioBaseDados.getIdPessoa());
                pessoaTO.setIdPessoaFisica(pessoaBaseDados.getIdPessoaFisica());
                pessoaTO.setIdPessoaJuridica(pessoaBaseDados.getIdPessoaJuridica());

                if (!pessoaFisicaTO.getCpfPessoaFisica().isEmpty()) {
                    pessoaFisicaTO.setIdPessoaFisica(funcionarioBaseDados.getIdPessoaFisica());
                    PessoaFisicaDAO.alterar(pessoaFisicaTO);
                }

                pessoaTO.setIdPessoa(funcionarioBaseDados.getIdPessoa());
                PessoaDAO.alterar(pessoaTO);
                FuncionarioDAO.alterar(funcionarioTO);
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

    //Evento para quando clicar no botão "Cancelar"
    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limparForm();
        habilitarForm(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    //Evento para quando der 2 cliques em um item da grade
    private void tbGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeMouseClicked
        if (evt.getClickCount() == 2) {

            try {
                TableModelGrid tm = (TableModelGrid) tbGrade.getModel();
                int idEntidade = tm.getIntValueAt(tbGrade.getSelectedRow(), 0);
                if (idEntidade <= 0) {
                    return;
                }

                FuncionarioTO funcionarioTO = (FuncionarioTO) FuncionarioDAO.get(FuncionarioTO.class, idEntidade);
                PessoaTO pessoaTO = (PessoaTO) PessoaDAO.get(PessoaTO.class, funcionarioTO.getIdPessoa());
                PessoaFisicaTO pessoaFisicaTO = null;
                PessoaJuridicaTO pessoaJuridicaTO = null;

                if (pessoaTO.getIdPessoaFisica() != null) {
                    pessoaFisicaTO = (PessoaFisicaTO) PessoaFisicaDAO.get(PessoaFisicaTO.class, pessoaTO.getIdPessoaFisica());
                } else {
                    pessoaJuridicaTO = (PessoaJuridicaTO) PessoaJuridicaDAO.get(PessoaJuridicaTO.class, pessoaTO.getIdPessoaJuridica());
                }

                txtCodigoFuncionario.setText("" + funcionarioTO.getIdFuncionario());
                txtNomeFuncionario.setText(pessoaTO.getNomePessoa());

                if (pessoaTO.getSexoPessoa().equals("M")) {
                    rbMasculinoFuncionario.setSelected(true);
                } else {
                    rbFemininoFuncionario.setSelected(true);
                }

                txtEnderecoFuncionario.setText(pessoaTO.getEnderecoPessoa());

                CidadeTO cidadeTO = (CidadeTO) CidadeDAO.get(CidadeTO.class, pessoaTO.getIdCidade());
                cbCidadeFuncionario.setSelectedItem(cidadeTO);

                txtCPFFuncionario.setText(pessoaFisicaTO.getCpfPessoaFisica());
                txtRGFuncionario.setText(pessoaFisicaTO.getRgPessoaFisica());
                txtCelularFuncionario.setText(pessoaTO.getCelularPessoa());
                txtTelefoneResidencialFuncionario.setText(pessoaTO.getTelefonePessoa());

                if (pessoaFisicaTO.getDataNascimentoPessoaFisica() != null) {
                    txtDataNascimentoFuncionario.setText(dateFormat.format(pessoaFisicaTO.getDataNascimentoPessoaFisica()));
                }

                txtNomeMaeFuncionario.setText(funcionarioTO.getNomeMaeFuncionario());

                if (funcionarioTO.getDataCadastroFuncionario() != null) {
                    txtDataCadastroFuncionario.setText(dateFormat.format(funcionarioTO.getDataCadastroFuncionario()));
                }

                txtSalarioFuncionario.setValue(funcionarioTO.getSalarioFuncionario());
                cbStatusFuncionario.setSelectedItem(funcionarioTO.getStatusFuncionario());

                habilitarForm(true);
            } catch (Exception ex) {
                ex.printStackTrace();
                Logger.getLogger(FuncionarioGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tbGradeMouseClicked

    private void txtSalarioFuncionarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalarioFuncionarioFocusGained
        SelecionarCampo.selecionarTudo(evt);
    }//GEN-LAST:event_txtSalarioFuncionarioFocusGained

    //Métodos//
    //Método que atualiza a grade com os valores cadastrados
    private void atualizarGrade() {
        try {
            String filtro = txtPesquisarFuncionario.getText();
            List<Class<?>> classes = new ArrayList<>();
            classes.add(FuncionarioTO.class);
            classes.add(PessoaTO.class);

            String[] camposSelect = new String[]{"Funcionario.idFuncionario", "Pessoa.nomePessoa",
                "Funcionario.statusFuncionario"};
            tb.setDados(FuncionarioDAO.listarUtilizandoComandoInnerJoin(classes, camposSelect, pagina, "nomePessoa", filtro));
            tbGrade.setModel(tb);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao atualizar grade");
        }
    }

    //Método que habilita o formulário
    private void habilitarForm(boolean habilitar) {
        txtCodigoFuncionario.setEnabled(habilitar);
        txtNomeFuncionario.setEnabled(habilitar);
        rbMasculinoFuncionario.setEnabled(habilitar);
        rbMasculinoFuncionario.setSelected(true);
        rbFemininoFuncionario.setEnabled(habilitar);
        txtEnderecoFuncionario.setEnabled(habilitar);
        cbCidadeFuncionario.setEnabled(habilitar);
        txtCPFFuncionario.setEnabled(habilitar);
        txtRGFuncionario.setEnabled(habilitar);
        txtCelularFuncionario.setEnabled(habilitar);
        txtTelefoneResidencialFuncionario.setEnabled(habilitar);
        txtDataNascimentoFuncionario.setEnabled(habilitar);
        txtNomeMaeFuncionario.setEnabled(habilitar);
        txtDataCadastroFuncionario.setEnabled(habilitar);
        txtSalarioFuncionario.setEnabled(habilitar);
        cbStatusFuncionario.setEnabled(habilitar);

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
        txtCodigoFuncionario.setText("");
        txtNomeFuncionario.setText("");
        rbMasculinoFuncionario.setSelected(true);
        txtEnderecoFuncionario.setText("");
        txtCPFFuncionario.setText("");
        txtRGFuncionario.setText("");
        txtCelularFuncionario.setText("");
        txtTelefoneResidencialFuncionario.setText("");
        txtDataNascimentoFuncionario.setText("");
        txtNomeMaeFuncionario.setText("");
        txtDataCadastroFuncionario.setText("");
        txtSalarioFuncionario.setText("");
    }

    //Método de validação do CPF
    private boolean validarCPF() throws Exception {
        //Validação do CPF
        String CPF = txtCPFFuncionario.getText().trim();
        if (ValidarCPF.isCPF(CPF) != true) {
            br.com.ctesop.componentes.JOptionPane.showWarningDialog(this, "CPF inválido.");
            txtCPFFuncionario.requestFocus();
            return false;
        }
        return true;
    }

    //Método de validação do TextField
    private boolean validar() throws Exception {
        //Validação do "Nome do funcionário"
        if (txtNomeFuncionario.getText().trim().length() < 2 || txtNomeFuncionario.getText().trim().length() > 90) {
            JOptionPane.showMessageDialog(this, "Nome do funcionário inválido.", "Alerta",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            txtNomeFuncionario.requestFocus();
            return false;
        }

        //Verificação do status do grupo de produto
        cidade = (CidadeTO) cbCidadeFuncionario.getSelectedItem();
        if (cidade.getStatusCidade().equals("INATIVO")) {
            JOptionPane.showMessageDialog(this, "Impossível cadastrar um cliente nesta cidade, pois "
                    + "o status da cidade está como inativo.");
            return false;
        }

        //Verificação da data de nascimento do cliente
        if (txtDataNascimentoFuncionario.getText().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(this, "A data de nascimento é inválida.");
            txtDataNascimentoFuncionario.requestFocus();
            return false;
        }

        Date data = new Date(dateFormat.parse(txtDataNascimentoFuncionario.getText()).getTime());
        if (data.after(new java.util.Date())) {
            JOptionPane.showMessageDialog(this, "A data de nascimento não pode ser superior a data atual.");
            txtDataNascimentoFuncionario.requestFocus();
            return false;
        }

        //Validação do campo salário
        NumberFormat nf = NumberFormat.getNumberInstance();
        Float salario = (nf.parse(txtSalarioFuncionario.getText()).floatValue());
        if (salario < 0) {
            JOptionPane.showMessageDialog(this, "O salário não pode ser um valor negativo.");
            txtSalarioFuncionario.requestFocus();
            return false;
        }
        
        return true;
    }

    //Para carregar a "Cidade" no formulário Funcionário
    private void carregaCidades() {
        try {
            List<Object> listaCidade = CidadeDAO.listar(CidadeTO.class);
            for (Object e : listaCidade) {
                cbCidadeFuncionario.addItem((CidadeTO) e);
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
    private javax.swing.JComboBox cbCidadeFuncionario;
    private javax.swing.JComboBox cbStatusFuncionario;
    private javax.swing.JLabel lbCPFFuncionario;
    private javax.swing.JLabel lbCelularFuncionario;
    private javax.swing.JLabel lbCidadeFuncionario;
    private javax.swing.JLabel lbCodigoFuncionario;
    private javax.swing.JLabel lbDataCadastroFuncionario;
    private javax.swing.JLabel lbDataNascimentoFuncionario;
    private javax.swing.JLabel lbEnderecoFuncionario;
    private javax.swing.JLabel lbNomeFuncionario;
    private javax.swing.JLabel lbNomeMaeFuncionario;
    private javax.swing.JLabel lbPesquisarFuncionario;
    private javax.swing.JLabel lbRGFuncionario;
    private javax.swing.JLabel lbSalarioFuncionario;
    private javax.swing.JLabel lbSexoFuncionario;
    private javax.swing.JLabel lbStatusFuncionario;
    private javax.swing.JLabel lbTelefoneResidencialFuncionario;
    private javax.swing.JTabbedPane pnAbas;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JPanel pnPesquisa;
    private javax.swing.JPanel pnPesquisar;
    private javax.swing.JRadioButton rbFemininoFuncionario;
    private javax.swing.JRadioButton rbMasculinoFuncionario;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    private javax.swing.JTextField txtCPFFuncionario;
    private javax.swing.JFormattedTextField txtCelularFuncionario;
    private javax.swing.JTextField txtCodigoFuncionario;
    private javax.swing.JFormattedTextField txtDataCadastroFuncionario;
    private javax.swing.JFormattedTextField txtDataNascimentoFuncionario;
    private javax.swing.JTextField txtEnderecoFuncionario;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtNomeMaeFuncionario;
    private javax.swing.JTextField txtPesquisarFuncionario;
    private javax.swing.JFormattedTextField txtRGFuncionario;
    private javax.swing.JFormattedTextField txtSalarioFuncionario;
    private javax.swing.JFormattedTextField txtTelefoneResidencialFuncionario;
    // End of variables declaration//GEN-END:variables
}
