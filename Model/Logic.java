package Model;

import java.util.Scanner;

/**
 * @author flosant
 */
public class Logic {

    /**
     *
     */
    private int n;

    /**
     *
     */
    private String data;

    /**
     *
     */
    private String[] dataList;

    /**
     *
     */
    private double media;

    /**
     *
     */
    private double desv;

    public void logic1a() {
        String outpath = "C:\\Users\\ugflo\\Documents\\NetBeansProjects\\1a\\src\\Model\\result.csv";   
        String inPath = "C:\\Users\\ugflo\\Documents\\NetBeansProjects\\1a\\src\\Model\\A.csv";
        Input input = new Input();
        Data myData = new Data();
        Media media1 = new Media();
        DesvEst desvE = new DesvEst();
        Output out = new Output();
        
        data = input.readData(inPath);
        dataList = myData.saveData(data);
        n = dataList.length;
        media = media1.getMedia(dataList, n);
        desv = desvE.getDesvEst(media, dataList, n);
        out.writeData(outpath, "Media: " + media + "\nDesviacion Estandar: " + desv);
    }
}
