import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        // PUNTO 1
        //A
        //mostarNumerosOrdenadosPorArgs(args);

        //B
        //mostrarNumerosOrdenadosPorConsola();

        //C
        if (args.length != 0){
            mostarNumerosOrdenadosPorArgs(args);
        }
        else {
            mostrarNumerosOrdenadosPorConsola();
        }
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

    private static void mostarNumerosOrdenadosPorArgs(String[] entradas){
        //Ingreso las entradas en el array
        Integer [] numeros = new Integer[entradas.length - 1];
        for (int numeroStr = 0; numeroStr < entradas.length - 1; numeroStr++){
            int numero = Integer.parseInt(entradas[numeroStr]);
            numeros[numeroStr] = numero;
        }
        //Ordena el array y lo muestra
        mostrarNumerosOrdenados(entradas[3], numeros);
    }

    private static void mostrarNumerosOrdenadosPorConsola(){
        //Ingreso las entradas en el array
        Scanner scn = new Scanner(System.in);
        Integer [] numeros = new Integer[3];
        for (int numeroActual = 0; numeroActual < numeros.length; numeroActual++){
            System.out.println("Ingrese un numero: ");
            numeros[numeroActual] = scn.nextInt();
        }
        System.out.println("Ingrese el orden de los numeros, \"a\" (ascendente) o \"d\" (descendente): ");
        String orden = scn.next();
        //Ordena el array y lo muestra
        mostrarNumerosOrdenados(orden, numeros);
    }
}