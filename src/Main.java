import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args)  {
        // PUNTO 1
        //A
        //Ingreso las entradas en el array
        Integer [] numeros = new Integer[args.length - 1];
        for (int numeroStr = 0; numeroStr < args.length - 1; numeroStr++){
            int numero = Integer.parseInt(args[numeroStr]);
            numeros[numeroStr] = numero;
        }

        //Ordeno el array segun el orden dado
        switch (args[3]){
            case "a":
                Arrays.sort(numeros);
                mostrarArrayNumeros(numeros);
                break;
            case "d":
                Arrays.sort(numeros, Collections.reverseOrder());
                mostrarArrayNumeros(numeros);
                break;
            default:
                System.out.println("ERROR: Ingresar \"a\" (ascendente) o \"d\" (descendiente) para el ordenar los numeros.");
                break;
        }


    }

    private static void mostrarArrayNumeros(Integer[] arrayNumeros){
        for (Integer numero : arrayNumeros){
            System.out.println(numero);
        }
    }
}