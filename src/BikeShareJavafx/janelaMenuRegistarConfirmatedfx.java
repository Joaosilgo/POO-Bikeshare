/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BikeShareJavafx;

import bikeshare.Utilizador;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author João
 */
public class janelaMenuRegistarConfirmatedfx extends StackPane {

    private Image i;
    private ImageView img;
    private VBox VBoxAll;

    public janelaMenuRegistarConfirmatedfx(Utilizador user) {
        janela(user);

    }

    private void janela(Utilizador user) {
        i = new Image(getClass().getResourceAsStream("bikeShareLogo.png"));
        img = new ImageView(i);
        img.setFitHeight(720);
        img.setFitWidth(360);

        Label confirm = new Label("Utilizador Criado Com Sucesso");
        confirm.setAlignment(Pos.CENTER);
        confirm.setFont(new Font("SanSerif", 30));
        confirm.setEffect(new InnerShadow());
        confirm.setTextFill(Color.WHITE);

        Label anounce = new Label("O Numero do seu cartão BikeShare:");
        anounce.setAlignment(Pos.CENTER);
        anounce.setFont(new Font("SanSerif", 20));
        anounce.setEffect(new InnerShadow());
        anounce.setTextFill(Color.WHITE);

        

        Label number = new Label("Nº: 000" + user.getCartao().getCardId());
        number.setAlignment(Pos.CENTER);
        number.setFont(new Font("SanSerif", 15));
        number.setEffect(new InnerShadow());
        number.setTextFill(Color.WHITE);
        
        
        VBoxAll = new VBox();
        
        
        VBoxAll.getChildren().addAll(confirm,anounce,number);
        this.getChildren().addAll(img, VBoxAll);
    }

}
