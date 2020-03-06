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
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.Window;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author João
 */
public class janelaAskCodigoCartaofx extends StackPane {

    private Label request;
    private TextField txtRequest;
    private VBox VBoxAll;
    private Image i;
    private ImageView img;

    public janelaAskCodigoCartaofx(Manager manager) {
        janela(manager);
    }

    private void janela(Manager manager) {
          i = new Image(getClass().getResourceAsStream("bikeShareLogo.png"));
        img = new ImageView(i);

        request = new Label("Insira nª de cartão BikeShare: ");
        request.setFont(new Font("SanSerif", 20));

        txtRequest = new TextField();

        Image imageOk = new Image(getClass().getResourceAsStream("likeButton.png"));
        ImageView okBtn = new ImageView(imageOk);
        okBtn.setFitHeight(50);
        okBtn.setFitWidth(50);
        Button btnOk = new Button("", okBtn);
        btnOk.setShape(new Circle(1));
        btnOk.setMaxSize(0.5, 0.5);

        Image cancel = new Image(getClass().getResourceAsStream("cancelButton.png"));
        ImageView noBtn = new ImageView(cancel);
        noBtn.setFitHeight(50);
        noBtn.setFitWidth(50);
        Button btnCancel = new Button("", noBtn);
        btnCancel.setShape(new Circle(1));
        btnCancel.setMaxSize(0.5, 0.5);

       

        btnOk.setOnAction(
                (ActionEvent event) -> {

                    Integer code = Integer.valueOf(txtRequest.getText());

                 //   if (m.isRegistado(code)) {
                      Utilizador u= manager.getUtilizador(code);
                      System.out.println(u);
                        btnOk.getScene().setRoot(new janelaMenuAlterar( u));
                  //  }
                });

        btnCancel.setOnAction(
                (ActionEvent event) -> {

                    Window window = getScene().getWindow();
                    if (window instanceof Stage) {
                        ((Stage) window).close();
                    }

                });
         HBox HBoxRequest = new HBox();
        HBoxRequest.getChildren().addAll(request, txtRequest);
        
        HBox HBoxButtons = new HBox();
        HBoxButtons.getChildren().addAll(btnOk,btnCancel);
                
        VBoxAll = new VBox(HBoxRequest,HBoxButtons);
        this.getChildren().addAll(img,VBoxAll);

    }

}
