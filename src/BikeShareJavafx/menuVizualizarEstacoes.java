/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BikeShareJavafx;

import bikeshare.Manager;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author João
 */
public class menuVizualizarEstacoes extends StackPane {
    private graficoBicicletas ips;
    private graficoBicicletas albarquel;
    private graficoBicicletas forum;
    private graficoBicicletas estacao;
    private graficoBicicletas saoSebastiao;
    private graficoBicicletas escolaProfissional;
    
    
    private Image i;
    private ImageView img;

    public menuVizualizarEstacoes(Manager manager) {
        janela(manager);
    }
   
private void janela(Manager manager)
{
    
    Label titulo = new Label("Estações");
        titulo.setTranslateX(-20);
        titulo.setTranslateY(-300);
        titulo.setFont(Font.font("Arial", 26));
    
        
        
        
         ips = new graficoBicicletas(manager.getStations()[0].countBikesElectricas(), manager.getStations()[0].countBikesNormais());
        albarquel = new graficoBicicletas(manager.getStations()[5].countBikesElectricas(), manager.getStations()[5].countBikesNormais());
        forum = new graficoBicicletas(manager.getStations()[4].countBikesElectricas(), manager.getStations()[4].countBikesNormais());
        estacao = new graficoBicicletas(manager.getStations()[3].countBikesElectricas(), manager.getStations()[3].countBikesNormais());
        saoSebastiao = new graficoBicicletas(manager.getStations()[2].countBikesElectricas(), manager.getStations()[2].countBikesNormais());
        escolaProfissional = new graficoBicicletas(manager.getStations()[1].countBikesElectricas(), manager.getStations()[1].countBikesNormais());
/**
 * Button stationAlbarquel = new Button("6");
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
 */
        
        
        VBox estacaoIPSV = new VBox();
        estacaoIPSV.getChildren().add(ips.getVBox());

        estacaoIPSV.setTranslateX(505);
        estacaoIPSV.setTranslateY(167);

        VBox albarquelV= new VBox();
        albarquelV.getChildren().add(albarquel.getVBox());

        albarquelV.setTranslateX(-295);
        albarquelV.setTranslateY(229);
        
        VBox forumV= new VBox();
        forumV.getChildren().add(forum.getVBox());

          forumV.setTranslateX(-197);
        forumV.setTranslateY(200);
        
        VBox estacaoV= new VBox();
        estacaoV.getChildren().add(estacao.getVBox());
        estacaoV.setTranslateX(-144);
        estacaoV.setTranslateY(77);

      
        
        VBox saoSebastiaoV= new VBox();
        saoSebastiaoV.getChildren().add(saoSebastiao.getVBox());

        saoSebastiaoV.setTranslateX(107);
        saoSebastiaoV.setTranslateY(39);
        
        VBox escolaProfissionalV= new VBox();
        escolaProfissionalV.getChildren().add(escolaProfissional.getVBox());

        escolaProfissionalV.setTranslateX(255);
        escolaProfissionalV.setTranslateY(170);
        
        
        i = new Image(getClass().getResourceAsStream("mapSetubal.PNG"));
       img = new ImageView(i);
        
         Button sair = new Button("SAIR");
         
          sair.setTranslateX(0);
        sair.setTranslateY(300);
        sair.setOnAction(
                (ActionEvent event) -> {
                    Window window = getScene().getWindow();
                    if (window instanceof Stage) {
                        ((Stage) window).close();
                    }
                });
         this.getChildren().addAll(img,titulo,estacaoIPSV,albarquelV,forumV,estacaoV,saoSebastiaoV,escolaProfissionalV, sair);
        
        
        
        
       
}
}

