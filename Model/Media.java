package Model;

/**
 * @author flosant
 */
public class Media {

    /**
     *
     */
    private double media;

    /**
     * @param dataList
     * @param n
     * @return
     */
    public double getMedia(String[] dataList, int n) {

        for (int i = 0; i < dataList.length; i++) {
            media = media + Double.parseDouble(dataList[i]);
        }

        return media / n;
    }
}
