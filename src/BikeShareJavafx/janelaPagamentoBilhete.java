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
import javafx.scene.control.TextField;
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
public class janelaPagamentoBilhete extends StackPane {

    public janelaPagamentoBilhete( Manager manager, String type, String valor) {
        janela( manager, type, valor);

    }

    private void janela( Manager manager, String type, String valor) {
        Image i = new Image(getClass().getResourceAsStream("bikeShareLogo.png"));
        ImageView img = new ImageView(i);
        img.setFitHeight(720);
        img.setFitWidth(360);

        Label labelTop = new Label(" Bilhete Adquirido");

        Image userIcon = new Image(getClass().getResourceAsStream("user.jpg"));
        ImageView imgUser = new ImageView(userIcon);
        imgUser.setFitHeight(60);
        imgUser.setFitWidth(60);
        Label typeAnnuity = new Label(type);

        Image calendar = new Image(getClass().getResourceAsStream("calendar.png"));
        ImageView imgCalendar = new ImageView(calendar);
        imgCalendar.setFitHeight(60);
        imgCalendar.setFitWidth(60);

        Image coin = new Image(getClass().getResourceAsStream("coin.png"));
        ImageView imgCoin = new ImageView(coin);
        imgCoin.setFitHeight(60);
        imgCoin.setFitWidth(60);

        Label labelValor = new Label(valor);

       // Label numberCard = new Label("Nº Cartão:");
        //TextField txtRequest = new TextField();
        
         Button ok = new Button("OK");
      // Button cancel = new Button("CANCEL");

        HBox confirmation = new HBox();
        confirmation.getChildren().addAll(ok);
         confirmation.setTranslateX(450);
           confirmation.setTranslateY(450);
           confirmation.setSpacing(100);
           
           
           ok.setOnAction(
                (ActionEvent event) -> {
                    Window window = getScene().getWindow();
                    if (window instanceof Stage) {
                        ((Stage) window).close();
                    }
                });


        VBox a = new VBox();
        a.getChildren().addAll(imgUser, typeAnnuity);
        VBox b = new VBox();
        b.getChildren().addAll(imgCalendar);
        VBox c = new VBox();
        c.getChildren().addAll(imgCoin, labelValor);

        HBox d = new HBox();
        //d.getChildren().addAll(, txequest);
        d.setTranslateX(435);
           d.setTranslateY(340);
        
        
        HBox topInf = new HBox();
        topInf.getChildren().addAll(a, b,c);
        topInf.setSpacing(150);
          topInf.setTranslateX(340);
        topInf.setTranslateY(300);
        
        VBox all = new VBox();
        all.getChildren().addAll(labelTop,topInf, d,confirmation);
        
        this.getChildren().addAll(img,all);
                

    }

    
}
