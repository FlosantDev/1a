package Model;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * @author flosant
 */
public class Output {

    /**
     * Default constructor
     */
    public Output() {
    }

    /**
     * @param outFile
     * @param outText
     */
    public void writeData(String outFile, String outText) {
        try {
            File file = new File(outFile);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(outText);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

