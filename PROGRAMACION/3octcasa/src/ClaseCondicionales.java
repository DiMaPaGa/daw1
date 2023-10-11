import java.util.Scanner;

public class ClaseCondicionales<edad> {

    public static void main (String [] args){
      /* int edadJorge=31;
       int edadPaco=12;
       if(edadJorge>edadPaco){
           System.out.println("El contenido del IF se ejecuta");
           if (edadJorge>0){
               System.out.println("a mayor de 0");
           }

       }
        if(edadJorge<edadPaco){
            System.out.println("El contenido del IF NO  se ejecuta");

        }
        System.out.println("FIN");

        if (edadJorge>edadPaco){
            System.out.println("Jorge es mayor que Paco");
        } else{
            System.out.println("Jorge es IGUAL O MENOR que Paco");

        }
//cascada de If else...
        if (edadJorge>edadPaco){
            System.out.println("Jorge es mayor que Paco");
        } else if (edadJorge==edadPaco){
            System.out.println("Ambos tienen la misma edad");

        } else{
            System.out.println("Jorge es menor que Paco"); //siempre poner else, aunque tenga que indicar un mensaje de que es imposible.
        }*/

       //act.1 Leer dos números enteros e imprimir el mayor de ellos.

        Scanner scan =new Scanner(System.in);
        System.out.println("Introduce un número");
        int num1=scan.nextInt();
        System.out.println("Introduce otro número");
        int num2=scan.nextInt();

        if (num1>=num2){
            System.out.println("El número 1 es mayor= "+ num1);
        } else {
            System.out.println("El número 2 es mayor= "+ num2);
        }

        /*act.2 Leer un entero y comprobar si es negativo o positivo, imprimiendo por pantalla una
        frase al respecto. Considere el cero como positivo.*/
        System.out.println("Introduce un número");
        int num3=scan.nextInt();

        if (num3>=0){
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }

         /*act.3 Modifique el ejercicio anterior para que, en caso de introducir un cero, se imprima por
        pantalla un mensaje específico.*/
        if (num3>0){
            System.out.println("El número es positivo");

        } else if (num3>0){
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        /* act 4.Leer una edad y comprobar si la persona es mayor de edad, imprimiendo una frase al
        respecto. Si es menor, imprimir también un mensaje.*/
           /* System.out.println("Introduce tu edad");
            int edad =scan.nextInt();*/

          /*  if (edad>=18){
                System.out.println("Eres mayor de edad");
            } else {
                System.out.println("Eres menor de edad");
            }*/

        /* act.5 Modificar el ejercicio anterior para que además se compruebe si es jubilado (tiene más
        de 67 años), imprimiendo un mensaje al respecto.*/

//lo más correcto...
      /*  if (edad>=18){
            System.out.println("Eres mayor de edad");
            if (edad>67){
                System.out.println("Jubilado");
            }
        } else {
            System.out.println("Eres menor de edad");
        }*/
        /*act.6 Modificar el ejercicio anterior para que solo se permita una edad válida (0 a 120). En
        caso de ser válida hará todo lo implementado anteriormente. En caso de ser
        inválida, se imprimirá un mensaje de error y el programa acabará.*/

        System.out.println("Introduce tu edad");
    int edad =scan.nextInt();
    //esta que viene es la solución del profesor, es más fácil...
    if (edad>0 &&edad<120){
        if (edad>=18){
            System.out.println("Eres mayor de edad");
            if (edad>67){
                System.out.println("Jubilado");
            }
        } else {
            System.out.println("Eres menor de edad");
    }

        /*if (edad>=0 && edad<18){
            System.out.println("Eres menor de edad");
        } else if (edad>=18 && edad<=120){
            System.out.println("Eres mayor de edad");
            if (edad>67 && edad<=120){
                System.out.println("Jubilado");
            }
        } else {
            System.out.println("No has incorporado un número válido");*/
        }


    }//main
}//class
