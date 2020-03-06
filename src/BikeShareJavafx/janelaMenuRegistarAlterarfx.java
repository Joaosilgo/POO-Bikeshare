/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BikeShareJavafx;

//import AnuidadeJavafx.folder.janelaPagamentoAskCodigo;
import bikeshare.Manager;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author João
 */
public class janelaMenuRegistarAlterarfx extends StackPane {

    private Label escolher;
    private HBox HBoxLabels;
    private VBox VBoxAll;
    private HBox HBoxBotoes;
    private Image i;
    private ImageView img;

    public janelaMenuRegistarAlterarfx(Manager manager) {
        janela(manager);
    }

    private void janela(Manager manager) {
        
        escolher = new Label("Selecione uma opção");
        escolher.setFont(new Font("SanSerif", 30));

        //Butao Alugar
        Button cancelar = new Button("Cancelar Registo");
        cancelar.setShape(new Rectangle(100, 500));
        cancelar.setMaxSize(500, 1000);

        cancelar.setOnAction(
                (ActionEvent event) -> {
                    Window window = getScene().getWindow();
                    if (window instanceof Stage) {
                        ((Stage) window).close();
                    }
                }
        );

        
        
        
        
        Button pagarAnuidade = new Button("Pagar Anuidade");
        pagarAnuidade.setShape(new Rectangle(100, 500));
        pagarAnuidade.setMaxSize(500, 1000);
           pagarAnuidade.setOnAction(
                (ActionEvent event) -> {
                         
                    pagarAnuidade.getScene().setRoot(new janelaPagamentoAskCodigo( manager));
                    
                });
        
        
        
        

        Button registarUtilizador = new Button("Registar Utilizador");
        registarUtilizador.setShape(new Rectangle(100, 500));
        registarUtilizador.setMaxSize(500, 1000);
        registarUtilizador.setOnAction(
                (ActionEvent event) -> {
                    Stage primaryStage = new Stage();
                    janelaMenuRegistarfx root = new janelaMenuRegistarfx( manager);
                    Scene scene1 = new Scene(root, 1188, 634);
                    primaryStage.setScene(scene1);
                    primaryStage.setTitle("BikeShareRegistar");
                    primaryStage.show();
                }
        );

        Button alterar = new Button("Alterar Dados");
        alterar.setShape(new Rectangle(100, 500));
        alterar.setMaxSize(500, 1000);
        
       //janelaAskCodigoCartaofx askCodigo = new janelaAskCodigoCartaofx( manager) ;
        
        alterar.setOnAction(
                (ActionEvent event) -> {
                         
                    alterar.getScene().setRoot(new janelaAskCodigoCartaofx(manager));
                    
                });
                

        i = new Image(getClass().getResourceAsStream("bikeShareLogo.png"));
        img = new ImageView(i);
        img.setFitHeight(1188);
        img.setFitWidth(634);

        HBoxBotoes = new HBox();
        HBoxBotoes.getChildren().addAll(registarUtilizador, pagarAnuidade, alterar, cancelar);
        HBoxLabels = new HBox();

        HBoxLabels.getChildren()
                .addAll(escolher);

        VBoxAll = new VBox();
        VBoxAll.getChildren()
                .addAll(HBoxLabels, HBoxBotoes);
        this.getChildren().addAll(img, VBoxAll);

    }

}
