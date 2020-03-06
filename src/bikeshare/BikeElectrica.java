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
public class BikeElectrica extends Bike {
    private  BikeDesig desig;
    private boolean aCarregar;

    public BikeElectrica() {
        super();
        this.desig = BikeDesig.getELECTRICA();
        this.aCarregar=false;
    }
     @Override
    public String toString() {
        return super.toString()+"BikeElectrica{" + "desig=" + desig.toString() + '}';
    }

    public BikeDesig getDesig() {
        return desig;
    }

    public boolean isaCarregar() {
        return aCarregar;
    }

    public void setaCarregar(boolean aCarregar) {
        this.aCarregar = aCarregar;
    }
    
    
    

    
    
    
    
}
