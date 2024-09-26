package Model;


/**
 * @author flosant
 */
public class Data {

    private String[] Lista;

    /**
     * @param data
     * @return 
     */
    public String[] saveData(String data) {
        Lista = data.split(",");
        return Lista;
    }
}
