package Model;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author flosant
 */
public class Input {

    /**
     *
     */
    private String data;

    /**
     *
     */
    private BufferedReader br;
    

    /**
     *
     * @param data
     */
    public String readData(String data) {
        try {
            br = new BufferedReader(new FileReader(data));
            data = br.readLine();
        } catch (Exception e) {
            System.err.print("Error en readData " + e.getMessage());
        }
        return data;
    }
}
