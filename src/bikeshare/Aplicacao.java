/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshare;

import java.util.Scanner;
//import java.lang.Integer;

/**
 *
 * @author João
 */
public class Aplicacao {

    private Menus menu;
    //  private Station stationSelect;
    private Manager manager;

    public Aplicacao() {

        this.menu = new Menus();
        this.manager = new Manager();

        //int i = sc.nextInt();
    }

    Scanner sc = new Scanner(System.in);

    public void run() {
        menu.menuInicial();
        int opcao = 0;
        opcao = sc.nextInt();
        System.out.println("opcao:" + opcao);
        switch (opcao) {
            case 0: {
                menu.menuDespedida();
                System.exit(0);

            }
            case 1: {
                manager.setStationSelect(manager.getStations()[0]);
                System.out.println("stationSelect:" + manager.getStationSelect().getStationName());
                principalMenu();
                break;

            }
            case 2: {
                manager.setStationSelect(manager.getStations()[1]);
                System.out.println("stationSelect:" + manager.getStationSelect().getStationName());
                principalMenu();
                break;
            }
            case 3: {
                manager.setStationSelect(manager.getStations()[2]);
                System.out.println("stationSelect:" + manager.getStationSelect().getStationName());
                principalMenu();
                break;
            }
            case 4: {
                manager.setStationSelect(manager.getStations()[3]);
                System.out.println("stationSelect:" + manager.getStationSelect().getStationName());
                principalMenu();
                break;
            }
            case 5: {
                manager.setStationSelect(manager.getStations()[4]);
                System.out.println("stationSelect:" + manager.getStationSelect().getStationName());
                principalMenu();
                break;
            }
            case 6: {
                manager.setStationSelect(manager.getStations()[5]);
                System.out.println("stationSelect:" + manager.getStationSelect().getStationName());
                principalMenu();
                break;
            }

        }

    }

    private void principalMenu() {
        menu.menuPrincipal();
        int opcao = 0;
        opcao = sc.nextInt();
        System.out.println("opcao:" + opcao);
        switch (opcao) {
            case 0: {
                menu.menuDespedida();
                System.exit(0);
                break;
            }
            case 1: {
                opcao1Principal();
                break;
            }
            case 2: {
                opcao2Principal();
                break;
            }
            case 3: {
                opcao3Principal();
                break;

            }
            case 4: {
                opcao4Principal();
                break;
            }
            case 5: {
                opcao5Principal();
                break;

            }

        }

    }

    public void opcao1Principal() {
        menu.menuAlugar();
        int numero = 0;
        numero = sc.nextInt();
        switch (numero) {
            case 0: {
                principalMenu();
                break;
            }
            case 1: {
                menuAlugar1App();
                break;

            }
            case 2: {
                menuAlugar2App();
                break;
            }
        }
    }

    public void menuAlugar1App() {
        menu.menuAlugar1();
        System.out.print(">");
        int n = 0;
        n = sc.nextInt();
        System.out.println(n);
        if (manager.containTicket(n) == true) {
            menu.requestNumberCard();
            int card = 0;
            System.out.print(">");
            card = sc.nextInt();
            if (manager.isRegistado(card)) {
                Utilizador user = manager.getUtilizador(card);
                Ticket t;
                t = manager.getTicket(n);
                manager.alugarBikeTicketUser(t, user);
                menuFinalOperacao();

            }
        } else {
            System.out.println("bilhte nao associado na database");
            menuFinalOperacao();
        }

    }

    public void menuAlugar2App() {
        menu.menuAlugar2();
        //menu.requestNumberCard();
        int option = 0;
        System.out.print(">");
        option = sc.nextInt();
        if (option == 0) {
            principalMenu();
        } else {
             if(manager.isRegistado(option))
             {
                 Utilizador user = manager.getUtilizador(option);
                 //alugar bike do tipo de anuidade
             }
             else
             {
                 System.out.println("cartao nao associado na database");
                 
             }
        }

    }

    public void opcao2Principal() {
        menu.menu2();
        int n = 0;
        n = sc.nextInt();
        switch (n) {
            case 0: {
                principalMenu();
                break;
            }
            case 1: {
                menu1opcao1opcao1();
                break;
            }
            case 2: {
                opcao2opcao2Registar();
                break;
            }
            case 3: {
                opcao2opcao3Alterar();
                break;

            }
        }

    }

    public void menu1opcao1opcao1() {
        menu.menu1opcao1opcao1();
        int n = 0;
        System.out.print(">");

        n = sc.nextInt();
        System.out.println("card:");
        if (manager.isRegistado(n) == true) {
            menu1opcao1opcao1Tipos(n);
        } else {
            System.out.println("User não reconhecido");
        }
        // Utilizador user= manager.getUtilizadorMultibanco(n);
        //System.out.println("User:" +user.getNome());
        //  menu1opcao1opcao1Tipos(n);

        //if (manager.MultibancoUser(n)!=0) {
        //   menu1opcao1opcao1Tipos(n);
        // } else {
        //     System.out.println("Multibanco não reconhecido");
        //     principalMenu();
        // }
    }

    public void menu1opcao1opcao1Tipos(int card) {
        menu.menu1opcao1opcao1Tipos();
        int n = 0;
        n = sc.nextInt();
        //Utilizador u;
        Utilizador u = manager.getUtilizador(card);
        switch (n) {
            case 0: {
                principalMenu();
                break;
            }
            case 1: {

                manager.adquirirAnuidade(u.getCartao().getCardId(), 'N');
                System.out.println(u.getAnuidade().toString());
                menuFinalOperacao();

                break;
            }
            case 2: {

                manager.adquirirAnuidade(u.getCartao().getCardId(), 'E');
                System.out.println(u.getAnuidade().toString());
                menuFinalOperacao();
                break;

            }
            case 3: {
                manager.adquirirAnuidade(u.getCartao().getCardId(), 'N');
                System.out.println(u.getAnuidade().toString());
                menuFinalOperacao();
                break;

            }
            case 4: {
                manager.adquirirAnuidade(u.getCartao().getCardId(), 'N');
                System.out.println(u.getAnuidade().toString());
                menuFinalOperacao();
                break;

            }
        }
    }

    public void opcao3Principal() {
        menu.menu1opcao3();
        int i = 0;
        i = sc.nextInt();
        switch (i) {
            case 0: {
                principalMenu();
                break;
            }
            case 1: {
                menu.requestNumberCard();
                int card = 0;
                System.out.print(">");
                card = sc.nextInt();
                if (manager.isRegistado(card)) {
                    Utilizador user = manager.getUtilizador(card);
                    Ticket ticket;
                    ticket = manager.createTicket(1, 'N');
                    manager.associarTicket(card, ticket);
                    menu.confirmacaoPedidoBilhete(ticket, user);
                    menuFinalOperacao();

                } else {
                    System.out.println("Cartao nao associado na database");
                    menu.menuPrincipal();
                }
            }
            case 2: {
                menu.requestNumberCard();
                int card = 0;
                System.out.print(">");
                card = sc.nextInt();
                if (manager.isRegistado(card)) {
                    Utilizador user = manager.getUtilizador(card);
                    Ticket ticket;
                    ticket = manager.createTicket(3, 'N');
                    manager.associarTicket(card, ticket);
                    menu.confirmacaoPedidoBilhete(ticket, user);
                    menuFinalOperacao();

                } else {
                    System.out.println("Cartao nao associado na database");
                    menu.menuPrincipal();
                }
            }
            case 3: {
                menu.requestNumberCard();
                int card = 0;
                System.out.print(">");
                card = sc.nextInt();
                if (manager.isRegistado(card)) {
                    Utilizador user = manager.getUtilizador(card);
                    Ticket ticket;
                    ticket = manager.createTicket(7, 'N');
                    manager.associarTicket(card, ticket);
                    menu.confirmacaoPedidoBilhete(ticket, user);
                    menuFinalOperacao();

                } else {
                    System.out.println("Cartao nao associado na database");
                    menu.menuPrincipal();
                }
            }
            case 4: {
                menu.requestNumberCard();
                int card = 0;
                System.out.print(">");
                card = sc.nextInt();
                if (manager.isRegistado(card)) {
                    Utilizador user = manager.getUtilizador(card);
                    Ticket ticket;
                    ticket = manager.createTicket(1, 'E');
                    manager.associarTicket(card, ticket);
                    menu.confirmacaoPedidoBilhete(ticket, user);
                    menuFinalOperacao();

                } else {
                    System.out.println("Cartao nao associado na database");
                    menu.menuPrincipal();
                }
            }
            case 5: {
                menu.requestNumberCard();
                int card = 0;
                System.out.print(">");
                card = sc.nextInt();
                if (manager.isRegistado(card)) {
                    Utilizador user = manager.getUtilizador(card);
                    Ticket ticket;
                    ticket = manager.createTicket(3, 'E');
                    manager.associarTicket(card, ticket);
                    menu.confirmacaoPedidoBilhete(ticket, user);
                    menuFinalOperacao();

                } else {
                    System.out.println("Cartao nao associado na database");
                    menu.menuPrincipal();
                }
            }
            case 6: {
                menu.requestNumberCard();
                int card = 0;
                System.out.print(">");
                card = sc.nextInt();
                if (manager.isRegistado(card)) {
                    Utilizador user = manager.getUtilizador(card);
                    Ticket ticket;
                    ticket = manager.createTicket(7, 'E');
                    manager.associarTicket(card, ticket);
                    menu.confirmacaoPedidoBilhete(ticket, user);
                    menuFinalOperacao();

                } else {
                    System.out.println("Cartao nao associado na database");
                    menu.menuPrincipal();
                }

            }

        }
    }

    public void opcao5Principal() {
        System.out.println("MANUTENÇÃO:");
        menuFinalOperacao();
    }

    public void opcao4Principal() {
        manager.showStations();
        menuFinalOperacao();

    }

    public void opcao2opcao2Registar() {
        //String nome;
        // String apelido;
        // char genero; 
        // int day;
        //int month;
        //int year;
        // int nif;
        //String morada;
        //String pais;
        // String mail;
        String nome;
        System.out.println("               Registo:       ");
        System.out.println("Nome:");
        System.out.print("> ");
        nome = sc.next();
        String apelido;
        System.out.println("Apelido:");
        System.out.print("> ");
        apelido = sc.next();
        char genero;
        System.out.println("Genero: (M/F)");
        System.out.print("> ");
        genero = sc.next().charAt(0);
        System.out.println("-Birthdate:");
        int day = 1;
        System.out.println("Day:");
        System.out.print("> ");
        day = sc.nextInt();
        int month = 1;
        System.out.println("Month:");
        System.out.print("> ");
        month = sc.nextInt();
        int year = 2017;
        System.out.println("Year:");
        System.out.print("> ");
        year = sc.nextInt();
        int nif = 1;
        System.out.println("Nif:");
        System.out.print("> ");;
        nif = sc.nextInt();
        String morada = "";
        System.out.println("Morada:");
        System.out.print("> ");
        morada = sc.next();
        String pais = "";
        System.out.println("País:");
        System.out.print("> ");
        pais = sc.next();
        String mail = "";
        System.out.println("Mail:");
        System.out.print("> ");
        mail = sc.next();
        Utilizador user;
        user = manager.registarUtilizadorReturn(nome, apelido, genero, day, month, year, nif, morada, pais, mail);
        menu.opcao2opcao2ConfirmacaoRegisto(user);
        menuFinalOperacao();

        //Utilizador(String nome, String apelido, char genero, int day, int month, int year, int nif, String morada, String pais, String mail)
    }

    private void menuFinalOperacao() {
        menu.menuFinalOperacao();
        int option = 1;
        System.out.print("> ");
        option = sc.nextInt();
        switch (option) {
            case 0: {
                menu.menuDespedida();
                System.exit(0);
                break;
            }
            case 1: {
                principalMenu();
            }
            default: {
                menuFinalOperacao();
            }

        }
    }

    public void opcao2opcao3Alterar() {
        menu.requestNumberCard();
        int choise = 0;
        System.out.print("> ");
        choise = sc.nextInt();
        if (choise == 0) {
            principalMenu();
        } else {
            if (manager.isRegistado(choise) == true) {
                Utilizador user;
                user = manager.getUtilizador(choise);
                menu.opcao2opcao3Alterar(user);

                int option = 0;
                System.out.print("> ");
                option = sc.nextInt();
                switch (option) {
                    case 0: {
                        principalMenu();
                    }
                    case 1: {
                        String name = "";
                        System.out.println("Nome:");
                        System.out.print("> ");
                        name = sc.next();
                        user.setNome(name);
                        System.out.println("Dado modificado com Sucesso. New Nome:" + name);
                        menuFinalOperacao();
                    }
                    case 2: {
                        String apelido = "";
                        System.out.println("Apelido:");
                        System.out.print("> ");
                        apelido = sc.next();
                        user.setApelido(apelido);
                        System.out.println("Dado modificado com Sucesso. New Apelido:" + apelido);
                        menuFinalOperacao();
                    }
                    case 3: {
                        char genero = ' ';
                        System.out.println("Genero:");
                        System.out.print("> ");
                        genero = sc.next().charAt(0);
                        user.setGenero(genero);
                        System.out.println("Dado modificado com Sucesso. New Genero:" + user.getGenero());
                        menuFinalOperacao();
                    }
                    case 4: {
                        int nif = 0;
                        System.out.println("Nif:");
                        System.out.print("> ");
                        nif = sc.nextInt();
                        user.setNif(nif);
                        System.out.println("Dado modificado com Sucesso. New Nif:" + user.getNif());
                        menuFinalOperacao();
                    }
                    case 5: {
                        String morada = "";
                        System.out.println("Morada:");
                        System.out.print("> ");
                        morada = sc.next();
                        user.setMorada(morada);
                        System.out.println("Dado modificado com Sucesso. New Morada:" + user.getMorada());
                        menuFinalOperacao();
                    }
                    case 6: {
                        String pais = "";
                        System.out.println("País:");
                        System.out.print("> ");
                        pais = sc.next();
                        user.setPais(pais);
                        System.out.println("Dado modificado com Sucesso. New Pais:" + user.getPais());
                        menuFinalOperacao();
                    }
                    case 7: {
                        String mail = "";
                        System.out.println("E-MAIL:");
                        System.out.print("> ");
                        mail = sc.next();
                        user.setMail(mail);
                        System.out.println("Dado modificado com Sucesso. New E-mail:" + user.getMail());
                        menuFinalOperacao();
                    }
                }

            } else {
                System.out.println("Numero de cartao não Existe na database");
                principalMenu();
            }
        }

    }

}
