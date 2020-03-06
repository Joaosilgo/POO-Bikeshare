/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshare;

/**
 *
 * @author João
 */
public class Ticket {

    private static int counter = 0;
    private int ticketId;
    private double ticketPrice;
    //  private char ticketTypeBike; //E OU N
    private BikeDesig desig;
    private int ticketDays;
    private int numeroMultibanco;

    public Ticket(int days, char typeBike) {
        ticketId = ++counter;
        generateTicket( days,  typeBike); 
       // this.numeroMultibanco =numeroMultibanco;
    }

    private void generateTicket(int days, char typeBike) {
        if (days == 1 && (typeBike == 'e' || typeBike == 'E')) {
            ticketDays = 1;
            desig = BikeDesig.ELECTRICA;
            ticketPrice = 3;
        } else if (days == 3 && (typeBike == 'e' || typeBike == 'E')) {
            ticketDays = 3;
            desig = BikeDesig.ELECTRICA;
            ticketPrice = 9;
        } else if (days == 7 && (typeBike == 'e' || typeBike == 'E')) {
            ticketDays = 7;
            desig = BikeDesig.ELECTRICA;
            ticketPrice = 15;
        } else if (days == 1 && (typeBike == 'n' || typeBike == 'N')) {
            ticketDays = 1;
            desig = BikeDesig.NORMAL;
            ticketPrice = 1;
        } else if (days == 3 && (typeBike == 'n' || typeBike == 'N')) {
            ticketDays = 3;
            desig = BikeDesig.NORMAL;
            ticketPrice = 3;
        } else if (days == 7 && (typeBike == 'n' || typeBike == 'N')) {
            ticketDays = 7;
            desig = BikeDesig.NORMAL;
            ticketPrice = 5;
        } else {
            ticketDays = 1;
            desig = BikeDesig.NORMAL;
            ticketPrice = 1;
        }
    }

    public int getTicketId() {
        return ticketId;
    }
    
    
    /*
    
    
     private BikeDesig validateChar(char caracter) {
        switch (caracter) {
            case 'E' :
                return desig.ELECTRICA;
            case 'N':
                return desig.NORMAL;
                
            case 'e' :
                return desig.ELECTRICA;
            case 'n':
                return desig.NORMAL;
            default:
                return desig.NORMAL;
        }
    }

    private int validateInteger(int integer) {
        if (integer==1 || integer==3 || integer==7) {
            return integer;
        } else {
            return 1;
        }
    }
     */
    

    public BikeDesig getDesig() {
        return desig;
    }

    @Override
    public String toString() {
        return "\nTicket{" + "\n ticket nº: " + ticketId + ",  \n bike: " + desig + ",\n ticketDays:" + ticketDays+"\n Price:" + ticketPrice + '}';
    }
}
