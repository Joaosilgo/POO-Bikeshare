/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshare;

import java.util.Calendar;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.getInstance;

/**
 *
 * @author João
 */
public class CartaoMultibanco {
     private static int counter = 100;
     private Calendar validade;
    private int MultibancoNumero;

    public CartaoMultibanco() {
        this.MultibancoNumero=counter++;
        validade = getInstance();
        validade.add(Calendar.YEAR , +2);
       
       
    }

    public Calendar getValidade() {
        return validade;
    }

    public int getMultibancoNumero() {
        return MultibancoNumero;
    }
    
    
    
    
    
    
}
