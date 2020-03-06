/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshare;

import java.util.*;

/**
 *
 * @author João
 */
public class Station {

    private ArrayList<Terminal> stationTerminais;//perguntar ao prof se é array ou pode ser arrayList
    private ArrayList<DocaNormal> stationDocasNormal;
    private ArrayList<DocaElectrica> stationDocasElectricas;
    private ArrayList<Doca> stationDocas;
    private ArrayList<BikeNormal> stationBikesNormais;
    private ArrayList<BikeElectrica> stationBikesElectricas;

    private final String stationName;

    public Station(String name) {
        this.stationName = validateString(name);
        stationTerminais = new ArrayList<>();
        stationDocasNormal = new ArrayList<>();
        stationDocasElectricas = new ArrayList<>();
        stationDocas = new ArrayList<>();
        stationBikesNormais = new ArrayList<>();
        stationBikesElectricas = new ArrayList<>();
        populate();
        
                
    }

    private String validateString(String string) {
        if (string == null) {
            return "";
        } else {
            return string;
        }
    }

    private void populate() {

        // Terminais
        Terminal terminal1 = new Terminal();
        Terminal terminal2 = new Terminal();
        Terminal terminal3 = new Terminal();
        Terminal terminal4 = new Terminal();
        Terminal terminal5 = new Terminal();
        Terminal terminal6 = new Terminal();
        stationTerminais.add(terminal1);
        stationTerminais.add(terminal2);
        stationTerminais.add(terminal3);
        stationTerminais.add(terminal4);
        stationTerminais.add(terminal5);
        stationTerminais.add(terminal6);
        //Bike Normais
        BikeNormal bike1 = new BikeNormal();
        BikeNormal bike2 = new BikeNormal();
        BikeNormal bike3 = new BikeNormal();
        BikeNormal bike4 = new BikeNormal();
        BikeNormal bike5 = new BikeNormal();
        BikeNormal bike6 = new BikeNormal();
        stationBikesNormais.add(bike1);
        stationBikesNormais.add(bike2);
        stationBikesNormais.add(bike3);
        stationBikesNormais.add(bike4);
        stationBikesNormais.add(bike5);
        stationBikesNormais.add(bike6);

        //Bike Electricas
        BikeElectrica bike7 = new BikeElectrica();
        BikeElectrica bike8 = new BikeElectrica();
        BikeElectrica bike9 = new BikeElectrica();
        BikeElectrica bike10 = new BikeElectrica();
        stationBikesElectricas.add(bike7);
        stationBikesElectricas.add(bike8);
        stationBikesElectricas.add(bike9);
        stationBikesElectricas.add(bike10);

        DocaNormal doca1 = new DocaNormal();
        DocaNormal doca2 = new DocaNormal();
        DocaNormal doca3 = new DocaNormal();
        DocaNormal doca4 = new DocaNormal();
        DocaNormal doca5 = new DocaNormal();
        DocaNormal doca6 = new DocaNormal();
        DocaNormal doca7 = new DocaNormal();
        DocaNormal doca8 = new DocaNormal();
        stationDocasNormal.add(doca1);
        stationDocasNormal.add(doca2);
        stationDocasNormal.add(doca3);
        stationDocasNormal.add(doca4);
        stationDocasNormal.add(doca5);
        stationDocasNormal.add(doca6);
        stationDocasNormal.add(doca7);
        stationDocasNormal.add(doca8);

        DocaElectrica doca10 = new DocaElectrica();
        DocaElectrica doca11 = new DocaElectrica();
        DocaElectrica doca12 = new DocaElectrica();
        DocaElectrica doca13 = new DocaElectrica();
        DocaElectrica doca14 = new DocaElectrica();
        stationDocasElectricas.add(doca10);
        stationDocasElectricas.add(doca11);
        stationDocasElectricas.add(doca12);
        stationDocasElectricas.add(doca13);
        stationDocasElectricas.add(doca14);
        //
/**
 * 
 
        // adicionar todas as docas electricas
        /////
        stationDocasElectricas.forEach((item) -> {
            stationDocas.add(item);
        });
        ///////
        stationDocasNormal.forEach((item) -> {
            stationDocas.add(item);
        });
        /////
        putAllBikesElectricasInDock();
        putAllBikesNormaisInDock();
*/
    }

    private void putAllBikesElectricasInDock() {
        stationBikesElectricas.forEach((i) -> {
            stationDocasElectricas.stream().filter((item) -> (item.isOccupied() == false)).forEachOrdered((item) -> {
                item.lockBikeElectrica(i);
            });
        });

    }

    private void putAllBikesNormaisInDock() {
        stationBikesNormais.forEach((i) -> {
            stationDocasNormal.stream().filter((item) -> (item.isOccupied() == false)).forEachOrdered((item) -> {
                item.lockBikeNormal(i);
            });
        });

    }

    public String getStationName() {
        return stationName;
    }

    public BikeNormal getAvailableBikeNormal() {
        for (int i = 0; i < stationBikesNormais.size(); i++) {
            if (stationBikesNormais.get(i) != null) {
                return stationBikesNormais.get(i);
            }
        }
        return null;
    }

    public BikeElectrica getAvailableBikeElectrica() {

        for (int i = 0; i < stationBikesElectricas.size(); i++) {
            if (stationBikesElectricas.get(i) != null) {
                return stationBikesElectricas.get(i);

            }
        }
        return null;
    }
    public int countBikesElectricas()
    {
        int count=0;
        for (int i = 0; i < stationBikesElectricas.size(); i++) {
            if (stationBikesElectricas.get(i) != null) {
                count++;
            }
            }
        return count;
    }
    
     public int countBikesNormais()
    {
        int count=0;
        for (int i = 0; i < stationBikesNormais.size(); i++) {
            if (stationBikesNormais.get(i) != null) {
                count++;
                
            }
            
            }
        return count;
    }
}

