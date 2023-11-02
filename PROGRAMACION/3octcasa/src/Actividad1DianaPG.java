import java.util.Scanner;

public class Actividad1DianaPG {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/*1. Crea una aplicación que permita adivinar un número. La aplicación genera un número
aleatorio del 1 al 100. A continuación va pidiendo números y va respondiendo si el número
a adivinar es mayor o menor que el introducido, a demás de los intentos que te quedan
(tienes 10 intentos para acertarlo). El programa termina cuando se acierta el número
(además te dice en cuantos intentos lo has acertado), si se llega al limite de intentos te
muestra el número que había generado.*/

        int ganador = (int) (Math.random() * 100 + 1); //creo la variable random, así como contador.
        int contador = 0;

        System.out.println("Introduce un número");
        int numeroSolicitado = scan.nextInt(); //solicito al usuario el número.

        for (int i = 0; i < 10; i++) { //Mientras que no lo acierte, tendrá 10 oportunidades.

            if (numeroSolicitado != ganador) { //esta condición se hará mientras que no acierte.

                if (numeroSolicitado>ganador){
                    System.out.println("No has acertado, el numero correcto es más bajo");
                    contador++;
                    System.out.println("Te quedan " + (10 - contador) + " intentos. Introduce un número");
                    numeroSolicitado = scan.nextInt();
                } else {
                    System.out.println("No has acertado, el numero correcto es más alto");
                    contador++;
                    System.out.println("Te quedan " + (10 - contador) + " intentos. Introduce un número");
                    numeroSolicitado = scan.nextInt();
                }
                if(i==9 && numeroSolicitado != ganador)
                    System.out.println("No has acertado y te has quedado sin oportunidades. El número ganador era "+ ganador+ " .");

            } else {
                System.out.println("Has acertado en solo "+ contador + " oportunidades, enhorabuena"); //Y esta cuando acierte, y sale del bucle.
                break;
            }

        }


    }

    }
