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
public class DocaNormal extends Doca {
    private final DocaDesig desig;

    public DocaNormal() {
         super();
        this.desig = DocaDesig.getNORMAL();
    }
     public void lockBikeNormal(BikeNormal bikeToLock) {
       // if (bikeToLock.getDesig() == BikeDesig.NORMAL) {
            super.lockBike(bikeToLock);
        //    return true;
        //} else {
         //   return false;
       // }

    }
     
    
    
}
