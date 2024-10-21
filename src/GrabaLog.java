import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GrabaLog{
    public void grabaLinea(List<String> lista) {
        try {
            FileWriter fileWriter = new FileWriter("LogConversion.txt");
            for (String linea : lista) {
                fileWriter.write(linea);
                fileWriter.write("\n");
            }
            fileWriter.close();
            } catch (IOException e) {
            System.out.println("Error grabacion archivo LOG " + e.getMessage());
        }
    }
}