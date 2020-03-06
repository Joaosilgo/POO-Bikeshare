/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshare;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

/**
 *
 * @author João
 */
public class Anuidade {

    private static int counter = 0;
    private int anuidadeId;
    private BikeDesig desig;
    private String anuidadeType;
    private double anuidadeCost;
     private String validate;
   // private Anuidade anuidade;

    public Anuidade(int age, char bike) {
        anuidadeId = ++counter;
        generateAnuidade( age, bike);
        this.validate=generateValidate();

    }

    private void generateAnuidade(int age, char typeBike) {
        if ((age >= 16 && age <= 24) && (typeBike == 'e' || typeBike == 'E')) {
            this.anuidadeCost = 31;
            this.anuidadeType = "JovemElectrica";
            this.desig = BikeDesig.ELECTRICA;
        } else if ((age >= 16 || age <= 24) && (typeBike == 'n' || typeBike == 'N')) {
            this.anuidadeCost = 18;
            this.anuidadeType = "JovemNormal";
            this.desig = BikeDesig.NORMAL;
        } else if ((age < 16 && age > 24) && (typeBike == 'n' || typeBike == 'N')) {
            this.anuidadeCost = 29;
            this.anuidadeType = "NormalNormal";
            this.desig = BikeDesig.NORMAL;
        } else if ((age < 16 && age > 24) && (typeBike == 'e' || typeBike == 'E')) {
            this.anuidadeCost = 59;
            this.anuidadeType = "NormalElectrica";
            this.desig = BikeDesig.ELECTRICA;
        } else {
            this.anuidadeCost = 29;
            this.anuidadeType = "NormalNormal";
            this.desig = BikeDesig.NORMAL;
        }
    }

    public String getAnuidadeType() {
        return anuidadeType;
    }
    private String generateValidate()
    {
        Calendar cal = Calendar.getInstance();
    // Date today = cal.getTime();
    cal.add(Calendar.YEAR, 1); // to get previous year add -1
    //Date nextYear = cal.getTime();
    String dateVal="";
     dateVal = ""+cal.get(DAY_OF_MONTH)+"-"+cal.get(MONTH)+"-"+ cal.get(YEAR);
    return dateVal;
    
    }
    

    @Override
    public String toString() {
        return "\nAnuidade{" + "\nanuidadeId: " + anuidadeId + ", bike: " + desig + ", \ntipo Anuidade: " + anuidadeType + ", \nanuidadeCost=" + anuidadeCost + "\nvalidate: "+ validate+ '}';
    }

    public String getValidate() {
        return validate;
    }

}
