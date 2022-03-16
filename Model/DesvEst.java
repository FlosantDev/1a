package Model;

import java.util.*;

/**
 * @author flosant
 */
public class DesvEst {

    /**
     * Default constructor
     */
    public DesvEst() {
    }
    private double desvEst;

    /**
     * @param media
     * @param dataList
     * @param n
     */
    public double getDesvEst(double media, String[] dataList, int n) {
        double rango = 0.0, varianza = 0.0,h;
        for (int i = 0; i < dataList.length; i++) {
            rango = Math.pow(Double.parseDouble((String) dataList[i]) - media,2f);
            varianza = varianza + rango;
        }
        varianza = (varianza / (n-1));
        return desvEst = Math.sqrt(varianza);
    }

}
