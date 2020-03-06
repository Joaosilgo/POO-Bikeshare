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
public class BikeNormal extends Bike {

    private final BikeDesig desig;

    public BikeNormal() {
        super();
        this.desig = BikeDesig.getNORMAL();

    }

    public BikeDesig getDesig() {
        return desig;
    }
    

    @Override
    public String toString() {
        return super.toString()+"BikeNormal{" + "desig=" + desig.toString() + '}';
    }

}
