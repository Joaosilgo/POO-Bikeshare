/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BikeShareJavafx;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import BikeShareJavafx.janelaMenufx;
import bikeshare.Manager;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author João
 */
public class janelaPrincipalFX extends StackPane {

    private Label bemvindo;
    private Image i;
    private ImageView img;
    private VBox VBoxTudo;
    private HBox HBoxBotoes;
    private janelaMenufx janelaMenu;
    private Manager m;

    public janelaPrincipalFX() {
        this.m = new Manager();
        janelaMenu = new janelaMenufx(m);

    }

    public void janela() {
        bemvindo = new Label("Bem Vindo!");
        bemvindo.setFont(new Font("SanSerif", 30));
        bemvindo.setEffect(new InnerShadow());
        bemvindo.setTextFill(Color.WHITE);

        i = new Image(getClass().getResourceAsStream("mapSetubal.PNG"));
        img = new ImageView(i);

        // img.setFitHeight(500);
        // img.setFitWidth(720);
        Button stationAlbarquel = new Button("6");
        stationAlbarquel.setShape(new Circle(1.5));
        stationAlbarquel.setMaxSize(3, 3);
        // stationAlbarquel.setLayoutX(500);
        // stationAlbarquel.setLayoutY(100);
        stationAlbarquel.setTranslateX(50);
        stationAlbarquel.setTranslateY(450);

        Button stationForumMunicipal = new Button("5");
        stationForumMunicipal.setShape(new Circle(1.5));
        stationForumMunicipal.setMaxSize(3, 3);

        stationForumMunicipal.setTranslateX(250);
        stationForumMunicipal.setTranslateY(400);

        Button stationCP = new Button("4");
        stationCP.setShape(new Circle(1.5));
        stationCP.setMaxSize(3, 3);

        stationCP.setTranslateX(255);
        stationCP.setTranslateY(371);

        Button stationEscolaPrincipal = new Button("2");
        stationEscolaPrincipal.setShape(new Circle(1.5));
        stationEscolaPrincipal.setMaxSize(3, 3);

        stationEscolaPrincipal.setTranslateX(724);
        stationEscolaPrincipal.setTranslateY(412);

        Button stationCampusIps = new Button("1");
        stationCampusIps.setShape(new Circle(1.5));
        stationCampusIps.setMaxSize(3, 3);

        stationCampusIps.setTranslateX(997);
        stationCampusIps.setTranslateY(411);

        Button stationSaoSebastiao = new Button("3");
        stationSaoSebastiao.setShape(new Circle(1.5));
        stationSaoSebastiao.setMaxSize(3, 3);

        stationSaoSebastiao.setTranslateX(475);
        stationSaoSebastiao.setTranslateY(340);

        // Button sair = new Button("Sair");
        // sair.backgroundProperty().
        stationAlbarquel.setOnAction(
                (ActionEvent event) -> {
                    Stage primaryStage = new Stage();
                    janelaMenufx root = new janelaMenufx(m);
                    Scene scene1 = new Scene(root, 1188, 634);
                    primaryStage.setScene(scene1);
                    primaryStage.setTitle("BikeShareMenu");
                    primaryStage.show();
                }
        );
        stationForumMunicipal.setOnAction(
                (ActionEvent event) -> {
                    Stage primaryStage = new Stage();
                    janelaMenufx root = new janelaMenufx(m);
                    Scene scene1 = new Scene(root, 1188, 634);
                    primaryStage.setScene(scene1);
                    primaryStage.setTitle("BikeShareMenu");
                    primaryStage.show();
                }
        );
        
        stationCP.setOnAction(
                (ActionEvent event) -> {
                    Stage primaryStage = new Stage();
                    janelaMenufx root = new janelaMenufx(m);
                    Scene scene1 = new Scene(root, 1188, 634);
                    primaryStage.setScene(scene1);
                    primaryStage.setTitle("BikeShareMenu");
                    primaryStage.show();
                }
        );
        
        stationEscolaPrincipal.setOnAction(
                (ActionEvent event) -> {
                    Stage primaryStage = new Stage();
                    janelaMenufx root = new janelaMenufx(m);
                    Scene scene1 = new Scene(root, 1188, 634);
                    primaryStage.setScene(scene1);
                    primaryStage.setTitle("BikeShareMenu");
                    primaryStage.show();
                }
        );
        
        stationCampusIps.setOnAction(
                (ActionEvent event) -> {
                    Stage primaryStage = new Stage();
                    janelaMenufx root = new janelaMenufx(m);
                    Scene scene1 = new Scene(root, 1188, 634);
                    primaryStage.setScene(scene1);
                    primaryStage.setTitle("BikeShareMenu");
                    primaryStage.show();
                }
        );
        
        stationSaoSebastiao.setOnAction(
                (ActionEvent event) -> {
                    Stage primaryStage = new Stage();
                    janelaMenufx root = new janelaMenufx(m);
                    Scene scene1 = new Scene(root, 1188, 634);
                    primaryStage.setScene(scene1);
                    primaryStage.setTitle("BikeShareMenu");
                    primaryStage.show();
                }
        );
        

        HBoxBotoes = new HBox();
        HBoxBotoes.autosize();

        HBoxBotoes.getChildren()
                .addAll(stationAlbarquel, stationForumMunicipal, stationCP, stationEscolaPrincipal, stationCampusIps, stationSaoSebastiao);

        VBoxTudo = new VBox();
        VBoxTudo.getChildren()
                .addAll(HBoxBotoes, bemvindo);
        VBoxTudo.autosize();
        this.getChildren().addAll(img, VBoxTudo);
        this.autosize();

        //  setBottom(VBoxTudo);
        //   setTop(img);
        //   setCenter(bemvindo);
//
    }

}
