import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main2 {
    public static void main(String[] args) throws IOException {
        // PUNTO 2
        sumaArchivo(args);
    }

    private static void sumaArchivo(String[] entradas) throws java.io.IOException{
        String archivo = entradas[0];
        int suma = 0;
        for (String linea : Files.readAllLines(Paths.get(archivo))){
            suma += Integer.parseInt(linea);
        }
        System.out.println(suma);
    }
}
