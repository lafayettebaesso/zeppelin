package br.com.ctesop.gui;

import java.awt.Point;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import org.jvnet.substance.skin.SubstanceBusinessBlackSteelLookAndFeel;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpArea = new javax.swing.JDesktopPane();
        mbMenu = new javax.swing.JMenuBar();
        meMovimentacao = new javax.swing.JMenu();
        seMovimentacao1 = new javax.swing.JPopupMenu.Separator();
        miDelivery = new javax.swing.JMenuItem();
        miVenda = new javax.swing.JMenuItem();
        miCompra = new javax.swing.JMenuItem();
        seMovimentacao2 = new javax.swing.JPopupMenu.Separator();
        miContasReceber = new javax.swing.JMenuItem();
        miContasPagar = new javax.swing.JMenuItem();
        seMovimentacao3 = new javax.swing.JPopupMenu.Separator();
        miAbrirFecharCaixa = new javax.swing.JMenuItem();
        seMovimentacao4 = new javax.swing.JPopupMenu.Separator();
        meCadastro = new javax.swing.JMenu();
        seCadastro1 = new javax.swing.JPopupMenu.Separator();
        miEstado = new javax.swing.JMenuItem();
        miCidade = new javax.swing.JMenuItem();
        seCadastro2 = new javax.swing.JPopupMenu.Separator();
        miCliente = new javax.swing.JMenuItem();
        miFornecedor = new javax.swing.JMenuItem();
        miFuncionario = new javax.swing.JMenuItem();
        seCadastro3 = new javax.swing.JPopupMenu.Separator();
        miGrupoProduto = new javax.swing.JMenuItem();
        miProduto = new javax.swing.JMenuItem();
        miIngrediente = new javax.swing.JMenuItem();
        seCadastro4 = new javax.swing.JPopupMenu.Separator();
        meRelatório = new javax.swing.JMenu();
        seRelatorio1 = new javax.swing.JPopupMenu.Separator();
        miRelatorioCliente = new javax.swing.JMenuItem();
        miRelatorioFornecedor = new javax.swing.JMenuItem();
        miRelatorioFuncionario = new javax.swing.JMenuItem();
        seRelatorio2 = new javax.swing.JPopupMenu.Separator();
        miRelatorioCompra = new javax.swing.JMenuItem();
        miRelatorioContasPagar = new javax.swing.JMenuItem();
        seRelatorio3 = new javax.swing.JPopupMenu.Separator();
        miRelatorioVenda = new javax.swing.JMenuItem();
        miRelatorioContasReceber = new javax.swing.JMenuItem();
        seRelatorio4 = new javax.swing.JPopupMenu.Separator();
        miRelatorioCaixa = new javax.swing.JMenuItem();
        seRelatorio5 = new javax.swing.JPopupMenu.Separator();
        meSistema = new javax.swing.JMenu();
        seSistema1 = new javax.swing.JPopupMenu.Separator();
        miSobre = new javax.swing.JMenuItem();
        seSistema2 = new javax.swing.JPopupMenu.Separator();
        miSair = new javax.swing.JMenuItem();
        seSistema3 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("zeppelin - Sistema de gerenciamento de restaurante");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().add(dpArea, java.awt.BorderLayout.CENTER);

        mbMenu.setMaximumSize(new java.awt.Dimension(136, 32769));
        mbMenu.setPreferredSize(new java.awt.Dimension(136, 21));

        meMovimentacao.setText("Movimentação");
        meMovimentacao.add(seMovimentacao1);

        miDelivery.setText("Delivery");
        miDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDeliveryActionPerformed(evt);
            }
        });
        meMovimentacao.add(miDelivery);

        miVenda.setText("Venda");
        miVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaActionPerformed(evt);
            }
        });
        meMovimentacao.add(miVenda);

        miCompra.setText("Compra");
        miCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCompraActionPerformed(evt);
            }
        });
        meMovimentacao.add(miCompra);
        meMovimentacao.add(seMovimentacao2);

        miContasReceber.setText("Contas a receber");
        miContasReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miContasReceberActionPerformed(evt);
            }
        });
        meMovimentacao.add(miContasReceber);

        miContasPagar.setText("Contas a pagar");
        miContasPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miContasPagarActionPerformed(evt);
            }
        });
        meMovimentacao.add(miContasPagar);
        meMovimentacao.add(seMovimentacao3);

        miAbrirFecharCaixa.setText("Abrir/Fechar o caixa");
        miAbrirFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAbrirFecharCaixaActionPerformed(evt);
            }
        });
        meMovimentacao.add(miAbrirFecharCaixa);
        meMovimentacao.add(seMovimentacao4);

        mbMenu.add(meMovimentacao);

        meCadastro.setText("Cadastro");
        meCadastro.add(seCadastro1);

        miEstado.setText("Estado");
        miEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEstadoActionPerformed(evt);
            }
        });
        meCadastro.add(miEstado);

        miCidade.setText("Cidade");
        miCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCidadeActionPerformed(evt);
            }
        });
        meCadastro.add(miCidade);
        meCadastro.add(seCadastro2);

        miCliente.setText("Cliente");
        miCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        meCadastro.add(miCliente);

        miFornecedor.setText("Fornecedor");
        miFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFornecedorActionPerformed(evt);
            }
        });
        meCadastro.add(miFornecedor);

        miFuncionario.setText("Funcionário");
        miFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFuncionarioActionPerformed(evt);
            }
        });
        meCadastro.add(miFuncionario);
        meCadastro.add(seCadastro3);

        miGrupoProduto.setText("Grupo de produto");
        miGrupoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGrupoProdutoActionPerformed(evt);
            }
        });
        meCadastro.add(miGrupoProduto);

        miProduto.setText("Produto");
        miProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProdutoActionPerformed(evt);
            }
        });
        meCadastro.add(miProduto);

        miIngrediente.setText("Ingrediente");
        miIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miIngredienteActionPerformed(evt);
            }
        });
        meCadastro.add(miIngrediente);
        meCadastro.add(seCadastro4);

        mbMenu.add(meCadastro);

        meRelatório.setText("Relatórios");
        meRelatório.add(seRelatorio1);

        miRelatorioCliente.setText("Cliente");
        meRelatório.add(miRelatorioCliente);

        miRelatorioFornecedor.setText("Fornecedor");
        meRelatório.add(miRelatorioFornecedor);

        miRelatorioFuncionario.setText("Funcionário");
        meRelatório.add(miRelatorioFuncionario);
        meRelatório.add(seRelatorio2);

        miRelatorioCompra.setText("Compra");
        meRelatório.add(miRelatorioCompra);

        miRelatorioContasPagar.setText("Contas a pagar");
        meRelatório.add(miRelatorioContasPagar);
        meRelatório.add(seRelatorio3);

        miRelatorioVenda.setText("Venda");
        meRelatório.add(miRelatorioVenda);

        miRelatorioContasReceber.setText("Contas a receber");
        meRelatório.add(miRelatorioContasReceber);
        meRelatório.add(seRelatorio4);

        miRelatorioCaixa.setText("Caixa");
        meRelatório.add(miRelatorioCaixa);
        meRelatório.add(seRelatorio5);

        mbMenu.add(meRelatório);

        meSistema.setText("Sistema");
        meSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meSistemaActionPerformed(evt);
            }
        });
        meSistema.add(seSistema1);

        miSobre.setText("Sobre");
        meSistema.add(miSobre);
        meSistema.add(seSistema2);

        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        meSistema.add(miSair);
        meSistema.add(seSistema3);

        mbMenu.add(meSistema);

        setJMenuBar(mbMenu);

        setSize(new java.awt.Dimension(410, 330));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEstadoActionPerformed
        EstadoGUI p = new EstadoGUI();
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miEstadoActionPerformed

    private void miCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCidadeActionPerformed
        CidadeGUI p = new CidadeGUI();
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miCidadeActionPerformed

    private void miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClienteActionPerformed
        ClienteGUI p = new ClienteGUI();
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miClienteActionPerformed

    private void miAbrirFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAbrirFecharCaixaActionPerformed
        CaixaGUI p = new CaixaGUI();
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miAbrirFecharCaixaActionPerformed

    private void miFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFuncionarioActionPerformed
        FuncionarioGUI p = new FuncionarioGUI();
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miFuncionarioActionPerformed

    private void miFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFornecedorActionPerformed
        FornecedorGUI p = new FornecedorGUI();
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miFornecedorActionPerformed

    private void miDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDeliveryActionPerformed
        /* No construtor o dpArea ("... new DeliveryGUI(dpArea);" foi passado como um
         * parâmetro para que outros JInternalFrame fosse aberto dentro do DeliveryGUI */
        DeliveryGUI p = new DeliveryGUI(dpArea);
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miDeliveryActionPerformed

    private void miVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendaActionPerformed
        /* No construtor o dpArea ("... new VendaGUI(dpArea);" foi passado como um
         * parâmetro para que outros JInternalFrame fosse aberto dentro do VendaGUI */
        VendaGUI p = new VendaGUI(dpArea);
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miVendaActionPerformed

    private void miContasReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miContasReceberActionPerformed
        /* No construtor o dpArea ("... new ContasReceberGUI(dpArea);" foi passado como um
         * parâmetro para que outros JInternalFrame fosse aberto dentro do DeliveryGUI */
        ContasReceberGUI p = new ContasReceberGUI(dpArea);
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miContasReceberActionPerformed

    private void miContasPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miContasPagarActionPerformed
        /* No construtor o dpArea ("... new ContasPagarGUI(dpArea);" foi passado como um
         * parâmetro para que outros JInternalFrame fosse aberto dentro do DeliveryGUI */
        ContasPagarGUI p = new ContasPagarGUI(dpArea);
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miContasPagarActionPerformed

    private void miCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCompraActionPerformed
        /* No construtor o dpArea ("... new ContasReceberGUI(dpArea);" foi passado como um
         * parâmetro para que outros JInternalFrame fosse aberto dentro do DeliveryGUI */
        CompraGUI p = new CompraGUI(dpArea);
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miCompraActionPerformed

    private void miProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miProdutoActionPerformed
        ProdutoGUI p = new ProdutoGUI();
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miProdutoActionPerformed

    private void miGrupoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGrupoProdutoActionPerformed
        GrupoProdutoGUI p = new GrupoProdutoGUI();
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miGrupoProdutoActionPerformed

    private void miIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miIngredienteActionPerformed
        IngredienteGUI p = new IngredienteGUI();
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miIngredienteActionPerformed

    private void meSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meSistemaActionPerformed
        
    }//GEN-LAST:event_meSistemaActionPerformed

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSairActionPerformed

    public static void main(String args[]) {
        /* Definição do Look and Feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("GTK+".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

        try {
            UIManager.setLookAndFeel(new SubstanceBusinessBlackSteelLookAndFeel());
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e) {
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpArea;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenu meCadastro;
    private javax.swing.JMenu meMovimentacao;
    private javax.swing.JMenu meRelatório;
    private javax.swing.JMenu meSistema;
    private javax.swing.JMenuItem miAbrirFecharCaixa;
    private javax.swing.JMenuItem miCidade;
    private javax.swing.JMenuItem miCliente;
    private javax.swing.JMenuItem miCompra;
    private javax.swing.JMenuItem miContasPagar;
    private javax.swing.JMenuItem miContasReceber;
    private javax.swing.JMenuItem miDelivery;
    private javax.swing.JMenuItem miEstado;
    private javax.swing.JMenuItem miFornecedor;
    private javax.swing.JMenuItem miFuncionario;
    private javax.swing.JMenuItem miGrupoProduto;
    private javax.swing.JMenuItem miIngrediente;
    private javax.swing.JMenuItem miProduto;
    private javax.swing.JMenuItem miRelatorioCaixa;
    private javax.swing.JMenuItem miRelatorioCliente;
    private javax.swing.JMenuItem miRelatorioCompra;
    private javax.swing.JMenuItem miRelatorioContasPagar;
    private javax.swing.JMenuItem miRelatorioContasReceber;
    private javax.swing.JMenuItem miRelatorioFornecedor;
    private javax.swing.JMenuItem miRelatorioFuncionario;
    private javax.swing.JMenuItem miRelatorioVenda;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JMenuItem miVenda;
    private javax.swing.JPopupMenu.Separator seCadastro1;
    private javax.swing.JPopupMenu.Separator seCadastro2;
    private javax.swing.JPopupMenu.Separator seCadastro3;
    private javax.swing.JPopupMenu.Separator seCadastro4;
    private javax.swing.JPopupMenu.Separator seMovimentacao1;
    private javax.swing.JPopupMenu.Separator seMovimentacao2;
    private javax.swing.JPopupMenu.Separator seMovimentacao3;
    private javax.swing.JPopupMenu.Separator seMovimentacao4;
    private javax.swing.JPopupMenu.Separator seRelatorio1;
    private javax.swing.JPopupMenu.Separator seRelatorio2;
    private javax.swing.JPopupMenu.Separator seRelatorio3;
    private javax.swing.JPopupMenu.Separator seRelatorio4;
    private javax.swing.JPopupMenu.Separator seRelatorio5;
    private javax.swing.JPopupMenu.Separator seSistema1;
    private javax.swing.JPopupMenu.Separator seSistema2;
    private javax.swing.JPopupMenu.Separator seSistema3;
    // End of variables declaration//GEN-END:variables

    private Point calculaLocal(JDesktopPane dpArea, JInternalFrame p) {
        return new Point(((dpArea.getWidth() - p.getWidth()) / 2), ((dpArea.getHeight() - p.getHeight()) / 2));
    }
}
