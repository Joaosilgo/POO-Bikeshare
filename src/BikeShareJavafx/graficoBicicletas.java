/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BikeShareJavafx;

import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author João
 */

    public class graficoBicicletas extends StackPane {

    private int numeroElectrico;
    private int numeroNormal;

    public graficoBicicletas(int numeroBikesElectricas, int numeroBikesNormal) {
        this.numeroElectrico = numeroBikesElectricas;
        this.numeroNormal = numeroBikesNormal;

        PieChart chart = new PieChart();

        PieChart.Data bikeElectrica = new PieChart.Data("", numeroElectrico);
        PieChart.Data bikeNormal = new PieChart.Data("", numeroNormal);

        chart.getData().add(bikeElectrica);
        chart.getData().add(bikeNormal);

        chart.setScaleX(0.19);
        chart.setScaleY(0.19);
        chart.setLegendVisible(true);

        VBox vbox = new VBox();
        vbox.getChildren().add(chart);

        this.getChildren().addAll(vbox);
    }

    public StackPane getVBox() {
        return this;
    }
}
    

