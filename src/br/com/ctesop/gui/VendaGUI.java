package br.com.ctesop.gui;

import br.com.ctesop.componentes.SelecionarCampo;
import br.com.ctesop.dao.ClienteDAO;
import br.com.ctesop.dao.ItemVendaDAO;
import br.com.ctesop.dao.VendaDAO;
import br.com.ctesop.dao.PessoaDAO;
import br.com.ctesop.dao.ProdutoDAO;
import br.com.ctesop.gui.tablemodel.TableModelGrid;
import br.com.ctesop.to.VendaTO;
import br.com.ctesop.to.ClienteTO;
import br.com.ctesop.to.ItemVendaTO;
import br.com.ctesop.to.PessoaTO;
import br.com.ctesop.to.ProdutoTO;
import java.awt.Point;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class VendaGUI extends javax.swing.JInternalFrame {

    int pagina = 0;
    TableModelGrid tb;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private int idVenda = 0;

    //Atribudo para armazenar qual JDesktopPane irá receber o JInternalFrame
    private JDesktopPane dpArea = null;

    public VendaGUI() {
        initComponents();
        carregaCliente();
        this.tb = new TableModelGrid("Código", "Nome", "Quantidade", "Valor unitário");
        habilitarForm(false);
        //atualizarGrade();
    }

    public VendaGUI(JDesktopPane dpArea) {
        //Armazena o dpArea (JDesktopPane) recebido por parâmetro para ser usado depois
        this.dpArea = dpArea;
        initComponents();
        this.tb = new TableModelGrid("Código", "Nome", "Quantidade", "Valor unitário");
        carregaCliente();
        habilitarForm(false);
        //atualizarGrade();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnBotoes = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btFinalizar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        pnAbas = new javax.swing.JTabbedPane();
        pnPesquisa = new javax.swing.JPanel();
        pnPesquisar = new javax.swing.JPanel();
        lbPesquisarVenda = new javax.swing.JLabel();
        txtPesquisarVenda = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        spGradePesquisar = new javax.swing.JScrollPane();
        tbGradePesquisar = new javax.swing.JTable();
        pnFormulario = new javax.swing.JPanel();
        pnDadosVenda = new javax.swing.JPanel();
        cbClienteVenda = new javax.swing.JComboBox();
        lbClienteVenda = new javax.swing.JLabel();
        lbMesaVenda = new javax.swing.JLabel();
        txtMesaVenda = new javax.swing.JTextField();
        lbDataVenda = new javax.swing.JLabel();
        txtDataVenda = new javax.swing.JFormattedTextField();
        lbValorTotalVenda = new javax.swing.JLabel();
        txtValorTotalVenda = new javax.swing.JFormattedTextField();
        pnProdutosVenda = new javax.swing.JPanel();
        spGradeCadastro = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();
        btAdicionarProduto = new javax.swing.JButton();
        btExcluirProduto = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Venda");

        btNovo.setMnemonic('p');
        btNovo.setText("Novo");
        btNovo.setMaximumSize(new java.awt.Dimension(120, 40));
        btNovo.setMinimumSize(new java.awt.Dimension(120, 40));
        btNovo.setPreferredSize(new java.awt.Dimension(120, 40));
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setMnemonic('p');
        btSalvar.setText("Salvar");
        btSalvar.setMaximumSize(new java.awt.Dimension(120, 40));
        btSalvar.setMinimumSize(new java.awt.Dimension(120, 40));
        btSalvar.setPreferredSize(new java.awt.Dimension(120, 40));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btFinalizar.setMnemonic('p');
        btFinalizar.setText("Finalizar");
        btFinalizar.setMaximumSize(new java.awt.Dimension(120, 40));
        btFinalizar.setMinimumSize(new java.awt.Dimension(120, 40));
        btFinalizar.setPreferredSize(new java.awt.Dimension(120, 40));
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
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
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        lbPesquisarVenda.setText("Pesquisar:");

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
                .addComponent(lbPesquisarVenda)
                .addGap(12, 12, 12)
                .addComponent(txtPesquisarVenda)
                .addGap(12, 12, 12)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnPesquisarLayout.setVerticalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPesquisarVenda)
                    .addComponent(txtPesquisarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        tbGradePesquisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        spGradePesquisar.setViewportView(tbGradePesquisar);

        javax.swing.GroupLayout pnPesquisaLayout = new javax.swing.GroupLayout(pnPesquisa);
        pnPesquisa.setLayout(pnPesquisaLayout);
        pnPesquisaLayout.setHorizontalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spGradePesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                    .addComponent(pnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnPesquisaLayout.setVerticalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(spGradePesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnAbas.addTab("Pesquisar", pnPesquisa);

        pnDadosVenda.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da venda"));

        lbClienteVenda.setText("Cliente:");

        lbMesaVenda.setText("Mesa:");

        txtMesaVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMesaVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMesaVendaFocusGained(evt);
            }
        });

        lbDataVenda.setText("Data:");

        txtDataVenda.setEditable(false);
        txtDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtDataVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbValorTotalVenda.setText("Valor total:");

        txtValorTotalVenda.setEditable(false);
        txtValorTotalVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorTotalVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnDadosVendaLayout = new javax.swing.GroupLayout(pnDadosVenda);
        pnDadosVenda.setLayout(pnDadosVendaLayout);
        pnDadosVendaLayout.setHorizontalGroup(
            pnDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosVendaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbMesaVenda)
                .addGap(12, 12, 12)
                .addGroup(pnDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosVendaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbValorTotalVenda)
                        .addGap(12, 12, 12)
                        .addComponent(txtValorTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDadosVendaLayout.createSequentialGroup()
                        .addComponent(txtMesaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbClienteVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbClienteVenda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15)
                        .addComponent(lbDataVenda)
                        .addGap(12, 12, 12)
                        .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        pnDadosVendaLayout.setVerticalGroup(
            pnDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosVendaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbClienteVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbClienteVenda)
                    .addComponent(lbMesaVenda)
                    .addComponent(txtMesaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDataVenda)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnDadosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorTotalVenda)
                    .addComponent(txtValorTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnProdutosVenda.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos da venda"));

        tbGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        spGradeCadastro.setViewportView(tbGrade);

        btAdicionarProduto.setMnemonic('s');
        btAdicionarProduto.setText("Adicionar produto");
        btAdicionarProduto.setMaximumSize(new java.awt.Dimension(120, 40));
        btAdicionarProduto.setMinimumSize(new java.awt.Dimension(120, 40));
        btAdicionarProduto.setPreferredSize(new java.awt.Dimension(120, 40));
        btAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarProdutoActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProdutosVendaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spGradeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnProdutosVendaLayout.createSequentialGroup()
                        .addComponent(btAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        pnProdutosVendaLayout.setVerticalGroup(
            pnProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutosVendaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnProdutosVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(spGradeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnProdutosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnDadosVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pnAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    //Evento para quando clicar no botão "Adicionar produto"
    private void btAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarProdutoActionPerformed
        //Abre a JInternalFrame no JDesktopPane dpArea
        if (dpArea != null) {
            VendaAdicionarProdutoGUI p = new VendaAdicionarProdutoGUI(dpArea, this);
            dpArea.add(p);
            p.setLocation(calculaLocal(dpArea, p));
            p.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Impossível abrir a janela interna, pois o \n"
                    + "DesktopPane destino não está definido!");
        }
    }//GEN-LAST:event_btAdicionarProdutoActionPerformed

    private void btExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExcluirProdutoActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        habilitarForm(true);
        this.idVenda = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        txtDataVenda.setText(sdf.format(new Date()));
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            if (!validar()) {
                return;
            }

            //Instanciação do objeto utilizados na classe
            VendaTO vendaTO = new VendaTO();

            //Cria um novo cliente, dá um nome para eles e recupera os objetos selecionados
            ClienteTO cliente = (ClienteTO) cbClienteVenda.getSelectedItem();
            vendaTO.setIdCliente(cliente.getIdCliente());
            NumberFormat nf = NumberFormat.getNumberInstance();

            vendaTO.setNumeroMesaVenda(nf.parse(txtMesaVenda.getText()).intValue());

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            vendaTO.setDataVenda(sdf.parse(txtDataVenda.getText()));

            vendaTO.setValorTotalVenda(nf.parse(txtValorTotalVenda.getText()).floatValue());

            vendaTO.setStatusVenda("ABERTA");

            if (idVenda == 0) {
                idVenda = VendaDAO.inserirRetornandoId(vendaTO);
            } else {
                VendaDAO.alterar(vendaTO);
            }

            //Após salvar a Venda
            for (int i = 0; i < tb.getRowCount(); i++) {
                String tipo = tb.getValueAt(i, 4).toString();
                ItemVendaTO item = new ItemVendaTO();
                item.setIdItemVenda(0);
                item.setIdProduto(tb.getIntValueAt(i, 0));
                item.setIdVenda(idVenda);
                item.setQuantidadeItemVendaProduto(tb.getIntValueAt(i, 2));
                item.setValorItemVendaProduto((float) tb.getIntValueAt(i, 3));
                ItemVendaDAO.inserir(item);
            }

            br.com.ctesop.componentes.JOptionPane.showMessageDialog(this, "Venda salva com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
            br.com.ctesop.componentes.JOptionPane.showMessageDialog(this, "Erro ao salvar!\nDados: " + e.getMessage());
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void txtMesaVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMesaVendaFocusGained
        SelecionarCampo.selecionarTudo(evt);
    }//GEN-LAST:event_txtMesaVendaFocusGained

    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
        try {
            if (!validar()) {
                return;
            }

            //Instanciação do objeto utilizado na classe
            VendaTO vendaTO = new VendaTO();
            ProdutoTO produtoTO = new ProdutoTO();
            ClienteTO cliente = (ClienteTO) cbClienteVenda.getSelectedItem();
            NumberFormat nf = NumberFormat.getNumberInstance();

            //Persistência dos dados da compra
            vendaTO.setIdVenda(idVenda);

            vendaTO.setNumeroMesaVenda(nf.parse(txtMesaVenda.getText()).intValue());

            vendaTO.setIdCliente(cliente.getIdCliente());

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            vendaTO.setDataVenda(sdf.parse(txtDataVenda.getText()));

            vendaTO.setValorTotalVenda(nf.parse(txtValorTotalVenda.getText()).floatValue());

            vendaTO.setStatusVenda("FECHADA");

            if (idVenda == 0) {
                idVenda = VendaDAO.inserirRetornandoId(vendaTO);
                vendaTO.setIdVenda(idVenda);
            } else {
                VendaDAO.alterar(vendaTO);
            }

            //Após finalizar a Venda
            for (int i = 0; i < tb.getRowCount(); i++) {
                String tipo = tb.getValueAt(i, 4).toString();
                ItemVendaTO item = new ItemVendaTO();
                item.setIdItemVenda(0);
                item.setIdProduto(tb.getIntValueAt(i, 0));
                item.setIdVenda(idVenda);
                item.setQuantidadeItemVendaProduto(tb.getIntValueAt(i, 2));
                item.setValorItemVendaProduto((float) tb.getIntValueAt(i, 3));
                ItemVendaDAO.inserir(item);
            }

            br.com.ctesop.componentes.JOptionPane.showMessageDialog(this, "Venda finalizada com sucesso!");

            //atualizarGrade();
            limparForm();
            habilitarForm(false);

            dispose();

            VendaFormaRecebimentoGUI vfrgui = new VendaFormaRecebimentoGUI(vendaTO, dpArea);
            dpArea.add(vfrgui);
            vfrgui.setLocation((dpArea.getWidth() - vfrgui.getWidth()) / 2, (dpArea.getHeight() - vfrgui.getHeight()) / 2);
            vfrgui.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
            br.com.ctesop.componentes.JOptionPane.showMessageDialog(this, "Erro ao salvar!\nDados: " + e.getMessage());
        }
    }//GEN-LAST:event_btFinalizarActionPerformed

    //Métodos//
    //Método que adicionar os produto
    public void adicionarProduto(ItemVendaTO ivto) {
        try {

            ProdutoTO produtoTO = (ProdutoTO) ProdutoDAO.get(ProdutoTO.class, ivto.getIdProduto());
            List<String> dados = new ArrayList<>();
            NumberFormat nf = NumberFormat.getNumberInstance();
            dados.add(nf.format(ivto.getIdProduto()));
            dados.add(produtoTO.getNomeProduto());
            dados.add(nf.format(ivto.getQuantidadeItemVendaProduto()));
            dados.add(nf.format(ivto.getValorItemVendaProduto()));
            dados.add("Produto");
            tb.addDados(dados);
            tbGrade.setModel(tb);
            atualizarValorTotal();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar produto.");
            e.printStackTrace();
        }
    }

    //Método para carregar o nome dos cliente no ComboBox
    private void carregaCliente() {
        try {
            List<Object> listaCliente = ClienteDAO.listar(ClienteTO.class);
            for (Object e : listaCliente) {
                ClienteTO cliente = (ClienteTO) e;
                PessoaTO pessoa = (PessoaTO) PessoaDAO.get(PessoaTO.class, cliente.getIdPessoa());
                cliente.setNomePessoa(pessoa.getNomePessoa());
                cbClienteVenda.addItem(cliente);
            }

        } catch (Exception ex) {
            //Para as mensagens de erro. Esta puxando do pacote "br.com.ctesop.componentes" da classe "JOptionPane"
            br.com.ctesop.componentes.JOptionPane.showWarningDialog(this, "Ocorreu um erro ao listar os clientees.");
        }
    }

    //Método que habilita o formulário
    private void habilitarForm(boolean habilitar) {
        txtMesaVenda.setEnabled(habilitar);
        cbClienteVenda.setEnabled(habilitar);
        txtDataVenda.setEnabled(habilitar);
        txtValorTotalVenda.setEnabled(habilitar);

        btAdicionarProduto.setEnabled(habilitar);
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
        txtMesaVenda.setText("");
        txtDataVenda.setText("");
        txtValorTotalVenda.setText("");
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
        txtValorTotalVenda.setText(nf.format(total));
    }

    //Método para validar
    private boolean validar() {
        return true;
    }

    //Método para abrir os JInternalFrame adicionais centralizados
    private Point calculaLocal(JDesktopPane dpArea, JInternalFrame p) {
        return new Point(((dpArea.getWidth() - p.getWidth()) / 2), ((dpArea.getHeight() - p.getHeight()) / 2));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarProduto;
    private javax.swing.JButton btExcluirProduto;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbClienteVenda;
    private javax.swing.JLabel lbClienteVenda;
    private javax.swing.JLabel lbDataVenda;
    private javax.swing.JLabel lbMesaVenda;
    private javax.swing.JLabel lbPesquisarVenda;
    private javax.swing.JLabel lbValorTotalVenda;
    private javax.swing.JTabbedPane pnAbas;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnDadosVenda;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JPanel pnPesquisa;
    private javax.swing.JPanel pnPesquisar;
    private javax.swing.JPanel pnProdutosVenda;
    private javax.swing.JScrollPane spGradeCadastro;
    private javax.swing.JScrollPane spGradePesquisar;
    private javax.swing.JTable tbGrade;
    private javax.swing.JTable tbGradePesquisar;
    private javax.swing.JFormattedTextField txtDataVenda;
    private javax.swing.JTextField txtMesaVenda;
    private javax.swing.JTextField txtPesquisarVenda;
    private javax.swing.JFormattedTextField txtValorTotalVenda;
    // End of variables declaration//GEN-END:variables
}
