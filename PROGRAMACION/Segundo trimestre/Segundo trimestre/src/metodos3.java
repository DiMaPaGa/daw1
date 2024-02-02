import java.util.Scanner;

public class metodos3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. Crear un metodo que reciba dos arrays de 1D y los sume. Los arrays deben tener distinto tamaño.
        // int[] primero = {7, 2, 1, 0, 8};
        // int[] segundo = {3, 2, 2, 7};

        // resultado {10, 4, 3, 7, 8}

        int [] primero= {7, 2, 1, 0, 8};
        int[] segundo = {3, 2, 2, 7, 4, 5, 7};


        imprimirArray(arraySumado(primero, segundo));

        imprimirArray(sumararray(primero,segundo));



    }//main

    public static int [] sumararray (int [] primero, int [] segundo){
        //solucion de clase 1.
        int [] arraysumadisimo;
        int tamayo;
        if(primero.length > segundo.length) {
           tamayo= primero.length;
        } else{
            tamayo= segundo.length;
        }
        arraysumadisimo= new int[tamayo];

        for (int i = 0; i < arraysumadisimo.length ; i++) {
            if (i < primero.length && i < segundo.length) {
                arraysumadisimo[i] = (primero[i] + segundo[i]);
            } else if (i < primero.length) {
                    arraysumadisimo[i] = primero[i];
                } else {
                    arraysumadisimo[i] = segundo[i];
                }
        }

        return arraysumadisimo;
    }

    // mi solucion al 1
    public static int [] arraySumado (int [] primero, int [] segundo){
        int valor=0;
        int diferencia=0;

        if (primero.length > segundo.length){
            valor=primero.length;
            diferencia=primero.length - segundo.length;

        } else {
            valor=segundo.length;
            diferencia=segundo.length - primero.length;
        }
        int [] arraysumada= new int [valor];

        for (int i = 0; i < arraysumada.length ; i++) {
            if (i < (valor-diferencia)) {
                arraysumada[i] = (primero[i] + segundo[i]);
            } else {
                if (primero.length > segundo.length) {
                    arraysumada[i] = primero[i];
                } else {
                    arraysumada[i] = segundo[i];
                }
            }
        }

        return arraysumada;
    }



    public static void imprimirArray (int[]nuevaMatriz){
        for (int var : nuevaMatriz) {
            System.out.print(var+ " ");
        }
        System.out.println();

    }


} //class
