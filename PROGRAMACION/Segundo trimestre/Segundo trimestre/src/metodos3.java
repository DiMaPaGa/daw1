import java.util.Scanner;

public class metodos3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Crear un metodo que reciba dos arrays de 1D y los sume. Los arrays deben tener distinto tamaño.
        // int[] primero = {7, 2, 1, 0, 8};
        // int[] segundo = {3, 2, 2, 7};

        // resultado {10, 4, 3, 7, 8}

        int [] primero= {7, 2, 1, 0, 8};
        int[] segundo = {3, 2, 2, 7};


        imprimirArray(arraySumado(primero, segundo));



    }//main

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
