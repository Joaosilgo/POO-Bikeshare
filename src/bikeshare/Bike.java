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
public class Bike {
    
     private static int counter = 0;
     private int bikeId;
     private boolean trancada;

    public Bike() {
        this.bikeId = ++counter;
        this.trancada=false;
    }

    public void setTrancada(boolean trancada) {
        this.trancada = trancada;
    }

    public int getBikeId() {
        return bikeId;
    }

    public boolean isTrancada() {
        return trancada;
    }

    @Override
    public String toString() {
        return "Bike{\n" + "\n bikeId=" + bikeId + ",\n trancada=" + trancada + "\n";
    }
    
    
     
    
}
