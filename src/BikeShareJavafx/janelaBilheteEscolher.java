/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BikeShareJavafx;

import bikeshare.Manager;
import bikeshare.Utilizador;
import javafx.event.ActionEvent;
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
public class janelaBilheteEscolher extends StackPane {

    private Label choise;
    private Manager manager;
    private Button cancel, normal1, normal3, normal7, Electrica1, Electrica3, Electrica7;

    public janelaBilheteEscolher(Manager manager) {
        janela(manager);
    }

    private void janela(Manager manager) {
        this.manager = manager;

        Image i = new Image(getClass().getResourceAsStream("bikeShareLogo.png"));
        ImageView img = new ImageView(i);
        img.setFitHeight(720);
        img.setFitWidth(360);

        choise = new Label("ESCOLHA DE BOLHETE");
        //  ok = new Button("OK");
        cancel = new Button("CANCEL");
        normal1 = new Button("NORMAL 1DIA \n 1.00€");
        normal3 = new Button("NORMAL 3DIA \n 3.00€");
        normal7 = new Button("NORMAL 7DIA \n 5.00€");
        Electrica1 = new Button("ELECTRICA 1DIA \n 3.00€");
        Electrica3 = new Button("ELECTRICA 3DIA \n 9.00€");
        Electrica7 = new Button("ELECTRICA 7DIA \n 15.00€");

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
        normal1.setOnAction(
                (ActionEvent event) -> {
                    String bilhete="NORMAL 1 DIA";
                    String valor="1.00€";
                     normal1.getScene().setRoot(new CartaoAskCodigoCartaoMultibanco(  manager,  bilhete,  valor));
                });
        normal3.setOnAction(
                (ActionEvent event) -> {
                    String bilhete="NORMAL 3 DIA";
                    String valor="3.00€";
                     normal3.getScene().setRoot(new CartaoAskCodigoCartaoMultibanco(  manager,  bilhete,  valor));
                    // ok.getScene().setRoot();
                });
        normal7.setOnAction(
                (ActionEvent event) -> {
                    String bilhete="NORMAL 7 DIA";
                    String valor="5.00€";
                     normal7.getScene().setRoot(new CartaoAskCodigoCartaoMultibanco(  manager,  bilhete,  valor));
                    //   String type="JOVENS(18-24)";
                    //  String valor="18€";
                    //  jovens.getScene().setRoot(new janelaPagamentoAnuidade(user , manager,type, valor));
                });
        Electrica1.setOnAction(
                (ActionEvent event) -> {
                     String bilhete="Electrica 1 DIA";
                    String valor="3.00€";
                     Electrica1.getScene().setRoot(new CartaoAskCodigoCartaoMultibanco(  manager,  bilhete,  valor));
                    // ok.getScene().setRoot();
                });
        Electrica3.setOnAction(
                (ActionEvent event) -> {
                     String bilhete="Electrica 3 DIA";
                    String valor="7.00€";
                     Electrica3.getScene().setRoot(new CartaoAskCodigoCartaoMultibanco(  manager,  bilhete,  valor));
                    // ok.getScene().setRoot();
                });
        Electrica7.setOnAction(
                (ActionEvent event) -> {
                       String bilhete="Electrica 7 DIA";
                    String valor="15.00€";
                     Electrica7.getScene().setRoot(new CartaoAskCodigoCartaoMultibanco(  manager,  bilhete,  valor));
                    // ok.getScene().setRoot();
                });

        HBox botoesNormais = new HBox();
        botoesNormais.getChildren().addAll(normal1, normal3, normal7);
        botoesNormais.setSpacing(100);

        HBox botoesElectricas = new HBox();
        botoesElectricas.getChildren().addAll(Electrica1, Electrica3, Electrica7);
        botoesElectricas.setSpacing(100);

        HBox confirmation = new HBox();
        confirmation.getChildren().addAll(cancel);

        VBox all = new VBox();
        all.getChildren().addAll(choise, botoesNormais, botoesElectricas, confirmation);
        //all.setAlignment(CENTER);
        all.setSpacing(100);
        all.setTranslateX(350);
        all.setTranslateY(100);

        this.getChildren().addAll(img, all);
    }

}
