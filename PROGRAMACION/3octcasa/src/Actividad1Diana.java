import java.util.Scanner;

class pruebaActi1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
1. Crea una aplicación que permita adivinar un número. La aplicación genera un número
aleatorio del 1 al 100. A continuación va pidiendo números y va respondiendo si el número
a adivinar es mayor o menor que el introducido, a demás de los intentos que te quedan
(tienes 10 intentos para acertarlo). El programa termina cuando se acierta el número
(además te dice en cuantos intentos lo has acertado), si se llega al limite de intentos te
muestra el número que había generado.*/

        int ganador= (int)(Math.random()*100+1); //creo la variable random, así como contador.
        int contador=0;

        System.out.println("Introduce un número");
        int numeroSolicitado= scan.nextInt(); //solicito al usuario el número.

        for (int i=0; i<10;i++){ //Mientras que no lo acierte, tendrá 10 oportunidades.

            if (numeroSolicitado!=ganador){ //esta condición se hará mientras que no acierte.
                System.out.println("No has acertado");
                contador++;
                System.out.println("Te quedan " + (10-contador) + " intentos. Introduce un número");
                numeroSolicitado= scan.nextInt();

            } else{
                System.out.println("Has acertado, enhorabuena"); //Y esta cuando acierte, y sale del bucle.
                break;
            }

        }



/*2. Crea una calculadora en la que te pida un número, una operación(+,-,*,/) y un segundo número. Te
devolverá el resultado y saldrá un menú, la primera opción del menú será hacer otra operación y la
segunda opción será terminar el programa.*/


        int decision=0; //Creo la variable decisión para el menú final.

        do {
        //Ahora incorporo todas las peticiones al usuario.
        System.out.println("Introduce un número");
        int num1= scan.nextInt();
        System.out.println("Introduce una operación: +, -, * o /");
        String operacion= scan.next();
        System.out.println("Introduce otro número");
        int num2= scan.nextInt();

        switch (operacion) {
            case "+":
                System.out.println(num1 + num2);
                System.out.println("¿Qué desea hacer?");
                System.out.println("1= continuar operando");
                System.out.println("2= salir");
                decision= scan.nextInt();
                break;
            case "-":
                System.out.println(num1 - num2);
                System.out.println("¿Qué desea hacer?");
                System.out.println("1= continuar operando");
                System.out.println("2= salir");
                decision= scan.nextInt();
                break;
            case "*":
                System.out.println(num1 * num2);
                System.out.println("¿Qué desea hacer?");
                System.out.println("1= continuar operando");
                System.out.println("2= salir");
                decision= scan.nextInt();
                break;
            case "/":
                System.out.println(num1 / num2);
                System.out.println("¿Qué desea hacer?");
                System.out.println("1= continuar operando");
                System.out.println("2= salir");
                decision= scan.nextInt();
                break;
            default:
                System.out.println("Ese valor no es válido");
                break;
        }

    } while (decision==1); //Se seguirá reproduciendo el bucle mientras se decida continuar.

        System.out.println("Ha decidido salir del programa"); //Y este es el mensaje para cuando salga de la calculadora.



    }



}
