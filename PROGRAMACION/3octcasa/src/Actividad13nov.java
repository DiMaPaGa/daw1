
import java.util.Scanner;

public class Actividad13nov {

    public static void main (String []args){

        Scanner scan= new Scanner (System.in);

       //1. Tabla del dos

       /* int resultado=0;

        for (int i = 0; i <=10 ; i++) {
            resultado=2*i;
            System.out.println("2 x "+ i + " = "+ resultado);
        }*/

        // 2. Pidiendo por comando


      /* System.out.println("Ingresa un número");
        int num= scan.nextInt();
        int resultado=0;
        int contador=0;*/

        /*for (int i = 0; i <=10 ; i++) {
            resultado=num*i;
            System.out.println( num+ " x "+ i + " = "+ resultado);
        }*/

   /* while (contador<=10){
        resultado= num*contador;
        System.out.println( num+ " x "+ contador + " = "+ resultado);
        contador++;
    }
    */

        // Imprimir el abecedario

        char letra='a';

      /*  for (char i = 'a'; i <='z' ; i++) {
            System.out.print(i+" ");

        }*/

       /* for (int i = letra; i <='z' ; i++) {

            System.out.println(letra);
            letra++;

            if(i=='n'){
                System.out.println("ñ");

            }
        }*/

        // Leer un número entero de tres cifras, forzando al usuario a que introduzca un número de esas características. Imprimir por pantalla si es par o impar.

    /*   int numero=0;

        do{
            System.out.println("Introduce un número de 3 cifras");
            numero= scan.nextInt();
        } while (numero<100 || numero>999);

        if (numero%2==0){
            System.out.println(numero+ " es par.");
        } else {
            System.out.println(numero+ " es impar.");
        }*/
// Leer un carácter para saber el estado de una persona (S para soltera o C para casado), forzando al usuario que introduzca S o C.
// Dependiendo de lo que haya introducido, imprimir: La persona es soltera o bien La persona esa casada.

    /*    System.out.println("introduce una letra s si eres soltera y c si eres casada. En Minúscular");
        char estadoCivil=scan.next().charAt(0);

       while (estadoCivil!='s' && estadoCivil!='c' ){
           System.out.println("introduce s si eres soltera o c si eres casada");
           estadoCivil=scan.next().charAt(0);
       }

        if (estadoCivil=='s'){
            System.out.println("La persona es soltera");
        } else {
            System.out.println("La persona es casada");
        }*/
// Tablas del 1 al 10

   /*     int resultado=0;

        for (int i = 1; i <=10 ; i++) {

            System.out.println("Tabla del " + i);
            System.out.println();

            for (int j = 0; j <= 10; j++) {
                resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);

            }
            System.out.println();
        }*/
// Contador de digitos. Introduce un numero por pantalla y muestra cuantos digitos tiene.

       /* System.out.println("Introduce un número");
        int num= scan.nextInt();
        int resultado=1;
        int i;


        for ( i = 0; resultado>0 ; i++) {

            resultado=num/10;
            num=resultado;
        }
        System.out.println("El número tiene "+ i + " dígitos");*/

        // Meter un número por pantalla de 0 a 10 y que ponga el nombre del dígito.

      /*  System.out.println("Introduce un número del 1 al 10");
        int num= scan.nextInt();

        switch (num){
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SIETE");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            case 9:
                System.out.println("NUEVE");
                break;
            case 10:
                System.out.println("DIEZ");
                break;
            default:
                System.out.println("NO VALIDO");
                break;
        }*/
// Leer la edad de dos personas, e imprimir por pantalla cuál de las dos es la mayor (La primera es mayor o La segunda es mayor).
       /* System.out.println("Ingresa la edad de A");
        int edadA= scan.nextInt();
        System.out.println("Ingresa la edad de B");
        int edadB= scan.nextInt();

        if (edadA > edadB){
            System.out.println("A es mayor que B");
        } else if (edadA == edadB){
            System.out.println("A y B son de la misma edad");
        } else {
            System.out.println("B es mayor que A");
        }*/

        // Leer la edad de una persona. A partir de ella calcular su año de nacimiento (suponga que estamos en el 2022)
        // e imprimir el año resultante. Dependiendo de dicho año, imprima qué horóscopo le tocaría en el calendario chino.

        System.out.println("¿Qué edad tienes?");
        int edad= scan.nextInt();

        int anionac=2022-edad;

        switch (anionac){
            case 1:
                System.out.println("RATA");
                break;
            case 2:
                System.out.println("BUEY");
                break;
            case 3:
                System.out.println("TIGRE");
                break;
            case 4:
                System.out.println("CONEJO");
                break;
            case 5:
                System.out.println("DRAGON");
                break;
            case 6:
                System.out.println("SERPIENTE");
                break;
            case 7:
                System.out.println("CABALLO");
                break;
            case 8:
                System.out.println("CABRA");
                break;
            case 9:
                System.out.println("MONO");
                break;
            case 10:
                System.out.println("GALLO");
                break;
            case 11:
                System.out.println("PERRO");
                break;
            case 12:
                System.out.println("CERDO");
                break;
            default:
                System.out.println("NO VALIDO");
                break;
        }








    } //main

}//class
