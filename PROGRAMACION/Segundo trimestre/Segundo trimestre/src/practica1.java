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
        int contador=practica.length;


        do{

            for (int i = 0; i < practica.length; i++) {
                if (practica[i]>practica[i+1]){
                mochila= practica[i];
                practica [i]= practica[i+1];
                practica[i+1]= mochila;
                }
            }
        }while (contador>1);

        for (int var: practica) {
            System.out.println(var+" ");
        }


    }
}

