package br.com.ctesop.gui;

import br.com.ctesop.componentes.JOptionPane;
import br.com.ctesop.dao.CidadeDAO;
import br.com.ctesop.dao.EstadoDAO;
import br.com.ctesop.gui.tablemodel.CidadeTableModel;
import br.com.ctesop.to.CidadeTO;
import br.com.ctesop.to.EstadoTO;
import java.util.List;

public class CidadeGUI extends javax.swing.JInternalFrame {

    int pagina = 0;

    //Criação do formulário CidadeGUIIIIIIIIIIII
    public CidadeGUI() {
        initComponents();
        carregaEstados(); //Método que carrega as siglas no ComboBox "Estado"
        habilitarForm(false); //O formulário abre desabilidade, por padrão
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
        lbPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        spGrade = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();
        pnFormulario = new javax.swing.JPanel();
        lbCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lbNomeCidade = new javax.swing.JLabel();
        txtNomeCidade = new javax.swing.JTextField();
        lbEstado = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox();
        lbStatus = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cidade");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(spGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        pnPesquisaLayout.setVerticalGroup(
            pnPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPesquisaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(spGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pnAbas.addTab("Pesquisar", pnPesquisa);

        pnFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulário"));

        lbCodigo.setText("Código:");

        txtCodigo.setEditable(false);

        lbNomeCidade.setText("Nome da cidade:");

        lbEstado.setText("Estado:");

        lbStatus.setText("Status:");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));

        javax.swing.GroupLayout pnFormularioLayout = new javax.swing.GroupLayout(pnFormulario);
        pnFormulario.setLayout(pnFormularioLayout);
        pnFormularioLayout.setHorizontalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCodigo)
                    .addComponent(lbNomeCidade)
                    .addComponent(lbStatus)
                    .addComponent(lbEstado))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCidade)
                    .addGroup(pnFormularioLayout.createSequentialGroup()
                        .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 313, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnFormularioLayout.setVerticalGroup(
            pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormularioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeCidade)
                    .addComponent(txtNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstado)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStatus)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(pnAbas, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE))
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

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        //Quando clicar em "Novo" habilita o formulário e seta um valor para o código
        habilitarForm(true);
        txtCodigo.setText("0");
    }

    //Ações para quando clicar no botão "Novo"   
    private void habilitarForm(boolean habilitar) {
        txtCodigo.setEnabled(habilitar);
        txtNomeCidade.setEnabled(habilitar);
        cbEstado.setEnabled(habilitar);
        cbStatus.setEnabled(habilitar);

        btNovo.setEnabled(!habilitar);
        btSalvar.setEnabled(habilitar);
        btCancelar.setEnabled(habilitar);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        atualizarGrade();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limparForm();
        habilitarForm(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        //Ações para quando clicar no botão "Salvar"                               
        try {

            if (!validar()) {
                return;
            }

            CidadeTO cidadeTO = new CidadeTO();
            //Cria um novo estado, dá um nome para ele e recupera o objeto Estado selecionado
            EstadoTO estado = (EstadoTO) cbEstado.getSelectedItem();

            cidadeTO.setIdCidade(Integer.parseInt(txtCodigo.getText()));
            cidadeTO.setNomeCidade(txtNomeCidade.getText());
            cidadeTO.setIdEstado(estado.getIdEstado());
            cidadeTO.setStatusCidade(cbStatus.getSelectedItem().toString());

            if (cidadeTO.getIdCidade() == 0) {
                CidadeDAO.inserir(cidadeTO);
            } else {
                CidadeDAO.alterar(cidadeTO);
            }

            JOptionPane.showMessageDialog(this, "Cidade cadastrado com sucesso!");

            atualizarGrade();
            limparForm();
            habilitarForm(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar!\nDados: " + e.getMessage());
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tbGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeMouseClicked
        /* Código para carregar as informações da grade para o formulário
         Quando o usuário der dois cliques no Cidade o mesmo é carregado no formulário */
        if (evt.getClickCount() == 2) {
            CidadeTableModel tm = (CidadeTableModel) tbGrade.getModel();
            CidadeTO cidade = tm.get(tbGrade.getSelectedRow());

            txtCodigo.setText(String.valueOf(cidade.getIdCidade()));
            txtNomeCidade.setText(cidade.getNomeCidade());
            //Preencher também o campo "Sigla do estado"
            try {
                EstadoTO estado = (EstadoTO) EstadoDAO.get(EstadoTO.class, cidade.getIdEstado());
                cbEstado.setSelectedItem(estado);
            } catch (Exception ex) {
            }
            cbStatus.setSelectedItem(cidade.getStatusCidade());

            habilitarForm(true);
        }
    }//GEN-LAST:event_tbGradeMouseClicked

    //Ações para quando clicar no botão "Cancelar"
    private void limparForm() {
        txtCodigo.setText("");
        txtNomeCidade.setText("");
    }

    private void atualizarGrade() {
        try {
            String filtro = txtPesquisar.getText();

            CidadeTableModel tb = new CidadeTableModel();
            tb.setDados((List<CidadeTO>) (Object) EstadoDAO.listar(CidadeTO.class, pagina, "nomeCidade", filtro));
            tbGrade.setModel(tb);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar grade");
        }
    }

    //Método de validação do TextField
    private boolean validar() throws Exception {
        //Validação do "Nome da cidade"
        if (txtNomeCidade.getText().trim().length() < 2 || txtNomeCidade.getText().trim().length() > 90) {
            JOptionPane.showMessageDialog(this, "Nome da cidade inválido.", "Alerta", javax.swing.JOptionPane.WARNING_MESSAGE);
            txtNomeCidade.requestFocus();
            return false;
        }

        //Para verificar se o "Nome da cidade" já está cadastrado
        if (CidadeDAO.verificaNomeExiste(txtNomeCidade.getText().trim())) {
            javax.swing.JOptionPane.showMessageDialog(this, "Nome da cidade já cadastrado.", "Alerta", javax.swing.JOptionPane.WARNING_MESSAGE);
            txtNomeCidade.requestFocus();
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JComboBox cbStatus;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbNomeCidade;
    private javax.swing.JLabel lbPesquisar;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JTabbedPane pnAbas;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnFormulario;
    private javax.swing.JPanel pnPesquisa;
    private javax.swing.JPanel pnPesquisar;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNomeCidade;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

    //Para carregar a "Sigla do estado" no formulário Cidade
    private void carregaEstados() {
        try {
            List<Object> listaEstado =  EstadoDAO.listar(EstadoTO.class);
            for (Object e :  listaEstado) {
                cbEstado.addItem((EstadoTO)e);
            }
        } catch (Exception ex) {
            //Para as mensagens de erro. Esta puxando do pacote "br.com.ctesop.componentes" da classe "JOptionPane"
            JOptionPane.showWarningDialog(this, "Ocorreu um erro ao listar as cidades.");
        }
    }
}