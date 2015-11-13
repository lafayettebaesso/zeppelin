package br.com.ctesop.gui;

import br.com.ctesop.dao.ContasPagarDAO;
import br.com.ctesop.dao.FornecedorDAO;
import br.com.ctesop.dao.ParcelasContasPagarDAO;
import br.com.ctesop.dao.PessoaDAO;
import br.com.ctesop.gui.tablemodel.TableModelGrid;
import br.com.ctesop.to.CaixaTO;
import br.com.ctesop.to.CompraTO;
import br.com.ctesop.to.ContasPagarTO;
import br.com.ctesop.to.FornecedorTO;
import br.com.ctesop.to.MovimentoCaixaTO;
import br.com.ctesop.to.ParcelasContasPagarTO;
import br.com.ctesop.to.PessoaTO;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;

public class ContasPagarGUI extends javax.swing.JInternalFrame {

    //Atribudo para armazenar qual JDesktopPane irá receber o JInternalFrame
    private JDesktopPane dpArea = null;
    int pagina = 0;
    private CompraTO compraTO;
    private CaixaTO caixaTO;
    private FornecedorTO fornecedorTO;
    private int idContasPagar = 0;
    private int idMovimentoCaixa = 0;
    private int idParcelasContasPagar = 0;
    TableModelGrid tb;
    TableModelGrid tbParcelas;
    private float valor, resto = 0;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public ContasPagarGUI(CompraTO compraTO) {
        //Armazena o dpArea (JDesktopPane) recebido por parâmetro para ser usado depois
        //this.dpArea = dpArea;
        this.compraTO = compraTO;
        initComponents();
        //this.tb = new TableModelGrid("Código", "Fornecedor", "Data", "Qtde. parcelas", "Valor total", "Status");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        txtDataContasPagar.setText(sdf.format(new java.util.Date()));
        NumberFormat nf = NumberFormat.getNumberInstance();
        txtValorTotalContasPagar.setText(nf.format(compraTO.getValorCompra()));
        habilitarForm(true);
        carregaFornecedor();
        atualizarGradeContasPagar();
    }

    public ContasPagarGUI(JDesktopPane dpArea) {
        //Armazena o dpArea (JDesktopPane) recebido por parâmetro para ser usado depois
        this.dpArea = dpArea;
        initComponents();
        this.tb = new TableModelGrid("Código", "Fornecedor", "Data", "Qtde. parcelas", "Valor total", "Status");
        this.tbParcelas = new TableModelGrid("Código", "Número", "Valor", "Vencimento", "Status");
        atualizarGradeContasPagar();
        //atualizarGradeContasPagar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBotoes = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        pnAbas = new javax.swing.JTabbedPane();
        pnPesquisar = new javax.swing.JPanel();
        pnPesquisa = new javax.swing.JPanel();
        lbPesquisarContasPagar = new javax.swing.JLabel();
        txtPesquisarContasPagar = new javax.swing.JTextField();
        btPesquisarContasPagar = new javax.swing.JButton();
        spGrade = new javax.swing.JScrollPane();
        tbGradeContasPagar = new javax.swing.JTable();
        pnContasReceber = new javax.swing.JPanel();
        pnFormulario = new javax.swing.JPanel();
        lbCodigoContasPagar = new javax.swing.JLabel();
        txtCodigoContasPagar = new javax.swing.JTextField();
        lbClienteContasPagar = new javax.swing.JLabel();
        lbDataContasPagar = new javax.swing.JLabel();
        txtDataContasPagar = new javax.swing.JFormattedTextField();
        lbQuantidadeParcelasContasPagar = new javax.swing.JLabel();
        txtQuantidadeParcelasContasPagar = new javax.swing.JTextField();
        lbValorTotalContasPagar = new javax.swing.JLabel();
        txtValorTotalContasPagar = new javax.swing.JTextField();
        lbStatusContasPagar = new javax.swing.JLabel();
        cbStatusContasPagar = new javax.swing.JComboBox();
        cbFornecedorContasPagar = new javax.swing.JComboBox();
        pnParcelasContasReceber = new javax.swing.JPanel();
        spTabela = new javax.swing.JScrollPane();
        tbGradeParcelasContasPagar = new javax.swing.JTable();
        btQuitasParcela = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Contas a pagar");

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
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lbPesquisarContasPagar.setText("Pesquisar:");

        btPesquisarContasPagar.setText("Pesquisar");

        javax.swing.GroupLayout pnPesquisaLayout = new javax.swing.GroupLayout(pnPesquisa);
        pnPesquisa.setLayout(pnPesquisaLayout);
        pnPesquisaLayout.setHorizontalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbPesquisarContasPagar)
                .addGap(12, 12, 12)
                .addComponent(txtPesquisarContasPagar)
                .addGap(12, 12, 12)
                .addComponent(btPesquisarContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnPesquisaLayout.setVerticalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPesquisarContasPagar)
                    .addComponent(txtPesquisarContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisarContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        tbGradeContasPagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbGradeContasPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGradeContasPagarMouseClicked(evt);
            }
        });
        spGrade.setViewportView(tbGradeContasPagar);

        javax.swing.GroupLayout pnPesquisarLayout = new javax.swing.GroupLayout(pnPesquisar);
        pnPesquisar.setLayout(pnPesquisarLayout);
        pnPesquisarLayout.setHorizontalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnPesquisarLayout.setVerticalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Pesquisar", pnPesquisar);

        pnFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Contas a receber"));

        lbCodigoContasPagar.setText("Código:");

        txtCodigoContasPagar.setEditable(false);
        txtCodigoContasPagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbClienteContasPagar.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbClienteContasPagar.setText("Fornecedor:");

        lbDataContasPagar.setText("Data:");

        txtDataContasPagar.setEditable(false);
        txtDataContasPagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbQuantidadeParcelasContasPagar.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbQuantidadeParcelasContasPagar.setText("Qtde. parcelas:");

        txtQuantidadeParcelasContasPagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbValorTotalContasPagar.setText("Valor total:");

        txtValorTotalContasPagar.setEditable(false);
        txtValorTotalContasPagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbStatusContasPagar.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbStatusContasPagar.setText("Status:");

        cbStatusContasPagar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ABERTA", "FECHADA" }));

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormularioLayout.createSequentialGroup()
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnFormularioLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(lbQuantidadeParcelasContasPagar))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormularioLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbDataContasPagar)))
                    .addComponent(lbCodigoContasPagar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(txtCodigoContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbClienteContasPagar)
                        .addGap(12, 12, 12)
                        .addComponent(cbFornecedorContasPagar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnFormularioLayout.createSequentialGroup()
                                .addComponent(txtQuantidadeParcelasContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(lbValorTotalContasPagar)
                                .addGap(12, 12, 12)
                                .addComponent(txtValorTotalContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(lbStatusContasPagar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbStatusContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 113, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        pnFormularioLayout.setVerticalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbClienteContasPagar)
                    .addComponent(lbCodigoContasPagar)
                    .addComponent(cbFornecedorContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataContasPagar)
                    .addComponent(txtDataContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuantidadeParcelasContasPagar)
                    .addComponent(txtQuantidadeParcelasContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValorTotalContasPagar)
                    .addComponent(txtValorTotalContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbStatusContasPagar)
                    .addComponent(cbStatusContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pnParcelasContasReceber.setBorder(javax.swing.BorderFactory.createTitledBorder("Parcelas das contas a pagar"));

        tbGradeParcelasContasPagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbGradeParcelasContasPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGradeParcelasContasPagarMouseClicked(evt);
            }
        });
        spTabela.setViewportView(tbGradeParcelasContasPagar);

        btQuitasParcela.setMnemonic('q');
        btQuitasParcela.setText("Quitar parcela");
        btQuitasParcela.setMaximumSize(new java.awt.Dimension(120, 40));
        btQuitasParcela.setMinimumSize(new java.awt.Dimension(120, 40));
        btQuitasParcela.setPreferredSize(new java.awt.Dimension(120, 40));
        btQuitasParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuitasParcelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnParcelasContasReceberLayout = new javax.swing.GroupLayout(pnParcelasContasReceber);
        pnParcelasContasReceber.setLayout(pnParcelasContasReceberLayout);
        pnParcelasContasReceberLayout.setHorizontalGroup(
            pnParcelasContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnParcelasContasReceberLayout.createSequentialGroup()
                .addGroup(pnParcelasContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnParcelasContasReceberLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btQuitasParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnParcelasContasReceberLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(spTabela)))
                .addGap(12, 12, 12))
        );
        pnParcelasContasReceberLayout.setVerticalGroup(
            pnParcelasContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnParcelasContasReceberLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btQuitasParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(spTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnContasReceberLayout = new javax.swing.GroupLayout(pnContasReceber);
        pnContasReceber.setLayout(pnContasReceberLayout);
        pnContasReceberLayout.setHorizontalGroup(
            pnContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContasReceberLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnParcelasContasReceber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnContasReceberLayout.setVerticalGroup(
            pnContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContasReceberLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnParcelasContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Contas a pagar", pnContasReceber);

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
                .addComponent(pnAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            if (!validar()) {
                return;
            }

            //Instanciação do objeto utilizados na classe
            ContasPagarTO contasPagarTO = new ContasPagarTO();
            MovimentoCaixaTO movimentoCaixaTO = new MovimentoCaixaTO();
            ParcelasContasPagarTO parcelasContasPagarTO = new ParcelasContasPagarTO();

            //Inserção dos dados referente as Contas a pagar
            contasPagarTO.setIdContasPagar(0);
            contasPagarTO.setIdCompra(compraTO.getIdCompra());

            //Cria um novo fornecedor, dá um nome para eles e recupera os objetos selecionados
            FornecedorTO fornecedor = (FornecedorTO) cbFornecedorContasPagar.getSelectedItem();
            contasPagarTO.setIdFornecedor(fornecedor.getIdFornecedor());

            NumberFormat nf = NumberFormat.getNumberInstance();
            int qtdeParcelas = nf.parse(txtQuantidadeParcelasContasPagar.getText()).intValue();
            contasPagarTO.setQuantidadeParcelasContasPagar(qtdeParcelas);

            contasPagarTO.setValorTotalContasPagar(nf.parse(txtValorTotalContasPagar.getText()).floatValue());

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            contasPagarTO.setDataContasPagar(sdf.parse(txtDataContasPagar.getText()));

            contasPagarTO.setStatusContasPagar(cbStatusContasPagar.getSelectedItem().toString());

            if (idContasPagar == 0) {
                idContasPagar = ContasPagarDAO.inserirRetornandoId(contasPagarTO);
                contasPagarTO.setIdContasPagar(idContasPagar);
            } else {
                ContasPagarDAO.alterar(contasPagarTO);
            }

            for (int numeroParcela = 1; numeroParcela <= qtdeParcelas; numeroParcela++) {
                Date dataConta = sdf.parse(txtDataContasPagar.getText());

                GregorianCalendar gc = new GregorianCalendar();
                gc.setTime(dataConta);
                gc.add(GregorianCalendar.MONTH, numeroParcela);
                dataConta = gc.getTime();

                //Calculo do valor das parcelas
                valor = contasPagarTO.getValorTotalContasPagar() / qtdeParcelas;

                //Tratamento do resto da divisão
                resto = contasPagarTO.getValorTotalContasPagar() % qtdeParcelas;

                if (resto > 0 && numeroParcela == 1) {
                    valor += resto;
                }

                //Inserção dos dados referente as parcelas das contas a pagar
                //parcelasContasPagarTO.setIdParcelasContasPagar(idParcelasContasPagar);
                parcelasContasPagarTO.setIdContasPagar(contasPagarTO.getIdContasPagar());
                parcelasContasPagarTO.setNumeroParcelasContasPagar(numeroParcela);
                parcelasContasPagarTO.setVencimentoParcelasContasPagar(dataConta);
                parcelasContasPagarTO.setStatusParcelasContasPagar(cbStatusContasPagar.getSelectedItem().toString());
                parcelasContasPagarTO.setValorParcelasContasPagar(valor);

                //idParcelasContasPagar = ParcelasContasPagarDAO.inserirRetornandoId(parcelasContasPagarTO);
                //parcelasContasPagarTO.setIdParcelasContasPagar(idParcelasContasPagar);
                ParcelasContasPagarDAO.inserir(parcelasContasPagarTO);
            }

            br.com.ctesop.componentes.JOptionPane.showMessageDialog(this, "Conta a pagar salva com sucesso!");
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
            br.com.ctesop.componentes.JOptionPane.showMessageDialog(this, "Erro ao salvar!\nDados: " + e.getMessage());
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btQuitasParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuitasParcelaActionPerformed
        try {
            int linha = tbGradeParcelasContasPagar.getSelectedRow();
            ParcelasContasPagarTO pcpto = (ParcelasContasPagarTO) ParcelasContasPagarDAO.get(ParcelasContasPagarTO.class, Integer.parseInt((String) tbParcelas.getValueAt(linha, 0))) ;
            PagamentoGUI pagamentoGUI = new PagamentoGUI(pcpto);
            dpArea.add(pagamentoGUI);
            pagamentoGUI.setLocation((dpArea.getWidth() - pagamentoGUI.getWidth()) / 2,
                    (dpArea.getHeight() - pagamentoGUI.getHeight()) / 2);
            pagamentoGUI.setVisible(true);
            dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btQuitasParcelaActionPerformed

    private void tbGradeParcelasContasPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeParcelasContasPagarMouseClicked

    }//GEN-LAST:event_tbGradeParcelasContasPagarMouseClicked

    private void tbGradeContasPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeContasPagarMouseClicked
        if (evt.getClickCount() == 2) {

            try {
                TableModelGrid tm = (TableModelGrid) tbGradeContasPagar.getModel();
                int idEntidade = tm.getIntValueAt(tbGradeContasPagar.getSelectedRow(), 0);
                if (idEntidade <= 0) {
                    return;
                }

                ContasPagarTO contasPagar = (ContasPagarTO) ContasPagarDAO.get(ContasPagarTO.class, idEntidade);
            //    fornecedorTO = (FornecedorTO) FornecedorDAO.get(FornecedorTO.class, contasPagarTO.getIdFornecedor());

                //Para preencher também o campo "Sigla do estado"
                try {
                    FornecedorTO fornecedor = (FornecedorTO) FornecedorDAO.get(FornecedorTO.class, contasPagar.getIdFornecedor());
                    cbFornecedorContasPagar.setSelectedItem(fornecedor);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                txtCodigoContasPagar.setText("" + contasPagar.getIdContasPagar());
              //  cbFornecedorContasPagar.setSelectedItem(fornecedorTO);

                if (contasPagar.getDataContasPagar() != null) {
                    txtDataContasPagar.setText(dateFormat.format(contasPagar.getDataContasPagar()));
                }

                txtQuantidadeParcelasContasPagar.setText("" + contasPagar.getQuantidadeParcelasContasPagar());

                txtValorTotalContasPagar.setText("" + contasPagar.getValorTotalContasPagar());

                cbStatusContasPagar.setSelectedItem(contasPagar.getStatusContasPagar());

                idContasPagar = contasPagar.getIdContasPagar();
                
                atualizarGradeParcelasContasPagar();
                
                habilitarForm(true);
            } catch (Exception ex) {
                ex.printStackTrace();
                Logger.getLogger(ContasPagarGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tbGradeContasPagarMouseClicked

    //Métodos//
    //Método que atualiza a grade das contas a pagar com os valores cadastrados
    private void atualizarGradeContasPagar() {
        try {
            String filtro = txtPesquisarContasPagar.getText();
            List<Class<?>> classes = new ArrayList<>();
            classes.add(ContasPagarTO.class);
            classes.add(FornecedorTO.class);
            //classes.add(PessoaTO.class);

            String[] camposSelect = new String[]{"ContasPagar.idContasPagar", "Fornecedor.idFornecedor",
                "ContasPagar.dataContasPagar", "ContasPagar.quantidadeParcelasContasPagar",
                "ContasPagar.valorTotalContasPagar", "ContasPagar.statusContasPagar"};
            tb.setDados(ContasPagarDAO.listarUtilizandoComandoInnerJoin(classes, camposSelect, pagina, "nomePessoa", filtro));
            tbGradeContasPagar.setModel(tb);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao atualizar grade");
        }
    }

    //Método que atualiza a grade com os valores cadastrados
    private void atualizarGradeParcelasContasPagar() {
        try {
            List<Class<?>> classes = new ArrayList<>();
            classes.add(ParcelasContasPagarTO.class);

            String[] camposSelect = new String[]{"ParcelasContasPagar.idParcelasContasPagar",
                "ParcelasContasPagar.numeroParcelasContasPagar",
                "ParcelasContasPagar.valorParcelasContasPagar",
                "ParcelasContasPagar.vencimentoParcelasContasPagar",
                "ParcelasContasPagar.statusParcelasContasPagar"};
            tbParcelas.setDados(ParcelasContasPagarDAO.listarUtilizandoComandoInnerJoin(classes, camposSelect, pagina,
                    "parcelasContasPagar.idContasPagar", String.valueOf(idContasPagar)));
            tbGradeParcelasContasPagar.setModel(tbParcelas);
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao atualizar grade");
        }
    }

    public void limparForm() {
        txtQuantidadeParcelasContasPagar.setText("");
        txtValorTotalContasPagar.setText("");
        NumberFormat nf = NumberFormat.getNumberInstance();
        txtValorTotalContasPagar.setText(nf.format(compraTO.getValorCompra()));
    }

    //Método para carregar o nome dos funcionários no ComboBox
    private void carregaFornecedor() {
        try {
            List<Object> listaFornecedor = FornecedorDAO.listar(FornecedorTO.class);
            for (Object e : listaFornecedor) {
                FornecedorTO fornecedor = (FornecedorTO) e;
                PessoaTO pessoa = (PessoaTO) PessoaDAO.get(PessoaTO.class, fornecedor.getIdPessoa());
                fornecedor.setNomePessoa(pessoa.getNomePessoa());
                cbFornecedorContasPagar.addItem(fornecedor);
            }

        } catch (Exception ex) {
            //Para as mensagens de erro. Esta puxando do pacote "br.com.ctesop.componentes" da classe "JOptionPane"
            br.com.ctesop.componentes.JOptionPane.showWarningDialog(this, "Ocorreu um erro ao listar os fornecedores.");
        }
    }

    //Método que habilita o formulário
    private void habilitarForm(boolean habilitar) {
        if (habilitar) {
            pnAbas.setSelectedIndex(1);
        } else {
            pnAbas.setSelectedIndex(0);
        }
    }

    //Método que verifica, no pagamento, a situação do caixa
    private boolean situacaoCaixa(boolean b) {
        //Verifica se o caixa está fechado. Caso esteja, é apresentada uma mensagem
        if (caixaTO == null) {
            //Para as mensagens de erro. Esta puxando do pacote "br.com.ctesop.componentes" da classe "JOptionPane"
            br.com.ctesop.componentes.JOptionPane.showWarningDialog(this, "O caixa não está aberto.\n"
                    + "É necessário abri-lo antes de confirmar o pagamento.\n\n"
                    + "Instruções:\n- Feche este alerta clicando no 'Ok';\n"
                    + "- No Menu superior clique em 'Movimentação' > 'Abrir/Fechar o caixa';\n"
                    + "- Faça o lançamento do valor de abertura e clique em 'Abrir o caixa';\n"
                    + "- Feche a tela de abertura do caixa e prossiga com a operação de pagamento.");
            return false;
        }

        //Verifica se o valor da compra é maior que o saldo do caixa. Caso seja, é apresentada uma mensagem.
        if (compraTO.getValorCompra() > caixaTO.getSaldoCaixa()) {
            //Para as mensagens de erro. Esta puxando do pacote "br.com.ctesop.componentes" da classe "JOptionPane"
            br.com.ctesop.componentes.JOptionPane.showWarningDialog(this, "O valor da compra não pode"
                    + " ser maior que o saldo do caixa.");
            return false;
        }
        return true;
    }

    private boolean validar() {
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btPesquisarContasPagar;
    private javax.swing.JButton btQuitasParcela;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbFornecedorContasPagar;
    private javax.swing.JComboBox cbStatusContasPagar;
    private javax.swing.JLabel lbClienteContasPagar;
    private javax.swing.JLabel lbCodigoContasPagar;
    private javax.swing.JLabel lbDataContasPagar;
    private javax.swing.JLabel lbPesquisarContasPagar;
    private javax.swing.JLabel lbQuantidadeParcelasContasPagar;
    private javax.swing.JLabel lbStatusContasPagar;
    private javax.swing.JLabel lbValorTotalContasPagar;
    private javax.swing.JTabbedPane pnAbas;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnContasReceber;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JPanel pnParcelasContasReceber;
    private javax.swing.JPanel pnPesquisa;
    private javax.swing.JPanel pnPesquisar;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JScrollPane spTabela;
    private javax.swing.JTable tbGradeContasPagar;
    private javax.swing.JTable tbGradeParcelasContasPagar;
    private javax.swing.JTextField txtCodigoContasPagar;
    private javax.swing.JFormattedTextField txtDataContasPagar;
    private javax.swing.JTextField txtPesquisarContasPagar;
    private javax.swing.JTextField txtQuantidadeParcelasContasPagar;
    private javax.swing.JTextField txtValorTotalContasPagar;
    // End of variables declaration//GEN-END:variables
}
