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
import javax.swing.table.TableModel;

public class ClienteGUI extends javax.swing.JInternalFrame {

    int pagina = 0;
    TableModelGrid tb;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public ClienteGUI() {
        this.tb = new TableModelGrid("Código", "Nome", "Endereço", "Status");
        initComponents();
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
        lbCidade = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox();
        lbEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lbCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        lbRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JFormattedTextField();
        lbCNPJ = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        lbRazaoSocial = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        lbInscricaoEstadual = new javax.swing.JLabel();
        txtInscricaoEstadual = new javax.swing.JTextField();
        lbLocalTrabalho = new javax.swing.JLabel();
        txtLocalTrabalho = new javax.swing.JTextField();
        lbCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        lbTelefoneResidencial = new javax.swing.JLabel();
        txtTelefoneResidencial = new javax.swing.JFormattedTextField();
        lbTelefoneComercial = new javax.swing.JLabel();
        txtTelefoneComercial = new javax.swing.JTextField();
        lbDataNascimento = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        lbDataCadastro = new javax.swing.JLabel();
        txtDataCadastro = new javax.swing.JFormattedTextField();
        lbStatus = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox();

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

        lbPesquisar.setText("Pesquisar:");

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
                .addComponent(lbPesquisar)
                .addGap(12, 12, 12)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnPesquisaLayout.setVerticalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnPesquisarLayout.setVerticalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Pesquisar", pnPesquisar);

        pnFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulário"));

        lbCodigo.setText("Código:");

        txtCodigo.setEditable(false);

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

        bgSexo.add(rbFeminino);
        rbFeminino.setText("Feminino");

        lbCidade.setText("Cidade:");

        lbEndereco.setText("Endereço:");

        lbCPF.setText("CPF:");

        lbRG.setText("RG:");

        lbCNPJ.setText("CNPJ:");

        lbRazaoSocial.setText("Razão social:");

        lbInscricaoEstadual.setText("Inscrição estadual:");

        lbLocalTrabalho.setText("Local de trabalho:");

        txtLocalTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalTrabalhoActionPerformed(evt);
            }
        });

        lbCelular.setText("Celular:");

        lbTelefoneResidencial.setText("Telefone residencial:");

        lbTelefoneComercial.setText("Telefone comercial:");

        lbDataNascimento.setText("Data de nascimento:");

        lbDataCadastro.setText("Data de cadastro:");

        lbStatus.setText("Status:");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbTelefoneResidencial))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormularioLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCelular, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbLocalTrabalho, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(12, 12, 12)
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addComponent(txtTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(lbTelefoneComercial)
                                .addGap(12, 12, 12)
                                .addComponent(txtTelefoneComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLocalTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))))
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbCNPJ)
                                    .addComponent(lbInscricaoEstadual)
                                    .addComponent(lbCidade)
                                    .addComponent(lbTipoPessoa)
                                    .addComponent(lbCodigo)
                                    .addComponent(lbStatus)
                                    .addComponent(lbDataNascimento)
                                    .addComponent(lbSexo)))
                            .addComponent(lbCPF, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(12, 12, 12)
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(lbRazaoSocial)
                                .addGap(12, 12, 12)
                                .addComponent(txtRazaoSocial))
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(lbNome)
                                .addGap(12, 12, 12)
                                .addComponent(txtNome))
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(lbEndereco)
                                .addGap(12, 12, 12)
                                .addComponent(txtEndereco))
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnFormularioLayout.createSequentialGroup()
                                        .addComponent(rbPessoaFisica)
                                        .addGap(8, 8, 8)
                                        .addComponent(rbPessoaJuridica))
                                    .addGroup(pnFormularioLayout.createSequentialGroup()
                                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(lbDataCadastro)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnFormularioLayout.createSequentialGroup()
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(lbRG)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnFormularioLayout.createSequentialGroup()
                                        .addComponent(rbMasculino)
                                        .addGap(8, 8, 8)
                                        .addComponent(rbFeminino)))
                                .addGap(0, 0, 0)))))
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
                    .addComponent(lbSexo)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCidade)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRG)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCPF))
                .addGap(0, 0, 0)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCNPJ)
                        .addComponent(lbRazaoSocial)
                        .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInscricaoEstadual))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLocalTrabalho)
                    .addComponent(txtLocalTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefoneComercial)
                    .addComponent(txtTelefoneComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataNascimento)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDataCadastro)
                    .addComponent(txtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
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
        txtTelefoneResidencial.setEnabled(habilitar);
        txtCelular.setEnabled(habilitar);
        txtTelefoneComercial.setEnabled(habilitar);
        txtDataNascimento.setEnabled(habilitar);
        txtLocalTrabalho.setEnabled(habilitar);
        txtDataCadastro.setEnabled(habilitar);
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
        txtTelefoneResidencial.setText("");
        txtCelular.setText("");
        txtTelefoneComercial.setText("");
        txtDataNascimento.setText("");
        txtLocalTrabalho.setText("");
        txtDataCadastro.setText("");
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
//        if (txtEndereco.getText().trim().length() < 2 || txtNome.getText().trim().length() > 150) {
//            JOptionPane.showMessageDialog(this, "Endereço inválido.", "Alerta", javax.swing.JOptionPane.WARNING_MESSAGE);
//            txtEndereco.requestFocus();
//            return false;
//        }
        //Validação do "Celular"
//        if (txtTelefoneResidencial.getText().trim().length() != 14) {
//            JOptionPane.showMessageDialog(this, "Endereço inválido.", "Alerta", javax.swing.JOptionPane.WARNING_MESSAGE);
//            txtNome.requestFocus();
//            return false;
//        }
        //Validação do "Telefone residencial"
//        if (txtNome.getText().trim().length() < 2 || txtNome.getText().trim().length() > 150) {
//            JOptionPane.showMessageDialog(this, "Endereço inválido.", "Alerta", javax.swing.JOptionPane.WARNING_MESSAGE);
//            txtNome.requestFocus();
//            return false;
//        }
        if (rbPessoaFisica.isSelected()) {

        }

        //Para verificar se o "Nome da cidade" já está cadastrado
//        if (ClienteDAO.verificaNomeExiste(txtCPF.getText().trim())) {
//            javax.swing.JOptionPane.showMessageDialog(this, "Nome d cidade já cadastrado.", "Alerta", javax.swing.JOptionPane.WARNING_MESSAGE);
//            txtNome.requestFocus();
//            return false;
//        }
        return true;

    }

    //Para fechar o formulário ClienteGUI
    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

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

    private void atualizarGrade() {
        try {
            String filtro = txtPesquisar.getText();
            List<Class<?>> classes = new ArrayList<>();
            classes.add(ClienteTO.class);
            classes.add(PessoaTO.class);

            String[] camposSelect = new String[]{"Cliente.idCliente", "Pessoa.nomePessoa", "Pessoa.enderecoPessoa", "Cliente.statusCliente"};
            tb.setDados(ClienteDAO.listarUtilizandoComandoInnerJoin(classes, camposSelect, pagina, "nomePessoa", filtro));
            tbGrade.setModel((TableModel) tb);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao atualizar grade");
        }
    }

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        //Ações para o botão "Salvar"
        try {
            if (!validar()) {
                return;
            }

            ClienteTO clienteTO = new ClienteTO();
            PessoaTO pessoaTO = new PessoaTO();
            PessoaFisicaTO pessoaFisicaTO = new PessoaFisicaTO();
            PessoaJuridicaTO pessoaJuridicaTO = new PessoaJuridicaTO();
            //Cria uma nova cidade, dá um nome para ela e recupera o objeto Cidade selecionado
            CidadeTO cidade = (CidadeTO) cbCidade.getSelectedItem();

            clienteTO.setIdCliente(Integer.parseInt(txtCodigo.getText()));
            pessoaTO.setNomePessoa(txtNome.getText());
            pessoaTO.setIdCidade(cidade.getIdCidade());
            pessoaTO.setEnderecoPessoa(txtEndereco.getText());
            pessoaFisicaTO.setCpfPessoaFisica(txtCPF.getText());
            pessoaFisicaTO.setRgPessoaFisica(txtRG.getText());
            pessoaJuridicaTO.setCnpjPessoaJuridica(txtCNPJ.getText());
            pessoaJuridicaTO.setRazaoSocialPessoaJuridica(txtRazaoSocial.getText());
            clienteTO.setLocalTrabalhoCliente(txtLocalTrabalho.getText());
            //pessoaJuridicaTO.(txtInscricaoEstadual.getText());
            pessoaTO.setCelularPessoa(txtTelefoneResidencial.getText());
            pessoaTO.setTelefonePessoa(txtCelular.getText());
            pessoaTO.setTelefoneComercialPessoa(txtTelefoneComercial.getText());
            if (!txtDataNascimento.getText().trim().isEmpty()) {
                Date data = new Date(dateFormat.parse(txtDataNascimento.getText()).getTime());
                pessoaTO.setDataNascimentoPessoa(data);
            }

            if (!txtDataCadastro.getText().trim().isEmpty()) {
                Date data = new Date(dateFormat.parse(txtDataCadastro.getText()).getTime());
                clienteTO.setDataCadastro(data);
            }

            clienteTO.setStatusCliente(cbStatus.getSelectedItem().toString());

            if (clienteTO.getIdCliente() == 0) {
                if (!pessoaFisicaTO.getCpfPessoaFisica().isEmpty()) {
                    pessoaTO.setIdPessoaFisica(PessoaFisicaDAO.inserirRetornandoId(pessoaFisicaTO));
                    clienteTO.setIdPessoaFisica(pessoaTO.getIdPessoaFisica());
                } else {
                    pessoaTO.setIdPessoaJuridica(PessoaJuridicaDAO.inserirRetornandoId(pessoaJuridicaTO));
                    clienteTO.setIdPessoaJuridica(pessoaTO.getIdPessoaJuridica());
                }

                clienteTO.setIdPessoa(PessoaDAO.inserirRetornandoId(pessoaTO));
                ClienteDAO.inserir(clienteTO);
            } else {
                ClienteTO clienteBaseDados = (ClienteTO) ClienteDAO.get(ClienteTO.class, clienteTO.getIdCliente());
                clienteTO.setIdPessoa(clienteBaseDados.getIdPessoa());
                clienteTO.setIdPessoaFisica(clienteBaseDados.getIdPessoaFisica());
                clienteTO.setIdPessoaJuridica(clienteBaseDados.getIdPessoaJuridica());
                pessoaTO.setIdPessoa(clienteBaseDados.getIdPessoa());                
                pessoaTO.setIdPessoaFisica(clienteBaseDados.getIdPessoaFisica());
                pessoaTO.setIdPessoaJuridica(clienteBaseDados.getIdPessoaJuridica());


                if (!pessoaFisicaTO.getCpfPessoaFisica().isEmpty()) {
                    pessoaFisicaTO.setIdPessoaFisica(clienteBaseDados.getIdPessoaFisica());
                    PessoaFisicaDAO.alterar(pessoaFisicaTO);
                }else{
                    pessoaJuridicaTO.setIdPessoaJuridica(clienteBaseDados.getIdPessoaJuridica());
                    PessoaJuridicaDAO.alterar(pessoaJuridicaTO); 
                }
                
                pessoaTO.setIdPessoa(clienteBaseDados.getIdPessoa());
                PessoaDAO.alterar(pessoaTO);
                ClienteDAO.alterar(clienteTO);
            }

            JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");

            atualizarGrade();
            limparForm();
            habilitarForm(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar!\nDados: " + e.getMessage());
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    //Chama os métodos que habilitam os componentes da checkbox PessoaJuridica
    private void rbPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPessoaJuridicaActionPerformed
        habilitarPessoaJuridica(true);
        habilitarPessoaFisica(false);
    }//GEN-LAST:event_rbPessoaJuridicaActionPerformed

    //Chama os métodos que habilitam os componentes da checkbox PessoaFisica
    private void rbPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPessoaFisicaActionPerformed
        habilitarPessoaFisica(true);
        habilitarPessoaJuridica(false);
    }//GEN-LAST:event_rbPessoaFisicaActionPerformed

    private void txtLocalTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalTrabalhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalTrabalhoActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        atualizarGrade();
    }//GEN-LAST:event_btPesquisarActionPerformed

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

                ClienteTO clienteTO = (ClienteTO) ClienteDAO.get(ClienteTO.class, idEntidade);
                PessoaTO pessoaTO = (PessoaTO) PessoaDAO.get(PessoaTO.class, clienteTO.getIdPessoa());
                PessoaFisicaTO pessoaFisicaTO = null;
                PessoaJuridicaTO pessoaJuridicaTO = null;

                if (clienteTO.getIdPessoaFisica() != 0) {
                    pessoaFisicaTO = (PessoaFisicaTO) PessoaFisicaDAO.get(PessoaFisicaTO.class, clienteTO.getIdPessoaFisica());
                } else {
                    pessoaJuridicaTO = (PessoaJuridicaTO) PessoaJuridicaDAO.get(PessoaJuridicaTO.class, clienteTO.getIdPessoaJuridica());
                }

                //CidadeTO cidade = (CidadeTO) cbCidade.getSelectedItem(); //pessoaTO.getIdCidade()
                txtCodigo.setText(clienteTO.getIdCliente().toString());
                txtNome.setText(pessoaTO.getNomePessoa());
                txtEndereco.setText(pessoaTO.getEnderecoPessoa());
                txtTelefoneResidencial.setText(pessoaTO.getCelularPessoa());
                txtCelular.setText(pessoaTO.getTelefonePessoa());
                txtTelefoneComercial.setText(pessoaTO.getTelefoneComercialPessoa());

                if (pessoaTO.getDataNascimentoPessoa() != null) {
                    txtDataNascimento.setText(dateFormat.format(pessoaTO.getDataNascimentoPessoa()));
                }

                if (clienteTO.getDataCadastro() != null) {
                    txtDataCadastro.setText(dateFormat.format(clienteTO.getDataCadastro()));
                }

                txtLocalTrabalho.setText(clienteTO.getLocalTrabalhoCliente());
                cbStatus.setSelectedItem(clienteTO.getStatusCliente());

                if (pessoaFisicaTO != null) {
                    txtCPF.setText(pessoaFisicaTO.getCpfPessoaFisica());
                    txtRG.setText(pessoaFisicaTO.getRgPessoaFisica());
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
    private javax.swing.JLabel lbLocalTrabalho;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPesquisar;
    private javax.swing.JLabel lbRG;
    private javax.swing.JLabel lbRazaoSocial;
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
    private javax.swing.JTextField txtLocalTrabalho;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtTelefoneComercial;
    private javax.swing.JFormattedTextField txtTelefoneResidencial;
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
