package br.com.ctesop.gui;

import br.com.ctesop.componentes.JOptionPane;
import br.com.ctesop.dao.CidadeDAO;
import br.com.ctesop.dao.ClienteDAO;
import br.com.ctesop.to.CidadeTO;
import java.util.List;

public class ClienteGUI extends javax.swing.JInternalFrame {

    public ClienteGUI() {
        initComponents();
        carregaCidades();
        habilitarForm(false);
        habilitarPessoaJuridica(false);
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
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbTipoPessoa = new javax.swing.JLabel();
        rbPessoaFisica = new javax.swing.JRadioButton();
        rbPessoaJuridica = new javax.swing.JRadioButton();
        lbSexo = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        lbEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lbCidade = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox();
        lbCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        lbRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JFormattedTextField();
        lbCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        lbTelefoneResidencial = new javax.swing.JLabel();
        txtTelefoneResidencial = new javax.swing.JFormattedTextField();
        lbDataNascimento = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        lbNomeMae = new javax.swing.JLabel();
        txtNomeMae = new javax.swing.JTextField();
        lbDataCadastro = new javax.swing.JLabel();
        txtDataCadastro = new javax.swing.JFormattedTextField();
        lbSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JFormattedTextField();
        lbStatus = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox();
        lbCNPJ = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        lbRazaoSocial = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        lbInscricaoEstadual = new javax.swing.JLabel();
        txtInscricaoEstadual = new javax.swing.JTextField();
        lbTelefoneComercial = new javax.swing.JLabel();
        txtTelefoneComercial = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

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

        pnPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lbPesquisar.setText("Pesquisar:");

        btPesquisar.setMnemonic('p');
        btPesquisar.setLabel("Pesquisar");
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
        spGrade.setViewportView(tbGrade);

        javax.swing.GroupLayout pnPesquisaLayout = new javax.swing.GroupLayout(pnPesquisa);
        pnPesquisa.setLayout(pnPesquisaLayout);
        pnPesquisaLayout.setHorizontalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnPesquisaLayout.setVerticalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Pesquisar", pnPesquisa);

        pnFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulário"));

        lbCodigo.setText("Código:");

        lbNome.setText("Nome do cliente:");

        lbTipoPessoa.setText("Tipo:");

        bgTipoPessoa.add(rbPessoaFisica);
        rbPessoaFisica.setText("Pessoa física");
        rbPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPessoaFisicaActionPerformed(evt);
            }
        });

        bgTipoPessoa.add(rbPessoaJuridica);
        rbPessoaJuridica.setText("Pessoa jurídica");
        rbPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPessoaJuridicaActionPerformed(evt);
            }
        });

        lbSexo.setText("Sexo:");

        bgSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });

        bgSexo.add(rbFeminino);
        rbFeminino.setText("Feminino");

        lbEndereco.setText("Endereço:");

        lbCidade.setText("Cidade:");

        lbCPF.setText("CPF:");

        lbRG.setText("RG:");

        lbCelular.setText("Celular:");

        lbTelefoneResidencial.setText("Telefone residencial:");

        lbDataNascimento.setText("Data de nascimento:");

        lbNomeMae.setText("Nome da mãe:");

        lbDataCadastro.setText("Data de cadastro:");

        lbSalario.setText("Salário:");

        lbStatus.setText("Status:");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));

        lbCNPJ.setText("CNPJ:");

        lbRazaoSocial.setText("Razão social:");

        lbInscricaoEstadual.setText("Inscrição estadual:");

        lbTelefoneComercial.setText("Telefone comercial:");

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbCidade)
                            .addComponent(lbTelefoneResidencial)
                            .addComponent(lbCelular)
                            .addComponent(lbInscricaoEstadual)
                            .addComponent(lbSexo)
                            .addComponent(lbCPF)
                            .addComponent(lbCNPJ)
                            .addComponent(lbTipoPessoa)
                            .addComponent(lbCodigo)))
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbDataNascimento))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDataCadastro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbStatus, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbNomeMae)
                        .addGap(12, 12, 12)
                        .addComponent(txtNomeMae, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbRazaoSocial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRazaoSocial))
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco))
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addComponent(txtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(lbSalario)
                                .addGap(12, 12, 12)
                                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(lbRG)
                                .addGap(12, 12, 12)
                                .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addComponent(rbMasculino)
                                .addGap(6, 6, 6)
                                .addComponent(rbFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addComponent(rbPessoaFisica)
                                .addGap(6, 6, 6)
                                .addComponent(rbPessoaJuridica))
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addComponent(txtTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(lbTelefoneComercial)
                                .addGap(12, 12, 12)
                                .addComponent(txtTelefoneComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 222, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        pnFormularioLayout.setVerticalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodigo))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPessoaFisica)
                    .addComponent(rbPessoaJuridica)
                    .addComponent(lbTipoPessoa))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino)
                    .addComponent(lbSexo))
                .addGap(10, 10, 10)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCidade))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRG)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRazaoSocial)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInscricaoEstadual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCelular))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefoneComercial)
                    .addComponent(txtTelefoneComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbDataNascimento))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNomeMae)
                        .addComponent(txtNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSalario)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDataCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbStatus))
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
                    .addComponent(pnAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pnAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Habilitar o formulário
    private void habilitarForm(boolean habilitar) {
        txtCodigo.setEnabled(habilitar);
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
        txtCelular.setEnabled(habilitar);
        txtTelefoneResidencial.setEnabled(habilitar);
        txtTelefoneComercial.setEnabled(habilitar);
        txtDataNascimento.setEnabled(habilitar);
        txtNomeMae.setEnabled(habilitar);
        txtDataCadastro.setEnabled(habilitar);
        txtSalario.setEnabled(habilitar);
        cbStatus.setEnabled(habilitar);

        btNovo.setEnabled(!habilitar);
        btSalvar.setEnabled(habilitar);
        btCancelar.setEnabled(habilitar);
    }

    private void limparForm() {
        txtCodigo.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtCPF.setText("");
        txtRG.setText("");
        txtCNPJ.setText("");
        txtRazaoSocial.setText("");
        txtInscricaoEstadual.setText("");
        txtCelular.setText("");
        txtTelefoneResidencial.setText("");
        txtTelefoneComercial.setText("");
        txtDataNascimento.setText("");
        txtNomeMae.setText("");
        txtDataCadastro.setText("");
        txtSalario.setText("");
    }

    //Ações para quando clicar no RadioButton "Pessoa Física"   
    private void habilitarPessoaFisica(boolean habilitar) {
        lbCPF.setVisible(habilitar);
        txtCPF.setVisible(habilitar);
        lbRG.setVisible(habilitar);
        txtRG.setVisible(habilitar);
    }

    //Ações para quando clicar no RadioButton "Pessoa Jurídica"   
    private void habilitarPessoaJuridica(boolean habilitar) {
        lbCNPJ.setVisible(habilitar);
        txtCNPJ.setVisible(habilitar);
        lbRazaoSocial.setVisible(habilitar);
        txtRazaoSocial.setVisible(habilitar);
    }

    //Método de validação do TextField
    private boolean validar() throws Exception {
        //Validação do "Nome do cliente"
        if (txtNome.getText().trim().length() < 2 || txtNome.getText().trim().length() > 90) {
            JOptionPane.showMessageDialog(this, "Nome do cliente inválido.", "Alerta", javax.swing.JOptionPane.WARNING_MESSAGE);
            txtNome.requestFocus();
            return false;
        }

        //Validação do "Endereço"
        if (txtEndereco.getText().trim().length() < 2 || txtNome.getText().trim().length() > 150) {
            JOptionPane.showMessageDialog(this, "Endereço inválido.", "Alerta", javax.swing.JOptionPane.WARNING_MESSAGE);
            txtEndereco.requestFocus();
            return false;
        }

        //Validação do "Celular"
        if (txtCelular.getText().trim().length() != 14) {
            JOptionPane.showMessageDialog(this, "Endereço inválido.", "Alerta", javax.swing.JOptionPane.WARNING_MESSAGE);
            txtNome.requestFocus();
            return false;
        }

        //Validação do "Telefone residencial"
        if (txtNome.getText().trim().length() < 2 || txtNome.getText().trim().length() > 150) {
            JOptionPane.showMessageDialog(this, "Endereço inválido.", "Alerta", javax.swing.JOptionPane.WARNING_MESSAGE);
            txtNome.requestFocus();
            return false;
        }

        if (rbPessoaFisica.isSelected()) {

        }

        //Para verificar se o "Nome da cidade" já está cadastrado
        if (ClienteDAO.verificaNomeExiste(txtCPF.getText().trim())) {
            javax.swing.JOptionPane.showMessageDialog(this, "Nome d cidade já cadastrado.", "Alerta", javax.swing.JOptionPane.WARNING_MESSAGE);
            txtNome.requestFocus();
            return false;
        }
        return true;

    }

    //Para fechar o formulário ClienteGUI
    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    //Chama os métodos que habilitam os componentes da checkbox PessoaFisica
    private void rbPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPessoaFisicaActionPerformed
        habilitarPessoaFisica(true);
        habilitarPessoaJuridica(false);
    }//GEN-LAST:event_rbPessoaFisicaActionPerformed

    //Chama os métodos que habilitam os componentes da checkbox PessoaJuridica
    private void rbPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPessoaJuridicaActionPerformed
        habilitarPessoaJuridica(true);
        habilitarPessoaFisica(false);
    }//GEN-LAST:event_rbPessoaJuridicaActionPerformed

    //Ações para o botão "Cancelar"
    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limparForm();
        habilitarForm(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    //Ações para o botão "Novo"
    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        habilitarForm(true);
        txtCodigo.setText("0");
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMasculinoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.ButtonGroup bgTipoPessoa;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbCidade;
    private javax.swing.JComboBox cbStatus;
    private javax.swing.JLabel lbCNPJ;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDataCadastro;
    private javax.swing.JLabel lbDataNascimento;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbInscricaoEstadual;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeMae;
    private javax.swing.JLabel lbPesquisar;
    private javax.swing.JLabel lbRG;
    private javax.swing.JLabel lbRazaoSocial;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbTelefoneComercial;
    private javax.swing.JLabel lbTelefoneResidencial;
    private javax.swing.JLabel lbTipoPessoa;
    private javax.swing.JTabbedPane pnAbas;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JPanel pnPesquisa;
    private javax.swing.JPanel pnPesquisar;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbPessoaFisica;
    private javax.swing.JRadioButton rbPessoaJuridica;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtDataCadastro;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtInscricaoEstadual;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeMae;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JFormattedTextField txtSalario;
    private javax.swing.JTextField txtTelefoneComercial;
    private javax.swing.JFormattedTextField txtTelefoneResidencial;
    // End of variables declaration//GEN-END:variables

    //Para carregar a "Sigla do estado" no formulário Cidade
    private void carregaCidades() {
        try {
            List<CidadeTO> listaCidade = CidadeDAO.listar();
            for (CidadeTO e : listaCidade) {
                cbCidade.addItem(e);
            }

        } catch (Exception ex) {
            //Para as mensagens de erro. Esta puxando do pacote "br.com.ctesop.componentes" da classe "JOptionPane"
            JOptionPane.showWarningDialog(this, "Ocorreu um erro ao listar as cidades.");
        }

    }

}
