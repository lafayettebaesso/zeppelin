package br.com.ctesop.gui;

import java.awt.Point;
import java.beans.PropertyVetoException;
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
        meAtendimento = new javax.swing.JMenu();
        miDelivery = new javax.swing.JMenuItem();
        meFinanceiro = new javax.swing.JMenu();
        miContasReceber = new javax.swing.JMenuItem();
        miContasPagar = new javax.swing.JMenuItem();
        seFinanceiro1 = new javax.swing.JPopupMenu.Separator();
        miAbrirFecharCaixa = new javax.swing.JMenuItem();
        seFinanceiro2 = new javax.swing.JPopupMenu.Separator();
        meCadastro = new javax.swing.JMenu();
        miEstado = new javax.swing.JMenuItem();
        miCidade = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        seCadastro1 = new javax.swing.JPopupMenu.Separator();
        miCliente = new javax.swing.JMenuItem();
        miFornecedor = new javax.swing.JMenuItem();
        miFuncionario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        seCadastro2 = new javax.swing.JPopupMenu.Separator();
        miUsuario = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        seCadastro3 = new javax.swing.JPopupMenu.Separator();
        meCozinha = new javax.swing.JMenu();
        miReceita = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("zeppelin - Sistema de gerenciamento de restaurante");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().add(dpArea, java.awt.BorderLayout.CENTER);

        mbMenu.setMaximumSize(new java.awt.Dimension(136, 32769));
        mbMenu.setPreferredSize(new java.awt.Dimension(136, 21));

        meAtendimento.setText("Atendimento");

        miDelivery.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
        miDelivery.setText("Delivery");
        miDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDeliveryActionPerformed(evt);
            }
        });
        meAtendimento.add(miDelivery);

        mbMenu.add(meAtendimento);

        meFinanceiro.setText("Financeiro");

        miContasReceber.setText("Contas a receber");
        meFinanceiro.add(miContasReceber);

        miContasPagar.setText("Contas a pagar");
        meFinanceiro.add(miContasPagar);
        meFinanceiro.add(seFinanceiro1);

        miAbrirFecharCaixa.setText("Abrir/Fechar o caixa");
        miAbrirFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAbrirFecharCaixaActionPerformed(evt);
            }
        });
        meFinanceiro.add(miAbrirFecharCaixa);
        meFinanceiro.add(seFinanceiro2);

        mbMenu.add(meFinanceiro);

        meCadastro.setText("Cadastro");

        miEstado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        miEstado.setText("Estado");
        miEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEstadoActionPerformed(evt);
            }
        });
        meCadastro.add(miEstado);

        miCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK));
        miCidade.setText("Cidade");
        miCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCidadeActionPerformed(evt);
            }
        });
        meCadastro.add(miCidade);
        meCadastro.add(jSeparator1);
        meCadastro.add(seCadastro1);

        miCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        miCliente.setText("Cliente");
        miCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        meCadastro.add(miCliente);

        miFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK));
        miFornecedor.setText("Fornecedor");
        miFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFornecedorActionPerformed(evt);
            }
        });
        meCadastro.add(miFornecedor);

        miFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK));
        miFuncionario.setText("Funcionário");
        miFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFuncionarioActionPerformed(evt);
            }
        });
        meCadastro.add(miFuncionario);
        meCadastro.add(jSeparator2);
        meCadastro.add(seCadastro2);

        miUsuario.setText("Usuário");
        miUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUsuarioActionPerformed(evt);
            }
        });
        meCadastro.add(miUsuario);
        meCadastro.add(jSeparator3);
        meCadastro.add(seCadastro3);

        mbMenu.add(meCadastro);

        meCozinha.setText("Cozinha");

        miReceita.setText("Receita");
        miReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReceitaActionPerformed(evt);
            }
        });
        meCozinha.add(miReceita);

        mbMenu.add(meCozinha);

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

    private void miUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUsuarioActionPerformed
        UsuarioGUI p = new UsuarioGUI();
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miUsuarioActionPerformed

    private void miReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReceitaActionPerformed
        ReceitaGUI p = new ReceitaGUI();
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miReceitaActionPerformed

    private void miDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDeliveryActionPerformed
        /* No construtor o dpArea ("... new DeliveryGUI(dpArea);" foi passado como um
         * parâmetro para que outros JInternalFrame fosse aberto dentro do DeliveryGUI */
        DeliveryGUI p = new DeliveryGUI(dpArea);
        dpArea.add(p);
        p.setLocation(calculaLocal(dpArea, p));
        p.setVisible(true);
    }//GEN-LAST:event_miDeliveryActionPerformed

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
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenu meAtendimento;
    private javax.swing.JMenu meCadastro;
    private javax.swing.JMenu meCozinha;
    private javax.swing.JMenu meFinanceiro;
    private javax.swing.JMenuItem miAbrirFecharCaixa;
    private javax.swing.JMenuItem miCidade;
    private javax.swing.JMenuItem miCliente;
    private javax.swing.JMenuItem miContasPagar;
    private javax.swing.JMenuItem miContasReceber;
    private javax.swing.JMenuItem miDelivery;
    private javax.swing.JMenuItem miEstado;
    private javax.swing.JMenuItem miFornecedor;
    private javax.swing.JMenuItem miFuncionario;
    private javax.swing.JMenuItem miReceita;
    private javax.swing.JMenuItem miUsuario;
    private javax.swing.JPopupMenu.Separator seCadastro1;
    private javax.swing.JPopupMenu.Separator seCadastro2;
    private javax.swing.JPopupMenu.Separator seCadastro3;
    private javax.swing.JPopupMenu.Separator seFinanceiro1;
    private javax.swing.JPopupMenu.Separator seFinanceiro2;
    // End of variables declaration//GEN-END:variables

    private Point calculaLocal(JDesktopPane dpArea, JInternalFrame p) {
        return new Point(((dpArea.getWidth() - p.getWidth()) / 2), ((dpArea.getHeight() - p.getHeight()) / 2));
    }
}
