package br.com.ctesop.gui;

import br.com.ctesop.componentes.SelecionarCampo;
import br.com.ctesop.dao.ClienteDAO;
import br.com.ctesop.dao.ContasReceberDAO;
import br.com.ctesop.dao.ParcelasContasReceberDAO;
import br.com.ctesop.dao.PessoaDAO;
import br.com.ctesop.gui.tablemodel.TableModelGrid;
import br.com.ctesop.to.CaixaTO;
import br.com.ctesop.to.ClienteTO;
import br.com.ctesop.to.ContasReceberTO;
import br.com.ctesop.to.MovimentoCaixaTO;
import br.com.ctesop.to.ParcelasContasReceberTO;
import br.com.ctesop.to.PessoaTO;
import br.com.ctesop.to.VendaTO;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JDesktopPane;

public class ContasReceberGUI extends javax.swing.JInternalFrame {

    //Atribudo para armazenar qual JDesktopPane irá receber o JInternalFrame
    private JDesktopPane dpArea = null;
    int pagina = 0;
    private VendaTO vendaTO;
    private CaixaTO caixaTO;
    private ClienteTO clienteTO;
    private int idContasReceber = 0;
    private int idMovimentoCaixa = 0;
    private int idParcelasContasReceber = 0;
    TableModelGrid tb;
    TableModelGrid tbParcelas;
    private float valor, resto = 0;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public ContasReceberGUI(VendaTO vendaTO) {
        //Armazena o dpArea (JDesktopPane) recebido por parâmetro para ser usado depois
        //this.dpArea = dpArea;
        this.vendaTO = vendaTO;
        initComponents();
        //this.tb = new TableModelGrid("Código", "Fornecedor", "Data", "Qtde. parcelas", "Valor total", "Status");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        txtDataContasReceber.setText(sdf.format(new java.util.Date()));
        NumberFormat nf = NumberFormat.getNumberInstance();
        txtValorTotalContasReceber.setText(nf.format(vendaTO.getValorTotalVenda()));
        habilitarForm(true);
        carregaCliente();
        atualizarGradeContasReceber();
    }

    
    
    public ContasReceberGUI(JDesktopPane dpArea) {
        //Armazena o dpArea (JDesktopPane) recebido por parâmetro para ser usado depois
        this.dpArea = dpArea;
        initComponents();
        this.tb = new TableModelGrid("Código", "Cliente", "Data", "Qtde. parcelas", "Valor total", "Status");
        this.tbParcelas = new TableModelGrid("Código", "Número", "Valor", "Vencimento", "Status");
        atualizarGradeContasReceber();
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
        lbPesquisarContasReceber = new javax.swing.JLabel();
        txtPesquisarContasReceber = new javax.swing.JTextField();
        txtPesquisar = new javax.swing.JButton();
        spGrade = new javax.swing.JScrollPane();
        tbGradeContasReceber = new javax.swing.JTable();
        pnContasReceber = new javax.swing.JPanel();
        pnFormulario = new javax.swing.JPanel();
        lbCodigoContasReceber = new javax.swing.JLabel();
        txtCodigoContasReceber = new javax.swing.JTextField();
        lbClienteContasReceber = new javax.swing.JLabel();
        lbDataContasReceber = new javax.swing.JLabel();
        txtDataContasReceber = new javax.swing.JFormattedTextField();
        lbQuantidadeParcelasContasReceber = new javax.swing.JLabel();
        txtQuantidadeParcelasContasReceber = new javax.swing.JTextField();
        lbValorTotalContasReceber = new javax.swing.JLabel();
        txtValorTotalContasReceber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbStatusContasReceber = new javax.swing.JComboBox();
        cbClienteContasReceber = new javax.swing.JComboBox();
        pnParcelasContasReceber = new javax.swing.JPanel();
        spTabela = new javax.swing.JScrollPane();
        tbGradeParcelasContasReceber = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Contas a receber");

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
                .addGap(0, 0, 0))
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        lbPesquisarContasReceber.setText("Pesquisar:");

        txtPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout pnPesquisaLayout = new javax.swing.GroupLayout(pnPesquisa);
        pnPesquisa.setLayout(pnPesquisaLayout);
        pnPesquisaLayout.setHorizontalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbPesquisarContasReceber)
                .addGap(12, 12, 12)
                .addComponent(txtPesquisarContasReceber)
                .addGap(12, 12, 12)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnPesquisaLayout.setVerticalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPesquisaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPesquisarContasReceber)
                    .addComponent(txtPesquisarContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        tbGradeContasReceber.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        spGrade.setViewportView(tbGradeContasReceber);

        javax.swing.GroupLayout pnPesquisarLayout = new javax.swing.GroupLayout(pnPesquisar);
        pnPesquisar.setLayout(pnPesquisarLayout);
        pnPesquisarLayout.setHorizontalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnPesquisarLayout.setVerticalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Pesquisar", pnPesquisar);

        pnFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Contas a receber"));

        lbCodigoContasReceber.setText("Código:");

        txtCodigoContasReceber.setEditable(false);
        txtCodigoContasReceber.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbClienteContasReceber.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbClienteContasReceber.setText("Cliente:");

        lbDataContasReceber.setText("Data:");

        txtDataContasReceber.setEditable(false);
        txtDataContasReceber.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbQuantidadeParcelasContasReceber.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        lbQuantidadeParcelasContasReceber.setText("Qtde. parcelas:");

        txtQuantidadeParcelasContasReceber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQuantidadeParcelasContasReceber.setText("1");
        txtQuantidadeParcelasContasReceber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantidadeParcelasContasReceberFocusGained(evt);
            }
        });

        lbValorTotalContasReceber.setText("Valor total:");

        txtValorTotalContasReceber.setEditable(false);
        txtValorTotalContasReceber.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        jLabel1.setText("Status:");

        cbStatusContasReceber.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ABERTA", "FECHADA" }));

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormularioLayout.createSequentialGroup()
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnFormularioLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(lbQuantidadeParcelasContasReceber))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormularioLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbDataContasReceber)))
                    .addComponent(lbCodigoContasReceber, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(txtDataContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(txtCodigoContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbClienteContasReceber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbClienteContasReceber, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addComponent(txtQuantidadeParcelasContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbValorTotalContasReceber)
                        .addGap(12, 12, 12)
                        .addComponent(txtValorTotalContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(cbStatusContasReceber, 0, 196, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnFormularioLayout.setVerticalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbClienteContasReceber)
                    .addComponent(lbCodigoContasReceber)
                    .addComponent(cbClienteContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataContasReceber)
                    .addComponent(txtDataContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuantidadeParcelasContasReceber)
                    .addComponent(txtQuantidadeParcelasContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValorTotalContasReceber)
                    .addComponent(txtValorTotalContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cbStatusContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pnParcelasContasReceber.setBorder(javax.swing.BorderFactory.createTitledBorder("Parcelas das contas a receber"));

        tbGradeParcelasContasReceber.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        spTabela.setViewportView(tbGradeParcelasContasReceber);

        javax.swing.GroupLayout pnParcelasContasReceberLayout = new javax.swing.GroupLayout(pnParcelasContasReceber);
        pnParcelasContasReceber.setLayout(pnParcelasContasReceberLayout);
        pnParcelasContasReceberLayout.setHorizontalGroup(
            pnParcelasContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnParcelasContasReceberLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(spTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        pnParcelasContasReceberLayout.setVerticalGroup(
            pnParcelasContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnParcelasContasReceberLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(spTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnContasReceberLayout = new javax.swing.GroupLayout(pnContasReceber);
        pnContasReceber.setLayout(pnContasReceberLayout);
        pnContasReceberLayout.setHorizontalGroup(
            pnContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContasReceberLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnParcelasContasReceber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnContasReceberLayout.setVerticalGroup(
            pnContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContasReceberLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnParcelasContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Contas a receber", pnContasReceber);

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

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void txtQuantidadeParcelasContasReceberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeParcelasContasReceberFocusGained
        SelecionarCampo.selecionarTudo(evt);
    }//GEN-LAST:event_txtQuantidadeParcelasContasReceberFocusGained

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            if (!validar()) {
                return;
            }

            //Instanciação do objeto utilizados na classe
            ContasReceberTO contasReceberTO = new ContasReceberTO();
            MovimentoCaixaTO movimentoCaixaTO = new MovimentoCaixaTO();
            ParcelasContasReceberTO parcelasContasReceberTO = new ParcelasContasReceberTO();

            //Inserção dos dados referente as Contas a pagar
            contasReceberTO.setIdContasReceber(0);
            contasReceberTO.setIdVenda(vendaTO.getIdVenda());

            //Cria um novo cliente, dá um nome para eles e recupera os objetos selecionados
            ClienteTO cliente = (ClienteTO) cbClienteContasReceber.getSelectedItem();
            contasReceberTO.setIdCliente(cliente.getIdCliente());

            NumberFormat nf = NumberFormat.getNumberInstance();
            int qtdeParcelas = nf.parse(txtQuantidadeParcelasContasReceber.getText()).intValue();
            contasReceberTO.setQuantidadeParcelasContasReceber(qtdeParcelas);

            contasReceberTO.setValorTotalContasReceber(nf.parse(txtValorTotalContasReceber.getText()).floatValue());

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            contasReceberTO.setDataContasReceber(sdf.parse(txtDataContasReceber.getText()));

            contasReceberTO.setStatusContasReceber(cbStatusContasReceber.getSelectedItem().toString());

            if (idContasReceber == 0) {
                idContasReceber = ContasReceberDAO.inserirRetornandoId(contasReceberTO);
                contasReceberTO.setIdContasReceber(idContasReceber);
            } else {
                ContasReceberDAO.alterar(contasReceberTO);
            }

            for (int numeroParcela = 1; numeroParcela <= qtdeParcelas; numeroParcela++) {
                Date dataConta = sdf.parse(txtDataContasReceber.getText());

                GregorianCalendar gc = new GregorianCalendar();
                gc.setTime(dataConta);
                gc.add(GregorianCalendar.MONTH, numeroParcela);
                dataConta = gc.getTime();

                //Calculo do valor das parcelas
                valor = contasReceberTO.getValorTotalContasReceber() / qtdeParcelas;

                //Tratamento do resto da divisão
                resto = contasReceberTO.getValorTotalContasReceber() % qtdeParcelas;

                if (resto > 0 && numeroParcela == 1) {
                    valor += resto;
                }

                //Inserção dos dados referente as parcelas das contas a pagar
                //parcelasContasPagarTO.setIdParcelasContasPagar(idParcelasContasPagar);
                parcelasContasReceberTO.setIdContasReceber(contasReceberTO.getIdContasReceber());
                parcelasContasReceberTO.setNumeroParcelasContasReceber(numeroParcela);
                parcelasContasReceberTO.setVencimentoParcelasContasReceber(dataConta);
                parcelasContasReceberTO.setStatusParcelasContasReceber(cbStatusContasReceber.getSelectedItem().toString());
                parcelasContasReceberTO.setValorParcelasContasReceber(valor);

                //idParcelasContasPagar = ParcelasContasPagarDAO.inserirRetornandoId(parcelasContasPagarTO);
                //parcelasContasPagarTO.setIdParcelasContasPagar(idParcelasContasPagar);
                ParcelasContasReceberDAO.inserir(parcelasContasReceberTO);
            }

            br.com.ctesop.componentes.JOptionPane.showMessageDialog(this, "Conta a pagar salva com sucesso!");
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
            br.com.ctesop.componentes.JOptionPane.showMessageDialog(this, "Erro ao salvar!\nDados: " + e.getMessage());
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    //Métodos//
    //Método que atualiza a grade das contas a pagar com os valores cadastrados
    private void atualizarGradeContasReceber() {
        try {
            String filtro = txtPesquisarContasReceber.getText();
            List<Class<?>> classes = new ArrayList<>();
            classes.add(ContasReceberTO.class);
            classes.add(ClienteTO.class);
            //classes.add(PessoaTO.class);

            String[] camposSelect = new String[]{"ContasReceber.idContasReceber", "Cliente.idCliente",
                "ContasReceber.dataContasReceber", "ContasReceber.quantidadeParcelasContasReceber",
                "ContasPagar.valorTotalContasReceber", "ContasPagar.statusContasReceber"};
            tb.setDados(ContasReceberDAO.listarUtilizandoComandoInnerJoin(classes, camposSelect, pagina, "nomePessoa", filtro));
            tbGradeContasReceber.setModel(tb);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao atualizar grade");
        }
    }
    
    //Método que atualiza a grade com os valores cadastrados
    private void atualizarGradeParcelasContasReceberr() {
        try {
            List<Class<?>> classes = new ArrayList<>();
            classes.add(ParcelasContasReceberTO.class);

            String[] camposSelect = new String[]{"ParcelasContasReceber.idParcelasContasReceber",
                "ParcelasContasReceber.numeroParcelasContasReceber",
                "ParcelasContasReceber.valorParcelasContasReceber",
                "ParcelasContasReceber.vencimentoParcelasContasReceber",
                "ParcelasContasReceber.statusParcelasContasReceber"};
            tbParcelas.setDados(ParcelasContasReceberDAO.listarUtilizandoComandoInnerJoin(classes, camposSelect, pagina,
                    "parcelasContasReceber.idContasReceber", String.valueOf(idContasReceber)));
            tbGradeParcelasContasReceber.setModel(tbParcelas);
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao atualizar grade");
        }
    }
    
    //Método para carregar o nome dos clientes no ComboBox
    private void carregaCliente() {
        try {
            List<Object> listaCliente = ClienteDAO.listar(ClienteTO.class);
            for (Object e : listaCliente) {
                ClienteTO cliente = (ClienteTO) e;
                PessoaTO pessoa = (PessoaTO) PessoaDAO.get(PessoaTO.class, cliente.getIdPessoa());
                cliente.setNomePessoa(pessoa.getNomePessoa());
                cbClienteContasReceber.addItem(cliente);
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
        if (vendaTO.getValorTotalVenda()> caixaTO.getSaldoCaixa()) {
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
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbClienteContasReceber;
    private javax.swing.JComboBox cbStatusContasReceber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbClienteContasReceber;
    private javax.swing.JLabel lbCodigoContasReceber;
    private javax.swing.JLabel lbDataContasReceber;
    private javax.swing.JLabel lbPesquisarContasReceber;
    private javax.swing.JLabel lbQuantidadeParcelasContasReceber;
    private javax.swing.JLabel lbValorTotalContasReceber;
    private javax.swing.JTabbedPane pnAbas;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnContasReceber;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JPanel pnParcelasContasReceber;
    private javax.swing.JPanel pnPesquisa;
    private javax.swing.JPanel pnPesquisar;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JScrollPane spTabela;
    private javax.swing.JTable tbGradeContasReceber;
    private javax.swing.JTable tbGradeParcelasContasReceber;
    private javax.swing.JTextField txtCodigoContasReceber;
    private javax.swing.JFormattedTextField txtDataContasReceber;
    private javax.swing.JButton txtPesquisar;
    private javax.swing.JTextField txtPesquisarContasReceber;
    private javax.swing.JTextField txtQuantidadeParcelasContasReceber;
    private javax.swing.JTextField txtValorTotalContasReceber;
    // End of variables declaration//GEN-END:variables
}
