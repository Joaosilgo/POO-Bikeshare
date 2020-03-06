/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BikeShareJavafx;

import bikeshare.Manager;
import bikeshare.Utilizador;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author João
 */
public class janelaAlugarBilheteCartao extends StackPane {

    public janelaAlugarBilheteCartao(Manager manager) {
        janela(manager);
        
    }
    
    private void janela(Manager manager)
    {
        
        Text title = new Text("Escolher Bilhete ou Cartão");
        title.setFont(Font.font("Arial", 16));
        

        HBox primeira = new HBox();

        Image cartaoImagem = new Image(getClass().getResourceAsStream("cardIcon.png"));
        ImageView cartaoImagemIcon = new ImageView(cartaoImagem);
        cartaoImagemIcon.setFitHeight(40);
        cartaoImagemIcon.setFitWidth(40);

       Button cartao = new Button("", cartaoImagemIcon);

        Image bilheteImagem = new Image(getClass().getResourceAsStream("ticket.png"));
        ImageView bilheteImagemIcon = new ImageView(bilheteImagem);
        bilheteImagemIcon.setFitHeight(40);
        bilheteImagemIcon.setFitWidth(40);

        Button bilhete = new Button("", bilheteImagemIcon);
        
        Image voltarA = new Image(getClass().getResourceAsStream("ArrowLeft.png"));
        ImageView voltarIcon = new ImageView(voltarA);
        voltarIcon.setFitHeight(40);
        voltarIcon.setFitWidth(40);

       Button recusar = new Button("", voltarIcon);
        recusar.setTranslateX(50);

        primeira.getChildren().addAll(title,cartao, bilhete);
        primeira.setSpacing(20);
        primeira.setPadding(new Insets(15));

        this.getChildren().addAll(primeira,recusar);
      
        this.setPadding(new Insets(10));
        
        
        
       // setBeahavior

  

        cartao.setOnAction(e -> {
          // Integer code = Integer.valueOf(txtRequest.getText());
           // Utilizador u = manager.getUtilizador(code);
            cartao.getScene().setRoot(new janelaAskCodigoCartaoAlugar( manager));

        });
         bilhete.setOnAction(e -> {
         
             
             //bilhete.getScene().setRoot(new janelaAnuidadeEscolher(u, manager));
        });
         
         
            recusar.setOnAction(e -> {
            Window window = getScene().getWindow();
            if (window instanceof Stage) {
                ((Stage) window).close();
            }
        });
    
    }

 
}

