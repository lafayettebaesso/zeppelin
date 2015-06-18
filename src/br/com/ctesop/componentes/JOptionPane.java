package br.com.ctesop.componentes;

import java.awt.Component;

public class JOptionPane extends javax.swing.JOptionPane {

    public static void showWarningDialog(Component componente, Object mensagem) {
        JOptionPane.showMessageDialog(componente, mensagem, "Alerta", JOptionPane.WARNING_MESSAGE);

    }

}
