import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main2 {
    public static void main(String[] args) throws IOException {
        // PUNTO 2
        //sumaArchivo(args);
        //a
        operacionesArchivo(args);
    }

    private static void operacionesArchivo(String[] entradas) throws java.io.IOException{
        //tomo la entrada y derivo segun la operacion.
        String operacion = entradas[1];
        if (operacion.equals("+")){
            sumaArchivo(entradas);
        } else if (operacion.equals("*")) {
            multriplicarArchivo(entradas);
        } else {
            System.out.println("ERROR: Ingrese \"+\" o \"*\" como segundo parametro.");
        }
    }

    private static void sumaArchivo(String[] entradas) throws java.io.IOException{
        String archivo = entradas[0];
        int suma = 0;
        for (String linea : Files.readAllLines(Paths.get(archivo))){
            suma += Integer.parseInt(linea);
        }
        System.out.println(suma);
    }

    private static void multriplicarArchivo(String[] entradas) throws java.io.IOException{
        String archivo = entradas[0];
        int multiplicacion = 1;
        for (String linea : Files.readAllLines(Paths.get(archivo))){
            multiplicacion *= Integer.parseInt(linea);
        }
        System.out.println(multiplicacion);
    }
}
