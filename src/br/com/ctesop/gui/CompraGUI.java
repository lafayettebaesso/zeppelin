package br.com.ctesop.gui;

import br.com.ctesop.dao.CompraDAO;
import br.com.ctesop.dao.FornecedorDAO;
import br.com.ctesop.dao.IngredienteDAO;
import br.com.ctesop.dao.ItemCompraProdutoDAO;
import br.com.ctesop.dao.PessoaDAO;
import br.com.ctesop.dao.ProdutoDAO;
import br.com.ctesop.gui.tablemodel.TableModelGrid;
import br.com.ctesop.to.CompraTO;
import br.com.ctesop.to.FornecedorTO;
import br.com.ctesop.to.IngredienteTO;
import br.com.ctesop.to.ItemCompraIngredienteTO;
import br.com.ctesop.to.ItemCompraProdutoTO;
import br.com.ctesop.to.PessoaTO;
import br.com.ctesop.to.ProdutoTO;
import java.awt.Point;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class CompraGUI extends javax.swing.JInternalFrame {

    int pagina = 0;
    TableModelGrid tmCompra;
    TableModelGrid tb;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private int idCompra = 0;
    int quantidadeProduto, quantidadeIngrediente = 0;

    //Atribudo para armazenar qual JDesktopPane irá receber o JInternalFrame
    private JDesktopPane dpArea = null;

    public CompraGUI() {
        initComponents();
        carregaFornecedor();
        this.tmCompra = new TableModelGrid("Código", "Fornecedor", "Valor", "Data", "Tipo");
        this.tb = new TableModelGrid("Código", "Nome", "Preço de custo", "Preço de venda", "Status");
        habilitarForm(false);
        atualizarGrade();
    }

    public CompraGUI(JDesktopPane dpArea) {
        //Armazena o dpArea (JDesktopPane) recebido por parâmetro para ser usado depois
        this.dpArea = dpArea;
        initComponents();
        this.tmCompra = new TableModelGrid("Código", "Fornecedor", "Valor", "Data", "Tipo");
        this.tb = new TableModelGrid("Código", "Nome", "Preço de custo", "Preço de venda", "Status");
        carregaFornecedor();
        habilitarForm(false);
        atualizarGrade();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBotoes = new javax.swing.JPanel();
        btFinalizar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        pnAbas = new javax.swing.JTabbedPane();
        pnPesquisa = new javax.swing.JPanel();
        pnPesquisar = new javax.swing.JPanel();
        lbPesquisarCompra = new javax.swing.JLabel();
        txtPesquisarCompra = new javax.swing.JTextField();
        btPesquisarCompra = new javax.swing.JButton();
        spGradePesquisar = new javax.swing.JScrollPane();
        tbGradeCompra = new javax.swing.JTable();
        pnFormulario = new javax.swing.JPanel();
        pnDadosVenda = new javax.swing.JPanel();
        lbFornecedorCompra = new javax.swing.JLabel();
        cbFornecedorCompra = new javax.swing.JComboBox();
        lbDataCompra = new javax.swing.JLabel();
        txtDataCompra = new javax.swing.JTextField();
        lbValorTotalCompra = new javax.swing.JLabel();
        txtValorTotalCompra = new javax.swing.JTextField();
        pnProdutosVenda = new javax.swing.JPanel();
        sbGrade = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();
        btAdicionarProduto = new javax.swing.JButton();
        btAdicionarIngrediente = new javax.swing.JButton();
        btExcluirProduto = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Compra");

        btFinalizar.setMnemonic('z');
        btFinalizar.setText("Finalizar");
        btFinalizar.setMaximumSize(new java.awt.Dimension(120, 40));
        btFinalizar.setMinimumSize(new java.awt.Dimension(120, 40));
        btFinalizar.setPreferredSize(new java.awt.Dimension(120, 40));
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });

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
                .addComponent(btFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        lbPesquisarCompra.setText("Pesquisar:");

        btPesquisarCompra.setText("Pesquisar");
        btPesquisarCompra.setMaximumSize(new java.awt.Dimension(120, 40));
        btPesquisarCompra.setMinimumSize(new java.awt.Dimension(120, 40));
        btPesquisarCompra.setPreferredSize(new java.awt.Dimension(120, 40));

        javax.swing.GroupLayout pnPesquisarLayout = new javax.swing.GroupLayout(pnPesquisar);
        pnPesquisar.setLayout(pnPesquisarLayout);
        pnPesquisarLayout.setHorizontalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbPesquisarCompra)
                .addGap(12, 12, 12)
                .addComponent(txtPesquisarCompra)
                .addGap(12, 12, 12)
                .addComponent(btPesquisarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnPesquisarLayout.setVerticalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPesquisarCompra)
                    .addComponent(txtPesquisarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        tbGradeCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbGradeCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGradeCompraMouseClicked(evt);
            }
        });
        spGradePesquisar.setViewportView(tbGradeCompra);

        javax.swing.GroupLayout pnPesquisaLayout = new javax.swing.GroupLayout(pnPesquisa);
        pnPesquisa.setLayout(pnPesquisaLayout);
        pnPesquisaLayout.setHorizontalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spGradePesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                    .addComponent(pnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnPesquisaLayout.setVerticalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(spGradePesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Pesquisar", pnPesquisa);

        pnDadosVenda.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da compra"));

        lbFornecedorCompra.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbFornecedorCompra.setText("Fornecedor:");

        lbDataCompra.setText("Data:");

        txtDataCompra.setEditable(false);
        txtDataCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbValorTotalCompra.setText("Valor total:");

        txtValorTotalCompra.setEditable(false);
        txtValorTotalCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnDadosVendaLayout = new javax.swing.GroupLayout(pnDadosVenda);
        pnDadosVenda.setLayout(pnDadosVendaLayout);
        pnDadosVendaLayout.setHorizontalGroup(
            pnDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosVendaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbFornecedorCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFornecedorCompra, 0, 381, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(lbDataCompra)
                .addGap(15, 15, 15)
                .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lbValorTotalCompra)
                .addGap(12, 12, 12)
                .addComponent(txtValorTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        pnDadosVendaLayout.setVerticalGroup(
            pnDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosVendaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFornecedorCompra)
                    .addComponent(cbFornecedorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDataCompra)
                    .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValorTotalCompra)
                    .addComponent(txtValorTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pnProdutosVenda.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos da compra"));

        tbGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        sbGrade.setViewportView(tbGrade);

        btAdicionarProduto.setMnemonic('r');
        btAdicionarProduto.setText("Adicionar produto");
        btAdicionarProduto.setMaximumSize(new java.awt.Dimension(120, 40));
        btAdicionarProduto.setMinimumSize(new java.awt.Dimension(120, 40));
        btAdicionarProduto.setPreferredSize(new java.awt.Dimension(120, 40));
        btAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarProdutoActionPerformed(evt);
            }
        });

        btAdicionarIngrediente.setMnemonic('s');
        btAdicionarIngrediente.setText("Adicionar ingrediente");
        btAdicionarIngrediente.setMaximumSize(new java.awt.Dimension(120, 40));
        btAdicionarIngrediente.setMinimumSize(new java.awt.Dimension(120, 40));
        btAdicionarIngrediente.setPreferredSize(new java.awt.Dimension(120, 40));
        btAdicionarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarIngredienteActionPerformed(evt);
            }
        });

        btExcluirProduto.setText("Excluir lançamento");
        btExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnProdutosVendaLayout = new javax.swing.GroupLayout(pnProdutosVenda);
        pnProdutosVenda.setLayout(pnProdutosVendaLayout);
        pnProdutosVendaLayout.setHorizontalGroup(
            pnProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutosVendaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sbGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(pnProdutosVendaLayout.createSequentialGroup()
                        .addComponent(btAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btAdicionarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        pnProdutosVendaLayout.setVerticalGroup(
            pnProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutosVendaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAdicionarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(sbGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnDadosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnProdutosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnFormularioLayout.setVerticalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnDadosVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnProdutosVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(pnAbas, javax.swing.GroupLayout.Alignment.TRAILING))
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

    //Evento para quando clicar no botão "Adicionar produto"
    private void btAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarProdutoActionPerformed
        //Abre a JInternalFrame no JDesktopPane dpArea
        if (dpArea != null) {
            CompraAdicionarProdutoGUI p = new CompraAdicionarProdutoGUI(dpArea, this);
            dpArea.add(p);
            p.setLocation(calculaLocal(dpArea, p));
            p.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Impossível abrir a janela interna, pois o \n"
                    + "DesktopPane destino não está definido!");
        }

    }//GEN-LAST:event_btAdicionarProdutoActionPerformed

    //Evento para quando clicar no botão "Adicionar ingrediente"
    private void btAdicionarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarIngredienteActionPerformed
        //Abre a JInternalFrame no JDesktopPane dpArea
        if (dpArea != null) {
            CompraAdicionarIngredienteGUI p = new CompraAdicionarIngredienteGUI(dpArea, this);
            dpArea.add(p);
            p.setLocation(calculaLocal(dpArea, p));
            p.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Impossível abrir a janela interna, pois o \n"
                    + "DesktopPane destino não está definido!");
        }
    }//GEN-LAST:event_btAdicionarIngredienteActionPerformed

    //Evento para quando clicar no botão "Salvar"
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            if (!validar()) {
                return;
            }

            //Instanciação do objeto utilizados na classe
            CompraTO compraTO = new CompraTO();

            //Cria um novo fornecedor, dá um nome para eles e recupera os objetos selecionados
            FornecedorTO fornecedor = (FornecedorTO) cbFornecedorCompra.getSelectedItem();
            compraTO.setIdFornecedor(fornecedor.getIdFornecedor());
            
            compraTO.setIdPessoa(fornecedor.getIdPessoa());

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            compraTO.setDataCompra(sdf.parse(txtDataCompra.getText()));

            NumberFormat nf = NumberFormat.getNumberInstance();
            compraTO.setValorCompra(nf.parse(txtValorTotalCompra.getText()).floatValue());

            compraTO.setStatusCompra("ABERTA");

            if (idCompra == 0) {
                idCompra = CompraDAO.inserirRetornandoId(compraTO);
            } else {
                CompraDAO.alterar(compraTO);
            }

            //Após salvar a Compra
            for (int i = 0; i < tb.getRowCount(); i++) {
                String tipo = tb.getValueAt(i, 4).toString();

                if (tipo.equalsIgnoreCase("PRODUTO")) {
                    ItemCompraProdutoTO item = new ItemCompraProdutoTO();
                    item.setIdItemCompraProduto(0);
                    item.setIdProduto(tb.getIntValueAt(i, 0));
                    item.setIdCompra(idCompra);
                    item.setQuantidadeItemCompraProduto(tb.getIntValueAt(i, 2));
                    item.setValorItemCompraProduto((float) tb.getIntValueAt(i, 3));
                    ItemCompraProdutoDAO.inserir(item);
                } else {
                    ItemCompraIngredienteTO item = new ItemCompraIngredienteTO();
                    item.setIdItemCompraIngrediente(0);
                    item.setIdIngrediente(tb.getIntValueAt(i, 0));
                    item.setIdCompra(idCompra);
                    item.setQuantidadeItemCompraIngrediente(tb.getIntValueAt(i, 2));
                    item.setValorItemCompraIngrediente((float) tb.getIntValueAt(i, 3));
                    ItemCompraProdutoDAO.inserir(item);
                }
            }

            br.com.ctesop.componentes.JOptionPane.showMessageDialog(this, "Compra salva com sucesso!");
            
            atualizarGrade();
            limparForm();
            habilitarForm(false);
        } catch (Exception e) {
            e.printStackTrace();
            br.com.ctesop.componentes.JOptionPane.showMessageDialog(this, "Erro ao salvar!\nDados: " + e.getMessage());
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    //Evento para quando clicar no botão "Finalizar"
    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
        try {
            if (!validar()) {
                return;
            }

            //Instanciação do objeto utilizado na classe
            CompraTO compraTO = new CompraTO();
            ProdutoTO produtoTO = new ProdutoTO();
            IngredienteTO ingredienteTO = new IngredienteTO();

            //Persistência dos dados da compra
            compraTO.setIdCompra(idCompra);

            if (!txtDataCompra.getText().trim().isEmpty()) {
                Date data = new Date(dateFormat.parse(txtDataCompra.getText()).getTime());
                compraTO.setDataCompra(data);
            }

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            compraTO.setDataCompra(sdf.parse(txtDataCompra.getText()));

            NumberFormat nf = NumberFormat.getNumberInstance();
            compraTO.setValorCompra(nf.parse(txtValorTotalCompra.getText()).floatValue());

            //Cria um novo fornecedor e funcionário, dá um nome para eles e recupera os objetos selecionados
            FornecedorTO fornecedor = (FornecedorTO) cbFornecedorCompra.getSelectedItem();
            compraTO.setIdFornecedor(fornecedor.getIdFornecedor());

            compraTO.setStatusCompra("FECHADA");

            if (idCompra == 0) {
                idCompra = CompraDAO.inserirRetornandoId(compraTO);
                compraTO.setIdCompra(idCompra);
            } else {
                CompraDAO.alterar(compraTO);
            }

            //Após finalizar a Compra
            for (int i = 0; i < tb.getRowCount(); i++) {
                String tipo = tb.getValueAt(i, 4).toString();

                if (tipo.equalsIgnoreCase("PRODUTO")) {
                    ItemCompraProdutoTO item = new ItemCompraProdutoTO();
                    item.setIdItemCompraProduto(0);
                    item.setIdProduto(tb.getIntValueAt(i, 0));
                    item.setIdCompra(idCompra);
                    item.setQuantidadeItemCompraProduto(tb.getIntValueAt(i, 2));
                    item.setValorItemCompraProduto((float) tb.getIntValueAt(i, 3));
                    ItemCompraProdutoDAO.inserir(item);

                    produtoTO = (ProdutoTO) ProdutoDAO.get(ProdutoTO.class, item.getIdProduto());
                    quantidadeProduto = item.getQuantidadeItemCompraProduto()
                            + produtoTO.getQuantidadeProduto();
                    produtoTO.setQuantidadeProduto(quantidadeProduto);
                    
                    ProdutoDAO.alterar(produtoTO);
                    
                } else {
                    ItemCompraIngredienteTO item = new ItemCompraIngredienteTO();
                    item.setIdItemCompraIngrediente(0);
                    item.setIdIngrediente(tb.getIntValueAt(i, 0));
                    item.setIdCompra(idCompra);
                    item.setQuantidadeItemCompraIngrediente(tb.getIntValueAt(i, 2));
                    item.setValorItemCompraIngrediente((float) tb.getIntValueAt(i, 3));
                    ItemCompraProdutoDAO.inserir(item);
                    
                    ingredienteTO = (IngredienteTO) IngredienteDAO.get(IngredienteTO.class, item.getIdIngrediente());
                    quantidadeIngrediente = item.getQuantidadeItemCompraIngrediente()
                            + ingredienteTO.getQuantidadeIngrediente();
                    ingredienteTO.setQuantidadeIngrediente(quantidadeIngrediente);
                    
                    IngredienteDAO.alterar(ingredienteTO);
                }
            }

            br.com.ctesop.componentes.JOptionPane.showMessageDialog(this, "Compra finalizada com sucesso!");

            atualizarGrade();
            limparForm();
            habilitarForm(false);

            dispose();

            CompraFormaPagamentoGUI cfrgui = new CompraFormaPagamentoGUI(compraTO, dpArea);
            dpArea.add(cfrgui);
            cfrgui.setLocation((dpArea.getWidth() - cfrgui.getWidth()) / 2, (dpArea.getHeight() - cfrgui.getHeight()) / 2);
            cfrgui.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
            br.com.ctesop.componentes.JOptionPane.showMessageDialog(this, "Erro ao salvar!\nDados: " + e.getMessage());
        }
    }//GEN-LAST:event_btFinalizarActionPerformed

    //Evento para quando clicar no botão "Novo"
    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        habilitarForm(true);
        this.idCompra = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        txtDataCompra.setText(sdf.format(new Date()));
    }//GEN-LAST:event_btNovoActionPerformed

    private void tbGradeCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeCompraMouseClicked
        if (evt.getClickCount() == 2) {

            try {
                TableModelGrid tm = (TableModelGrid) tbGrade.getModel();
                int idEntidade = tm.getIntValueAt(tbGrade.getSelectedRow(), 0);
                if (idEntidade <= 0) {
                    return;
                }

                CompraTO compraTO = (CompraTO) CompraDAO.get(CompraTO.class, idEntidade);
                ProdutoTO produtoTO = (ProdutoTO) ProdutoDAO.get(ProdutoTO.class, idEntidade);
                IngredienteTO ingredienteTO = (IngredienteTO) IngredienteDAO.get(IngredienteTO.class, idEntidade);
                FornecedorTO fornecedorTO = (FornecedorTO) FornecedorDAO.get(FornecedorTO.class, idEntidade);
                
                cbFornecedorCompra.setSelectedItem(fornecedorTO);
                
                if (compraTO.getDataCompra()!= null) {
                    txtDataCompra.setText(dateFormat.format(compraTO.getDataCompra()));
                }
                
                txtValorTotalCompra.setText(compraTO.getValorCompra() + "");
                

                habilitarForm(true);
            } catch (Exception ex) {
                ex.printStackTrace();
                Logger.getLogger(ClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tbGradeCompraMouseClicked

    private void btExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirProdutoActionPerformed
        int linha = tbGrade.getSelectedRow();
        tb.removeLinha(linha);
        
    }//GEN-LAST:event_btExcluirProdutoActionPerformed

    //Métodos//
    //Método que atualiza a grade com os valores cadastrados
    private void atualizarGrade() {
        try {
            String filtro = txtPesquisarCompra.getText();
            List<Class<?>> classes = new ArrayList<>();
            classes.add(CompraTO.class);
            classes.add(FornecedorTO.class);
            classes.add(PessoaTO.class);

            
            String[] camposSelect = new String[]{"Compra.idCompra", "Pessoa.nomePessoa",
                "Compra.valorCompra","Compra.dataCompra" , "Compra.statusCompra"};
            tmCompra.setDados(CompraDAO.listarUtilizandoComandoInnerJoin(classes, camposSelect, pagina, "nomePessoa", filtro));
            tbGradeCompra.setModel(tmCompra);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao atualizar grade");
        }
    }

    //Método que adicionar os produto
    public void adicionarProduto(ItemCompraProdutoTO icpto) {
        try {

            ProdutoTO produtoTO = (ProdutoTO) ProdutoDAO.get(ProdutoTO.class, icpto.getIdProduto());
            List<String> dados = new ArrayList<>();
            NumberFormat nf = NumberFormat.getNumberInstance();
            dados.add(nf.format(icpto.getIdProduto()));
            dados.add(produtoTO.getNomeProduto());
            dados.add(nf.format(icpto.getQuantidadeItemCompraProduto()));
            dados.add(nf.format(icpto.getValorItemCompraProduto()));
            dados.add("PRODUTO");
            tb.addDados(dados);
            tbGrade.setModel(tb);
            atualizarValorTotal();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar produto.");
            e.printStackTrace();
        }
    }

    //Método que adiciona os ingredientes
    public void adicionarIngrediente(ItemCompraIngredienteTO icito) {
        try {
            IngredienteTO ingredienteTO = (IngredienteTO) IngredienteDAO.get(IngredienteTO.class, icito.getIdIngrediente());
            List<String> dados = new ArrayList<>();
            NumberFormat nf = NumberFormat.getNumberInstance();
            dados.add(nf.format(icito.getIdIngrediente()));
            dados.add(ingredienteTO.getNomeIngrediente());
            dados.add(nf.format(icito.getQuantidadeItemCompraIngrediente()));
            dados.add(nf.format(icito.getValorItemCompraIngrediente()));
            dados.add("INGREDIENTE");
            tb.addDados(dados);
            tbGrade.setModel(tb);
            atualizarValorTotal();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar ingrediente.");
            e.printStackTrace();
        }
    }

    //Método para carregar o nome dos fornecedores no ComboBox
    private void carregaFornecedor() {
        try {
            List<Object> listaFornecedor = FornecedorDAO.listar(FornecedorTO.class);
            for (Object e : listaFornecedor) {
                FornecedorTO fornecedor = (FornecedorTO) e;
                PessoaTO pessoa = (PessoaTO) PessoaDAO.get(PessoaTO.class, fornecedor.getIdPessoa());
                fornecedor.setNomePessoa(pessoa.getNomePessoa());
                cbFornecedorCompra.addItem(fornecedor);
            }

        } catch (Exception ex) {
            //Para as mensagens de erro. Esta puxando do pacote "br.com.ctesop.componentes" da classe "JOptionPane"
            br.com.ctesop.componentes.JOptionPane.showWarningDialog(this, "Ocorreu um erro ao listar os fornecedores.");
        }
    }

    //Método que habilita o formulário
    private void habilitarForm(boolean habilitar) {
        txtDataCompra.setEnabled(habilitar);
        txtValorTotalCompra.setEnabled(habilitar);
        cbFornecedorCompra.setEnabled(habilitar);
        cbFornecedorCompra.setEnabled(habilitar);

        btAdicionarProduto.setEnabled(habilitar);
        btAdicionarIngrediente.setEnabled(habilitar);
        btExcluirProduto.setEnabled(habilitar);
        btNovo.setEnabled(!habilitar);
        btSalvar.setEnabled(habilitar);
        btFinalizar.setEnabled(habilitar);

        if (habilitar) {
            pnAbas.setSelectedIndex(1);
        } else {
            pnAbas.setSelectedIndex(0);
        }
    }

    //Método que limpa o formulário
    private void limparForm() {
        txtDataCompra.setText("");
        txtValorTotalCompra.setText("");
    }

    //Método para validar
    private boolean validar() {
        return true;
    }

    //Método que soma e mostra o valor total da compra
    public void atualizarValorTotal() {
        float total = 0;
        if (tb != null) {
            for (int i = 0; i < tb.getRowCount(); i++) {
                NumberFormat nf = NumberFormat.getNumberInstance();

                float valor = Float.parseFloat(tb.getValueAt(i, 3).toString());
                float quantidade = Float.parseFloat(tb.getValueAt(i, 2).toString());
                total += (valor * quantidade);
            }
        }
        NumberFormat nf = NumberFormat.getNumberInstance();
        txtValorTotalCompra.setText(nf.format(total));
    }

    //Método para abrir os JInternalFrame adicionais centralizados
    private Point calculaLocal(JDesktopPane dpArea, JInternalFrame p) {
        return new Point(((dpArea.getWidth() - p.getWidth()) / 2), ((dpArea.getHeight() - p.getHeight()) / 2));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarIngrediente;
    private javax.swing.JButton btAdicionarProduto;
    private javax.swing.JButton btExcluirProduto;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisarCompra;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbFornecedorCompra;
    private javax.swing.JLabel lbDataCompra;
    private javax.swing.JLabel lbFornecedorCompra;
    private javax.swing.JLabel lbPesquisarCompra;
    private javax.swing.JLabel lbValorTotalCompra;
    private javax.swing.JTabbedPane pnAbas;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnDadosVenda;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JPanel pnPesquisa;
    private javax.swing.JPanel pnPesquisar;
    private javax.swing.JPanel pnProdutosVenda;
    private javax.swing.JScrollPane sbGrade;
    private javax.swing.JScrollPane spGradePesquisar;
    private javax.swing.JTable tbGrade;
    private javax.swing.JTable tbGradeCompra;
    private javax.swing.JTextField txtDataCompra;
    private javax.swing.JTextField txtPesquisarCompra;
    private javax.swing.JTextField txtValorTotalCompra;
    // End of variables declaration//GEN-END:variables
}
