import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        // PUNTO 1
        //A
        //Ingreso las entradas en el array
        /*
        Integer [] numeros = new Integer[args.length - 1];
        for (int numeroStr = 0; numeroStr < args.length - 1; numeroStr++){
            int numero = Integer.parseInt(args[numeroStr]);
            numeros[numeroStr] = numero;
        }

        mostrarNumerosOrdenados(args[3], numeros);
        */

        //B
        Scanner scn = new Scanner(System.in);
        Integer [] numeros = new Integer[3];
        for (int numeroActual = 0; numeroActual < numeros.length; numeroActual++){
            System.out.println("Ingrese un numero: ");
            numeros[numeroActual] = scn.nextInt();
        }
        System.out.println("Ingrese el orden de los numeros, \"a\" (ascendente) o \"d\" (descendente): ");
        String orden = scn.next();
        mostrarNumerosOrdenados(orden, numeros);

    }

    private static void mostrarArrayNumeros(Integer[] arrayNumeros){
        for (Integer numero : arrayNumeros){
            System.out.println(numero);
        }
    }

    private static void mostrarNumerosOrdenados(String ordenNumeros, Integer[] arrayNumeros){
        //Ordeno el array segun el orden dado
        switch (ordenNumeros){
            case "a":
                Arrays.sort(arrayNumeros);
                mostrarArrayNumeros(arrayNumeros);
                break;
            case "d":
                Arrays.sort(arrayNumeros, Collections.reverseOrder());
                mostrarArrayNumeros(arrayNumeros);
                break;
            default:
                System.out.println("ERROR: Ingresar \"a\" (ascendente) o \"d\" (descendente) para el ordenar los numeros.");
                break;
        }
    }
}