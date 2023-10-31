import java.util.Scanner;

public class Actividad2DianaPG {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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

            switch (operacion) { //Utilizo un switch, dado que creo que es lo más operativo y ordenado para reutilizar el código.
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
