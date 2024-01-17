import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


    /*Debe ordenar los elementos del array siguiendo la técnica empleada en clase (ver imagen GIF adjunta).
    En ningún momento puede crear un nuevo array, debe trabajar sobre el original. Tras ordenar el array, debe devolverlo e imprimirlo en el main.*/

        int [] practica= new int [10];

        for (int i = 0; i < practica.length; i++) {
            practica[i]= (int) (Math.random() * (300 + 1));
        }

        for (int var: practica) {
            System.out.print(var+" ");
        }

        int mochila;
        int iteraciones=1;

        for (int i = 0; i <practica.length-1 ; i++) {
            for (int j = 0; j < practica.length-iteraciones; j++) {
                if (practica[j] > practica[j + 1]) {
                    mochila = practica[j];
                    practica[j] = practica[j + 1];
                    practica[j + 1] = mochila;
                }

            }
            iteraciones++;
        }

        System.out.println("\n Array ordenada");
        for (int var: practica) {
            System.out.print(var+" ");
        }


    }
}

