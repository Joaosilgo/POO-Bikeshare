/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshare;

//import Utilizador;
import BikeShareJavafx.janelaPrincipalFX;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author João
 */
public class BikeShare extends Application {

    /**
     * @param args the command line arguments-
     *  @Override
    public void start(Stage primaryStage) {

        JanelaPrincipalFX root = new JanelaPrincipalFX();
        root.janela();
        root.getChildren();

        Scene scene;
        scene = new Scene(root, 500, 400);

        primaryStage.setTitle("Avaliação da Formação");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

     */
    
     @Override
    public void start(Stage primaryStage) {

        janelaPrincipalFX root = new janelaPrincipalFX();
        root.janela();
        root.getChildren();

        Scene scene;
        scene = new Scene(root, 1188, 634);

        primaryStage.setTitle("BikeShare");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
//Utilizador(String nome, String apelido, char genero, int day, int month, int year, int nif, String morada, String pais, String mail)
        // TODO code application logic here
        Utilizador utilizador1 = new Utilizador("Joao", "Gomes", 'M', 9, 3, 1996, 14956363, "Comporta", "Portugal", "joaosilgo96@gmail.com");
       Utilizador utilizador2 = new Utilizador("Joao", "Gomes", 'M', 3, 2, 1, 14956363, "Comporta", "Portugal", "joaosilgo96@gmail.com");
        //just for testing
        System.out.println(utilizador1.toString());
        System.out.println(utilizador2.toString());

        BikeNormal bike1 = new BikeNormal();
        BikeNormal bike2 = new BikeNormal();
        BikeNormal bike3 = new BikeNormal();
        BikeNormal bike4 = new BikeNormal();
        BikeNormal bike5 = new BikeNormal();
        BikeNormal bike6 = new BikeNormal();
        System.out.println(bike1.toString());
        System.out.println(bike2.toString());
        System.out.println(bike3.toString());
        System.out.println(bike4.toString());
        System.out.println(bike5.toString());
        System.out.println(bike6.toString());

        BikeElectrica bike7 = new BikeElectrica();
        BikeElectrica bike8 = new BikeElectrica();
        BikeElectrica bike9 = new BikeElectrica();
        BikeElectrica bike10 = new BikeElectrica();

        DocaNormal doca1 = new DocaNormal();
        DocaNormal doca2 = new DocaNormal();
        DocaNormal doca3 = new DocaNormal();
        DocaNormal doca4 = new DocaNormal();
        DocaNormal doca5 = new DocaNormal();
        DocaNormal doca6 = new DocaNormal();

        DocaElectrica doca7 = new DocaElectrica();
        DocaElectrica doca8 = new DocaElectrica();
        DocaElectrica doca9 = new DocaElectrica();
        DocaElectrica doca10 = new DocaElectrica();
        DocaElectrica doca11 = new DocaElectrica();
        DocaElectrica doca12 = new DocaElectrica();
        System.out.println(bike10.isTrancada());
        doca12.lockBikeElectrica( bike10);
        
          
        
        System.out.println(bike10.isTrancada());
        //bike10.isTrancada();
         System.out.println(bike9.isaCarregar());
         doca12.chargeBikeElectrica(bike9);
         System.out.println(bike9.isaCarregar());
         
         
         System.out.println(utilizador1.getIdade());
        Scanner scanner = new Scanner(System.in);
        
        Ticket ticket1 = new Ticket(3, 'N');
        System.out.println(ticket1);
        
         Anuidade anuidade1= new Anuidade(18, 'N');
          System.out.println(anuidade1.toString());
       //  Aplicacao ap = new Aplicacao();
       // ap.run();
       // Manager m = new Manager();
         launch(args);

        //para sair do programa (ok)//System.exit(0);
    }

}
