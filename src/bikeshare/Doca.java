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
public class Doca {

    private static int counter = 0;
    private int docaId;
    private Bike bike;

    public Doca() {
        this.docaId = ++counter;
        this.bike=null;
    }

    public boolean lockBike(Bike bikeToLock) {
        if (bikeToLock != null) {
            if (bikeToLock.isTrancada() != true) {
                bikeToLock.setTrancada(true);
                this.bike=bikeToLock;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public boolean unlockBike(Bike bikeToUnlock) {
        if (bikeToUnlock != null) {
            if (bikeToUnlock.isTrancada() == true) {
                bikeToUnlock.setTrancada(false);
                this.bike=null;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Bike getBike() {
        return bike;
    }
    public boolean isOccupied()
    {
        if(this.bike.isTrancada()==true && this.bike!=null)
        {
            return true;
        }
        else
        {
            return false;
        }
            
    }
    

}
