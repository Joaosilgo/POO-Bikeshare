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
public enum BikeDesig {

    ELECTRICA, NORMAL;

    public static BikeDesig getELECTRICA() {
        return ELECTRICA;
    }

    public static BikeDesig getNORMAL() {
        return NORMAL;
    }

    @Override
    public String toString() {
        String inf;

        switch (this) {
            case ELECTRICA:
                inf = "ELECTRICA";

                break;
            case NORMAL:
                inf = "NORMAL";
                break;
            default:
                inf = "";
                break;
        }
            return inf;
    }
}
