/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BikeShareJavafx;

import bikeshare.Manager;
import bikeshare.Utilizador;
import javafx.event.ActionEvent;
import static javafx.geometry.Pos.CENTER;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author João
 */
public class janelaAnuidadeEscolher extends StackPane {

    private Label choise;
    private Manager manager;
    private Button  cancel, normal, empresas, jovens, normalElectrica, empresasElectrica, jovensElectrica;

    public janelaAnuidadeEscolher(Utilizador user,Manager manager) {
        this.manager = manager;

        Image i = new Image(getClass().getResourceAsStream("bikeShareLogo.png"));
        ImageView img = new ImageView(i);
        img.setFitHeight(720);
        img.setFitWidth(360);

        choise = new Label("PAGAMENTO DE ANUIDADE");
      //  ok = new Button("OK");
        cancel = new Button("CANCEL");
        normal = new Button("NORMAL 29.00€");
        empresas = new Button("EMPRESAS 20.00€");
        jovens = new Button("JOVENS(18-24)");
        normalElectrica = new Button("NORMAL ELECTRICA 59.00€ ");
        empresasElectrica = new Button("EMPRESAS ELECTRICA 39.00€ ");
        jovensElectrica = new Button("JOVEM ELECTRICA 31.00€ ");

        //action
     //   ok.setOnAction(
             //   (ActionEvent event) -> {
                    // ok.getScene().setRoot();
              //  });
        cancel.setOnAction(
                (ActionEvent event) -> {
                    Window window = getScene().getWindow();
                    if (window instanceof Stage) {
                        ((Stage) window).close();
                    }
                });
        normal.setOnAction(
                (ActionEvent event) -> {
                    // ok.getScene().setRoot();
                    String type="NORMAL";
                    String valor="29.00€";
                     normal.getScene().setRoot(new anuidadeAskCartaoMultibanco(  user, manager,type, valor));
                });
        empresas.setOnAction(
                (ActionEvent event) -> {
                    // ok.getScene().setRoot();
                    String type="Empresas";
                    String valor="20€";
                     empresas.getScene().setRoot(new anuidadeAskCartaoMultibanco(  user, manager,type, valor));
                });
        jovens.setOnAction(
                (ActionEvent event) -> {
                    String type="JOVENS(18-24)";
                    String valor="18€";
                     jovens.getScene().setRoot(new anuidadeAskCartaoMultibanco(  user, manager,type, valor));
                });
        normalElectrica.setOnAction(
                (ActionEvent event) -> {
                    // ok.getScene().setRoot();
                       String type="NORMAL ELECTRICAS";
                    String valor="59.00€";
                     normalElectrica.getScene().setRoot(new anuidadeAskCartaoMultibanco(  user, manager,type, valor));
                    
                });
        empresasElectrica.setOnAction(
                (ActionEvent event) -> {
                    // ok.getScene().setRoot();
                       String type="EMPRESAS ELECTRICA ";
                    String valor="39.00€";
                     empresasElectrica.getScene().setRoot(new anuidadeAskCartaoMultibanco(  user, manager,type, valor));
                    
                });
        jovensElectrica.setOnAction(
                (ActionEvent event) -> {
                    // ok.getScene().setRoot();
                      String type="JOVEM ELECTRICA ";
                    String valor="31.00€";
                     empresasElectrica.getScene().setRoot(new anuidadeAskCartaoMultibanco(  user, manager,type, valor));
                    
                });

        HBox botoesNormais = new HBox();
        botoesNormais.getChildren().addAll(normal, empresas, jovens);

        HBox botoesElectricas = new HBox();
        botoesElectricas.getChildren().addAll(normalElectrica, empresasElectrica, jovensElectrica);

        HBox confirmation = new HBox();
        confirmation.getChildren().addAll( cancel);

        VBox all = new VBox();
        all.getChildren().addAll(choise, botoesNormais, botoesElectricas, confirmation);
        //all.setAlignment(CENTER);

        this.getChildren().addAll(img, all);
    }
}
