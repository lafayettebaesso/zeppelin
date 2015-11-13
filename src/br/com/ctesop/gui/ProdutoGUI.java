package br.com.ctesop.gui;

import br.com.ctesop.componentes.JOptionPane;
import br.com.ctesop.componentes.MascaraNumerosDecimais;
import br.com.ctesop.componentes.SelecionarCampo;
import br.com.ctesop.dao.GrupoProdutoDAO;
import br.com.ctesop.dao.ProdutoDAO;
import br.com.ctesop.gui.tablemodel.TableModelGrid;
import br.com.ctesop.to.GrupoProdutoTO;
import br.com.ctesop.to.ProdutoTO;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;

public class ProdutoGUI extends javax.swing.JInternalFrame {

    //Atribudo para armazenar qual JDesktopPane irá receber o JInternalFrame
    private JDesktopPane dpArea = null;
    private ProdutoTO produtoTO;
    GrupoProdutoTO grupoProduto = new GrupoProdutoTO();

    int pagina = 0;
    TableModelGrid tb;

    public ProdutoGUI() {
        initComponents();
        this.tb = new TableModelGrid("Código", "Nome", "Preço de venda", "Quantidade", "Status");
        carregaGrupoProduto();
        habilitarForm(false);
        atualizarGrade();

    }

    //Armazena o dpArea (JDesktopPane) recebido por parâmetro para ser usado depois
    public ProdutoGUI(JDesktopPane dpArea) {
        this.dpArea = dpArea;
        initComponents();
        //Formação do valor do ingrediente para exibir formatado na tela
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        txtPrecoCustoProduto.setText(nf.format(produtoTO.getPrecoCustoProduto()));
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
        lbCodigoProduto = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();
        lbNomeProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        lbGrupoProduto = new javax.swing.JLabel();
        cbGrupoProduto = new javax.swing.JComboBox();
        lbPrecoCustoProduto = new javax.swing.JLabel();
        txtPrecoCustoProduto = new javax.swing.JFormattedTextField();
        lbPrecoVendaProduto = new javax.swing.JLabel();
        txtPrecoVendaProduto = new javax.swing.JFormattedTextField();
        lbQuantidadeProduto = new javax.swing.JLabel();
        txtQuantidadeProduto = new javax.swing.JFormattedTextField();
        lbStatusProduto = new javax.swing.JLabel();
        cbStatusProduto = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setTitle("Produto");

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

        txtPesquisar.setDocument(new br.com.ctesop.componentes.MascaraLetrasNumeros(70));

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
                .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Pesquisar", pnPesquisa);

        pnFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulário"));

        lbCodigoProduto.setText("Código:");

        txtCodigoProduto.setEditable(false);
        txtCodigoProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbNomeProduto.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbNomeProduto.setText("Nome:");

        txtNomeProduto.setDocument(new br.com.ctesop.componentes.MascaraLetrasNumeros(70));

        lbGrupoProduto.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbGrupoProduto.setText("Grupo:");

        lbPrecoCustoProduto.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbPrecoCustoProduto.setText("Preço de custo:");

        txtPrecoCustoProduto.setDocument(new br.com.ctesop.componentes.MascaraNumerosDecimais(0));
        txtPrecoCustoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPrecoCustoProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecoCustoProduto.setText("0,00");
        txtPrecoCustoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoCustoProdutoFocusGained(evt);
            }
        });

        lbPrecoVendaProduto.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbPrecoVendaProduto.setText("Preço de venda:");

        txtPrecoVendaProduto.setDocument(new br.com.ctesop.componentes.MascaraNumerosDecimais(0));
        txtPrecoVendaProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPrecoVendaProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecoVendaProduto.setText("0,00");
        txtPrecoVendaProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoVendaProdutoFocusGained(evt);
            }
        });

        lbQuantidadeProduto.setText("Quantidade:");

        txtQuantidadeProduto.setEditable(false);
        txtQuantidadeProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbStatusProduto.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbStatusProduto.setText("Status:");

        cbStatusProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ATIVO", "INATIVO" }));

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNomeProduto)
                    .addComponent(lbGrupoProduto)
                    .addComponent(lbCodigoProduto)
                    .addComponent(lbPrecoCustoProduto)
                    .addComponent(lbQuantidadeProduto))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                            .addComponent(cbGrupoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addComponent(txtPrecoCustoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(lbPrecoVendaProduto)
                                .addGap(12, 12, 12)
                                .addComponent(txtPrecoVendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbStatusProduto)
                        .addGap(12, 12, 12)
                        .addComponent(cbStatusProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnFormularioLayout.setVerticalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigoProduto)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeProduto)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGrupoProduto)
                    .addComponent(cbGrupoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecoCustoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrecoVendaProduto)
                    .addComponent(txtPrecoVendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrecoCustoProduto))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStatusProduto)
                    .addComponent(cbStatusProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbQuantidadeProduto)
                    .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    //Evento para quando clicar no botão "Novo"
    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        habilitarForm(true);
        txtCodigoProduto.setText("0");
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

            //Instanciação dos objetos utilizados na classe
            ProdutoTO produtoTO = new ProdutoTO();

            //Cria um novo grupo de produto, dá um nome para ele e recupera o objeto grupoProduto selecionado
            grupoProduto = (GrupoProdutoTO) cbGrupoProduto.getSelectedItem();

            produtoTO.setIdProduto(Integer.parseInt(txtCodigoProduto.getText()));
            produtoTO.setNomeProduto(txtNomeProduto.getText());
            produtoTO.setIdGrupoProduto(grupoProduto.getIdGrupoProduto());

            NumberFormat nf = NumberFormat.getNumberInstance();
            produtoTO.setPrecoCustoProduto(nf.parse(txtPrecoCustoProduto.getText()).floatValue());
            produtoTO.setPrecoVendaProduto(nf.parse(txtPrecoVendaProduto.getText()).floatValue());

            produtoTO.setQuantidadeProduto(Integer.parseInt(txtQuantidadeProduto.getText()));

            produtoTO.setStatusProduto(cbStatusProduto.getSelectedItem().toString());

            if (produtoTO.getIdProduto() == 0) {
                ProdutoDAO.inserir(produtoTO);
                JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");
            } else {
                ProdutoDAO.alterar(produtoTO);
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

    //Evento para quando clica na grade
    private void tbGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeMouseClicked
        if (evt.getClickCount() == 2) {

            try {
                TableModelGrid tm = (TableModelGrid) tbGrade.getModel();
                int idEntidade = tm.getIntValueAt(tbGrade.getSelectedRow(), 0);
                if (idEntidade <= 0) {
                    return;
                }

                ProdutoTO produto = (ProdutoTO) ProdutoDAO.get(ProdutoTO.class, idEntidade);
                GrupoProdutoTO grupoProduto = (GrupoProdutoTO) GrupoProdutoDAO.get(GrupoProdutoTO.class, produto.getIdGrupoProduto());

                cbGrupoProduto.setSelectedItem(grupoProduto);
                txtCodigoProduto.setText(produto.getIdProduto() + "");
                txtNomeProduto.setText(produto.getNomeProduto());
                txtPrecoCustoProduto.setText(produto.getPrecoCustoProduto() + "");
                txtPrecoVendaProduto.setText(produto.getPrecoVendaProduto() + "");
                txtQuantidadeProduto.setText(produto.getQuantidadeProduto() + "");
                cbStatusProduto.setSelectedItem(produto.getStatusProduto());

                habilitarForm(true);
            } catch (Exception ex) {
                ex.printStackTrace();
                //Logger.getLogger(FuncionarioGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tbGradeMouseClicked

    private void txtPrecoCustoProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoCustoProdutoFocusGained
        SelecionarCampo.selecionarTudo(evt);
    }//GEN-LAST:event_txtPrecoCustoProdutoFocusGained

    private void txtPrecoVendaProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoVendaProdutoFocusGained
        SelecionarCampo.selecionarTudo(evt);
    }//GEN-LAST:event_txtPrecoVendaProdutoFocusGained

    //Métodos//
    //Método que atualiza a grade com os valores cadastrados
    private void atualizarGrade() {
        try {
            String filtro = txtPesquisar.getText();
            List<Class<?>> classes = new ArrayList<>();
            classes.add(ProdutoTO.class);

            String[] camposSelect = new String[]{"Produto.idProduto", "Produto.nomeProduto",
                "Produto.precoVendaProduto", "Produto.quantidadeProduto", "Produto.statusProduto"};
            tb.setDados(ProdutoDAO.listarUtilizandoComandoInnerJoin(classes, camposSelect, pagina,
                    "nomeProduto", filtro));
            tbGrade.setModel(tb);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao atualizar grade");
        }
    }

    //Método que habilita o formulário
    private void habilitarForm(boolean habilitar) {
        txtCodigoProduto.setEnabled(habilitar);
        txtNomeProduto.setEnabled(habilitar);
        cbGrupoProduto.setEnabled(habilitar);
        txtPrecoCustoProduto.setEnabled(habilitar);
        txtPrecoVendaProduto.setEnabled(habilitar);
        txtQuantidadeProduto.setEnabled(habilitar);
        cbStatusProduto.setEnabled(habilitar);

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
        txtCodigoProduto.setText("");
        txtNomeProduto.setText("");
        txtPrecoCustoProduto.setText("");
        txtPrecoVendaProduto.setText("");
        txtQuantidadeProduto.setText("");
    }

    //Método de validação dos TextFields
    private boolean validar() throws Exception {
        //Validação do "Nome do produto"
        if (txtNomeProduto.getText().trim().length() < 2 || txtNomeProduto.getText().trim().length() > 70) {
            JOptionPane.showMessageDialog(this, "Nome do produto inválido.", "Alerta",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            txtNomeProduto.requestFocus();
            return false;
        }
        
        //Verificação do status do grupo de produto
        grupoProduto = (GrupoProdutoTO) cbGrupoProduto.getSelectedItem();
        if (grupoProduto.getStatusGrupoProduto().equals("INATIVO")) {
            JOptionPane.showMessageDialog(this, "Impossível cadastrar um produto neste grupo, pois "
                    + "o status do grupo está como inativo.");
            return false;
        }
        
        return true;
    }

    //Método para carregar o "Grupo de produtos" no formulário Produto
    private void carregaGrupoProduto() {
        try {
            List<Object> listaGrupoProduto = GrupoProdutoDAO.listar(GrupoProdutoTO.class);
            for (Object e : listaGrupoProduto) {
                cbGrupoProduto.addItem((GrupoProdutoTO) e);
            }
        } catch (Exception ex) {
            //Para as mensagens de erro. Esta puxando do pacote "br.com.ctesop.componentes" da classe "JOptionPane"
            JOptionPane.showWarningDialog(this, "Ocorreu um erro ao listar os grupos de produtos.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbGrupoProduto;
    private javax.swing.JComboBox cbStatusProduto;
    private javax.swing.JLabel lbCodigoProduto;
    private javax.swing.JLabel lbGrupoProduto;
    private javax.swing.JLabel lbNomeProduto;
    private javax.swing.JLabel lbPesquisar;
    private javax.swing.JLabel lbPrecoCustoProduto;
    private javax.swing.JLabel lbPrecoVendaProduto;
    private javax.swing.JLabel lbQuantidadeProduto;
    private javax.swing.JLabel lbStatusProduto;
    private javax.swing.JTabbedPane pnAbas;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JPanel pnPesquisa;
    private javax.swing.JPanel pnPesquisar;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtPrecoCustoProduto;
    private javax.swing.JFormattedTextField txtPrecoVendaProduto;
    private javax.swing.JFormattedTextField txtQuantidadeProduto;
    // End of variables declaration//GEN-END:variables
}
