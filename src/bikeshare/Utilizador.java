package bikeshare;

// import static java.time.LocalDate.now;
// import static java.time.LocalDate.of;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.getInstance;
// import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author João
 */
public class Utilizador {

    private String nome;
    private String apelido;
    private char genero;
    // private LocalDate birthdate;
    private int nif;
    private String morada;
    private String pais;
    private String mail;
    private Cartao cartao;
    private Calendar birthdate;
    private Anuidade anuidade;
    private Bike bike;
    private CartaoMultibanco multibanco;
    //private Ticket ticket;
    private ArrayList<Ticket> userTickets;
     private static int counter = 00;
    private int idUser;

    public Utilizador(String nome, String apelido, char genero, int day, int month, int year, int nif, String morada, String pais, String mail) {
        this.nome = validateString(nome);

        this.apelido = validateString(apelido);
        this.genero = validateChar(genero);
        //this.dataNascimento = validateString(dataNascimento);
        this.nif = validateInteger(nif);
        this.morada = validateString(morada);
        this.pais = validateString(pais);
        this.mail = validateString(mail);
//        createCard();
        //this.cartao= createCard();
        this.birthdate = getInstance();
        //this.birthdate.set(year, month, day);
        this.birthdate.set(year, month, day, 0, 0, 0);
        this.cartao = null;
        this.anuidade = null;
        this.userTickets = new ArrayList<>();
        this.bike = null;
        this.multibanco = new CartaoMultibanco();
       this.idUser=++counter;

    }

    private String validateString(String string) {
        if (string == null) {
            return "";
        } else {
            return string;
        }
    }

    private char validateChar(char caracter) {
        switch (caracter) {
            case 'M':
                return 'M';
            case 'F':
                return 'F';
            default:
                return ' ';
        }
    }

    public boolean receberTicket(Ticket ticket) {
        if (ticket != null) {
            this.userTickets.add(ticket);
            return true;
        } else {
            return false;
        }
    }

    private int validateInteger(int integer) {
        if (integer >= 0) {
            return integer;
        } else {
            return 0;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * public String getBirthdayText() { DateTimeFormatter formatter =
     * DateTimeFormatter.ofPattern("yyyy MM dd"); birthdate.format(formatter);
     * // return text; return "";
     *
     * }
     *
     */
    public String getNome() {
        return nome;
    }

    public int getIdUser() {
        return idUser;
    }
    

    public String getApelido() {
        return apelido;
    }

    public char getGenero() {
        return genero;
    }

    public int getNif() {
        return nif;
    }

    public String getMorada() {
        return morada;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    public Cartao getCartao() {
        Cartao cartaoCopy;
        cartaoCopy = cartao;
        return cartaoCopy;

    }

    public String getPais() {
        return pais;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    public int getIdade() {
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        int yearBirth = this.birthdate.get(YEAR);
        int age = yearNow - yearBirth;
        return age;

        // return this.birthdate.getTime().getYear();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Utilizador other = (Utilizador) obj;
        if (this.nif != other.nif) {
            return false;
        }
        return true;
    }

    public void receberAnuidade(Anuidade anuidade) {
        this.anuidade = validateAnuidade(anuidade);
    }

    private Anuidade validateAnuidade(Anuidade anuidade) {
        if (anuidade != null) {
            return anuidade;
        } else {
            throw new NullPointerException("anuidade must be null");
        }

    }

    public boolean removeTicket(Ticket ticket) {
        if (ticket != null) {
            userTickets.remove(ticket);
            return true;
        } else {
            return false;
        }
    }

    /**
     * public boolean containsTicket(Ticket ticket) {
     *
     * }
     * /
     *
     *
     * /**
     *
     */
    public Anuidade getAnuidade() {
        return anuidade;
    }

    public void associarCartao() {
        Cartao c = new Cartao("SpeedFreak");
        cartao = c;
    }

    public boolean receberBike(Bike bike) {
        if (bike != null) {
            this.bike = bike;
            return true;
        } else {
            return false;
        }
    }

    public int getNumeroMultibanco() {
        return this.multibanco.getMultibancoNumero();
    }

    public Calendar getValidadeMultibanco() {
        return multibanco.getValidade();
    }

    public String getValidadeMultibancoString() {

        Calendar val = multibanco.getValidade();

        return val.get(DAY_OF_MONTH) + "-" + val.get(MONTH) + "-" + val.get(YEAR);
        // birthdate.get(DAY_OF_MONTH) + "-" + birthdate.get(MONTH) + "-" + birthdate.get(YEAR)
    }

    @Override
    public String toString() {
        if (cartao != null) {

            return "\nUtilizador{\n" + "\n nome=" + nome + ",\n apelido=" + apelido + ",\n genero=" + genero + ",\n birthdate=" + birthdate.get(DAY_OF_MONTH) + "-" + birthdate.get(MONTH) + "-" + birthdate.get(YEAR) + ",\n nif=" + nif + ",\n morada=" + morada + ",\n pais=" + pais + ",\n mail=" + mail + ",\n cartao=" + cartao.getCardId() + " }";
        } else {
            return "\nUtilizador{\n" + "\n nome=" + nome + ",\n apelido=" + apelido + ",\n genero=" + genero + ",\n birthdate=" + birthdate.get(DAY_OF_MONTH) + "-" + birthdate.get(MONTH) + "-" + birthdate.get(YEAR) + ",\n nif=" + nif + ",\n morada=" + morada + ",\n pais=" + pais + ",\n mail=" + mail + ",\n cartao= Nao Associado" + " }";
        }
    }

}
