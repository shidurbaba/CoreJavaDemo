
package modernMan;
import udemOOPS.*;
public class AlphaMan extends Man{
    String alphaManNAme;

    public void setAlphaManNAme(String alphaManNAme) {
        this.alphaManNAme = alphaManNAme;
    }

    public String getAlphaManNAme() {
        return alphaManNAme;
    }

    public void alphaManWalks() {
        power1 = "Super Strength";
        power2 = "Super Persuasion Skills";
        System.out.println("Alpha Man Walks");
        System.out.println("He has " + power1 + " and " + power2);
    }

}
