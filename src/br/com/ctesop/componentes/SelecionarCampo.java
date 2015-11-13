package br.com.ctesop.componentes;

import java.awt.event.FocusEvent;
import javax.swing.JFormattedTextField;

public class SelecionarCampo {

    public static void selecionarTudo(FocusEvent evt){
         if (evt.getComponent() instanceof JFormattedTextField) {
            JFormattedTextField campo = (JFormattedTextField) evt.getComponent();
            campo.selectAll();
        }
    }
}
