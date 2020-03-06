/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshare;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

/**
 *
 * @author João
 */
public class Manager {

    private HashMap<Integer, Utilizador> registo;
    private HashMap<Integer, Ticket> registoTickets;
    private Station[] stations;
    private Station stationSelect;
    private ArrayList<Utilizador> listaUser;
     private ArrayList<Ticket> listaTickets;

    public Manager() {
        this.registo = new HashMap<>();
        stations = new Station[6];
        this.registoTickets = new HashMap<>();
        createStation();
        createUsers();
        stationSelect = stations[0];
        listaUser = new ArrayList<>();
        listaTickets=new ArrayList<>();
        // populate();
        populateTickets();

    }
    public Station[] getStations()
    {
       return stations;
    }

    private void populate() {
        Utilizador user1 = new Utilizador("Joao", "Gomes", 'M', 9, 2, 1996, 1495482, "Comporta", "Portugal", "joaosilgo96");
        user1.associarCartao();

        Utilizador user2 = new Utilizador("Joao", "Gomes", 'M', 9, 2, 1996, 1495482, "Comporta", "Portugal", "joaosilgo96");
        user2.associarCartao();

        Utilizador user3 = new Utilizador("Joao", "Gomes", 'M', 9, 2, 1996, 1495482, "Comporta", "Portugal", "joaosilgo96");
        user3.associarCartao();

        Utilizador user4 = new Utilizador("Joao", "Gomes", 'M', 9, 2, 1996, 1495482, "Comporta", "Portugal", "joaosilgo96");
        user4.associarCartao();

        Utilizador user5 = new Utilizador("Joao", "Gomes", 'M', 9, 2, 1996, 1495482, "Comporta", "Portugal", "joaosilgo96");
        user5.associarCartao();
        listaUser.add(user5);
        listaUser.add(user4);
        listaUser.add(user3);
        listaUser.add(user2);
        listaUser.add(user1);
        registo.put(user5.getCartao().getCardId(), user5);
        registo.put(user4.getCartao().getCardId(), user4);
        registo.put(user3.getCartao().getCardId(), user3);
        registo.put(user2.getCartao().getCardId(), user2);
        registo.put(user1.getCartao().getCardId(), user1);

    }
    private void populateTickets()
    {
        Ticket ticket1 = new Ticket(1, 'N');
        listaTickets.add(ticket1);
        System.out.println(ticket1);
         Ticket ticket2 = new Ticket(3, 'N');
         listaTickets.add(ticket2);
        System.out.println(ticket2);
        Ticket ticket3 = new Ticket(7, 'N');
        listaTickets.add(ticket3);
        System.out.println(ticket3);
    }

    public boolean containMultibanco(int numeroMultibanco) {
        if (listaUser.stream().anyMatch((item) -> (item.getNumeroMultibanco()==numeroMultibanco))) {
            return true;
        }
        
       // return true;
        return true;
    }

    public void listaNumerosMultibanco() {
        listaUser.forEach((item) -> {
            System.out.println("Cartao BikeShare Id:" + item.getCartao().getCardId() + " Multibanco: " + item.getNumeroMultibanco());
        });
    }

    public ArrayList getArrayListUsers() {
        return listaUser;
    }
    
     public ArrayList getArrayListTickets() {
        return listaTickets;
    }

    private void createStation() {
        Station station1 = new Station("Campus do IPS");
        stations[0] = station1;
        Station station2 = new Station("Escola Profissional");
        stations[1] = station2;
        Station station3 = new Station("São Sebastião");
        stations[2] = station3;
        Station station4 = new Station("Estação CP");
        stations[3] = station4;
        Station station5 = new Station("ForumMunicipal");
        stations[4] = station5;
        Station station6 = new Station("Albarquel");
        stations[5] = station6;
    }

    public Station getStationSelect() {
        return stationSelect;
    }

    public void setStationSelect(Station stationSelect) {
        this.stationSelect = stationSelect;
    }

    private void createUsers() {

        Utilizador user1 = new Utilizador("Joao", "Gomes", 'M', 9, 2, 1996, 1495482, "Comporta", "Portugal", "joaosilgo96");
        user1.associarCartao();
        registo.put(user1.getCartao().getCardId(), user1);
        // user1.getCartao().setCardId(1);
        System.out.println("code:" + user1.getCartao().getCardId());
        System.out.println("Multibanco:" + user1.getNumeroMultibanco());
        System.out.println("MultibancoValidade:" + user1.getValidadeMultibancoString());

        Utilizador user2 = new Utilizador("Miguel", "Gomes", 'M', 9, 2, 1995, 1765482, "Samora", "Portugal", "miguel95");
        user2.associarCartao();
        registo.put(user2.getCartao().getCardId(), user2);
        System.out.println("code:" + user2.getCartao().getCardId());
        System.out.println("Multibanco:" + user2.getNumeroMultibanco());
        System.out.println("MultibancoValidade:" + user2.getValidadeMultibancoString());

        Utilizador user3 = new Utilizador("Joao", "Gomes", 'M', 9, 2, 1996, 1495482, "Comporta", "Portugal", "joaosilgo96");
        user3.associarCartao();
        registo.put(user3.getCartao().getCardId(), user3);
        System.out.println("code:" + user3.getCartao().getCardId());
        System.out.println("Multibanco:" + user3.getNumeroMultibanco());
        System.out.println("MultibancoValidade:" + user3.getValidadeMultibancoString());
        Utilizador user4 = new Utilizador("Miguel", "Gomes", 'M', 9, 2, 1995, 1765482, "Samora", "Portugal", "miguel95");
        user4.associarCartao();
        registo.put(user4.getCartao().getCardId(), user4);
        System.out.println("code:" + user4.getCartao().getCardId());
        System.out.println("Multibanco:" + user4.getNumeroMultibanco());
        System.out.println("MultibancoValidade:" + user4.getValidadeMultibancoString());
    }

    private void createTickets() {

        Ticket ticket1 = new Ticket(1, 'E');
        registoTickets.put(ticket1.getTicketId(), ticket1);
        Ticket ticket2 = new Ticket(3, 'E');
        registoTickets.put(ticket1.getTicketId(), ticket1);
        Ticket ticket3 = new Ticket(7, 'E');
        registoTickets.put(ticket1.getTicketId(), ticket1);
        Ticket ticket4 = new Ticket(1, 'N');
        registoTickets.put(ticket1.getTicketId(), ticket1);
        Ticket ticket5 = new Ticket(3, 'N');
        registoTickets.put(ticket1.getTicketId(), ticket1);

    }
/*
    public Station[] getStations() {
        Station[] copy = new Station[6];
        for (int i = 0; i < stations.length; i++) {
            copy[i] = stations[i];
        }
        return copy;
    }
*/

    public void showStations() {
        System.out.println("Estações:");
        for (Station station : stations) {
            System.out.println(station.getStationName());
        }

    }

    public void registarUtilizador(String nome, String apelido, char genero, int day, int month, int year, int nif, String morada, String pais, String mail) {
        Utilizador utilizador = new Utilizador(nome, apelido, genero, day, month, year, nif, morada, pais, mail);
        utilizador.associarCartao();
        registo.put(utilizador.getCartao().getCardId(), utilizador);

    }

    public Utilizador registarUtilizadorReturn(String nome, String apelido, char genero, int day, int month, int year, int nif, String morada, String pais, String mail) {
        Utilizador utilizador = new Utilizador(nome, apelido, genero, day, month, year, nif, morada, pais, mail);
        utilizador.associarCartao();
        registo.put(utilizador.getCartao().getCardId(), utilizador);
        return utilizador;
    }

    public void registarTicket(int days, char typeBike) {
        Ticket ticket = new Ticket(days, typeBike);
        //utilizador.associarCartao();
        registoTickets.put(ticket.getTicketId(), ticket);

    }

    public Ticket createTicket(int days, char typeBike) {
        Ticket ticket = new Ticket(days, typeBike);
        registoTickets.put(ticket.getTicketId(), ticket);
        return ticket;
    }

    public void associarTicket(int numeroCartao, Ticket ticket) {
        Utilizador user = getUtilizador(numeroCartao);
        user.receberTicket(ticket);
    }

    public Ticket getTicket(int numeroBilhete) {
        for (Map.Entry<Integer, Ticket> entry : registoTickets.entrySet()) {
            Integer key = entry.getKey();
            Ticket value = entry.getValue();
            if (numeroBilhete == key) {
                return value;

            }
        }
        return null;
    }

    public boolean containTicket(int number) {
        if (registoTickets.entrySet().stream().map((entry) -> entry.getKey()).anyMatch((key) -> (number == key))) {
            return true;
        } //HashMap value = entry.getValue();
        return false;
    }

    public Utilizador getUtilizadorMultibanco(int multibanco) {
        for (Map.Entry<Integer, Utilizador> entry : registo.entrySet()) {
            Integer key = entry.getKey();
            Utilizador value = entry.getValue();
            if (multibanco == value.getNumeroMultibanco()) {
                return value;

            }
            break;
        }
        //break;
        // return null;
        return null;
    }

    public int MultibancoUser(int multibanco) {
        for (Map.Entry<Integer, Utilizador> entry : registo.entrySet()) {
            Integer key = entry.getKey();
            Utilizador value = entry.getValue();
            if (value.getNumeroMultibanco() == multibanco) {
                return multibanco;

            }
            break;
        }
        return 0;
    }

    public void showInfo() {
        System.out.println("REGISTO:");
        registo.entrySet().forEach((entry) -> {
            Integer key = entry.getKey();
            Utilizador value = entry.getValue();
            System.out.println("cartao nº: " + key + "  |  " + value.getNome() + " " + value.getApelido());
        });
    }

    public boolean isRegistado(int numeroCartao) {
        for (Map.Entry<Integer, Utilizador> entry : registo.entrySet()) {
            Integer key = entry.getKey();
            //HashMap value = entry.getValue();
            if (numeroCartao == key) {
                return true;
            }
        }
        return false;
    }

    public void alugarBikeTicketUser(Ticket ticket, Utilizador user) {
        switch (ticket.getDesig()) {
            case NORMAL: {
                BikeNormal bike = stationSelect.getAvailableBikeNormal();
                user.receberBike(bike);
                System.out.println("Bike alugada");
                System.out.println("User:" + user.getNome());
                System.out.println("From Station: " + stationSelect.getStationName());
//                System.out.println("Bike:" + bike.toString());
                break;
            }
            case ELECTRICA: {
                BikeElectrica bike = stationSelect.getAvailableBikeElectrica();
                user.receberBike(bike);
                System.out.println("Bike alugada");
                System.out.println("User:" + user.getNome());
                System.out.println("From Station: " + stationSelect.getStationName());
                // System.out.println("Bike:" + bike.toString());
                break;
            }
        }
    }

    public Utilizador getUtilizador(int numeroCartao) {
        for (Map.Entry<Integer, Utilizador> entry : registo.entrySet()) {
            Integer key = entry.getKey();
            Utilizador value = entry.getValue();
            if (numeroCartao == key) {
                return value;
            }

        }

        throw new IllegalArgumentException("Final speed can not be less than zero");
    }

    public void adquirirAnuidade(int numeroCartao, char bikeType) {
        if (isRegistado(numeroCartao) == true) {
            Utilizador user = getUtilizador(numeroCartao);
            if (user != null) {
                Anuidade annuity = new Anuidade(user.getIdade(), bikeType);
                user.receberAnuidade(annuity);
            } else {
                System.out.println(user + ": Deve estar a null");
            }

        } else {
            System.out.println(numeroCartao + ": Não está registado no Sistema");

        }
    }
}
