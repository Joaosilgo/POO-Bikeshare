/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BikeShareJavafx;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





import bikeshare.Ticket;
import bikeshare.Manager;
import bikeshare.Utilizador;
import java.time.LocalDate;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * 
 */
public class CartaoAskCodigoCartaoMultibanco extends VBox {

   

    private int numeroEstacao;
    private int numeroAluguer;
    private int numeroUtilizador;

    private TextField numeroCartao;
    private DatePicker calendario;

    private Button alugar;
    private Button cancelar;

  //  private TipoDeAnualidade tipoAnualidade;

    public CartaoAskCodigoCartaoMultibanco(Manager manager, String type, String valor) {

      

        calendario = new DatePicker();
        numeroCartao = new TextField();

        VBox vboxInfo = new VBox();

        Text title = new Text("\tDados de cartão");
        title.setFont(Font.font("Arial", 15));
        title.setTranslateX(90);

        vboxInfo.getChildren().add(title);
        vboxInfo.setSpacing(3);
        vboxInfo.setPadding(new Insets(6, 0, 6, 0));

        HBox labelTextNumero = new HBox();

        Label numeroCartaoLabel = new Label("Número do Cartão:  ");
        numeroCartao = new TextField();
        numeroCartao.setTranslateY(-2);

        labelTextNumero.getChildren().addAll(numeroCartaoLabel, numeroCartao);
        labelTextNumero.setPadding(new Insets(10, 0, 0, 40));

        HBox dataLabelHBox = new HBox();

        Label dataLabel = new Label("Data de validade:  ");
        calendario.setTranslateY(-2);

        dataLabelHBox.getChildren().addAll(dataLabel, calendario);
        dataLabelHBox.setPadding(new Insets(10, 0, 0, 40));

        HBox ultima = new HBox();

        Image voltarA = new Image(getClass().getResourceAsStream("Arrow_Left-512.png"));
        ImageView voltarIcon = new ImageView(voltarA);
        voltarIcon.setFitHeight(20);
        voltarIcon.setFitWidth(20);

        cancelar = new Button("", voltarIcon);

        Image confirmarImagem = new Image(getClass().getResourceAsStream("OK.png"));
        ImageView confirmarImagemIcon = new ImageView(confirmarImagem);
        confirmarImagemIcon.setFitHeight(20);
        confirmarImagemIcon.setFitWidth(20);

        alugar = new Button("", confirmarImagemIcon);

        ultima.getChildren().addAll(cancelar, alugar);
        ultima.setPadding(new Insets(5, 0, 0, 140));
        ultima.setSpacing(4);

        this.getChildren().addAll(vboxInfo, labelTextNumero, dataLabelHBox, ultima);

        setupBehaviour(manager, type, valor);
    }

  

    private void setupBehaviour(Manager manager, String type, String valor) {

        cancelar.setOnAction(e -> {
            Window window = getScene().getWindow();
            if (window instanceof Stage) {
                ((Stage) window).close();
            }

        });

        alugar.setOnAction(e -> {
            System.out.println(calendario.getConverter().toString(LocalDate.now()));

            //if (numeroCartao.getText().isEmpty()) {
             //   janelaErroNumeroNull("Utiliza um número valido");
           // } else if (calendario.getValue() == null) {
            //    janelaErroNumeroNull("Tem que preencher a data");
            //} else {
                
                    int n = Integer.parseInt(numeroCartao.getText());
                    System.out.println(n);
                    if(manager.containMultibanco(n))
                    {
                        if(type.equals("NORMAL 1 DIA") )
                        {
                          Ticket tickets = new  Ticket(1, 'N');
                          manager.getArrayListTickets().add(tickets);
                          System.out.println(tickets);
                            alugar.getScene().setRoot(new janelaPagamentoBilhete(  manager,  type,  valor));
                            //break;
                         
                        }
                        else if(type.equals("NORMAL 3 DIA"))
                        {
                            Ticket tickets = new  Ticket(3, 'N');
                            manager.getArrayListTickets().add(tickets);
                            System.out.println(tickets);
                             alugar.getScene().setRoot(new janelaPagamentoBilhete(  manager,  type,  valor));
                        }
                         else if(type.equals("NORMAL 7 DIA") )
                        {
                           Ticket tickets = new  Ticket(7, 'N');
                           manager.getArrayListTickets().add(tickets);
                           System.out.println(tickets);
                            alugar.getScene().setRoot(new janelaPagamentoBilhete(  manager,  type,  valor));
                        }
                         else if(type.equals("Electrica 1 DIA"))
                        {
                           Ticket tickets = new  Ticket(1, 'E');
                           manager.getArrayListTickets().add(tickets);
                           System.out.println(tickets);
                            alugar.getScene().setRoot(new janelaPagamentoBilhete(  manager,  type,  valor));
                        }
                         else if(type.equals("Electrica 3 DIA") )
                        {
                          Ticket tickets = new  Ticket(3, 'E');
                          manager.getArrayListTickets().add(tickets);
                          System.out.println(tickets);
                           alugar.getScene().setRoot(new janelaPagamentoBilhete(  manager,  type,  valor));
                        }
                        else if(type.equals("Electrica 7 DIA"))
                        {
                          Ticket tickets = new  Ticket(7, 'E');
                          manager.getArrayListTickets().add(tickets);
                          System.out.println(tickets);
                           alugar.getScene().setRoot(new janelaPagamentoBilhete(  manager,  type,  valor));
                        }
                        
                        else
                        {
                        // Ticket tickets = new  Ticket(1, 'N');   
                            System.out.println("erro");
                        }
                        
                       //  alugar.getScene().setRoot(new janelaAskCodigoCartaoAlugar( manager));
                    }
                    else
                    {
                        System.out.println("Não existe");
                    }

                   // listaUtilizadoresAtual.get(numeroUtilizador).criarCartaoPagarAnuidade(converterData(calendario), n); // insere o cartao de pagamento da anuidade
                   // listaUtilizadoresAtual.get(numeroUtilizador).definirTipoDeAnualidade(tipoAnualidade); // defina a anualidade do utilizador

                  //  fazerSempreGuardarLer();// guarda a informação alterada

                   // concluir("A sua anualidade foi registada com sucesso");

                //} catch (NumberFormatException a) {
                  //  janelaErroNumeroNull("Por Favor coloque apenas números");

                
            

        }
        );
    }


    private void janelaErroNumeroNull(String mensagemErro) {

        final Stage janelaErro = new Stage();
        BorderPane painelErro = new BorderPane();
        VBox vbox = new VBox();

        Label erroLabel = new Label(mensagemErro);
        erroLabel.setContentDisplay(ContentDisplay.TOP);

        Image erroImagem = new Image(getClass().getResourceAsStream("close_red.png"));
        ImageView erroImagemIcon = new ImageView(erroImagem);
        erroImagemIcon.setFitHeight(40);
        erroImagemIcon.setFitWidth(40);

        Button botaoVoltar = new Button("OK");

        vbox.getChildren().addAll(erroLabel, erroImagemIcon, botaoVoltar);
        vbox.setSpacing(40);
        vbox.setAlignment(Pos.CENTER);

        painelErro.setCenter(vbox);

        botaoVoltar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                janelaErro.close();
            }
        });

        Scene scene = new Scene(painelErro, 300, 250);
        janelaErro.setTitle("Erro!");
        janelaErro.setScene(scene);
        janelaErro.show();
    }

    private void concluir(String mensagem) {

        final Stage janelaErro = new Stage();
        BorderPane painelErro = new BorderPane();
        VBox vbox = new VBox();

        Label erroLabel = new Label(mensagem);
        erroLabel.setContentDisplay(ContentDisplay.TOP);

        Image erroImagem = new Image(getClass().getResourceAsStream("OK.png"));
        ImageView erroImagemIcon = new ImageView(erroImagem);
        erroImagemIcon.setFitHeight(40);
        erroImagemIcon.setFitWidth(40);

        Button botaoVoltar = new Button("Menu Principal");

        vbox.getChildren().addAll(erroLabel, erroImagemIcon, botaoVoltar);
        vbox.setSpacing(40);
        vbox.setAlignment(Pos.CENTER);

        painelErro.setCenter(vbox);

  
        Scene scene = new Scene(painelErro, 300, 250);
        janelaErro.setTitle("Erro!");
        janelaErro.setScene(scene);
        janelaErro.show();
    }

   

}
