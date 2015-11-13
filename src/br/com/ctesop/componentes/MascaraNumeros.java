package br.com.ctesop.componentes;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class MascaraNumeros extends PlainDocument {

    private int quantidadeMaxima;

    public MascaraNumeros(int maxLen) {
        super();
        if (maxLen <= 0) {
            throw new IllegalArgumentException("Especifique a quantidade de digitos");
        }
        quantidadeMaxima = maxLen;
    }
    
    @Override
    public void insertString(int offset, String str, AttributeSet attr)
        throws BadLocationException {
        if(str==null||getLength()==quantidadeMaxima)
            return;
        int totalquantia=(getLength()+str.length());
        if(totalquantia<=quantidadeMaxima) {
            super.insertString(offset, str.toUpperCase().replaceAll("[^0-9]", ""), attr);
            return;
        }
        
        String nova = str.substring(0,getLength()-quantidadeMaxima);
        super.insertString(offset, nova, attr);
        
    }

}
