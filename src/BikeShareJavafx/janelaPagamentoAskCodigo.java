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
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author João
 */
public class janelaPagamentoAskCodigo extends StackPane {

    private Label request;
    private TextField txtRequest;
    private VBox VBoxAll;
    private Image i;
    private ImageView img;
    private Button ok, cancel;

    public janelaPagamentoAskCodigo(Manager manager) {
        janela(manager);
    }

    private void janela(Manager manager) {
        i = new Image(getClass().getResourceAsStream("bikeShareLogo.png"));
        img = new ImageView(i);

        request = new Label("Insira nª de cartão BikeShare: ");
        request.setFont(new Font("SanSerif", 20));

        txtRequest = new TextField();

        ok = new Button("OK");
        cancel = new Button("CANCEL");

        HBox confirmation = new HBox();
        confirmation.getChildren().addAll(ok, cancel);

        VBox all = new VBox();
        all.getChildren().addAll(request, txtRequest, confirmation);

        this.getChildren().addAll(img, all);

        //action
        ok.setOnAction(
                (ActionEvent event) -> {
                    Integer code = Integer.valueOf(txtRequest.getText());
                    Utilizador u = manager.getUtilizador(code);
                    System.out.println(u);
                    ok.getScene().setRoot(new janelaAnuidadeEscolher(u, manager));
                    // ok.getScene().setRoot();
                });
        cancel.setOnAction(
                (ActionEvent event) -> {
                    Window window = getScene().getWindow();
                    if (window instanceof Stage) {
                        ((Stage) window).close();
                    }
                });

    }

}
