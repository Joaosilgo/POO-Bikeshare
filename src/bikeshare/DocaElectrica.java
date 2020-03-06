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
public class DocaElectrica extends Doca {
    
    private final DocaDesig desig;
    
    
    public DocaElectrica() {
        super();
        this.desig = DocaDesig.getELECTRICA();
    }
    
    public void lockBikeElectrica(BikeElectrica bikeToLock) {
        // if (bikeToLock.getDesig() == BikeDesig.ELECTRICA) {
        super.lockBike(bikeToLock);
        //    return true;
        //} else {
        //   return false;
        //}

    }

    public boolean chargeBikeElectrica(BikeElectrica bikeToLock) {
        if (bikeToLock.isTrancada() == true) {
            if (bikeToLock.isaCarregar() == false) {                
                if (super.getBike().getBikeId() == bikeToLock.getBikeId()) // if(super.getBike().equals(bikeToLock))
                {
                    bikeToLock.setaCarregar(true);
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
}
