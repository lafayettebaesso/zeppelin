package br.com.ctesop.componentes;

import java.text.NumberFormat;
import java.text.ParseException;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class MascaraNumerosDecimais extends PlainDocument {

    private int precisao = 2;

    public MascaraNumerosDecimais() {
    }

    public MascaraNumerosDecimais(int precisao) {
        this.precisao = precisao;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        super.insertString(offs, str, a);
        formatar();
    }

    @Override
    public void remove(int offs, int len) throws BadLocationException {
        super.remove(offs, len);
        formatar();
    }

    private void formatar() throws BadLocationException {
        try {
            String texto = getText(0, getLength());
            if (texto.length() != 0) {
                StringBuilder numeros = new StringBuilder();

                for (char c : texto.toCharArray()) {
                    if (Character.isDigit(c)) {
                        numeros.append(c);
                    }
                }

                if (precisao > 0) {
                    numeros.insert(numeros.length() - precisao, ',');
                }

                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMaximumFractionDigits(precisao);
                nf.setMinimumFractionDigits(precisao);

                texto = nf.format(nf.parse(numeros.toString()));

                super.remove(0, getLength());
                super.insertString(0, texto, null);
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
}
