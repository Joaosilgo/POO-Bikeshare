/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BikeShareJavafx;

import bikeshare.Manager;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author João
 */
public class janelaMenufx extends StackPane {

    private Label escolher;
    private HBox HBoxLabels;
    private VBox VBoxAll;
    private HBox HBoxBotoes;
     private Image i;
    private ImageView img;

    public janelaMenufx(Manager manager) {
        janela(manager);
    }

    private void janela(Manager manager) {
        
        

        escolher = new Label("Selecione uma opção");
        escolher.setFont(new Font("SanSerif", 30));
        
        
        //Butao Alugar

        Button alugarDevolver = new Button("Alugar ou devolver Bicicleta");
        alugarDevolver.setShape(new Rectangle(100, 500));
        alugarDevolver.setMaxSize(500, 1000);
        alugarDevolver.setOnAction(
                (ActionEvent event) -> {
                    alugarDevolver.getScene().setRoot(new janelaAlugarBilheteCartao( manager));
                }
        );
        
        
         
        
        
        
        Button comprarBilhete= new Button("Comprar Bilhete");
        comprarBilhete.setShape(new Rectangle(100, 500));
        comprarBilhete.setMaxSize(500, 1000);
        comprarBilhete.setOnAction(
                (ActionEvent event) -> {
                    comprarBilhete.getScene().setRoot(new janelaBilheteEscolher( manager));
                }
        );
                
                
        
        
        
        Button registarUtilizador = new Button("Dados Utilizador");
        alugarDevolver.setShape(new Rectangle(100, 500));
        alugarDevolver.setMaxSize(500, 1000);
         registarUtilizador.setOnAction(
                (ActionEvent event) -> {
                    Stage primaryStage = new Stage();
                    janelaMenuRegistarAlterarfx root = new janelaMenuRegistarAlterarfx(manager);
                    Scene scene1 = new Scene(root, 1188, 634);
                    primaryStage.setScene(scene1);
                    primaryStage.setTitle("BikeShareRegistar");
                    primaryStage.show();
                }
        );
         
         
        
        
        Button estacoes = new Button("Visualizar Estações");
        alugarDevolver.setShape(new Rectangle(100, 500));
        alugarDevolver.setMaxSize(500, 1000);
        
        
        estacoes.setOnAction(
                (ActionEvent event) -> {
                    Stage primaryStage = new Stage();
                    menuVizualizarEstacoes root = new menuVizualizarEstacoes(manager);
                    Scene scene1 = new Scene(root, 1188, 634);
                    primaryStage.setScene(scene1);
                    primaryStage.setTitle("BikeShareVisualizarEstaçoes");
                    primaryStage.show();
                }
        );
         
        
        
        
        i = new Image(getClass().getResourceAsStream("bikeShareLogo.png"));
        img = new ImageView(i);
        img.setFitHeight(1188);
        img.setFitWidth(634);
        
        

        HBoxBotoes = new HBox();
        HBoxBotoes.getChildren().addAll(alugarDevolver,comprarBilhete,registarUtilizador,estacoes);
        HBoxLabels = new HBox();

        HBoxLabels.getChildren()
                .addAll(escolher);

        VBoxAll = new VBox();
        VBoxAll.getChildren()
                .addAll(HBoxLabels, HBoxBotoes);
        this.getChildren().addAll(img,VBoxAll);

    }

}
