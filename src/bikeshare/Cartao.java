/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshare;

/**
 *
 * @author João
 */

public class Cartao {
    private String s;
     private static int counter = 0;

    private  int cardId;

    public Cartao(String speedfreak) {
        this.cardId = ++counter;
        s=speedfreak;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }
    
    

    
    
    
}
