/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BikeShareJavafx;

import bikeshare.Manager;
import bikeshare.Utilizador;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author João
 */
public class janelaMenuAlterar extends StackPane {

    private Label nome, apelido, genero, dataNascimento, dia, mes, ano, nif, pais, morada, mail;
    private TextField txtNome, txtApelido, txtDia, txtMes, txtAno, txtNif, txtPais, txtMorada, txtMail;
    private ToggleGroup generoGroup;
    private RadioButton btnMasculino, btFeminino;
    private VBox VBoxAll;
    private Image i;
    private ImageView img;
    private HBox HBoxBotoes;
    //private Button btnOk;
    //private Button btnCancel;

    public janelaMenuAlterar(Utilizador user) {

        janela(user);

    }

    private void janela(Utilizador user) {
        Utilizador u =user;
        Manager m = new Manager();
        i = new Image(getClass().getResourceAsStream("bikeShareLogo.png"));
        img = new ImageView(i);
        img.setFitHeight(1188);
        img.setFitWidth(634);

        nome = new Label("Nome");
        apelido = new Label("Apelido");
        pais = new Label("País");
        morada = new Label("Morada");
        mail = new Label("E-mail");

        txtNome = new TextField();
        txtApelido = new TextField();
        txtPais = new TextField();
        txtMorada = new TextField();
        txtMail = new TextField();

        txtNome.setText(u.getNome());
        txtApelido.setText(u.getApelido());
        txtPais.setText(u.getPais());
        txtMorada.setText(u.getMorada());
        txtMail.setText(u.getMail());

        HBoxBotoes = new HBox();

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

        HBoxBotoes.getChildren().addAll(btnOk, btnCancel);

        HBox HBoxnome;
        HBoxnome = new HBox();
        HBoxnome.getChildren()
                .addAll(nome, txtNome);

        HBox HBoxApelido;
        HBoxApelido = new HBox();
        HBoxApelido.getChildren()
                .addAll(apelido, txtApelido);

        HBox HBoxPais;
        HBoxPais = new HBox();
        HBoxPais.getChildren()
                .addAll(pais, txtPais);

        HBox HBoxMorada;
        HBoxMorada = new HBox();
        HBoxMorada.getChildren()
                .addAll(morada, txtMorada);

        HBox HBoxMail;
        HBoxMail = new HBox();
        HBoxMail.getChildren()
                .addAll(mail, txtMail);

        // definir a acçao dos  butoes
        btnOk.setOnAction(
                (ActionEvent event) -> {
                    String name = String.valueOf(txtNome.getText());
                    String lastName = String.valueOf(txtApelido.getText());
                    String adress = String.valueOf(txtMorada.getText());
                    String country = String.valueOf(txtPais.getText());
                    String email = String.valueOf(txtMail.getText());
                    
                    
                   u.setNome(name);
                   u.setApelido(lastName);
                   u.setMorada(adress);
                   u.setMail(email);
                   u.setPais(country);
                   
                   
                    
                    
                    /*
                    String name = String.valueOf(txtNome.getText());
                    String lastName = String.valueOf(txtApelido.getText());
                    char gender = ' ';
                    if (btnMasculino.isSelected()) {
                        gender = 'M';
                    } else if (btFeminino.isSelected()) {
                        gender = 'F';
                    } else {
                        gender = ' ';
                    }
                    Integer day = Integer.valueOf(txtDia.getText());
                    Integer month = Integer.valueOf(txtMes.getText());
                    Integer year = Integer.valueOf(txtAno.getText());
                    Integer NIF = Integer.valueOf(txtNif.getText());
                    String adress = String.valueOf(txtMorada.getText());
                    String country = String.valueOf(txtPais.getText());
                    String email = String.valueOf(txtMail.getText());

                  Utilizador user =  m.registarUtilizadorReturn( name,lastName,gender,day, month, year, NIF, adress,country,email );
                    Stage primaryStage = new Stage();
                    janelaMenuRegistarConfirmatedfx root = new janelaMenuRegistarConfirmatedfx(user);
                    Scene scene1 = new Scene(root, 720, 360);
                    primaryStage.setScene(scene1);
                    primaryStage.setTitle("BikeShareConfirmateUser");
                    primaryStage.show();
                     */
                }
        );

        VBoxAll = new VBox();

        VBoxAll.getChildren()
                .addAll(HBoxnome, HBoxApelido, HBoxPais, HBoxMorada, HBoxMail, HBoxBotoes);
        VBoxAll.setSpacing(10);
        System.out.println(VBoxAll.getAlignment());
        VBoxAll.setAlignment(Pos.TOP_RIGHT);

        //VBoxAll.alignmentProperty();
        // VBoxAll.autosize();
        this.getChildren().addAll(img, VBoxAll);
    }
}
